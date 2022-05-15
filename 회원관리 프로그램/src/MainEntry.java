
import java.util.*;

public class MainEntry {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		// Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		int n = 0;

		Boolean flag = true;
		while (flag) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1. ȸ�� �߰�   |   2. ȸ�� ����   |   3. ȸ�� ����Ʈ   |   4. ȸ�� ���� ����   |   5. ����");
			System.out.println("------------------------------------------------------------------");
			System.out.print("������ ��ȣ�� �Է��ϼ���:");
			n = sc.nextInt();

			switch (n) {
			case 1: // �߰�
				System.out.println();
				System.out.println("�߰��� ȸ���� ������ �Է��ϼ���.");
				System.out.println("---------------------");
				System.out.print("�̸�: ");
				String name = sc.next();
				System.out.print("�ּ�: ");
				String address = sc.next();
				System.out.print("����ó: ");
				String phone = sc.next();
				System.out.print("ȸ����ȣ: ");
				String id = sc.next();
				System.out.print("���α׷�: ");
				String program = sc.next();
				System.out.print("����: ");
				String instructor = sc.next();
				System.out.print("�����: ");
				String start = sc.next();
				System.out.print("��õ��: ");
				String friend = sc.next();
				
				customers.add(new Customer(name, address, phone, id, program, instructor, start, friend ));
				System.out.println("�߰� �Ǿ����ϴ�!");
				break;

			case 2: // ����
				System.out.println();
				System.out.println("������ ȸ���� �̸��� �Է��ϼ���.");
				System.out.println("---------------------");
				System.out.print("�̸�: ");
				name = sc.next();
				for (int i = 0; i < customers.size(); i++) {
					if (name.equals(customers.get(i).getName())) {
						customers.remove(i);
						System.out.println("�����Ǿ����ϴ�!");
					} else
						System.out.println("ȸ���� �������� �ʽ��ϴ�.");
				}
				break;

			case 3: // ����Ʈ ���
				System.out.println();
				for (Customer customer : customers)
					System.out.println(customer);

			case 4: // ����
				System.out.println();
				System.out.print("������ ȸ���� �̸��� �Է��ϼ���.");
				name = sc.next();
				for (int i = 0; i < customers.size(); i++) {
					if (name.equals(customers.get(i).getName())) {

						System.out.print("�����Ͻ� �׸��� �����ϼ���. (1)�̸�  (2)�ּ�  (3)����ó  (4)ȸ����ȣ  (5)���α׷�  (6)����  (7)�������  (8)��õ��  ");
						n = sc.nextInt();
						System.out.println();

						switch (n) {
						case 1:
							System.out.print("�̸��� ���� �Է��ϼ���.");
							name = sc.next();
							customers.get(i).setName(name);
							break;
						case 2:
							System.out.print("�ּҸ� ���� �Է��ϼ���.");
							address = sc.next();
							customers.get(i).setAddress(address);
							break;
						case 3:
							System.out.print("����ó�� ���� �Է��ϼ���.");
							phone = sc.next();
							customers.get(i).setPhone(phone);
							break;
							
						case 4:
							System.out.print("ȸ����ȣ�� ���� �Է��ϼ���.");
							id = sc.next();
							customers.get(i).setId(id);	
							break;
							
						case 5:
							System.out.print("���α׷��� ���� �Է��ϼ���.");
							program = sc.next();
							customers.get(i).setProgram(program);
							break;
							
						case 6:
							System.out.print("���縦 ���� �Է��ϼ���.");
							instructor = sc.next();
							customers.get(i).setInstructor(instructor);
							break;
							
							
						case 7:
							System.out.print("������ڸ� ���� �Է��ϼ���.");
							start = sc.next();
							customers.get(i).setStart(start);	
							break;
							
						case 8:
							System.out.print("��õ���� ���� �Է��ϼ���.");
							friend = sc.next();
							customers.get(i).setFriend(friend);	
							break;
							
							
						}
						System.out.println("�����Ǿ����ϴ�!");

					} else
						System.out.println("�߸��� �����Դϴ�.");
				}

				break;

			case 5:
				flag = false;
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				break;

			default:
				System.out.println("1 ~ 5 ������ ���ڸ� �Է��ϼ���.");
				break;

			}

		}

	}

}