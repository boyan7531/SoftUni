package bg.softuni.slidecard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

    @GetMapping("/cards")
    public String getCards(){
        return "card";
    }
}
