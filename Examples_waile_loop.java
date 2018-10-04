/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_of_besic;

/**
 *
 * @author esraa yousef
 */
public class Examples_waile_loop {
    /*
      الفرق بين ال for loop  و ال  waile loop
        
for loop : بستخدمها لما أكون محدد من أين أبدأ ومن أين أنتهي .

waile loop : نفس ال for loop , لكن الفرق أنه بأستخدمها في حال عدم معرفة أين البرنامج أين سينتهي .

     */
 /*
        Example waile loop
    
        طريقة كتابتها :
         
        int i=0; counter
        while(boolean Expresion){
            
            body Code
            
            i++; الزيادة لكل لفه
        }
    }
   
    //---------------------------------------------------------------
   
      /*
    
        برنامج يبطبع الاعداد من 1 الى 10
        int i=1;
       while(i<=10){
           System.out.println(i);
           i++;
       }
    
     */
    //---------------------------------------------------------------
    /*
        برنامج لطباعة الارقام الزوجية من1 الى 100
        
         int j=1; 1 - انشانا عداد
          while(j<100){ 2 - طالما العداد أصغر من 100
           if(j%2==0){ 3 - أفحص الارقام من 1 الى 100 هل هي زوجية أم لا
               System.out.println(j); 4 - أطبع رقم في كل لفة
           }
           j++; في كل لفة زيد العداد بواحد
    
       }
    
     */
    //------------------------------------------------------------
    /*
        فحص الارقام الزوجية من 100 الى 1
        
        int j=100;
       while(j>=1){
           if(j%2==0){
               System.out.println(j);
           }
           j--;
       }
    
     */
    //--------------------------------------------------------------
    /*
        طباعة الارقام من 100 الى 1
        int j = 100;
        while (j >= 1) {
            System.out.println(j);

            j--;
        }
    
     */
    //---------------------------------------------------------------
    /*
        برنامج تقطيع الكلمة مع وجود علامة - بين كل حرف
       String n = "Hello worled";
        int i=0;
        while(i<=n.length()-1){
            char c = n.charAt(i);
            if(i==n.length()-1){
                System.out.print(c);
            }else{
                System.out.print(c+"-");
            }
            
            i++;
        }
        System.out.println();
     */
    //----------------------------------------------------------------
    /*
        برنامج تقطيع الكلمة بدون علامة - بين كل حرف
       String n = "Hello worled";
        int i = 0;
         while (i <= n.length() - 1) {
            char c = n.charAt(i);

            System.out.println(c);

            i++;
        }
     */
    //---------------------------------------------------------
    /*
        برنامج لادخال كلمات غير محدودة
        Scanner s = new Scanner(System.in);// 1 - انشاء سكنر
       int i=1; // هذه لطباعة عدد مرات الادخال
       System.out.println("Enter name "+i+" : ");//2 - رسالة للمستخدم
       String name = s.nextLine();//3 - هيدخل أول كلمة
       
       while(name.equalsIgnoreCase("done")==false){//4 - هيفضل مستمر في الأدخال لعند مالمستخد يكتب done
            System.out.println("You Entered : "+name);//5 - اذا شرط الاستمرار تحقق , اطبع أنه الاسم مطبوع
            i++;
            System.out.println("Enter name "+i+" : ");//6 - رسالة ادخال للمستخدم
            name = s.nextLine();// 7 - ادخل من جديد
           
            /*
            اذا المستخدم كتب done  البرنامج سيقف وسيكمل على اللي بعده , يعني هيطلع من ال while
            
    }
       System.out.println("Thanks You");
     */
    //--------------------------------------------------------------
    /* 
       ادخال أعداد أولية غير محدودة , وعند أدخال رقم زوجي سيتم انهاء البرنامج
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number For Scan is Prime");
        int x = s.nextInt();
      
      int i=2;
      while((x%i)!=0){
          System.out.println("Number Of "+x+" is Prime");
            System.out.println("Enter number For Scan is Prime");
          x = s.nextInt();
          
          
        
      }
      System.out.println("Number Of "+x+" is not Prime");
    
      
     */
    //-----------------------------------------------------------------
    /*
        أدخال كلمات غير محدودة وتقطيعها , ولكن عندما يدخل المستخدم كلمة done  سيتم انهاء البرنامج
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        String name = s.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char subWord = name.charAt(i);
            System.out.println(subWord);
        }

        while (!name.equalsIgnoreCase("done")) {
            System.out.println("Enter name");
            name = s.nextLine();
            for (int i = 0; i < name.length(); i++) {
                char subWord = name.charAt(i);
                System.out.println(subWord);
            }
        }
     */
}
