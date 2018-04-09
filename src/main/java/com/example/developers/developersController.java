package com.example.developers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class developersController {

    DeveloperRepository dr;
    DeveloperAdressRepository dar;
    InvestmentRepository ir;
    OfferRepository or;
    CityRepository cr;

    public developersController(DeveloperRepository dr, DeveloperAdressRepository dar, InvestmentRepository ir, OfferRepository or, CityRepository cr) {
        this.dr = dr;
        this.dar = dar;
        this.ir = ir;
        this.or = or;
        this.cr = cr;
    }

    @GetMapping("/main")
    public String showMainPage(Model model) {

        model.addAttribute("developers", dr.findAll());
        model.addAttribute("promotedOffer", or.getAllByPromotedIsTrueAndStatusIs(Status.FORSALE));

        return "index";
    }

    @GetMapping("/developerDetails")
    public String showDeveloperList(@RequestParam Long id, Model model) {

        Optional<Developer> developer = dr.findById(id);

        if (developer.isPresent()) {
            model.addAttribute("developer", developer.get());
            model.addAttribute("devInvestment", ir.findAllByDeveloperId(id));
            model.addAttribute("newInvestment", new Investment());
            model.addAttribute("cities",cr.findAll());
        } else {
            return "redirect:/main";
        }
        return "developerDetails";
    }




}
