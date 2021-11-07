package com.glasiem.adapter;

import com.glasiem.electricitySystem.INewElectricitySystem;
import com.glasiem.electricitySystem.OldElectricitySystem;

public class Adapter implements INewElectricitySystem {
    // Але всередині він старий
    private final OldElectricitySystem _adaptee;
    public Adapter(com.glasiem.electricitySystem.OldElectricitySystem adaptee)
    {
        _adaptee = adaptee;
    }

    // А тут відбувається вся магія: наш адаптер «перекладає»
    // функціональність із нового стандарту на старий
    public String MatchWideSocket()
    {
        // Якщо б була різниця
        // то тут ми б помістили трансформатор
        return _adaptee.MatchThinSocket();
    }
}
