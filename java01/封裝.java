/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 封裝 {
    private int 年 = 0;
    private int 月 = 0; //1~12
    private int 日 = 0; 
    
    //setter 專門用來設定值的方法
    
    public void set年(int 年){
        this.年 = 年;
        System.out.println(年+"年");
    }
        public void set月(int 月){
            if(月<1 || 月>12){
                System.out.println("null");
                return;
            }
            else{
            this.月=月;
            }
            System.out.println(月+"月");
        }
        public void set日(int 日){
            if(日<1 ||日>31){
            return;
            }else{
            this.日=日;
            }
            System.out.println(日 +"日");
        }
        
       public void 顯示資料(){
           if (this.年 == 0 || this.月==0 || this.日 ==0){
               System.out.println("無效");
           }else{
               System.out.println(this.年 + "/" + this.月+"/"+ this.日);
           }
       }
    
    
}
