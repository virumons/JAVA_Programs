package sdmcet.cse.oop;

class Sort {
	private int a[] = new int[10];

	Sort(int a[]) {
		this.a = a;
	}

	void bubblesort() {
		int temp;// local variable active only in bubble sort function //

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	void display() {
		for (int e : a) {
			System.out.println(e);

		}
	}
}	
	public class SortAscendingDemo{

      public static void main(String[] args) {
			// TODO Auto-generated method stub

			int arr[]= {10,4,22,15,96,89};

			int arr1[]= {25,39,26,15,5,11};

			Sort bs=new Sort(arr);

			System.out.println("before sorting");
			bs.display();
			bs.bubblesort();
			System.out.println("after sorting");
			bs.display();

			Sort bs1=new Sort(arr1);

			System.out.println("before sorting");
			bs1.display();
			bs1.bubblesort();
			System.out.println("after sorting");
			bs1.display();







		}

	}
