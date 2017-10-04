package br.com.webservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente implements Serializable {
	private static final long serialVersionUID = 4076144634050904733L;
	private int id;
	private double longitude;
	private double latatitude;
	private String data;
	
	public Cliente() {
		
	}

	public Cliente(double longitude, double latatitude, String data) {		
		this.longitude = longitude;
		this.latatitude = latatitude;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatatitude() {
		return latatitude;
	}

	public void setLatatitude(double latatitude) {
		this.latatitude = latatitude;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", longitude=" + longitude + ", latatitude=" + latatitude + ", data=" + data + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(latatitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(latatitude) != Double.doubleToLongBits(other.latatitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		return true;
	}

}