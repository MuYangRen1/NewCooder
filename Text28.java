package com.NiuKeWang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г�������
 * ���ַ���abc,acb,bac,bca,cab��cba��
 * ����˼·���ȶ������ַ�����ֳ�Ϊһ���ַ����飬Ȼ����������ַ����ĵݹ����������������
 * �����������������б��У�Ȼ���жϸ��б��Ƿ�������ַ������������ͼ�����ַ�����
 * ��󷵻��ַ����б�
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


