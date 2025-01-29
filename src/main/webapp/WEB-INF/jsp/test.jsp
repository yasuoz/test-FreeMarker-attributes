<%@ page
pageEncoding="UTF-8"
%><%@ taglib prefix="s"	uri="/struts-tags"
%><%@ taglib prefix="t" uri="/test-tags"
%>
<html><head>
	<title>FreeMarker attributes null error</title>
</head><body>
after "<code>gradle update_libs</code>", launch tomcat 10.1 Server.
<a href="https://stackoverflow.com/questions/79396269/freemarker-template-attributes-becomes-null-in-struts2-customized-anchor">I reported this error.</a>
"template/simple/a-close.ftl" is a standard template that assumes that attributes are given from the struts system.<br/>
If I use the standard Anchor class, attributes are given as Map object(→Success),
but if I extend the Anchor class, attributes seem to be null(→Fail).<br/>
It is unclear what controls whether attributes are given.
<ul>
	<li><a href="http://localhost:8080/test/index.htm">static link</a>
	<li><t:a action="index" original="1">original have attributes</t:a>
	<li><t:a action="index">customed may error</t:a>
</ul>
</body></html>