# spring-beans-mutability
spring-beans-mutability

The spring framework provides five scopes for a bean. We can use two of them only in the context of this example Spring ApplicationContext.

Singleton: Only one instance will be created for a single bean definition per Spring IoC container and the same object will be shared for each request made for that bean.
Prototype: A new instance will be created for a single bean definition every time a request is made for that bean.

<img width="1033" alt="Screenshot 2023-11-28 at 21 47 38" src="https://github.com/aliFetvaci61/spring-beans-mutability/assets/16122994/d379e8a1-be3c-4dc7-9790-438c5f4e3388">

Singleton profile is selected and the scope is a singleton, then only one instance of that bean will be instantiated per Spring IoC container and the same instance will be shared for each request.

<img width="1313" alt="Screenshot 2023-11-28 at 21 49 59" src="https://github.com/aliFetvaci61/spring-beans-mutability/assets/16122994/23b5d383-8b00-4aa4-bff3-01a777ffb8fe">


Prototype profile is selected and the scope is declared prototype, then spring IOC container will create a new instance of that bean every time a request is made for that specific bean.

<img width="1032" alt="Screenshot 2023-11-28 at 21 50 26" src="https://github.com/aliFetvaci61/spring-beans-mutability/assets/16122994/bfdb8088-3db3-457a-8e46-76a75eda7436">


<img width="1346" alt="Screenshot 2023-11-28 at 21 50 50" src="https://github.com/aliFetvaci61/spring-beans-mutability/assets/16122994/77ac5642-6252-4f48-bf8a-c158eba1b4b6">
