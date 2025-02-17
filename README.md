after ``gradle update_libs``, launch tomcat 10.1 Server.
And access [test site](http://localhost:8080/test/index.htm).

[I reported this error.](https://stackoverflow.com/q/79396269/3796339)

`template/simple/a-close.ftl` is a standard template that assumes that attributes are given from the struts system.<br/>
If I use the standard Anchor class, attributes are given as Map object(→Success),
but if I extend the Anchor class, attributes seem to be null(→Fail).<br/>
It is unclear what controls whether attributes are given.