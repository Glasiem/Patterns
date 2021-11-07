package com.glasiem.main;

import com.glasiem.composite.Component;
import com.glasiem.composite.Composite;
import com.glasiem.composite.Leaf;

public class MainApp {
    public static void main(String[] args) {
        // Create a tree structure
        Component root = new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));
        Component comp = new Composite("Composite X");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);
        root.Add(new Leaf("Leaf C"));
        // Add and remove a leaf
        Leaf leaf = new Leaf("Leaf D");
        root.Add(leaf);
        root.Remove(leaf);
        // Recursively display tree
        root.Display(1);
        // Wait for user
    }
}
