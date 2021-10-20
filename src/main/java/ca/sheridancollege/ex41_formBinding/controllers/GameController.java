package ca.sheridancollege.ex41_formBinding.controllers;

import ca.sheridancollege.ex41_formBinding.model.VideoGame;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class GameController {
    CopyOnWriteArrayList<VideoGame> list = new CopyOnWriteArrayList<>();
    VideoGame videoGame = new VideoGame(new Long(1),"Rohan","Rohan","Rohan",new String [] {"R","O","H"},new BigDecimal(1));

    @GetMapping("/")public String index(){
        return "index";
    }
    @GetMapping("/register")public String showForm(Model model){
        VideoGame videoGame = new VideoGame();
        model.addAttribute(videoGame);
        list.add(new VideoGame(new Long(1),"Rohan","Rohan","Rohan",new String [] {"R","O","H"},new BigDecimal(1)));
        return "videogames";
    }
    @PostMapping("/register")public String submitForm(@ModelAttribute("videoGame") VideoGame videoGame){
        return "videogames";
    }
    @PostMapping("/videogames")public String videoGames(@ModelAttribute("user") VideoGame videoGame){
        return "videogames";
    }

}
