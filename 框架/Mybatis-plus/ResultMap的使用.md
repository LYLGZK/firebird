# ResultMap的使用

## 一、是什么？

​		resultMap 是mybatis在使用jdbc查出来结果集【ResultSet】之后映射成POJO类/javaBean的信息。

## 二、为什么？

​		在使用jdbc查出来之后是一个resultSet结果集，而我们在编写java代码的时候，要把javaBean的字段和mysql的字段对应起来，这就需要一个映射关系来将他们进行关系映射。

## 三、怎么做？





## 四、从sql查询到java的pojo的映射

1. 通过JDBC查询得到ResultSet对象
2. 遍历ResultSet对象并将每行数据暂存到HashMap实例中，以结果集的字段名或字段别名为键，以字段值为值
3. 根据ResultMap标签的type属性通过反射实例化领域模型
4. 根据ResultMap标签的type属性和id、result等标签信息将HashMap中的键值对，填充到领域模型实例中并返回