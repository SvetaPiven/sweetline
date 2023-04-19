//package com.avia.rest;
//
//import com.avia.domain.Role;
//import com.avia.domain.User;
//import com.avia.service.RoleService;
//import com.avia.service.UserRoleService;
//import com.avia.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collections;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/rest/roles")
//@RequiredArgsConstructor
//public class RoleController {
//
//    private final RoleService roleService;
//    private final UserRoleService userRoleService;
//
//    private final UserService userService;
//
//    @GetMapping
//    public ResponseEntity<Map<String, Object>> getAllRoles() {
//
//        List<Role> roles = roleService.findAll();
//
//        return new ResponseEntity<>(Collections.singletonMap("roles", roles), HttpStatus.OK);
//    }
//
//
//    @GetMapping("/{idUser}")
//    public ResponseEntity<Map<String, Object>> getUsersAuthorities(@PathVariable Long idUser) {
//
//        User user = userService.findById(idUser);
//        List<Role> roles = roleService.getUserAuthorities(idUser);
//
//        Map<String, Object> result = new LinkedHashMap<>();
//        result.put("user", user);
//        result.put("roles", roles);
//
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
//}
