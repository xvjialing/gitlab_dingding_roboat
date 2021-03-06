# gitlab钉钉机器人

> 我们常使用gitlab来存储代码，使用钉钉来进行工作交流，但很多情况下需要将gitlab的一些信息实时推送到钉钉，例如代码提交信息，gitlab流水线构建状态与情况。以下就是通过在工程中设置webhook地址，将pipeline消息推送到机器人，机器人对数据进行处理之后推送到钉钉群的自定义机器人。

## 创建钉钉机器人
先在钉钉群中智能群助手中创建自定义机器人，选择添加自定义机器人，然后安全设置选择加签，创建成功之后会有签名密钥与`webhook`推送链接

## 修改机器人配置
修改机器人工程的`src\main\resources\application.yml`文件,`secret`为钉钉机器人的加签密钥，`URL`为钉钉机器人`webhook`地址，然后启动项目，可根据需要修改程序端口等基本配置。

## gitlab添加webhook地址
在需要推送`gitlab`构建信息的工程中，在`webhook`设置中添加机器人工程的地址`http://IP:PORT/v1/data`,`IP`和`PORT`代表机器人启动的IP地址和端口号。

