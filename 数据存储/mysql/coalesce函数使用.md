## coalesce 函数使用

翻译： 合并

这个函数类似于编程语言中的三元函数，前面的参数是null，就往后判断，直到不是null的。如果不幸所有参数都是null，就使用最后的默认值。



eg：

```sql
select coalesce(success_cnt, 1) as cnt from tableA
```

如果success_cnt不为null，cnt就是success_cnt的值，否则就是默认的1

```sql
select coalesce(success_cnt,period,1) from tableA
-- success_cnt 不为null，就是这个值
-- success_cnt 为null，period不为null，就是period
-- success_cnt和period都为null，就是默认的1
```

