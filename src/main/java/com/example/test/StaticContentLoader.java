package com.example.test;

import org.apache.struts2.dispatcher.DefaultStaticContentLoader;

import java.util.*;

public class StaticContentLoader extends DefaultStaticContentLoader {
	static final List<String>	DEFAULT;
	static {
		final ArrayList<String>	ls;
		
		ls	= new ArrayList<>(3);
		ls.add("static/");
		ls.add("template/");
		ls.add("org/apache/struts2/static/");
		ls.trimToSize();
		DEFAULT	= Collections.unmodifiableList(ls);
	}
	public StaticContentLoader() {
		pathPrefixes	= DEFAULT;
	}
}