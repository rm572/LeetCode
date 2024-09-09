public class _13_RomanToInt {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            String cur = s.substring(i, i+1);

            // String next = s.substring(i+1, i+2);
            boolean isLast = false;
            if (i == len-1) {
                isLast = true;
            }
            
            //tests I (1)
            if (cur.equals("I")) {
                if (isLast) {
                    sum++;
                    break;
                }
                else {
                    String next = s.substring(i+1, i+2);
                    if (next.equals("V")) {
                        sum += 4;
                        i++;
                    }
                    else if(next.equals("X")) {
                        sum += 9;
                        i++;
                    }
                    else {
                        sum++;
                    }
                }

            }

            //tests V (5)
            else if (cur.equals("V")) {
                sum += 5;
            }

            //tests X (10)
            else if (cur.equals("X")) {
                if (isLast) {
                    sum+=10;
                    break;
                } 
                else {
                    String next = s.substring(i+1, i+2); 
                    if (next.equals("L")) {
                        sum += 40;
                        i++;
                    }
                    else if(next.equals("C")) {
                        sum += 90;
                        i++;
                    }
                    else {
                        sum += 10;
                    }
                }              
                
            }

            //tests L (50)
            else if (cur.equals("L")) {
                sum += 50;
            }

            //tests C (100)
            else if (cur.equals("C")) {
                if (isLast) {
                    sum += 100;
                    break;
                } 
                else {
                    String next = s.substring(i+1, i+2); 
                    if (next.equals("D")) {
                        sum += 400;
                        i++;
                    }
                    else if(next.equals("M")) {
                        sum += 900;
                        i++;
                    }
                    else {
                        sum += 100;
                    }
                }               
                
            }

            //tests D (500)
            else if (cur.equals("D")) {
                sum += 500;
            }

            //tests M (1000)
            else if (cur.equals("M")) {
                sum += 1000;
            }

        }

        return sum;
    }
}
