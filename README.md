zentasks sample application
===========================

This is a slight reworking of the [Play framework 2.1.1](http://www.playframework.com/documentation/2.1.1/Home) Scala-language sample application - `zentasks` - to run on Cloud Foundry. The application uses PostgreSQL instead of the in-built H2 in-memory database. 

PostgreSQL barked on the use of `user` as a table name because `user` is a reserved word. The queries used in the application have been updated accordingly to use `users` instead. 

### Deploying to Cloud Foundry

To deploy the application to Cloud Foundry, simply build the dist and push it to Cloud Foundry using the provided `manifest.yml` file. 

```bash
$ play dist
$ cf push
```

The host name field in the `manifest.yml` include some random characters to make sure the URL for the app is unique in the Cloud Foundry environment. The output of the
`cf app` command shows the URL that was assigned. Using the provided URL in the `urls` field displayed, you can browse to the running application.
