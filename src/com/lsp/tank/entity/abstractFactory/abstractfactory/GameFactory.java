package com.lsp.tank.entity.abstractFactory.abstractfactory;

import com.lsp.tank.entity.Dir;
import com.lsp.tank.entity.Group;
import com.lsp.tank.entity.abstractFactory.BaseBullet;
import com.lsp.tank.entity.abstractFactory.BaseExplode;
import com.lsp.tank.entity.abstractFactory.BaseTank;

import java.awt.*;
import java.util.UUID;

/**
 * @Author CandyWall
 * @Date 2021/1/28--8:56
 * @Description 生产坦克、子弹和爆炸的抽象工厂类
 */
public abstract class GameFactory {
    /**
     * 创建己方坦克
     * @return
     */
    public abstract BaseTank createSelfTank(UUID id, int x, int y, Dir dir, int speed);

    /**
     * 创建敌方坦克
     * @return
     */
    public abstract BaseTank createEnemyTank(UUID id, int x, int y, Dir dir, int speed);

    /**
     * 创建子弹
     * @return
     */
    public abstract BaseBullet createBullet(UUID id, UUID tankId, int x, int y, Dir dir, Group group);

    /**
     * 创建爆炸
     * @return
     */
    public abstract BaseExplode createExplode(Rectangle tankRect);


}