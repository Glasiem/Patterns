package com.glasiem.main;

import com.glasiem.proxy.Proxy;
import com.glasiem.proxy.Subject;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.Request();
    }
}
