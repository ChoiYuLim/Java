package com.yulim.day_0317.Application4.Problem;

public class StrongBox<E> {

	private E thing;
	private KeyType type;
	private int count;

	public StrongBox(KeyType type) {
		this.type = type;
		this.count = 0;
	}

	public void put(E thing) {
		this.thing = thing;
	}

	public E get() {
		count++;
		if (count <= this.type.getValue()) {
			return null;
		} else {
			return this.thing;
		}
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

	public static void main(String[] args) {
		StrongBox sb = new StrongBox(KeyType.PADLOCK);
		sb.put("money");
		for (int i = 0; i < 2000; i++) {
			System.out.println(sb.get());
		}

	}
}
