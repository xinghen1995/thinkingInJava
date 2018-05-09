#学习笔记

1. 容器大致分为两类:
    * Collection。List按照插入顺序保存元素。Set不能有重复元素。Queue按照指定规则排序元素。
    * Map。利用“键值对”保存元素，又称作“关联数组”、“映射表”、“字典”。
2. Arrays.asList()仅仅将数组类型转换为Collection，但是底层依旧使用数组实现，不能改变大小
3. Set。
    * HashSet是最快获取元素的方式
    * TreeSet利用升序保存对象
    * LinkedHashSet依据被添加的顺序保存元素。
4. Map
    * HashMap提供了最快的访问速度。
    * TreeMap利用升序保存对象
    * LinkedHashMap依据添加顺序保存元素，同时保持了HashMap的访问速度
5. List
    * ArrayList随机访问快速，可以看做大小可变的数组
    * LinkedList插入，删除的代价较低，但是随机访问的速度不高。此外，其提供了队列，栈等操作的方法。
6. 迭代器
    * 迭代器是一个对象
    * 它的工作是遍历并选择序列中的对象
    * 轻量级对象，创建它的对象很小
