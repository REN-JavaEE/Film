<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>µÇÂ¼</title>
</head>
<body>
<s:form action="index.action" method="post" theme="simple">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;»¶Ó­µÇÂ¼ÏµÍ³<br/>
	<s:textfield name="logon.username" label="ÓÃ»§Ãû" size="20"/>
	<s:password name="logon.password" label="ÃÜÂë" size="20"/>
	<s:submit value="µÇÂ¼"/>
    <s:reset value="ÖØÖÃ"/>
</s:form>
ÐèÒª×¢²á£¬Çëµ¥»÷<a href="">×¢²á</a>£¡
</body>
</html>
