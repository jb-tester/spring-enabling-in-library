# Module with Feign Clients and Config Properties.

Uses the enabler-library that enables the FeignClients and ConfigurationProperties beans.

Expected:
the MyAppProps and Client2 classes are recognized as beans (due to enabling annotations from library module)

Actual: the beans are not recognized.

Works ok if the library module is added as module dependency, not as the library jar