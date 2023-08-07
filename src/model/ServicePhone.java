package model;

public class ServicePhone {
	
	private Phone phoneOne;
	private Phone phonetwo;
	private Phone phoneThree;

	
	public void setPhoneOne(Phone phone) {
		this.phoneOne=phone;
	}
	public void setPhoneTwo(Phone phone) {
		this.phonetwo=phone;
	}
	public void setPhoneThree(Phone phone) {
		this.phoneThree=phone;
	}
	
	public Phone getPhoneOne() {
		return phoneOne;
	}
	public Phone getPhoneTwo() {
		return phonetwo;
	}
	public Phone getPhoneThree() {
		return phoneThree;
	}
	 public boolean registryCall(Phone phone, int age, EtypeCall etypeCall) {
		 
		 return false;
	 }
	 /**
	  * 
	  * @param imai
	  * @return phone
	  */
	 public Phone findPhone(String imai) {
		  if (phoneOne != null && phoneOne.getImei().equals(imai)) {
		        return phoneOne;
		    } else if (phonetwo != null && phonetwo.getImei().equals(imai)) {
		        return phonetwo;
		    } else if (phoneThree != null && phoneThree.getImei().equals(imai)) {
		        return phoneThree;
		    }

		    return null;
		    	 		 
	 }
	 
	 
	 public int  addMinutes(Phone phone) {
		 return 0;
	 }
	 
}