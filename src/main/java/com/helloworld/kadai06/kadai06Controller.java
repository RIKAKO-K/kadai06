package com.helloworld.kadai06;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class kadai06Controller {
    @GetMapping("/kadai06")
    public List<Family> getmoribrothers(){
        return List.of(
                new Family("Mori Brothers",
                        List.of(
                                new ONEOKROCK("Taka",35),
                                new ONEOKROCK("Toru",35),
                                new ONEOKROCK("Ryota",34),
                                new ONEOKROCK("Tomoya",36)
                        ),
                        List.of(
                                new MYFIRSTSTORY("Hiro",29),
                                new MYFIRSTSTORY("Nob",39),
                                new MYFIRSTSTORY("Teru",31),
                                new MYFIRSTSTORY("Kid'z",31)
                        )
                )
        );
    }
}
