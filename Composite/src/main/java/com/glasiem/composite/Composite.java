package com.glasiem.composite;

import java.util.ArrayList;
import org.apache.commons.lang.StringUtils;

public class Composite extends Component{
    private ArrayList<Component> children = new ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        children.add(component);
    }

    @Override
    public void Remove(Component component) {
        children.remove(component);
    }

    @Override
    public void Display(int depth) {
        System.out.println(StringUtils.repeat("-", depth) + name);

        // Recursively display child nodes
        for (int i = 0; i < children.size(); i++)
        {
            children.get(i).Display(depth + 2);
        }
    }
}
