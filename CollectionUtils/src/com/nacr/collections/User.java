package com.nacr.collections;

import java.io.Serializable;

public class User implements Serializable {

	private static final long	serialVersionUID	= 7031679283226403692L;

	private int					id;

	private String				name;

	public User( int id, String name ) {
		this.id = id;
		this.name = name;
	}

	public int getId( ) {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName( ) {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	@Override
	public String toString( ) {
		return id + " " + name;
	}

}
