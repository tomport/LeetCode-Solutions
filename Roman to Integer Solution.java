class Solution {
    public int romanToInt(String s) {
        int num = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            switch(c[i]){
                case 'M':
                    num += 1000;
                    break;
                    
                case 'D':
                    num += 500;
                    break;
                    
                case 'C':
                    if(i < c.length - 1 &&  (c[i+1] == 'M')){
                        num += 900;
                        i++;
                    }
                    else if (i < c.length - 1 &&  (c[i+1] == 'D')){
                        num += 400;
                        i++;
                    }
                    else{
                        num += 100;
                    }
                    break;
                             
                case 'L':
                    num += 50;
                    break;
                             
                case 'X':
                    if(i < c.length - 1 &&  (c[i+1] == 'C')){
                        num += 90;
                        i++;
                    }
                    else if (i < c.length - 1 &&  (c[i+1] == 'L')){
                        num += 40;
                        i++;
                    }
                    else{
                        num += 10;
                    }
                    break;
                    
                case 'V':
                    num += 5;
                    break;
                             
                case 'I':
                    if(i < c.length - 1 &&  (c[i+1] == 'X')){
                        num += 9;
                        i++;
                    }
                    else if (i < c.length - 1 &&  (c[i+1] == 'V')){
                        num += 4;
                        i++;
                    }
                    else{
                        num++;
                    }
                    break;
                             
                default:
                    break;
            }
        System.out.println(i);
        System.out.println(c[i]);
        System.out.println(num);
        }
        return num;
    }
}