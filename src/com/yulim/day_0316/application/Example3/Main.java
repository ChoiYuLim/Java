package com.yulim.day_0316.application.Example3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.yulim.day_0316.Example13.Hero;

public class Main {
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Hero) {
//            Hero hero = (Hero) obj;
//            
//            if(this.getName().equals(hero.getName()))) {
//                
//            }
//        }
//        
//        return false;
//    }
//    
//    @Override
//    public int hashCode() {
//        
//    }
    public static void main(String[] args) {
        
        
//        List<Student> 장학생명부 = new ArrayList<>(); //원래 ArrayList인데, List로 보여지게
//        // List거 ArrayList보다 더 상위에 있거나,
//        
//        Student 반장 = new Student("이동학");
//        
//        장학생명부.add(반장);
//        System.out.println(장학생명부);
//        // arrayList extends AbstractList extends AbsractCollection
//        // AbsractCollection 여기서 toString 붙이기 때문에 
//        
//        반장 = new Student("박경덕");
//        
//        //높은 사람이
//        장학생명부.remove(반장); //박경덕
//        System.out.println(장학생명부);
        
        
        
        
//        
//        
        List<Student> 장학생명부 = new ArrayList<>(); //원래 ArrayList인데, List로 보여지게
        // List거 ArrayList보다 더 상위에 있거나,
        
        Student 반장 = new Student("이동학");
        
        장학생명부.add(반장);
        System.out.println(장학생명부);
        // arrayList extends AbstractList extends AbsractCollection
        // AbsractCollection 여기서 toString 붙이기 때문에 
        
        반장 = new Student("이동학");
        
        //높은 사람이
        장학생명부.remove(반장); //이동학
        System.out.println(장학생명부);
        // 이름이 같아도 안 빠짐
        // 나는 이름이 같으면 빠지면 좋겠어 -> 그럼 equals
        // 레퍼런스로 동작하던 것을 내용 기반으로 동작하게 할 수 있다, 내가 컨트롤 할 수 있어
        //
        
        
        //arraylist는 싹 다 이름, ㅇ등등 필드 다 비교해서 같아야ㅐ 같은거
        // 해시셋은 내부적으로 해시값만 비교하면 돼서 엄청 빠름
//        Set<Student> 장학생명부 = new HashSet<>();
//        
//        Student 반장 = new Student("이동학",0);
//       
//        장학생명부.add(반장);
//        System.out.println(반장.hashCode());
//        System.out.println(장학생명부);
//        // arrayList extends AbstractList extends AbsractCollection
//        // AbsractCollection 여기서 toString 붙이기 때문에 
//        
//        반장 = new Student("이동학",1);
//        System.out.println(반장.hashCode()); //해시코드 주소라고 일단 생각해도 무방
//        // 해시코드를 재정의 안하면 new할 때마다 다른 놈들이 나옴
//        //equals만 나오면 array:List는 잘 비교 되는데 동일한 값으로 비교하는 것이 아니라 해시코드 값으로 ㅣ교하므로
//        //다른 놈으로 인식함
//        
//        
//        //높은 사람이
//        장학생명부.remove(반장); //박경덕
//        System.out.println(장학생명부);
        
        // 해시값을 기바반으로 동작하는 애들인데 equals만 재정의하고 해시코드는 재정의 안함
    }
    
    
    
}
