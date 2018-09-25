package com.platform.field.mapping.configure.multi.datasource;

import java.io.Serializable;
import java.util.Map;

public class MultiConfigure implements Serializable{

	private static final long serialVersionUID = -4327375234243745826L;
	
	private String dataAlias;
	
	private ConnectionPropertiesConfigure master;
	
	private ConnectionPropertiesConfigure hypotaxis;
	
	private Map<String,ConnectionPropertiesConfigure> dataConnectList;
	
	public MultiConfigure() {};
/*	
	public MultiConfigure(String dataAlias) {
		this.dataAlias=dataAlias;
		if(null!=dataAlias && dataAlias.trim()!="") {
			String[] alias=dataAlias.split(",");
			this.dataConnectList=new HashMap<String,ConnectionPropertiesConfigure>();
			for(String alia:alias) {
				ConnectionPropertiesConfigure config=new ConnectionPropertiesConfigure();
				dataConnectList.put(alia, config);
			}
		}
	}
*/
	public String getDataAlias() {
		return dataAlias;
	}

	public void setDataAlias(String dataAlias) {
		this.dataAlias = dataAlias;
	}

	public ConnectionPropertiesConfigure getMaster() {
		return master;
	}

	public void setMaster(ConnectionPropertiesConfigure master) {
		this.master = master;
	}

	public ConnectionPropertiesConfigure getHypotaxis() {
		return hypotaxis;
	}

	public void setHypotaxis(ConnectionPropertiesConfigure hypotaxis) {
		this.hypotaxis = hypotaxis;
	}

	public Map<String, ConnectionPropertiesConfigure> getDataConnectList() {
		return dataConnectList;
	}

	public void setDataConnectList(Map<String, ConnectionPropertiesConfigure> dataConnectList) {
		this.dataConnectList = dataConnectList;
	}
}
