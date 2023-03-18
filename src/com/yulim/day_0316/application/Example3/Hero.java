package com.yulim.day_0316.application.Example3;

import java.util.Objects;

public class Hero {
	private String name;
	private int hp;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
	
	
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Hero other = (Hero) obj;
//		return Objects.equals(name, other.name);
//	}

}
