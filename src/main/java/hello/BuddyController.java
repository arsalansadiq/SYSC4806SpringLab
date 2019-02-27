package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BuddyController {

    @Autowired
   BuddyInfoRepository repo;

    @GetMapping("/buddy")
    public String addBuddy(Model model) {
        model.addAttribute("buddyInfo", new BuddyInfo());
        return "buddyInfo";
    }

    @PostMapping("/buddy")
    public String buddyDisplay(@ModelAttribute BuddyInfo buddyInfo, Model model) {

        BuddyInfo buddy = new BuddyInfo(buddyInfo.getName(),buddyInfo.getAddress(),buddyInfo.getNumber());
        repo.save(buddy);
        model.addAttribute("buddyInfo", buddy);
        return "displayBuddy";
    }

    @GetMapping("/all")
    public String displayAllBuddies(Model model){
        model.addAttribute("buddyInfo",repo.findAll());
        return "BuddiesList";
    }



}


