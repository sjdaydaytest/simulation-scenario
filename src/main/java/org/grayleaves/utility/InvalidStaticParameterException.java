/* Copyright (c) 2013, Regents of the University of California.  See License.txt for details */

package org.grayleaves.utility;

public class InvalidStaticParameterException extends Exception
{

	private static final long serialVersionUID = 1L;

	public InvalidStaticParameterException()
	{
	}

	public InvalidStaticParameterException(String arg0)
	{
		super(arg0);

	}

	public InvalidStaticParameterException(Throwable arg0)
	{
		super(arg0);

	}

	public InvalidStaticParameterException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);

	}

}
