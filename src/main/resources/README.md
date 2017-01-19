The public keys here match the test private keys generated and stored in the 
[gateway example project](https://github.com/stormpath/stormpath-spring-zuul-gateway-example/tree/master/src/main/resources), 
including instructions on how the keys were generated on the command line using `openssl`.

It is assumed that when testing this Origin application, that the Gateway creates JWTs that are signed by one
of those private keys.  When this example Origin application receives a forwarded request, Juiser will validate the 
JWT with the corresponding public key, extract the user claims, and make a nice User object available to the 
application for the duration of the request.

See the `application.yml` file to see how the public key is referenced.
