package de.cimt.talendcomp.http;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class RequestParameterList {

	private List<NameValuePair> parameterValues = new ArrayList<NameValuePair>();
	
	public RequestParameterList add(String key, String value) {
		if (key != null && key.trim().isEmpty() == false && value != null) {
			parameterValues.add(new BasicNameValuePair(key, value));
		}
		return this;
	}
	
	public List<NameValuePair> getParameters() {
		return parameterValues;
	}
	
}
