package com.priv.initialization;
// Using finalize() to detect an object that hasn't been properly cleaned up.

/**
 * 一旦垃圾回收机制准备回收某个对象，会首先调用finalize()方法，但finalize()方法不是
 * 析构函数。
 * 1.对象可能不被垃圾回收
 * 2.垃圾回收不等于"析构"
 * 3.垃圾回收只与内存有关
 * 对finalize()的需求被限制到了极端的情况：即通过某种创建对象以外的方式为对象分配了存储空间。
 * <p>
 * 无论是“释放”还是“终结”都不一定发生，如果JVM没有面临内存耗尽的情况，那么它不会浪费时间去执行
 * 垃圾回收以恢复内存的。
 * <p>
 * 垃圾回收机制
 * 引用计数：是常用来说明垃圾回收的工作方式，但它没有被应用到任何的垃圾回收器中。
 * 其缺点是：开销大，且对交叉引用的类，会出现类应该被回收但是引用不为0的情况。
 * 追踪应用：对于堆或静态区的对象，必须追踪到其存活在堆栈或静态存储区的引用。对于发现的每个引用，必须追踪
 * 它所引用的对象，然后是此对象包含的所有引用，如此反复，直到“根源于堆栈和静态存储区的引用”所形成的网络
 * 全部被访问为止。
 *
 * 对于追踪到的活对象的处理方法是：1.停止-复制；2.标记-清除（在追踪活对象时，进行标记，最后清除）
 */

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // 这一部分是需要的，但是它被注释掉了，仅仅是因为需要异常处理。
        // 应该总是假设基类需要进行清理工作。
        // super.finalize(); // Call the base-class version.
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }
}
