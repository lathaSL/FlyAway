package com.dao;

import java.util.List;

import com.dto.Location;

public interface LocationDao {
	public int AddLoc(Location loc);
	public boolean RemoveLoc (Location loc);
	public  List<Location>  getLocList ();
	public String getLocName(int locId);
	public Location getLocation(int locId);

}
