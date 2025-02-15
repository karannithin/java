package com.wipro.java.factories;

import com.wipro.java.buttons.Button;
import com.wipro.java.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
