package com.NiuKeWang;

import java.util.Stack;

/*��Ŀ������һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * ����˼·�����ն��������������������⣬���ö����������ķǵݹ��㷨����������node�ڵ�����¼
 * ��ǰ�ڵ����һ���ڵ㣬Ȼ���õ�ǰ�ڵ�leftָ����һ���ڵ㣬rightָ����һ���ڵ㡣
 * 
 * */
public class Text27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}

class TreeNode1{
	int val;
	TreeNode1 left =null;
	TreeNode1 right=null;
	TreeNode1(int val){
		this.val=val;
	}
}
class Solution27{
	public TreeNode1 Convert(TreeNode1 pRootOfTree) {
		Stack<TreeNode1> stack=new Stack<>();
		TreeNode1 p=pRootOfTree;
		TreeNode1 pre=null;
		boolean isT=true;
		while(p!=null||!stack.isEmpty()){
			while(p!=null){
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			if(isT){
				pre=p;
				pRootOfTree=p;
				isT=false;
			}else{
				pre.right=p;
				p.left=pre;
				pre=p;
			}
			p=p.right;
			
		}
		return pRootOfTree;
	}
}



