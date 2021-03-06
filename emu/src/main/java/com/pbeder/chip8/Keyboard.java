package com.pbeder.chip8;

/*
 | 1 | 2 | 3 | C |
 | 4 | 5 | 6 | D |
 | 7 | 8 | 9 | E |
 | A | 0 | B | F |
*/
class Keyboard {
    private boolean[] keyboard = new boolean[16];

    boolean isKeyPressed(byte x) {
//        System.out.println("Is key " + Integer.toHexString(x) +" pressed:" + keyboard[x]);
        return keyboard[x];
    }

    byte getFirstKeyPressed() {
        for (int i = 0; i < keyboard.length; i++) {
            if (keyboard[i]) {
                clear();
                return (byte) i;
            }
        }
        return (byte) 0xFF; //Invalid
    }

    private void clear() {
        for (int i = 0; i < keyboard.length; i++) {
            keyboard[i] = false;
        }
    }

    boolean isAnyKeyPressed() {
        for (boolean key : keyboard) {
            if (key) {
                return true;
            }
        }
        return false;
    }

    void setKey(byte key, boolean isPressed) {
        keyboard[key] = isPressed;
    }
}
