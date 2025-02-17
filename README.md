after ``gradle update_libs``, launch tomcat 10.1 Server.
And access [test site](http://localhost:8080/test/index.htm).

[I reported this error.](https://stackoverflow.com/q/79396269/3796339)

`template/simple/a-close.ftl` is a standard template that assumes that attributes are given from the struts system.<br/>
<s>If I use the standard Anchor class, attributes are given as Map object(→Success),
but if I extend the Anchor class, attributes seem to be null(→Fail).<br/>
It is unclear what controls whether attributes are given.</s>

This issue was solved by adding the name of custom components package (e.g. com.example.test.tag) to
[struts.properties](https://github.com/yasuoz/test-FreeMarker-attributes/commit/de2d52befacf4c7ceaebdac81c9e1b1258ba87f9#diff-65a4fdb3fc64bebc85c5c8a743f1c8e9964bfc9161cae6dbfb5233a19597b79fR4).