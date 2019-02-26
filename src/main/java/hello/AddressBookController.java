package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressBookController {

    @Autowired
    AddressBookRepository repo;
    AddressBook ad;
    @Autowired
    BuddyInfoRepository bud;


//    @RequestMapping("/createAD")
//    @ResponseBody
//    public AddressBook createAddress(@RequestParam(value="name", defaultValue="12345") int name){
//        ad = new AddressBook();
//        ad.setId(name);
//        repo.save(ad);
//        return ad;
//
//    }

    @GetMapping("/createAD")
    public String createAddressBook(Model model) {
        model.addAttribute("AddressBook", new AddressBook());
        return "AddressBook";
    }
//    @RequestMapping("/createBuddy")
//    @ResponseBody
//    public BuddyInfo createBuddy(@RequestParam(value = "name") String name, @RequestParam(value = "address") String address,@RequestParam(value = "number") String number){
//        BuddyInfo buddy = new BuddyInfo(name,address,number);
//        ad.addBuddy(buddy);
//        bud.save(buddy);
//        repo.save(ad);
//        return buddy;
//    }
    @RequestMapping("/Display")
    public String Display(Model model){
        model.addAttribute("address",repo.findAll());
//        return ad.toString();
        return "AddressBook";


    }

    }
