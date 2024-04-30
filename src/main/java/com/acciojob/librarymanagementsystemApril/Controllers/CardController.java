package com.acciojob.librarymanagementsystemApril.Controllers;

import com.acciojob.librarymanagementsystemApril.Enum.CardStatus;
import com.acciojob.librarymanagementsystemApril.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("card")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("add")
    public String addCard(){

        return cardService.addNewCard();
    }

    @PutMapping("associateCardAndStudent")
    public String associateCardAndStudent(@RequestParam("cardId")Integer cardId,
                                          @RequestParam("studentId")Integer studentId) {

        return cardService.associateCardAndStudent(cardId,studentId);
    }
}
