package org.opentir.ui;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.opentir.model.Operator10;

import com.vaadin.Application;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class OpentirApplication extends Application {

	public static final String PERSISTENCE_UNIT = "org.opentir.jpa.pu";

	@Override
	public void init() {
		setMainWindow(new AutoCrudViews());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	class AutoCrudViews extends Window {
		
		public AutoCrudViews() {
			final HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
			Tree navTree = new Tree();
			navTree.addListener(new Property.ValueChangeListener() {
				@Override
				public void valueChange(ValueChangeEvent event) {
					BasicCrudView cv = (BasicCrudView) event.getProperty()
							.getValue();
					cv.refreshContainer();
					horizontalSplitPanel.setSecondComponent(cv);
				}
			});
			navTree.setSelectable(true);
			navTree.setNullSelectionAllowed(false);
			navTree.setImmediate(true);

			horizontalSplitPanel.setSplitPosition(200,
					HorizontalSplitPanel.UNITS_PIXELS);
			horizontalSplitPanel.addComponent(navTree);
			setContent(horizontalSplitPanel);

			// add a basic crud view for all entities known by the JPA/model
			// implementation, most often this is not desired and developers
			// should just list those entities they want to have editors for
			
			Metamodel metamodel = JPAContainerFactory
					.createEntityManagerForPersistenceUnit(PERSISTENCE_UNIT)
					.getEntityManagerFactory().getMetamodel();
			Set<EntityType<?>> entities = metamodel.getEntities();
			
			for (EntityType<?> entityType : entities) {
				Class<?> javaType = entityType.getJavaType();
				BasicCrudView view = new BasicCrudView(javaType,
						PERSISTENCE_UNIT);
				navTree.addItem(view);
				navTree.setItemCaption(view, view.getCaption());
				navTree.setChildrenAllowed(view, false);
				if(javaType == Operator10.class) {
					view.setVisibleTableProperties("firstName11","lastName12");
					view.setVisibleFormProperties("firstName11","lastName12", "phoneNumber16", "street13", "city14", "zipCode15");
				}

			}

			// select first entity view
			navTree.setValue(navTree.getItemIds().iterator().next());
		}
	}

	static {
		EntityManager em = JPAContainerFactory
				.createEntityManagerForPersistenceUnit(PERSISTENCE_UNIT);

		long size = (Long) em.createQuery("SELECT COUNT(p) FROM Operator10 p").getSingleResult();
		if (size == 0) {
			// create one Admin Person objects as initial data

			em.getTransaction().begin();
			Operator10 p = new Operator10();
			p.setFirstName11("Admin");
			p.setLastName12("Opentir");
			p.setCity14("Gallifrey");
			p.setPhoneNumber16("+358 02 555 221");
			p.setZipCode15("20200");
			p.setStreet13("TARDIS 3rd");
			em.persist(p);

			em.getTransaction().commit();
		}

	}

}
