package org.omnaest.metabolomics.hmdb.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JSONHelper
{
	public static String prettyPrint(Object object)
	{
		String retval = null;
		try
		{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

			retval = objectMapper.writeValueAsString(object);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return retval;
	}

	public static <T> T readFromString(String data, Class<T> type)
	{
		T retval = null;
		try
		{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

			retval = objectMapper.readValue(data, type);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return retval;
	}
}
