<%@ page
pageEncoding="UTF-8"
%><%@ taglib prefix="s"	uri="/struts-tags"
%><%@ taglib prefix="t" uri="/test-tags"
%>
<html><head>
	<title>FreeMarker attributes error</title>
</head><body>
after "<code>gradle update_libs</code>", launch tomcat 10.1 Server.
<ul>
	<li><a href="http://localhost:8080/test/index.htm">static link</a>
	<li><t:a action="index" original="1">original</t:a>
	<li><t:a action="index">customed may error</t:a>
</ul>
</body></html>