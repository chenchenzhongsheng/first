//package com.example.demo.exercise;
//
//import User;
//import UserInputDTO;
//import UserNew;
//import UserService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Created by Administrator on 2018\1\30 0030.
// */
//@RequestMapping("/v1/api/user")
//@RestController
//public class exercise {
//    @Autowired
//        private UserService userService;
//// 使用get set方法 将DTO转成BO
//        @PostMapping
//        public UserNew addUser(UserInputDTO userInputDTO){
//            UserNew user = new UserNew();
//            user.setUsername(userInputDTO.getUsername());
//            user.setAge(userInputDTO.getAge());
//
//            return userService.addUser(user);
//        }
//    }
//
//
//    //使用 BeanUtils类里面的copyProperties方法 浅拷贝
//    //复制属性时，我们只需要把DTO对象和要转化的对象两个的属性值设置为一样的名称，并且保证一样的类型就可以了
//    @PostMapping
//    public User addUser(UserInputDTO userInputDTO){
//        User user = new User();
//        BeanUtils.copyProperties(userInputDTO,user);
//
//        return userService.addUser(user);
//    }
//
//
//    //上面的代码虽然优雅 但是没有体现转化的过程  为了更好的语义化
//    //不过代码量 更多了 稍显麻烦 但增加了可读性 目的是把语义层次差不多的代码放在一个方法里
//
//
//    @PostMapping
//    public User addUser(UserInputDTO userInputDTO){
//        User user = convertFor(userInputDTO);
//
//        return userService.addUser(user);
//    }
//
//    private User convertFor(UserInputDTO userInputDTO){
//
//        User user = new User();
//        BeanUtils.copyProperties(userInputDTO,user);
//        return user;
//    }
//
////当实际工作中，完成了几个api的DTO转化时，我们会发现，这样的操作有很多很多，那么应该定义好一个接口，让所有这样的操作都有规则的进行。
////如果接口被定义以后，那么convertFor这个方法的语义将产生变化，他将是一个实现类
//
////抽象后的接口
//public interface DTOConvert<S,T> {
//    T convert(S s);
//}
//
//
// //0接口实现
// public class UserInputDTOConvert implements DTOConvert {
//     @Override
//     public User convert(UserInputDTO userInputDTO) {
//         User user = new User();
//         BeanUtils.copyProperties(userInputDTO,user);
//         return user;
//     }
// }
//
//
// //最终优化
// @RequestMapping("/v1/api/user")
// @RestController
// public class UserApi {
//
//     @Autowired
//     private UserService userService;
//
//     @PostMapping
//     public User addUser(UserInputDTO userInputDTO){
//         User user = new UserInputDTOConvert().convert(userInputDTO);
//
//         return userService.addUser(user);
//     }
// }
//
//
//
//
//
//}
