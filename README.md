# Opentir-1.0.0

This is a NATO/SPA Codification Tool - according ACodP-1, CodSP-x and other rules.

The NATO Support and Procurement Agency, abbreviated to NSPA, is the main logistics and procurement agency of the North Atlantic
Treaty Organisation (NATO) and is the executive branch of the NATO Support and Procurement Organisation (NSPO).

On 1 April 2015, the NATO Support Agency (NSPA) became the NATO Support and Procurement Agency. This change marks the expansion
of Agency capabilities to include all aspects of systems procurement from initial acquisition throughout sustainment.

The mission of the NATO Support and Procurement Organisation is to provide responsive, effective and cost-efficient acquisition,
including armaments procurement; logistics; operational and systems support and services to the Allies, NATO Military Authorities
and partner nations, individually and collectively, in time of peace, crisis and war, in order to maximize the ability and
flexibility of their armed forces, contingents, and other relevant organisations, within the guidance provided by the NAC, to
execute their core missions.

The NATO Support and Procurement Agency brings the full spectrum of 21st century logistics and acquisition capabilities under one
organisation to ensure NATO allies and partners can maximize the effectiveness of their defence and logistics efforts.

From acquisition and through-life support to system disposal and operational logistics support, NSPA capabilities, products and
services offer integrated procurement and logistic solutions to support current and future national requirements to allies and
partners (as TIER-1 and TIER-2 countries). NSPA offers to customers the full range of design, acquisition, logistics and
procurement support services for complete weapon systems across five distinct capability areas:
    • Systems Procurement and Life Cycle Management, 
    • Support to Operations and Exercises,
    • Strategic Transport and Storage,
    • Logistics Services and Project Management, 
    • Fuel Management.

In order to manage and integrate all of these areas, NSPA had chosen the 'NATO Codification System' (NCS for short) that is
a Standardization Agreement approach to identify, classify and number items of supply. This is applicable to items that are
repetitively used and stocked (e.g., repair parts, equipment, food items, etc.). The System has been agreed by all signatories
of the NATO and sponsored non-NATO nations for use in identifying equipment and supplies. The result is a unique identification
and a data set that can be easily shared and understood by a wide range of users. The data set may be shared in the form of
printed catalogs, on line systems, electronic data exchange, etc. Users include logisticians and manufacturers.

The process of codification (or cataloging) involves naming, classifying, describing the item and assignment of a 13 digit NATO
Stock Number (or NSN). The system aids logistics processes, to include supply, purchasing, maintenance, warehousing, planning, 
transportation, etc. Further, it allows different organizations, even countries, to cooperate in providing logistics support to
military, disaster relief, peace keeping and similar operations.

NCS is based on the following main documents:

Five NATO Standardisation Agreements (STANAGs) build the structural basis for the system:

    STANAG 3150: Codification-Uniform System of Supply Classification
    STANAG 3151: Codification-Uniform System of Item of Supply Identification
    STANAG 4177: Codification-Uniform System of Data Acquisition
    STANAG 4199: Codification-Uniform System of Exchange of Materiel Management Data
    STANAG 4438: Codification-Uniform System of Dissemination of Data Associated with NATO Stock Numbers(NSN)

NCS basic concepts:

Unambiguous item identification in accordance with the STANAG 3151 standard. This identification takes place by means of a NATO
Stock Number (NSN), which is composed of a 4-digit NATO Supply Classification Code, a 2-digit code for the National Codification
Bureau (NCB) representing the country which codifies the item and of a 7-digit non-significant number that is assigned by this
NCB.

Uniform System of Supply Classification in accordance with STANAG 3150. All material is classified in material groups and classes
with respect to its usage in logistics.

Uniform System of Item Names in accordance with the H6 manual (Item Name Directory). There are approximately 40,000 approved
item names used, covering all types of material.

Item identification:

A descriptive item identification according to the Item Identification Guide (IIG) on the basis of material technical attributes
specification. A reference item identification on the basis of the manufacturer’s code, NCAGE, and of the manufacturer’s item
identification number.

Item of supply:

Item of supply is an item of production (part, article) which a responsible supply management authority has determined as being
required to meet a specific logistics requirement. This part has to be defined in compliance with logistics needs (transport,
usage, features, etc.) to meet all logistics requirements with the possibility of repeated usage. One item of supply may
represent several items of production, for example made by various producers, which do not have to be distinguished between from
the viewpoint of logistics requirements.

The Allied Codification Publication No. 1 (ACodP-1) contains the basics of the 'NATO Codification System'. The terms of reference
and responsibilities of National Codification Bureaux (NCB), users and contractors are specifically defined therein. Every
nation has the responsibility to implement ACodP-1 rules and procedures. The application of those rules and procedures, as well
as their harmonization with national regulations, is the responsibility of each National Codification Bureau, which is the final
authority in this matter.

Source-code pattern:

This project was split into five packages:

- acodp1 -   it contains ACodP1 and any other related documents that contain rules and procedures (whithout persistent classes).
- jpa -      it contais a persistence layer for database connection and ORM.
- national - it contains national regulations interfaces. No source-code should be put here, due to national security issues.
- exchange - it contains data exchange protocols. there are generators for exporting and digesters for importing generated data.
- ui -       it contains end-user interfaces for searching, viewing and CRUD (Create/Read/Update//Delete) operations.

The initial version was made by Rogerio, Santos.
