/* Copyright (c) 2013, Regents of the University of California.  See License.txt for details */

package org.grayleaves.utility;

public class TestingComponent
{

	private Boolean[] input;

	public void input(Boolean[] booleans)
	{
		input = booleans; 
	}

	public Boolean[] process()
	{
		Boolean[] output = new Boolean[input.length]; 
		for (int i = 0; i < input.length; i++)
		{
			output[i] = !input[i];
		}
		return output;
	}
	public void feedback(Integer index, Boolean feedback)
	{
		input[index] = !feedback; 
	}
}
