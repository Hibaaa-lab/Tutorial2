package library ;

class EBook extends LibraryItem {
private int filesize ;
private String format;

public EBook (String title, String author, int filesize, String format) {
super(title, author);
this.filesize = filesize;
this.format = format; 
}

@Override
public void displayInfo (){
super.displayInfo();
System.out.println("filesize :"+ filesize);
System.out.println("format :" + format);
}

@Override
public void getItemType (){
    System.out.println("EBook");
}

}