package com.lsp.tank.entity.abstractFactory;

import com.lsp.tank.entity.Dir;
import com.lsp.tank.entity.GameModel;
import com.lsp.tank.entity.Group;

/**
 * @author ：Lisp
 * @date： 2021/8/23
 * @version: V1.0
 * @slogan:
 * @description :父类的抽象工厂要尽可能的小，这样子类需要的实现就会少
 */
public abstract class GameFactory {

    /**
     *
     * 创建坦克方法
     * @param x 坐标x
     * @param y 坐标x
     * @param dir 方向
     * @param group 类别：敌人 友军
     * @param gameModel model层
     * @return 坦克类
     */
    public abstract BaseTank createTank(int x, int y, Dir dir, Group group, GameModel gameModel);


    /**
     * 创建炮弹方法
     * @param x 坐标x
     * @param y 坐标x
     * @param dir 方向
     * @param group 类别：敌人 友军
     * @param gameModel model层
     * @return 子弹
     */
    public abstract BaseBullet createBullet(int x, int y, Dir dir, Group group, GameModel gameModel);
    /**
     * 创建爆炸方法
     * @param x 坐标x
     * @param x 坐标x
     * @param y 坐标x
     * @param gameModel model层
     * @return 爆炸类
     */
    public abstract BaseExplode createExplode(int x, int y, GameModel gameModel);

}
