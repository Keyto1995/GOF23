# GOF23
Group of Four 23种设计模式

## 单例模式 [singleton]( ./singleton/README.md )

单例模式是对象的 `创建模式` 之一。

`单例模式` 确保一个类有且仅有一个实例。

|    | 线程安全 | 懒加载 |
|:---:|:---:|:---:|
| 饿汉式 | YES | NO |
| 懒汉式 | YES | YES |
| 双重检测锁 | YES | YES |
| 静态内部类 | YES | YES |
| 枚举 | YES | NO |

## 工厂模式 [factory]( ./factory/README.md )
`工厂模式` 实现了创建者和调用者的分离。

详细分类：
+ 简单工厂模式
+ 工厂方法模式
+ 抽象工厂模式
