# 原型模式 prototype

`原型模式` 属于对象的创建模式。  
通过给出一个原型对象来指明所有创建的对象的类型，然后用复制这个原型对象的办法创建出更多同类型的对象。  

+ 浅克隆  
属性指向同一内存，其中一个属性的对象改变属性值时，所有克隆对象都改变。
+ 深克隆  
属性指向不同内存，不共享属性。  
可以①克隆所有属性的对象 ②序列化&反序列化 实现深克隆。
