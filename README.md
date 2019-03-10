# Spring Boot（十二）— 服务组件

所谓的服务组件（Service Component）— 就是用于处理系统业务逻辑的类，如果按照系统分层设计理论来划分，服务组件是位于业务层当中的类。在Spring Boot中，服务组件是一个被**@Service**注解进行注释的类，这些类用于编写系统的业务代码。在本章节中，将讲解如何创建并使用服务组件。

在开始正文之前，先来看两段示例代码。使用服务组件之前，我们需要定义服务组件接口类，用于索引服务组件提供的服务，代码如下所示：

```java
public interface UserService{
    // TODO ...
}
```

然后，需要使用**@Service**注解对服务组件接口实现类进行注释，演示代码如下：

```java
@Service(value="userService")
public class UserServiceImpl implements UserService{
    //TODO ...
}
```

最后，使用**@Autowired**注解来自动引用服务组件，代码如下：

```java
@Controller
public class DemoController{
    @Autowired
    UserService userService;
    //TODO ...
}
```

在本次讲解中，我们依然以对用户的增、删、改、查为案例，将控制器中的业务方法迁移到服务组件中。

-----
如需查看本教程完整的内容，请访问[RT社圈](https://www.ramostear.com)或者点击下面的链接进行查看：
[Spring Boot（十二）— 服务组件 | ramostear · 罗摩尔](https://www.ramostear.com/archive/spring-boot/post/service-component.html)
