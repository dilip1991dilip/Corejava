package corejavaproject;

import java.io.File;
import java.util.Scanner;

public class Project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char yes;

		do {
			// Welcome note developer details and guideline for use of the application
			System.out.println(
					"Wellcome to my Java Project_1 \n \n Project Name: Simple File Operation.\n Developer Name: Dileep Kumar \n Location: India  \n");

			System.out.println(
					"Note:-Fully qualified directory and file name should be use here for proper operation of the application \n");

			System.out.println("Press 1 then enter to show available list of Files \n");

			System.out.println("Press 2 then enter to add the specified file into the directory \n  ");

			System.out.println(
					"Press 3 then enter  to delete the specified file from the directory \n Caution: use it carefully! \n");

			System.out.println("Press 4 then enter and  to search the specified file from the directory \n  ");

			System.out.println("Press 5 to exit from the application");

			int choice = scanner.nextInt();

			////////////////////////////////

			switch (choice) {
			case 1:
				System.out.println(
						"Type the directory path and enter \n(Directory path should be like this- D://name_of_subdirectoty  ):\n");
				try {

					String dirpath = scanner.next();
					File f = new File(dirpath);
					String s1[] = f.list();
					for (String s2 : s1) {

						File f2 = new File(f, s2);
						if (f2.isFile()) {
							System.out.println(s2);
						}
					
					}

				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				System.out.println(
						"Type the directory path and file name with extension \n (Directory path should be like this-example - D://new_file_name.txt ):\n ");
				try {

					String filename1 = scanner.next();
					File f = new File(filename1);
					if (f.createNewFile()) {
						System.out.println("File has been created");
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 3:

				System.out.println(
						"Type the directory path and file name with extension name \n(Directory path should be like this-example - D://name_of_subdirectoty//new_file_name.txt  \n)");
				try {
					String filename3 = scanner.next();
					File f3 = new File(filename3);
					if (f3.delete()) {
						System.out.println("File has been deleted");

					}

				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;

			case 4:
				System.out.println("Type the directory path and file name with extension name");
				try {
					String filename3 = scanner.next();
					File f4 = new File(filename3);
					if (f4.exists()) {

						System.out.println("Your file is available in directory ");

					} else {
						System.out.println("Your file is not available in directory ");
					}

				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());

				}
				break;
			case 5:
				System.out.println("Exited.... ");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			//////////////////////////////

			System.out.println("\nDo you want to continue (Type y or n) \n");
			yes = scanner.next().charAt(0);

		} while (yes == 'Y' || yes == 'y');

		System.out.println("You have been exited..");

	}

}
