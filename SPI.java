//count SPI Using Java Program......

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

class SubjectDetail {

    //fileds
    public int subnumber;
    public double TotalCreadit = 0;

   //for geeting Subject name we use string arraylist
   ArrayList<String> SubjectName = new ArrayList<>(subnumber);
   //for geeting Subject Cradit we use string arraylist
   ArrayList<Double>  Cradit_No = new ArrayList<>(subnumber);

    //methods
    //get sub number
    public void SubNo() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("How Many subject You Have : ");
        subnumber = sc1.nextInt();
    }

    //get subject Name
    public void SubName() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("........Enter Your " + subnumber + " Subject Name.......");

        //get User input
        for (int i = 0; i < subnumber; i++) {
            System.out.print("Enter Your Subject " + (i + 1) + " Name : ");

            //for arrayList We can Use
            SubjectName.add(i,sc2.nextLine());

        }
    }

    //show Subject Name
    public void ShowSubName(){
        System.out.println();
        System.out.println("-----------------------------Your Subject Name is-----------------------------");

        int i=0;
        while (i < subnumber){
            System.out.println("Subject " + (i+1) + " : " + SubjectName.get(i));
            i++;
        }
    }

    //Subject Cradit Detail
    public void SubCradit(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println();
        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) +" Subject Credit : ");
            Cradit_No.add(i,sc3.nextDouble());
        }

        //total credit
        for (int i =0 ;i<subnumber;i++){
            TotalCreadit += Cradit_No.get(i);
        }

//        System.out.println("Total crdit is : " + TotalCreadit);

//        System.out.println("Your Crdit is : ");
//        for (int i =0;i<subnumber;i++){
//            System.out.println(Cradit_No.get(i));
//        }
    }

}

class Marks extends SubjectDetail{

    Scanner sc = new Scanner(System.in);
    //for geeting Subject Internal Marks , practical marks and gtu marks we use string arraylist

    public ArrayList<Double> Midsem1_Marks = new ArrayList<>(subnumber);
    public ArrayList<Double> Midsem2_Marks = new ArrayList<>(subnumber);
    public ArrayList<Double> TotalMidMark = new ArrayList<>(subnumber);
    public ArrayList<Double> ConvertedMidMarks = new ArrayList<>(subnumber);

    public ArrayList<Double> PracticalMarks = new ArrayList<>(subnumber);
    public ArrayList<Double> GTUMarks = new ArrayList<>(subnumber);
    public ArrayList<Double> InternalMarks = new ArrayList<>(subnumber);

    //for Total Marks
    public ArrayList<Double> Total = new ArrayList<>(subnumber);


    //mid-1 marks
    public void Mid1_Marks(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println();
        System.out.println("......Your Mid-1 marks is out of 70.......");

        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) + " Mid-1 Marks : ");
            Midsem1_Marks.add(i,sc4.nextDouble());
        }

//        System.out.println("Mid-1 mark is");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(Midsem1_Marks.get(i));
//        }
    }

    //mid-2 marks
    public void Mid2_Marks(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println();
        System.out.println("......Your Mid-2 marks is out of 70.......");

        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) + " Mid-2 Marks : ");
            Midsem2_Marks.add(i,sc5.nextDouble());
        }

//        System.out.println("Mid-2 mark is");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(Midsem2_Marks.get(i));
//        }
    }

    //Total Mid marks
    public void TotalMidlMarks(){;
        System.out.println();

        for (int i=0;i<subnumber;i++){
           TotalMidMark.add(i,(Midsem1_Marks.get(i) + Midsem2_Marks.get(i)));
        }

//        System.out.println("Total mid mark is");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(TotalMidMark.get(i));
//        }
    }

    //convert this mid mark into 30
    public void ConvertedMidMarks(){
        System.out.println();

        for (int i=0;i<subnumber;i++){
            ConvertedMidMarks.add(i, ( (TotalMidMark.get(i) * 30 ) / 140));
        }

//        System.out.println("Your Converted mid marks is : ");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(ConvertedMidMarks.get(i));
//        }
    }

    public void Internalmarks(){
        System.out.println();
        Scanner sc6 = new Scanner(System.in);
        System.out.println("......Your Internal marks is out of 20.......");

        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) + " Internal Marks : ");
            InternalMarks.add(i,sc6.nextDouble());
        }


//        System.out.println("Your Internal marks is :");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(InternalMarks.get(i));
//        }
    }


    //for practical marks
    public void PracticalMarks(){
        Scanner sc7 = new Scanner(System.in);
        System.out.println();
        System.out.println("......Your Practical marks is out of 30.......");

        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) + " Practical Marks : ");
            PracticalMarks.add(i,sc7.nextDouble());
        }

//        System.out.println("Practical Marks is : ");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(PracticalMarks.get(i));
//        }
    }

    //for gtu marks
    public void GtuMarks(){
        Scanner sc8 = new Scanner(System.in);
        System.out.println();
        System.out.println("......Your Gtu marks is out of 70.......");

        for (int i=0;i<subnumber;i++){
            System.out.print("Enter Your " + SubjectName.get(i) + " Gtu Marks : ");
            GTUMarks.add(i,sc8.nextDouble());
        }

//        System.out.println("Gtu Total is : ");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(GTUMarks.get(i));
//        }
    }

    //for Total Marks
    public void TotalMarks(){
        for (int i=0;i < subnumber ;i++){
            Total.add(i,ConvertedMidMarks.get(i) + InternalMarks.get(i) + PracticalMarks.get(i) + GTUMarks.get(i));
        }

//        System.out.println("Total is");
//        for (int i=0;i < subnumber ;i++){
//            System.out.println(Total.get(i));
//        }
    }

}

class Calculation extends Marks{

    //store after convert 100 marks into arry list
    ArrayList<Double> Convert = new ArrayList<>(subnumber);

    //for number acorinding to total of 100 --> 10,9,8 grade
    ArrayList<Double> GreadPoint = new ArrayList<>(subnumber);

    //get SPI
    ArrayList<Double> Multiply = new ArrayList<>(subnumber);

    double Add = 0;
    double SPI = 3.4665656565656565656;

    //Convert this 150 marks to 100
    public void converter(){

        for (int i=0;i<subnumber;i++){
            Convert.add(i,(( Total.get(i)*100) /150));
        }

//        //show converted value
//        System.out.println("Converted value is:");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(Convert.get(i));
//        }
    }

    //set marks accoriding to total
    public void Gradpoint(){

        for (int i=0; i<subnumber; i++){


            if ( Convert.get(i)<=100 && Convert.get(i)>=85){
                GreadPoint.add(i,10.0);
            }
            else if(Convert.get(i)<=84 && Convert.get(i)>=75){
                GreadPoint.add(i,9.0);
            }
            else if(Convert.get(i)<=74 && Convert.get(i)>=65){
                GreadPoint.add(i,8.0);
            }
            else if(Convert.get(i)<=64 && Convert.get(i)>=55){
                GreadPoint.add(i,7.0);
            }
            else if(Convert.get(i)<=54 && Convert.get(i)>=45){
                GreadPoint.add(i,6.0);
            }
            else if(Convert.get(i)<=44 && Convert.get(i)>=40){
                GreadPoint.add(i,5.0);
            }
            else if(Convert.get(i)<=39 && Convert.get(i)>=35){
                GreadPoint.add(i,4.0);
            }
            else if(Convert.get(i)<35){
                GreadPoint.add(i,0.0);
            }
        }

//        //show gread point
//        System.out.println("Gread point is : ");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(GreadPoint.get(i));
//        }
    }

    //Getting your Spi
    public void Multiply(){

        for (int i=0;i<subnumber;i++){
            Multiply.add(i,(GreadPoint.get(i) * Cradit_No.get(i)));
        }

//        System.out.println("Mulitplication of gread point and credit is : ");
//        for (int i=0;i<subnumber;i++){
//            System.out.println(Multiply.get(i));
//        }
    }

    //add final subject score
    public void add(){

        for (int i=0;i<subnumber;i++){
          Add += Multiply.get(i);
        }

//      System.out.println("Addition of all subject marks is  : " + Add);
    }

    public void SPI(){
        SPI = Add / TotalCreadit;

        System.out.println();

        if (SPI >= 6.5){
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.println("...Congertlation You Have Pass.....");
//            System.out.print("Your SPI IS : " + SPI );
            System.out.printf("Your SPI Is : %.2f",SPI);
            System.out.println();
            System.out.println("------------------------------------------------------------");

        }
        else if (SPI == 0){
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.println("sorry! You have Fail");
        }
        else{
            System.out.println();
            System.out.println("Your SPI is : " + SPI);
        }
    }

}

public class SPI {
    public static void main(String[] args) {
        Calculation obj = new Calculation();

        //for Subject Information
        obj.SubNo();
        obj.SubName();
        obj.ShowSubName();

        //for Calculation
         obj.SubCradit();

         obj.Mid1_Marks();
         obj.Mid2_Marks();
         obj.TotalMidlMarks();
         obj.ConvertedMidMarks();
         obj.Internalmarks();
         obj.PracticalMarks();
         obj.GtuMarks();
         obj.TotalMarks();

        //for Calculation
        obj.converter();
        obj.Gradpoint();
        obj.Multiply();
        obj.add();

        obj.SPI();

    }
}