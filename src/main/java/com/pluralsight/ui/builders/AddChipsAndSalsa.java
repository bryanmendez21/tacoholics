package com.pluralsight.ui.builders;

import com.pluralsight.Main;
import com.pluralsight.model.ChipsAndSalsa;
import com.pluralsight.util.AnsiCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddChipsAndSalsa {

    public ChipsAndSalsa buildChipAndSalsa(){

        String flavor = salsaFlavor();

        return new ChipsAndSalsa(flavor);
    }

    public String salsaFlavor(){
        Map<Integer,String> salsa = new LinkedHashMap<>();

        salsa.put(1, "Salsa Verde");
        salsa.put(2, "Salsa Roja");
        salsa.put(3, "Chipotle");
        salsa.put(4, "Habanero");
        salsa.put(5, "Mild");
        salsa.put(6, "Extra Hot");
        salsa.put(7, "Molcajete Salsa");
        salsa.put(8, "Chile de Arbol salsa");

        AnsiCode.printSalsaMenu();

        AnsiCode.printSelection();
        int salsaChoice = Main.scanner.nextInt();

        return salsa.get(salsaChoice);
    }
}
