package com.wipro.java.factories;

import com.wipro.java.buttons.Button;
import com.wipro.java.buttons.WindowsButton;
import com.wipro.java.checkbox.Checkbox;
import com.wipro.java.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
