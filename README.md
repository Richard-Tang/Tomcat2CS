# 介绍

Jar包后门-Tomcat启动时回连到CobaltStrike。

# 使用

使用cs生成shellcode，将shellcode放置org.apache.tomcat.ConnectCS#run的位置，生成jar包，将jar包放置tomcat的lib目录下，重启tomcat即可触发。

![操作过程](操作过程.gif)

# 环境

未测试所有环境，目前可以确定适用于如下环境。

| Java | 中间件         | 操作系统  |
| ---- | -------------- | --------- |
| 1.8  | Tomcat7/8/9/10 | Windows10 |

# 参考

[Java内存攻击技术漫谈](https://xz.aliyun.com/t/10075)

[一种tomcat中间件留持久化后门的思路](https://gv7.me/articles/2021/an-idea-of-keeping-persistent-backdoor-in-tomcat-middleware/)

# 声明

**本工具仅能在取得足够合法授权的企业安全建设中使用在使用本工具过程中，您应确保自己所有行为符合当地的法律法规。如您在使用本工具的过程中存在任何非法行为，您将自行承担所有后果，本工具所有开发者和所有贡献者不承担任何法律及连带责任。 除非您已充分阅读、完全理解并接受本协议所有条款，否则，请您不要安装并使用本工具。您的使用行为或者您以其他任何明示或者默示方式表示接受本协议的，即视为您已阅读并同意本协议的约束。**