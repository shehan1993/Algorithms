
    public void travelInOrder(Node root){
        if(root != null){
            travelInOrder(root.left);
            System.out.print(root.value+" ");
            travelInOrder(root.right);
        }
    }

    public void travelPreOrder(Node root){
        if(root != null){
            System.out.print(root.value + " ");
            travelPreOrder(root.left);
            travelPreOrder(root.right);
        }
    }

    public void travelPostOrder(Node root){
        if(root != null){
            travelPostOrder(root.left);
            travelPostOrder(root.right);
            System.out.print(root.value + " ");

        }
    }

    public void travelBreadthFirstOrder(){

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){

            Node node = nodes.remove();
            System.out.print(node.value + " ");

            if(node.left != null){
                nodes.add(node.left);
            }

            if(node.right != null){
                nodes.add(node.right);
            }

        }

    }
