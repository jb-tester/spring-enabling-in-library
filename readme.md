1. Import the `enabler-module` as the IDEA project
2. Install the `enabler-module` project to the local maven repository. 
3. Import the `server-app` as the IDEA project
4. Import the `spring-use-enabler-library` as the IDEA project: it should use the `enabler-library` as a jar library.
5. Check the `com/mytests/spring/springuseenablerlibrary/SpringUseEnablerLibraryApplication.java` class:
   expected: no autowiring errors
   actual: the @ConfigurationProperties and @FeignClient classes from library are available for autowiring,
    but for the local ones the autowiring errors are shown. The corresponding local beans are not detected as beans 
    since the corresponding enabling annotations from library configs are not considered.
6. Run `server-app` and `spring-use-enabler-library` applications and use the requests from `http-request.http` to check that the application works as expected.