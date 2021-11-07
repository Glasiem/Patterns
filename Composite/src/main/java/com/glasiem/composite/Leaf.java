package com.glasiem.composite;

import org.apache.commons.lang.StringUtils;

public class Leaf extends Component{
    // Constructor
    public Leaf(String name){
            super(name);
    }

    @Override
    public void Add(Component c)
    {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void Remove(Component c)
    {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void Display(int depth)
    {
        System.out.println(StringUtils.repeat("-", depth) + name);
    }
}
