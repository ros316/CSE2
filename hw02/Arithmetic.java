//  Rachel Sholder
//  CSE 02
//  HW 2

//  define a class
public class Arithmetic {
    
//  add main method
    public static void main (String[] args) {
     
    //  Number of pairs of socks
    int nSocks=3;
    //  Cost per pair of socks
    //  ('$' is part of the variable name)
    double sockCost$=2.58;
    
    //  Number of drinking glasses
    int nGlasses=6;
    //  Cost per glass
    double glassCost$=2.29;
    
    //  Number of boxes of envelopes
    int nEnvelopes=1;
    //  Cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //  cost of socks, glasses, envelopes
    double totalSocks, totalGlasses, totalEnvelopes; 
    
    //  tax on socks, glasses, envelopes
    double taxSocks, taxGlasses, taxEnvelopes;
    
    //  total cost of socks, glasses, envelopes
    double paidSocks, paidGlasses, paidEnvelopes;
    
    //  total cost, sales tax, and total transaction
    double totalCost, totalSalesTax, totalTransaction;
    
    //  Cost of each kind of item
    totalSocks=nSocks*sockCost$;
    totalGlasses=(nGlasses*glassCost$);
    totalEnvelopes=nEnvelopes*envelopeCost$;
    
    System.out.println("The cost of socks is $"+totalSocks+".");
    System.out.println("The cost of glasses is $"+totalGlasses+".");
    System.out.println("The cost of envelopes is $"+totalEnvelopes+".");
    
    //  Sales tax on the purchase for each kind of item
    taxSocks=totalSocks*taxPercent;
    taxGlasses=totalGlasses*taxPercent;
    taxEnvelopes=totalEnvelopes*taxPercent;
    
    //  truncating decimals
    
    taxSocks=taxSocks*100;
    taxSocks=(int) taxSocks;
    taxSocks=taxSocks/100;
    
    taxGlasses=taxGlasses*100;
    taxGlasses=(int) taxGlasses;
    taxGlasses=taxGlasses/100;
    
    taxEnvelopes=taxEnvelopes*100;
    taxEnvelopes=(int) taxEnvelopes;
    taxEnvelopes=taxEnvelopes/100;
    
    //  sales tax on the purchase for each kind of item
    System.out.println("The tax on the purchase of socks is $"+taxSocks+".");
    System.out.println("The tax on the purchase of glasses is $"+taxGlasses+".");
    System.out.println("The tax on the purchase of envelopes is $"+taxEnvelopes+".");
    
    //  Total cost of each kind of item
    paidSocks=totalSocks+taxSocks;
    paidGlasses=totalGlasses+taxGlasses;
    paidEnvelopes=totalEnvelopes+taxEnvelopes;
    
    
    //  truncating decimals
    paidSocks=paidSocks*100;
    paidSocks=(int) paidSocks;
    paidSocks=paidSocks/100.0;
    
    
    //  total cost of each kind of item
    System.out.println("The total cost of socks is $"+paidSocks+".");
    System.out.println("The total cost of glasses is $"+paidGlasses+".");
    System.out.println("The total cost of envelopes is $"+paidEnvelopes+".");
    
    //  Total cost
    totalCost=totalSocks+totalGlasses+totalEnvelopes;
    
    System.out.println("The total cost of all items is $"+totalCost+" before sales tax.");
    
    //  Total sales tax
    totalSalesTax=totalCost*taxPercent;

    totalSalesTax=totalSalesTax*100;
    totalSalesTax=(int) totalSalesTax;
    totalSalesTax=totalSalesTax/100;
    
    System.out.println("The total sales tax is $"+totalSalesTax+".");
    
    //  Total cost of transaction
    totalTransaction=totalCost+totalSalesTax; 
    
    System.out.println("The total cost of the transaction is $"+totalTransaction+".");
        
        
    }
}