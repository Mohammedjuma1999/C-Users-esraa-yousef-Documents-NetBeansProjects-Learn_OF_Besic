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
public class Examples_For_Loop {
    /*
        برنامج يطبع الكلمة بالعكس
       Scanner s = new Scanner(System.in);
       String word = s.nextLine();
       
       for(int i=word.length()-1;i>=0;i--){
       System.out.print(word.charAt(i));
       }
    */
    //-------------------------------------------------------------
    /*
        برنامج يجزء الأحرف ويضع بين كل حرف علامة -
            Scanner s = new Scanner(System.in);
            for (int j = 1; j <=10; j++) {

            String inName = s.nextLine();
            for (int i = 0; i <= inName.length() - 1; i++) {
                char c = inName.charAt(i);

                if (i == inName.length() - 1) {// اذا كنت واصل عند اخر حرف لاتطبع بعده علامة -

                    System.out.print(c);

                } else {// غير هيك : اذا ما كان اخر حرف حط علامة - بعده وكمل لحد ماتصل اخر حرف

                    System.out.print(c + "-");
                }

            }
            System.out.println("\n");
        }
    
    */
    //-------------------------------------------------------------
    /*
        برنامج لطباعة مضروب الارقام من 1 الى 10 :
    
        الحلقة الكبيرة  for(int n=1;n<=10;n++){//الخطوة الثانية : عملنا حلقة تمر على الأرقام وتطبع مضروب كل رقم
        int pr = 1;// لاحظ عرفنا المتغير داخل الحلقة الكبيرة وقبل الحلقة الداخلية
        
الحلقة الداخلية  for(int i=1;i<n;i++){// الخطوة الأولى , جبنا مضروب الرقم نفسه
                                   
            pr*=i; // خزن ناتج مضروب كل رقم في المتغير pr
        }
        System.out.println("Factorial of "+n+" = "+pr);//لاحظ أنه جملة الطباعة وضعناها داخل الحلقة الكبيرة
    }
    
*/
    //--------------------------------------------------------------
    /*
        برنامج لحساب مضروب الرقم
     Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = 1;
        for(int i=n;i>=1;i--){
            f*=i;
        }
        System.out.println("Factorial of "+n+" = "+f);
    */
    //--------------------------------------------------------------
    /*
    برنامج لحل متتابعة حسابية .

    Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            double sum = 0;
            for(int i=1;i<=n;i++){
                sum+=1d/i;
            }
            System.out.println(sum);

    */
    
    //--------------------------------------------------------------
    /*
        مثال على الحلقات المتداخلة
        for(int j=0;j<5;j++){ 1 - طباعة الاسطر
               for(int i=0;i<10;i++){2 - طباعة النجوم
                System.out.print("*");
           }
               System.out.print("\n"); 3 - أنزل سطر بعد كل لفة
         }
    */
  //----------------------------------------------------------------  
    
    /*
    فحص العدد أولي أم لا
    الطريقة الاولى..
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
               
        boolean isPrime = true;
        for(int i =2;i<=n-1;i++){
            System.out.println(i);
            if(n%i==0){
               isPrime=false;
                 break; //وقف الحلقة
            }
          
        }
        if(isPrime==true){
             System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
    */
    //--------------------------------------------------------------
    /*
    برنامج لمعرفة العدد أولي أم لا
   الطريقة الثانية : 
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String isPrime = "is Prime";
        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                isPrime = "is not Prime";
                break; //وقف الحلقة
            }

        }
        System.out.println(n + " " + isPrime);
    */
}
