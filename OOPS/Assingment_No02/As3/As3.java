class Book{

  String title;
  String author ;
  String publisher;
  int isbn;
  int year;
  int price;
  int quantity;
 
   Book(){      
       title= "Leadership Learning From Chhatrapati Shivaji Maharaj ";
       author= "by Cyrus Gonda & Dr. Nitin";
       publisher="Saket Prakashan Pvt. Ltd";
       isbn = 817323;
       year=  2013;
       price = 340;
       quantity= 30;
   }

   void increse_q(int quantity){
       this.quantity+=quantity;
   }
  
   void decrese_q(int quantity){
       this.quantity-=quantity;
   }
  
  void getInventoryValue(){
      int pr = quantity * price;
      System.out.println(" InventoryValue of "+this.title+" is "+pr);
  }

    String get_title(){

        return this.title;
    }
    String get_Author(){

        return this.author;
    }
    String get_publisher(){

        return this.publisher;
    }
    int get_isbn(){

        return this.isbn;
    }
    int get_year(){

        return this.year;
    }
    int  get_price(){

        return this.price;
    }
    int get_quantity(){

        return this.quantity;
    }
    void set_title(String title){

         this.title=title;
    }
    void set_author(String author){

        this.author  = author;
    }
    void set_publisher(String publisher){

        this.publisher=publisher;
    }
    void set_isbn(int isbn){

         this.isbn=isbn;
    }
    void set_year(int year){

        this.year=year;
    }
    void  set_price(int price){

         this.price =price;
    }
    void set_quantity(int quantity){

         this.quantity = quantity;
    }


    
    
}

class As3{

  public static void main(String args[]){

       Book b1 = new Book();

      b1.getInventoryValue();
      b1.set_price(200);
      b1.getInventoryValue();

  }
}