<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>��¼</title>
</head>
<body>
<s:form action="index.action" method="post" theme="simple">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��ӭ��¼ϵͳ<br/>
	<s:textfield name="logon.username" label="�û���" size="20"/>
	<s:password name="logon.password" label="����" size="20"/>
	<s:submit value="��¼"/>
    <s:reset value="����"/>
</s:form>
��Ҫע�ᣬ�뵥��<a href="">ע��</a>��
</body>
</html>
