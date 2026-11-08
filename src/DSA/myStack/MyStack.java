package DSA.myStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MyStack {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //stackOpSimulation();
	    //closeBrackets();
        //remPairs();
	//backspaceDel();
	nxtGrtr();
	sc.close();
    }
    public static void declaration(){

        System.out.println("Enter input String to reverse:");
        String s = sc.next();
        Deque<Character> stack = new ArrayDeque<>();

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            stack.push(c);
        }
//        System.out.println(stack.size());

        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        System.out.println(res.toString());
    }

    public static void stackOpSimulation(){
        System.out.println("Enter n:");
        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        String input = "";
        int i =0;

        while(i < n){
            System.out.println("Enter input command " + (i+1) +":");
            input=sc.next();
            switch (input){
                case "push":
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case "pop":
                    stack.pop();
                    break;

                case "top":
                    StringBuilder res = new StringBuilder();

                    if(stack.peek() == null){
                        res.append("-1");
                    } else {
                        res.append(stack.peek());
                    }
                    System.out.println(res.toString());
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            i++;
        }
    }

    public static void closeBrackets(){
    	System.out.println("Enter bracket String:");
        String s = sc.next();

        Deque<Character> stack = new ArrayDeque<>();

        for(char c:s.toCharArray()){
            // do push opening brackets in to the stack
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                char top = stack.pop();
                if((c==')' && top != '(') ||
                (c=='}' && top != '{') ||
                (c==']' && top != '['))
                {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "YES" :"NO");
    }

    public static void remPairs(){
    	System.out.println("enter string: ");
        Deque<Character> stack = new ArrayDeque<>();
        String s = sc.next();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                if(top == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        if(!stack.isEmpty()){
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char val = stack.pop();
            sb.append(val);
        }

        sb.reverse();
        System.out.println(sb.toString());
        } else {
            System.out.println("-1");
        }
    }

    public static void backspaceDel(){
    	System.out.println("Enter String:");
	    String s1= sc.next();
	    String s2= sc.next();

        Deque<Character> stack1 = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();

        for(char c : s1.toCharArray()){
            if(c == '#'){
                if(stack1.isEmpty()) continue;
		stack1.pop();
            } else {
                stack1.push(c);
            }
        }

        for(char c : s2.toCharArray()){
            if(c == '#'){
                if(stack2.isEmpty()) continue;
		stack2.pop();
            } else {
                stack2.push(c);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while(!stack1.isEmpty()) sb1.append(stack1.pop());
        while(!stack2.isEmpty()) sb2.append(stack2.pop());

        String re1=sb1.toString();
        String re2=sb2.toString();

        String res = re1.equals(re2) ? "YES" : "NO";
        System.out.println(res);
    }

    public static void nxtGrtr(){
    	System.out.println("Enter n:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.println("Enter array elements:");
	
	for(int i = 0; i<n; i++) arr[i]=sc.nextInt();

	int[] ans = new int[n];
	Deque<Integer> stack = new ArrayDeque<>();

	for(int i = n-1; i >=0; i--){
		while(!stack.isEmpty() && stack.peek() <= arr[i]){
			stack.pop();
		}

		ans[i]=stack.isEmpty() ? -1:stack.peek();
		stack.push(arr[i]);
	}
	
	StringBuilder sb = new StringBuilder();
	
	for(int i = 0; i < n; i++){
		sb.append(ans[i]);
		if(i < n-1) sb.append(' ');
	}
	
	System.out.println(sb.toString());
	
    }
}
