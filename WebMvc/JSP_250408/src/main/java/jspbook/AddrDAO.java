package jspbook;

import java.util.ArrayList;
import java.util.List;

public class AddrDAO {
	List<AddrDTO> addrlist = new ArrayList<AddrDTO>();
	
	public void add(AddrDTO ab) {
		addrlist.add(ab);
	}
	
	public List<AddrDTO> getAddrlist(){
		return addrlist;
	}
	// 이름으로 찾기.
	public AddrDTO getadd(String username) {
		for(AddrDTO ab : addrlist) {
			if(ab.getUsername().equals(username)) {
				return ab;
			}
		}
		return null;
	}
}
