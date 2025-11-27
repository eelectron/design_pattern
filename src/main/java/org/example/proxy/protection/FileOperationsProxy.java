package org.example.proxy.protection;

public class FileOperationsProxy implements FileOperations{
    FileOperations realFileOperations = new RealFileOperations();
    String userRole = null;
    public FileOperationsProxy(String userRole){
        this.userRole = userRole;
    }

    @Override
    public void read() {
        realFileOperations.read();
    }

    @Override
    public void write() {
        realFileOperations.write();
    }

    @Override
    public void delete() {
        if(userRole.equals("ADMIN") == false){
            System.out.println("ACCESS DENIED : only admins can delete the files .");
            return;
        }
        realFileOperations.delete();
    }
}
