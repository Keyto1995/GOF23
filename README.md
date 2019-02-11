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
