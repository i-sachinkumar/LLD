package solid.D.bad;

import solid.D.WiredKeyBoard;
import solid.D.WiredMouse;

public class MacBook {

    // MacBook ha dependency of concrete class [WiredMouse and WiredKeyBoard]
    // which not following dependency inversion principle
    // suppose if macbook is adding bluetooth keyboard and mouse, it won't work;
    private final WiredMouse mouse;
    private final WiredKeyBoard keyBoard;

    public MacBook() {
        this.mouse = new WiredMouse();
        this.keyBoard = new WiredKeyBoard();
    }

}
