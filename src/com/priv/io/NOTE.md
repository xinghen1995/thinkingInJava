##学习笔记
![Java IOClassPic](IOClassPic.png)
![IOClassPic2](IOClassPic2.png)
<ol>
<li>FilenameFilter接口:
<pre>
public interface FilenameFilter {
    boolean accept(File dir, String name);
}
</pre>
    list()使用accept()来判断文件是否符合要求</li>
<li>RandomAccessFile类是自我独立的类，它直接从Object继承，并实现了DataInput和DataOutput接口。</li>
<li>readLine()读取后，会将\n删除。</li>
<li>readByte()读取任何字节都是正确的，不能用于检查文件结尾。可以使用available()检查剩余字节</li>
<li>Java使用的UTF-8是Java自己的一种变体，其它程序读取会有问题</li>
<li>nio改变了FileInputStream,FileOutputStream,RandomAccessFile三个类，这三个类上调用getChannel()可以获得FileChannel对象。</li>
<li>ByteBuffer直接与通道进行交互。并且向ByteBuffer中写入有两种方式。一是、使用'put'方法直接填充；二是、利用wrap()进行保证，将已经存在的字符数组填充进去。</li>
<li>使用transferTo()和transferFrom()函数可以将两个通道直接相连</li>
<li>ByteBuffer使用大端法存放数据。通过order(ByteOrder.BIG_ENDIAN)函数等设置存放方式。</li>
<li>FileChannel对象上调用tryLock()或lock()可以对文件加锁FileLock，其中tryLock()是非阻塞型，lock()会阻塞进程。</li>
<li>Serializable是一个空接口，实现该接口后使用ObjectInputStream/ObjectOutputStream的readObject()/writeObject()可以直接实现对象的序列化。</li>
<li>Serializable序列化的对象完全以文本中二进制进行恢复。但是Externalizable会在恢复是调用默认构造器，然后调用readExternal()。Externalizable控制序列化表现在，序列化时调用writeExternal()，解序列化时调用readExternal()。<li>
<li>transent的字段并非不可恢复，而是要自己保存和恢复。</li>
<li>控制的方式除了Extrenalizable之外，可以在Serializable中定义private readObject()/writeObject()。非transient的字段由defaultWriteObject()保存。</li>
<li>Java知道同一流中序列化的对象是不是同一个，但如果序列化到不同的容器中，Java将不知道是不是同一个对象。</li>
</ol>
