package com.cognologix.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class SoftwarePojo{
	private String server;
	private String type;
	private String software;
	private String version;
	
	public SoftwarePojo(String server, String type, String software, String version) {
		super();
		this.server = server;
		this.type = type;
		this.software = software;
		this.version = version;
	}

	public String getServer() {
		return server;
	}



	public void setServer(String server) {
		this.server = server;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getSoftware() {
		return software;
	}



	public void setSoftware(String software) {
		this.software = software;
	}



	public String getVersion() {
		return version;
	}



	public void setVersion(String version) {
		this.version = version;
	}



	@Override
	public String toString() {
		return "SoftwarePojo [server=" + server + ", type=" + type + ", software=" + software + ", version=" + version
				+ "]";
	}
	
}

public class Softwares {
	public static void main(String[] args) {
		List<SoftwarePojo> list = new ArrayList<SoftwarePojo>();
		SoftwarePojo sp1 = new SoftwarePojo("Server1", "Database", "MySQL", "5.5");
		SoftwarePojo sp2 = new SoftwarePojo("Server2", "Database", "MySQL", "5.1");
		SoftwarePojo sp3 = new SoftwarePojo("Server3", "OS", "Ubuntu", "12.04");
		SoftwarePojo sp4 = new SoftwarePojo("Server1", "OS", "Ubuntu", "12.04");
		SoftwarePojo sp5 = new SoftwarePojo("Server2", "OS", "Ubuntu", "18.04");
		SoftwarePojo sp6 = new SoftwarePojo("Server1", "Language", "Python", "2.6.3");
		
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		list.add(sp4);
		list.add(sp5);
		list.add(sp6);
		Map<Integer, String> swMap = new HashMap<Integer, String>();
		Iterator<SoftwarePojo> it = list.iterator();
		while(it.hasNext()) {
			SoftwarePojo sw = it.next();
			if(swMap.containsValue(sw.getSoftware()) == false) {
				swMap.put(1, sw.getSoftware());
			} else {
				int count = 1;
				Iterator iter = swMap.entrySet().iterator();
				while(iter.hasNext()) {
					Map.Entry<Integer, String> mp = (Map.Entry<Integer, String>)iter.next();
					if(mp.getValue() == sw.getSoftware()) {
						count++;
					}
				}
				swMap.put(count, sw.getSoftware());
			}
		}
		System.out.println(swMap);
		
	}
}
