Running the Play framework `zentasks` sample application on Cloud Foundry (version 1)
===========================

This is a slight reworking of the [Play framework 2.1.1](http://www.playframework.com/documentation/2.1.1/Home) Scala-language sample application - `zentasks` - to run on Cloud Foundry v1. The application uses PostgreSQL instead of the in-built H2 in-memory database. PostgreSQL is provided as part of Cloud Foundry, and we use Cloud Foundry's [Scala auto-reconfiguration](http://blog.cloudfoundry.com/2012/03/12/using-cloud-foundry-services-with-ruby-part-1-auto-reconfiguration/) to connect to it. To enable auto-reconfiguration, the SBT `Build.scala` has been updated to include a Cloud Foundry `.jar` and a PostgreSQL driver. 

PostgreSQL barked on the use of `user` as a table name because `user` is a reserved word. The queries used in the application have been updated accordingly to use `users` instead. 

Cloud Foundry - as deployed on [CloudFoundry.com](httP://www.cloudfoundry.com) is presently at v1, but will very soon be at the backwards-incompatible v2. To ensure that this demonstration works for as long as possible, I've deployed it to [AppFog](http://www.appfog.com) which still uses version 1 of the Cloud Foundry PaaS. You may see [it in action](http://scaladayszentasks.aws.af.cm/).
