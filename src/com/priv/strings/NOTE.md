##学习笔记
<ol>
<li>
    Java SE5中在PrintStream和PrintWrite对象中添加了format()函数，以打印格式化的字符串。并且，在String对象上也添加了format()对象。
    String.format()实际是在函数内部创建了Formatter对象，该对象创建时，接受一个输出流，如System.out。
</li>
<li>
    Java中正则表达式有所不同，在其他语言中\\表示插入一个普通的反斜线，请不要让他有任何特殊含义；而在Java中\\表示“我要插入一个正则表达式的反斜线，所以其后面的字符具有特殊含义”。例如：\\d表示一位数字。如果想
    插入普通的反斜线应该这样写\\\\。但是换行制表之类的东西却只需要一个反斜线，如\n\t。
</li>
<li>
    正则表达式部分：
    <ul>
        <li>
         String对象有内建的正则表达式匹配函数。string.matches(regex);(小写表示对象)
        </li>
        <li>
        string.split(regex)函数，分离的子串不包括正则式匹配部分。split()拥有重载版本，限制字符分割次数。
        </li>
        <li>
        \w指的是词字符[a-zA-Z0-9]并没有单独指代字母。
        </li>
        <li>
        量词类型：
            <ol>
                <li>
                贪婪型：尽可能的匹配多的字符串，默认类型。
                </li>
                <li>
                勉强型：匹配尽可能少的字符串。使用？指配。
                </li>
                <li>
                占有型：匹配失配时防止回溯。使用+指配。
                </li>
            </ol>
        </li>
        <li>
        (?m)等标志必须放在正则式中合适的位置，一般对其放置位置后面的字符起作用。
        </li>
    </ul>
</li>
<li>
    接口CharSequence从CharBuffer、String、StringBuffer、StringBuilder中抽象出字符序列的一般定义。多数正则表达式操作都接受CharSequence类型的参数。
    <pre>
    interface CharSequence {
        charAt(int i);
        length();
        subString(int start, int end);
        toString();
    }
    </pre>
</li>
<li>
    Pattern对象也拥有split()函数，不要和string.split()混淆了。
</li>
<li>
    使用matcher.reset(new string)可以将Matcher对象重新用于另一个字符串。如果不带参数，则是重置当前字符串。
</li>
<li>
   通过将正则式各个部分用()分割，在配合使用group(i)来一次分离不同部分的字符。
</li>
<li>this和字符串做链接操作时，调用的是this指代对象的toString()方法 ，如果该方法被覆盖，那么久可能发生递归调用。</li>
</ol>