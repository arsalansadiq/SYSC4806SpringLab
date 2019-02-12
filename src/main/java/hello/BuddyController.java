package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuddyController {
    @Autowired
   BuddyInfoRepository repo;
AddressBookRepository ADBRepo;
AddressBook address;
    @RequestMapping("/AddBuddy")
    public BuddyInfo addBuddy(@RequestParam(value="name", defaultValue="Arsalan") String name,@RequestParam(value="address") String Address,@RequestParam(value="number") String Number,Model model){
       BuddyInfo buddy = new BuddyInfo(name,Address,Number);

        address.addBuddy(buddy);
        repo.save(buddy);
        ADBRepo.save(address);
//        address=ADBRepo.findById(1).get();
//        model.addAttribute("address",address);
//        return "AddressBook";
        return buddy;
    }
    @GetMapping("/display")
    public String display (Model model){
        model.addAttribute("buddies", repo.findAll());

        return "buddyInfo";
    }

//    @PostMapping("/AddBuddy")
//    public String ( ModelAttribute model){
//        return "AddressBook";
//    }


}


