package com.glasiem.electricityConsumer;

import com.glasiem.electricitySystem.INewElectricitySystem;

public class ElectricityConsumer {
    // Зарядний пристрій, який розуміє тільки нову систему
    public static void ChargeNotebook(INewElectricitySystem electricitySystem)
    {
        System.out.println(electricitySystem.MatchWideSocket());
    }
}
