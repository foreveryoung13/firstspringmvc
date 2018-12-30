package com.nanafebriana.customeditor;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		if (name.contains("Mr.") || name.contains("Ms.")) {
			setValue(name);
		} else {
			name = "Mr. " + name;
			setValue(name);
		}
	}

}
