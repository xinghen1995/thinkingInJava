##学习记录
1. 无法找到或加载主类。
    * 我尝试熟悉Java自身的编译器，而摆脱对IDE的依赖时，发现在*.java文件的同一目录下，编译可以通过，但是不能执行。
    * 当代码中存在package存在时，在JVM看来完整的类名应该是包名+类名。例如Package com.priv.Helloworld，正确的执行应该是在src目录下运行java com.priv.HelloWorld
    * 可以不在src目录下运行，通过-cp选项，可以指定类文件查找目录。
2. 
