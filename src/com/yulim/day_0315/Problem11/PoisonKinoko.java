package com.yulim.day_0315.Problem11;

import com.yulim.day_0313.game.Hero;

public class PoisonKinoko extends Kinoko {

    private int count;

    public PoisonKinoko(char suffix) {
        super(suffix);
        count = 5; // 생성자에 초기화 해주는 게 나을 것 같다!
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (count > 0) {
            System.out.println("추가로,독 포자를 살포했다!");
            hero.setHp((int) (hero.getHp() - hero.getHp() * 0.2));
            System.out.println(hero.getHp() + "포인트의 데미지");
            count--;
        }
    }

}
