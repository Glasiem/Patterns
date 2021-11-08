package com.glasiem.proxy;

import jdk.jshell.spi.ExecutionControl;

public class RealSubject extends Subject{
    @Override
    public void Request()
    {
        throw new UnsupportedOperationException();
    }
}
