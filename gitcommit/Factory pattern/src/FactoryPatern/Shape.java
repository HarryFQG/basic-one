/**
 * 
 */
package FactoryPatern;

/**
 * 创建接口
 * @author Feng
 *意图：让子类决定自己实例化哪一个工厂类
 *主要解决：接口选择问题
 *何时使用：明确计划在不同条件下创建不同实例
 *
 */
public interface Shape {
	void draw();
}
