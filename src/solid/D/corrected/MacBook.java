package solid.D.corrected;

import solid.D.KeyBoard;
import solid.D.Mouse;

public class MacBook {

    // MacBook ha dependency of interface [Mouse and Keyboard]
    // which is following dependency inversion principle
    // we can add whichever keyboard or mouse we want
    private final Mouse mouse;
    private final KeyBoard keyBoard;


    // it will accept both type of keyboard and mouse
    public MacBook(Mouse mouse, KeyBoard keyBoard) {
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }
}
