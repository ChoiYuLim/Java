package com.yulim.day_0315.Example12;

public interface Human extends Creature { // human은 creature야
	void talk();

	void watch();

	void hear();

	// 추가로, 부모 인터페이스로부터 run()을 상속 받고 있음
}
