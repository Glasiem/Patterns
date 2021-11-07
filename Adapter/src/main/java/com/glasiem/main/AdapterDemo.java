package com.glasiem.main;

import com.glasiem.adapter.Adapter;
import com.glasiem.electricityConsumer.ElectricityConsumer;
import com.glasiem.electricitySystem.NewElectricitySystem;
import com.glasiem.electricitySystem.OldElectricitySystem;


public class AdapterDemo {
    public static void main(String[] args) {
        // 1) Ми можемо користуватися новою системою без проблем
        var newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.ChargeNotebook(newElectricitySystem);
        // 2) Ми повинні адаптуватися до старої системи, використовуючи адаптер
        var oldElectricitySystem = new OldElectricitySystem();
        var adapter = new Adapter(oldElectricitySystem);
        ElectricityConsumer.ChargeNotebook(adapter);
    }
}
