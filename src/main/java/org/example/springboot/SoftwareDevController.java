package org.example.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/software-dev")


public class SoftwareDevController {

    @GetMapping
    public List<SoftwareDeveloper> getDeveloper(){
        return List.of(
                new SoftwareDeveloper(
                        1,
                        "Mancoba",
                        "ms101@gmail",
                        List.of("java","python","c++")
                ),

                new SoftwareDeveloper(
                        2,
                        "Manba",
                        "msjkhgasdf101@gmail",
                        List.of("java","python","c++")
                )
        );

    }


}
