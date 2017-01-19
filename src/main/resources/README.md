The public keys here match the test private keys generated and stored at this location (along with instructions on 
how the keys were generated with OpenSSL on the command line):

https://github.com/stormpath/stormpath-spring-zuul-gateway-example/tree/master/src/main/resources

It is assumed that when testing this Origin application, that the Gateway creates JWTs that are signed by one
of those private keys.  When the Origin application receives a forwarded request, Juiser will validate the JWT with 
the corresponding public key, extract the user claims, and make a nice User object available to the application for the
duration of the request.

See the `application.yml` file to see how the verification public key is referenced.
