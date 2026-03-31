//package M1Sets;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class File{
//	String fileName;
//	String version;
//	int fileSize;
//	public File(String fileName, String version, int fileSize) {
//		super();
//		this.fileName = fileName;
//		this.version = version;
//		this.fileSize = fileSize;
//	}
//	
//	public String getfileName() {
//		return fileName;
//	}
//	public String getVersion() {
//		return version;
//	}
//	public int getfileSize() {
//		return fileSize;
//	}
//	@Override
//	public String toString() {
//		return fileName +" "+version+" "+ fileSize;
//	}
//	
//}
//class Utility{
//	public static List<File> list = new ArrayList<>();
//	
//	public void upload(File file) {
//		
//			if(!list.contains(file)) {
//				list.add(file);
//			}
//		
//	}
//	public void fetch(String fileName) {
//		Collections.sort(list,(f1,f2)->f1.getfileSize()-f2.getfileSize());
//		for(File f : list) {
//			if(f.getfileName().equalsIgnoreCase(fileName)) {
//				System.out.println(f);
//			}
//		}
//	}
//	public void latest(String fileName) {
//		for(int i =list.size() -1 ; i>0;i--) {
//			File f = list.get(list.size()-i);
//			if(f.getfileName().equalsIgnoreCase(fileName)) {
//				System.out.println(f);
//				break;
//			}
//		}
//		
//		
//	}
//	public void totalStorage(String fileName) {
//		int sum =0;
//		for(File f  : list) {
//			if(f.getfileName().equalsIgnoreCase(fileName)) {
//			sum +=f.getfileSize();}
//		}
//		System.out.println(fileName +" " +sum);
//		
//	}
//	
//}
//public class VersionControlFileSystem {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.nextLine());
//		Utility u = new Utility();
//		
//		while(n-- >0 && sc.hasNext()) {
//			String input = sc.nextLine();
//			String[] values = input.split(" ");
//			String operation = values[0];
//			
//			if(operation.equalsIgnoreCase("upload")) {
//				String fileName = values[1];
//				String version = values[2];
//				int size = Integer.parseInt(values[3]);
//				u.upload(new File( fileName, version, size));
//			}
//			else if(operation.equalsIgnoreCase("total_storage")) {
//				u.totalStorage(values[1]);
//			}
//			
//			else if(operation.equalsIgnoreCase("fetch")) {
//				String fileName = values[1];
//				u.fetch(fileName);
//			}
//            
//			else if(operation.equalsIgnoreCase("latest")) {
//				String fileName = values[1];
//				u.latest(fileName);
//			} 
//		}
//
//	}
//
//}
package M1Sets;

import java.util.*;

class File {
    String fileName;
    String version;
    int fileSize;

    public File(String fileName, String version, int fileSize) {
        this.fileName = fileName;
        this.version = version;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public String getVersion() {
        return version;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return fileName + " " + version + " " + fileSize;
    }
}

class Utility {

    public static List<File> list = new ArrayList<>();

    // Upload file
    public void upload(File file) {
        list.add(file);
    }

    // Fetch files of same name sorted by size
    public void fetch(String fileName) {

        List<File> temp = new ArrayList<>();

        for (File f : list) {
            if (f.getFileName().equalsIgnoreCase(fileName)) {
                temp.add(f);
            }
        }

        Collections.sort(temp, (f1, f2) -> f1.getFileSize() - f2.getFileSize());

        for (File f : temp) {
            System.out.println(f);
        }
    }

    // Latest uploaded file
    public void latest(String fileName) {

        for (int i = list.size() - 1; i >= 0; i--) {
            File f = list.get(i);

            if (f.getFileName().equalsIgnoreCase(fileName)) {
                System.out.println(f);
                return;
            }
        }
    }

    // Total storage of file
    public void totalStorage(String fileName) {

        int sum = 0;

        for (File f : list) {
            if (f.getFileName().equalsIgnoreCase(fileName)) {
                sum += f.getFileSize();
            }
        }

        System.out.println(fileName + " " + sum);
    }
}

public class VersionControlFileSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Utility u = new Utility();

        while (n-- > 0) {

            String input = sc.nextLine();
            String[] values = input.split(" ");

            String operation = values[0];

            if (operation.equalsIgnoreCase("upload")) {

                String fileName = values[1];
                String version = values[2];
                int size = Integer.parseInt(values[3]);

                u.upload(new File(fileName, version, size));
            }

            else if (operation.equalsIgnoreCase("fetch")) {

                String fileName = values[1];
                u.fetch(fileName);
            }

            else if (operation.equalsIgnoreCase("latest")) {

                String fileName = values[1];
                u.latest(fileName);
            }

            else if (operation.equalsIgnoreCase("total_storage")) {

                String fileName = values[1];
                u.totalStorage(fileName);
            }
        }

        sc.close();
    }
}
