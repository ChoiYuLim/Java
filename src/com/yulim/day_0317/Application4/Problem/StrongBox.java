package com.yulim.day_0317.Application4.Problem;

public class StrongBox<E> {

    public static void main(String[] args) {

        StrongBox sb = new StrongBox(KeyType.PADLOCK);
        sb.put("돈");

        for (int i = 0; i < 1300; i++) {
            System.out.println(sb.get());
        }
    }

    private E thing;
    private KeyType type;
    private int count;

    public StrongBox(KeyType type) {
        this.type = type;
        count = 0;
    }

    public E get() {
        count++;
        if (count <= type.getValue()) {
            return null;
        } else {
            return thing;
        }
    }

    public void put(E thing) {
        this.thing = thing;
    }

    enum KeyType {
        PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

        private final int value;

        KeyType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

}


