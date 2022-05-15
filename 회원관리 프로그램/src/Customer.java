
class Customer {
	String name;		// �̸�
	String address;		// �ּ�
	String phone;		// �ڵ��� ��ȣ
	String id;			// ȸ�� ��ȣ
	String program;		// ���α׷�
	String instructor;	// ����
	String start;		// �������
	String friend;		// ��õ��
	

	

	public Customer(String name, String address, String phone, String id, String program, String instructor, String start, String friend ) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.id = id;
		this.program = program;
		this.instructor = instructor;
		this.start = start;
		this.friend = friend;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
	
	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}
	
	
	
	

	@Override
	public String toString() {
		return "[ ���̸�: " + name + " , �ּ�: " + address + " , ��ȣ: " + phone + ", ȸ����ȣ: " + id + ", ���α׷�: " + program + ", ����: " + instructor + ", �������: " + start + ", ��õ��: " + friend + "]";
	}

}