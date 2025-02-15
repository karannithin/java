package com.wipro.java.factories;

import com.wipro.java.buttons.Button;
import com.wipro.java.buttons.MacOSButton;
import com.wipro.java.checkbox.Checkbox;
import com.wipro.java.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
