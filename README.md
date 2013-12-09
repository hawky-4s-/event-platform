event-platform
==============

[![Build Status](https://hawky4s.ci.cloudbees.com/job/event-platform/badge/icon)](https://hawky4s.ci.cloudbees.com/job/event-platform/)

GOALS
=====
I want to provide a high performance event processing platform, where

* REST
* JSON

are first-class citizens.
High performance through Akka's actor model?

Configuration
=============





Architecture
============

The EventPlatform represents an EventNetwork, which consists of EventNodes which in turn are producing or consuming Events.  

These Events are delivered between EventNodes using Channels, e.g. a event producer produces an event and sends it to the EventDispatcher, which dispatches the Event to all.  

An Event is represented through it's type, occurrence and has a payload, which format is described by the DataFormat.
Each EventNode has the capability to produce or consume events or both, depending on it's implementation and configuration.  

TODO: insert abstract diagram about event network

To create an EventNetwork, is has to be created/described using the EventNetworkBuilder, which in turn creates a EventNetworkConfiguration and creates an EventPlatformContext. (For what is the EventPlatformContext used?)
The EventNetworkBuilder allows to add EventConsumers/EventProducer/EventProcessors to the EventNetwork.


How is the Event in the EventNetwork distributed?
- create a graph-like structure where each node has a list of its outgoing nodes or
- have a EventDispatcher, which runs asynchronously and dispatches events from a queue to EventProcessors/EventConsumers and are maintained in a list?

Reactor/Proactor Pattern?



How do the following classes work together and which role do they fulfill in particular?

EventNetworkConfiguration
EventPlatformConfiguration





Use case for me:

Receive JSON from Madbid via (Async-)HttpClient. When the event is received, it should be processed (check data, clean data, add metadata).
Then the data should be stored in database (MongoDB)


Guarantees
==========

The EventPlatform guarantees following things:

- Events are processed in order of occurrence
- No Event is lost


SOMEDAY
============
- persistence?
- clustering?
