package baitap1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputKey = -1;
		while (inputKey != 0) {
			System.out.println("|------------------------MENU-----------------------------|");
			System.out.println("| 1. Chương trình tính cạnh huyền                         |");
			System.out.println("| 2. Chương trình tính giá trị đơn thức                   |");
			System.out.println("| 3. Chương trình tính tổng số nguyên dương hai ký số     |");
			System.out.println("| 4. Chương trình tính TBC 5 số nhập từ bàn phím          |");
			System.out.println("| 5. Chương trình đổi độ C sang độ F                      |");
			System.out.println("| 6. Chương trình đổi USD sàn VND                         |");
			System.out.println("| 0. Thoát                                                |");
			System.out.println("|---------------------------------------------------------|");
			Scanner console = new Scanner(System.in);
			System.out.print("Vui lòng chọn một số : ");
			inputKey = console.nextInt();
			switch (inputKey) {
			case 0:
				System.out.println("Tạm biệt!");
				break;
			case 1:
				tinhcanhhuyen();
				break;
			case 2:
				tinhGiaTriDonThuc();
				;
				break;
			case 3:
				tinhTongHaiSoNguyenDuong();
				break;
			case 4:
				tinhTBC();
				break;
			case 5:
				doiNhietDo();
				break;
			case 6:
				doiTien();
				break;
			default:
				System.out.println("Hãy chọn lại!");
				break;
			}
		}
	}

	private static void doiTien() {
		// TODO Auto-generated method stub
		System.out.println("6. Chương trình đổi USD sàn VND");
		double menhgia = 23500;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tiền USD: ");
		double usd = scanner.nextDouble();
		double vnd = usd * menhgia;
		System.out.printf("Số tiền VNĐ tương ứng là: %.0f\n", vnd);
	}

	private static void doiNhietDo() {
		// TODO Auto-generated method stub
		System.out.println("5. Chương trình đổi độ C sang độ F");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập nhiệt độ theo độ C: ");
		double c = scanner.nextDouble();
		double f = (c * 1.8) + 32;
		System.out.printf("Nhiệt độ theo độ F là: %.2f\n", f);
	}

	private static void tinhTBC() {
		// TODO Auto-generated method stub
		System.out.println("4. Chương trình tính TBC 5 số nhập từ bàn phím");
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Nhập số thứ " + i + ": ");
			double value = scanner.nextDouble();
			sum += value;
		}
		double average = sum / 5;
		System.out.printf("Giá trị trung bình của 5 số là: %.2f\n", average);

	}

	private static void tinhTongHaiSoNguyenDuong() {
		// TODO Auto-generated method stub
		System.out.println("3. Chương trình tính tổng số nguyên dương hai ký số");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên dương n có 2 chữ số: ");
		int n = scanner.nextInt();
		if (n < 10 || n > 99) {
			System.out.println("Vui lòng nhập số nguyên dương có 2 chữ số!");
		} else {
			int chuc = n / 10;
			int donvi = n % 10;
			int sum = chuc + donvi;
			System.out.println("Tổng của hai chữ số là: " + sum);
		}

	}

	private static void tinhGiaTriDonThuc() {
		// TODO Auto-generated method stub
		System.out.println("2. Chương trình tính giá trị đơn thức");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào hệ số a (số thực): ");
		double a = scanner.nextDouble();
		System.out.print("Nhập vào số mũ n (số nguyên không âm): ");
		int n = scanner.nextInt();
		int x = 8;
		double P = a * Math.pow(x, n);
		System.out.printf("Giá trị của đơn thức P(x) = %.2f\n", P);

	}

	private static void tinhcanhhuyen() {
		// TODO Auto-generated method stub
		System.out.println("1. Chương trình tính cạnh huyền");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài cạnh góc vuông thứ nhất: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập vào chiều dài cạnh góc vuông thứ hai: ");
		double b = scanner.nextDouble();
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.printf("Chiều dài cạnh huyền của tam giác vuông là: %.2f\n", c);
	}
}
