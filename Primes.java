public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int counter=0;
        boolean[] isPrime = new boolean[num+1];
        for(int i=0; i<=1; i++){
            isPrime[i]=false;
        }
        for(int i=2; i<=num; i++){
            isPrime[i]=true;
        }
        for(int i=2; i<=num; i++){
            if(isPrime[i]==true){
                for(int j=2*i;j<=num;j+=i){
                        isPrime[j]=false;
                    }
                }   
            }
            System.out.println("Prime numbers up to "+num+":");
            for(int i=0; i<=num; i++){
                if(isPrime[i]==true){
                    counter++;
                    System.out.println(i);
                }
                
            }
            double precent = (counter*100)/num;
            System.out.print("There are "+counter+" primes between 2 and "+num);
            System.out.println(" ("+precent+"% are primes)");
        }
        
    }
