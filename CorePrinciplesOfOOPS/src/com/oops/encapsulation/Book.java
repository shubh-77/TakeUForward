package com.oops.encapsulation;
import java.util.ArrayList;
import java.util.List;

class Book{

    public List<String> title = new ArrayList<>();
    public List<String> authors= new ArrayList<>();
    private List<Boolean> isAvailable= new ArrayList<>();




    Book(List<String> title, List<String> authors, List<Boolean> isAvailable){

        this.title=title;
        this.authors=authors;
        this.isAvailable=isAvailable;

    }


    public void borrowBook(String bookName){

           int index=0;
            for(int i=0;i<title.size();i++){
                if(title.get(i).equals(bookName)){
                    index=i;
                    break;
                }
         }
        if(isAvailable.get(index)==false){
            System.out.println("Book is not available.");
        }else{
            isAvailable.set(index,false);
        }





    }




    public void returnBook(String bookName){
        int index=0;
        for(int i=0;i<title.size();i++){
            if(title.get(i).equals(bookName)){
                index=i;
                break;
            }
        }

        isAvailable.set(index,true);






    }


   
    public void getAvailability(String bookName){
        int index=0;
        for(int i=0;i<title.size();i++){
            if(title.get(i).equals(bookName)){
                index=i;
                break;
            }
        }

        if(isAvailable.get(index)==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }








}