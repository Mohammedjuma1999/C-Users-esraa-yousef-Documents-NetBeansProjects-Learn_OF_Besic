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
public class Examples_Arrays {
    /*
    ملاحظة : Class Arrays : يوجد في داخله دوال جاهزة يمكن أن تساعدك
       تعريف مصفوفة
      1  -  int x[]= new int[25]; الطريقة الاولى 
      2  -  int y[]=new int[10]; الطريقة الثانية نفس الأولى بس اللي أختلف مكان المعرف الخاص بالمتغير
      3  -  int z[]={}; الطريقة الثالثة بتقدر تحط قيم في المصفوفة أثناء انشاءها
    دالة  x.compareTo(y); : تستخدم للمقارنة بين الاحرف في الترتيب الأبجدي وتستخدم في المصفوفات لترتيب الاحرف أبجديا .
     */
 /*
     تخزين أرقام في مصفوفة
      int[]x=new int[10];1 - مصفوفة من نوع انتجر حجمها عشرة أرقام
      Scanner s = new Scanner(System.in);2 - سكنر
      
      for(int i=0;i<10;i++){3 - جملة دوران لمرور على أماكن المصفوفة
         int numbers =  x[i]=s.nextInt();4 - لكل مكان في المصوفة خزن الرقم اللي دخله المستخدم
         System.out.println(i+" : "+numbers);5 - أطبع كل قيمة يتم تخزينها
      }
     */
    //------------------------------------------------------------
    /*
      برنامج طباعة الارقام بالمعكوس : 
        Scanner s = new Scanner(System.in);
       int number = s.nextInt();
       
       int dev = number/10;
       
       while(dev!=0){
           int mod = number%10;
           System.out.println(mod);
           number = number/10;
           dev=number/10;
       }
       if(dev==0){
           System.out.println(number%10);
       }
     */
    //----------------------------------------------------------------
    /*
        برنامج ادخال عشر أسماء وتخزينهم في مصفوفة وطباعتها .
        Scanner s = new Scanner(System.in);1 -سكنر
        String[] n = new String[5];2 - مصفوفة من نوع سترينغ
        for (int i = 0; i < n.length; i++) {3 - مر على عناصر المصفوفة
            String names = s.nextLine();* انشاء سكنر
            n[i] = names;* -ضيف ال names الى المصفوفة
            System.out.println("You Entered  : " + n[i]);
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {4 - مر على جميع عناصر المصفوفة
            System.out.println(n[i]);5 - أطبع عناصر المصفوفة
            System.out.println();
        }
    
     */
    //--------------------------------------------------------------
    /*
        برنامج طباعة مجموع المصفوفة و المعدل .
       int x[]={1,3,14,65,11,10,9}; 1 - مصوفة فيها أرقام
       int sum=0; 2 - متغير لتخزين مجموع أرقام المصفوفة
       for(int i=0;i<x.length;i++){3 - حلقة دوران لمرور على العناصر
           sum=sum+=x[i];4 -أجمع العناصر وضيفها على ال sum
      }
       System.out.println("sum = "+sum);أطبع ال المجموع
       System.out.println("Average = "+((double)sum/x.length));أطبع المعدل
     */
    //-------------------------------------------------------------
    /*
        برنامج يبحث عن الأسماء في المصفوفة .
        String[] x = {"Mohammed", "noor", "Ahmed", "Esraa", "juma", "Rami", "Ahmed"};
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        name = name.toLowerCase();
        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i].toLowerCase();
            if (x[i].contains(name)) {
                System.out.println(name + " is found at " + i);

            }
        }
     */
    //-----------------------------------------------------------
    /*
        برنامج للبحث عن أول ظهور للكلمة
        String[] x = {"Ali", "Ahmed", "Omar", "Abbas", "Ahmed", "Mahmoud", "Mahmoud Ali"};
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        name = name.toLowerCase();
        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i].toLowerCase();
            if (x[i].startsWith(name)) {
                System.out.println(name + " is found at " + i);
                
            }
        }
     */
    //------------------------------------------------------------
    /*
        برنامج لجلب أكبر رقم وأصغر رقم من المصفوفة
       int[]x={45,66,90,72,14,70,61,30}; مصفوفة أرقام
        
        int max=x[0];* - نفترض أنه أول رقم هو أكبر رقم
        int min=x[0];* - نفترض أنه أول رقم هو أصغر رقم
        
        for(int i=1;i<x.length;i++){لف على عناصر المفزفة
            if(x[i]>max){اذا كان العناصر اللي في المصفوة أصغر من  max
                max=x[i]; حط ال المصفوفة في ال max
            }
            if(x[i]<min){اذا كان العنصر أصغر من ال min
                min=x[i];حط عنصر المصفوفة في ال min
            }
        }
         System.out.println("Max = "+max);print
         System.out.println("nin = "+min);print
     */
    //--------------------------------------------------------------
    /*
        برنامج لتبديل أماكن المصفوفة
        int x[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<x.length/2;i++){
            int temp=x[i];
            x[i]=x[x.length-1-i];
            x[x.length-i-1]=temp;
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    
           
        حل ثاني للسؤال : 
       int[]x= new int [15];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
             x[i]+=s.nextInt();
        }
        for(int i=0;i<x.length/2;i++){
           
            int temp=x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]=temp;
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
     */
    //-----------------------------------------------------------------------
    /*
        برنامج لترتيب الحروف
            System.out.println("Sort By"+" : A-Z OR Z-A");
        char[] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        
        if(in.equalsIgnoreCase("A")){
           for(int i=0;i<c.length;i++){
               
               System.out.println((i+1)+" : "+c[i]);
           } 
        }else if(in.equalsIgnoreCase("Z")){
                for(int i=0;i<c.length/2;i++){
                    char temp = c[i];
                    c[i]=c[c.length-i-1];
                    c[c.length-i-1]=temp;
                    
                }
               for(int i=0;i<c.length;i++){
                   System.out.println((i+1)+" : "+c[i]);
               }
        }else{
            System.out.println("Not Sorted");
        }
        
     */
    //--------------------------------------------------------------------------
    /*
        برنامج ادخال حجم المصفوفة ,  ادخال أرقام و ترتيبها وجلب الأكبر والأصغر منها :
            Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        int number = Integer.parseInt(in);
        int[] arrNamber = new int[number];
        System.out.println("input:");
        for (int i = 0; i < arrNamber.length; i++) {
            arrNamber[i] = s.nextInt();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nSort by : S OR C");
        String sort = input.nextLine();

        if (sort.equalsIgnoreCase("S")) {
            for (int i = 0; i < arrNamber.length; i++) {
            }
        } else {
            if (sort.equalsIgnoreCase("C")) {
                for (int i = 0; i < arrNamber.length / 2; i++) {
                    int temp = arrNamber[i];
                    arrNamber[i] = arrNamber[arrNamber.length - i - 1];
                    arrNamber[arrNamber.length - i - 1] = temp;
                }
            } else {
                System.out.println("try again");
                System.exit(0);
            }
        }
        System.out.println("----------------------------------------------------\n");
        System.out.println("Sortd  by " + sort + " : ");
        for (int i = 0; i < arrNamber.length; i++) {
            System.out.println(arrNamber[i]);
        }
        int max = arrNamber[0];
        int min = arrNamber[0];
        for (int i = 0; i < arrNamber.length; i++) {
            if (arrNamber[i] > max) {
                max = arrNamber[i];
            }
            if (arrNamber[i] < min) {
                min = arrNamber[i];
            }
        }
        System.out.println("----------------------------------------------------\n");
        System.out.println("Max : " + max);
        System.out.println("min : " + min);
     */
//------------------------------------------------------------------
    /*
        حذف عنصر من مصفوفة
       int arr1[] = {2,13,4,5,9,24,3};
       int arr2[]= new int[(arr1.length)-1];
       
       Scanner s = new Scanner(System.in);
       int index = s.nextInt();
       
       for(int i=0;i<index;i++){
           arr2[i]=arr1[i];
       }
       for(int i=index+1;i<arr1.length;i++){
           arr2[i-1] = arr1[i];
       }
       for(int i=0;i<arr2.length;i++){
           System.out.println(arr2[i]);
       }
      
     */
    //---------------------------------------------------------------
    /*
         اضافة عنصر الى المصفوفة:
       int arr1[] = {2,13,4,5,9,24,3};
       int arr2[]= new int[(arr1.length)+1];
       
       Scanner s = new Scanner(System.in);
       System.out.println("Enter positson");
       int index = s.nextInt();
       System.out.println("Enter Value");
       int value = s.nextInt();
       
       for(int i=0;i<index;i++){
           arr2[i]=arr1[i];
       }
       arr2[index]=value;
       for(int i=index;i<arr1.length;i++){
           arr2[i+1] = arr1[i];
       }
       for(int i=0;i<arr2.length;i++){
           System.out.println(arr2[i]);
       }
     */
    //--------------------------------------------------------------
    /*
        ايجاد العناصر المتشابهة في كلا المصفوفتان :
       int arr1[] = {2,13,4,5,9,24,3,7};
       int arr2[]= {44,16,7,13,33,24};
       
       for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                   System.out.println(arr1[i]);
               }
           }
       }
     */
    //--------------------------------------------------------------
    /*
        ترتيب الارقام في المصفوفة:
         //تصاعدي أو تنازلي
       int arr1[] = {2,13,4,5,9,24,3,7};
       
       for(int i=0;i<arr1.length;i++){
           for(int j=i+1;j<arr1.length;j++){
               if(arr1[i]>arr1[j]){
                  int temp=arr1[i];
                  arr1[i]=arr1[j];
                  arr1[j]=temp;
               }
           }
       }
       for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
       }
     */
    //---------------------------------------------------------------
    /*
        ترتيب الاسماء في المصفوفة سواء تصاعدي أو تنازلي.
     String[] arr = {"Ziad","Rami","Ahmed","Omar","Belal","Waleed"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0 ){
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " : " + arr[i]);
        }
        
     */
    //-------------------------------------------------------------
    /*
    1 - رتب العناصر
    2 - قارن بين العناصر لجلب الاسم أو الرقم اللي مكرر
        جلب الاسماء المكررة في المصفوفة :
         String[] arr = {"Ziad", "Rami", "Ahmed", "Ahmed", "Omar", "Belal", "Omar", "Waleed"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                System.out.println(i + 1 + " : " + arr[i]);
            }
        }
     */
    //-------------------------------------------------------------
    /*
        طريقة مختصرة لطباعة عناصر المصفوفة :
       int[]arr={1,13,4,55,7,18};
       
       for(int i:arr){ تستخدم فقط لطباعة
           System.out.println(i);
       }
     */
   //---------------------------------------------------------------
    /*
        ترتيب العناصر اللي في المصفوفة بطريقة مختصرة.
        String[]arr={"Rami","Ahmed","Yaser"};
       
       Arrays.sort(arr);
       for(String x:arr){
           System.out.println(x);
       }
    */
    //--------------------------------------------------------------
    /*
       برنامج يرتب الاسماء الغير مفصولة عن بعضها .
        1 - التجزئة - جزء الاسماء من خلال دالة split
        2 - رتب الاسماء لو انت عاوز
        3 - أطبع
        
       String text = "Rami Ahmed Ali Yaser Omar Salah";
       String arr[]=text.split(" ");
       Arrays.sort(arr);
       for(String n:arr){
           System.out.println(n);
       }
    */
    //------------------------------------------------------------
    /*
        يطلب من المستخدم ادخال حجم المصفوفة وطباعة مجموع الارقام التي أدخلها:
    
        System.out.println("Enter Of length To Arrays:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[]vector = new int[N];
        if(N>0){
         System.out.println("length Of Array: "+N);    
        }else{
            System.out.println("Error, Should be length Of Array bigger of Zero");
            System.exit(0);
        }
       
        System.out.println("---------------------");
         System.out.println("input:");
        for(int i=0;i<vector.length;i++){
            System.out.print("Enter vector["+i+"] : ");
            vector[i]=s.nextInt();
        }
        System.out.println("---------------------");
         System.out.println("Output");
        for(int i=0;i<vector.length;i++){
            System.out.print("vector["+i+"] : ");
            System.out.println(vector[i]);
        }
        int sum=0;
        for(int i=0;i<vector.length;i++){
            sum+=vector[i];
        }
        System.out.println("Sum Of elments Array : "+sum);
    */
    //----------------------------------------------------------------
    /*
        
    */
}
