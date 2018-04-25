package com.NiuKeWang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所
 * 有字符串abc,acb,bac,bca,cab和cba。
 * 解题思路：先对整个字符串拆分成为一个字符数组，然后采用排列字符串的递归二叉树方法来排序
 * 将排序结果存放在相关列表当中，然后判断该列表是否包含该字符串，不包含就加入该字符串。
 * 最后返回字符串列表
 * */
public class Text28 {

	List<String> list=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ABCD";
		char[] s=a.toCharArray();
		Solution28 sol=new Solution28();
		sol.Permutation(a);
	}

}
class Solution28{
	List<String> list=new ArrayList<>();
	
	public ArrayList<String> Permutation(String str) {
		char [] a=str.toCharArray();
		
		if(str==null||str.length()==0)
			return (ArrayList<String>)list;
		Permutationnew(a,0,list);
		Collections.sort(list);
		return (ArrayList<String>) list;
	}
	public void Permutationnew(char[] a,int i,List<String> list){
		if(i==a.length-1){
			String s=String.valueOf(a);
			if(!list.contains(s)){
				list.add(s);
			}
		}else{
			for(int j=i;j<a.length;j++){
				swat(a,i,j);
				Permutationnew(a, i+1, list);
				swat(a, i, j);
			}
		}
	}
	public void swat(char[] a,int i,int j){
		char s=a[i];
		a[i]=a[j];
		a[j]=s;
	}
	public void text(char[] a,int i){
		if(i==a.length-1){
			System.out.println(String.valueOf(a));
		}else{
			for(int j=i;j<a.length;j++){
				swat(a,i,j);
				text(a,i+1);
				swat(a,i,j);
			}
		}
	}
}


