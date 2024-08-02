class Tree{
	string type;
	double height;
	
public static void main(String[] args){
	
	Tree t1 = new Tree();
	t1.type = "mango"; t1.height=15.6;
	System.out.println(t1.type +"tree is "+ t1.height +"feet tall");

	Tree t2 = new Tree();
	t2.type = "jack"; t2.height=21.8;
	System.out.println(t2.type +"tree is "+ t2.height +"feet tall");

	
	Tree t3= new Tree();
	t3.type = "coconate"; t3.height=30.4;
	System.out.println(t3.type +"tree is "+ t3.height +"feet tall");
	}
}

