1.局部视图和全局视图的配置
2.创建新分支
3.使用struts2自带的结果视图做页面跳转
	(1).chain:转发到另一个动作
	(2).chain:转发到不同名称空间的另一个动作 
	(3).freemarker：用于转发到另外一个freemarker模板。（页面静态化）
	(4).velocity：用于转发到另外一个velocity模板。
	(5).httpheader：用于输出http协议的消息头。
	(6).xslt：XML有关的样式
	(7).redirect：用于重定向到另外一个JSP页面。
	(8).redirectAction：用于重定向到另外一个动作。
	(9).stream：用于文件下载（日后再讲。文件上传和下载）
	(10).plainText：以纯文本的形式展现页面。输出源码。
4.封装请求参数
	方式一：用Action动作类作为模型对象 
	方式二：动作类和模型分开(模型)
	方式三：动作和模型分开(模型驱动：ModelDriven) 
5.静态参数注入
	是由两个拦截器来完成。
	静态参数注入：staticParams
	动态参数注入：params 


