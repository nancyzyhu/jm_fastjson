# jm_fastjson
聚美优品fastjson的定制化开发
聚美优品根据fastjson的安卓版本库源码做的定制修改,目前新加的功能点有两个:
1.支持聚美图片字典解析,通过`@JMIMG`标注一个类型为String的字段是否为聚美图片字段,如果是聚美图片字段,本库根据手机分辨率自动选择最佳图片url.
2.在解析场景为字段增加多alias支持,避免仅仅是因为字段名不同而反复生成Rsp协议文件.


用法参考：RogerRsp.java和TestDriver.java.
