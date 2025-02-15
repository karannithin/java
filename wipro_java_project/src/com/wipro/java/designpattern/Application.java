package com.wipro.java.designpattern;

import com.wipro.java.buttons.Button;
import com.wipro.java.checkbox.Checkbox;
import com.wipro.java.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
