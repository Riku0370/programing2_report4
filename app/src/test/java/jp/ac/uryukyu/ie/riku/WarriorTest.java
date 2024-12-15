package jp.ac.uryukyu.ie.riku;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int i = 0; i < 3; i++){
            int slimeMximumHp = slime.getHitPoint();
            demoHero.attackWithWeponSkill(slime);
            assertEquals(demoHero.getAttack() * 1.5,slimeMximumHp - slime.getHitPoint());
        }
    }
}
