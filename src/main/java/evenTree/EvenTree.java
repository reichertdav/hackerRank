package evenTree;

import java.util.ArrayList;
import java.util.List;

class EvenTree {

    private int nodeNumber;
    private int descendantQuantity;
    private List<EvenTree> children;
    private EvenTree father;

    EvenTree(int edgeNumber, int nodeNumber) {
        this.nodeNumber = nodeNumber;
        this.descendantQuantity = 2;
        this.children = new ArrayList<>();
        EvenTree child = new EvenTree(edgeNumber);
        child.setFather(this);
        children.add(child);
    }


    private EvenTree(int nodeNumber) {
        this.nodeNumber = nodeNumber;
        this.descendantQuantity = 1;
        this.children = new ArrayList<>();
    }


    private void setFather(EvenTree father) {
        this.father = father;
    }

    private void updatedeDescendant(EvenTree evenTree) {
        evenTree.descendantQuantity++;
        if (evenTree.getFather() != null) {
            updatedeDescendant(evenTree.getFather());
        }
    }

    void addNode(int edgeNumber, int nodeNumber) {
        if (nodeNumber == this.getNodeNumber()) {
            EvenTree child = new EvenTree(edgeNumber);
            child.setFather(this);
            this.getChildren().add(child);
            updatedeDescendant(this);
            return;
        }
        for (EvenTree child : this.getChildren()) {
            child.addNode(edgeNumber, nodeNumber);
        }
    }

    int getNodeNumber() {
        return nodeNumber;
    }

    List<EvenTree> getChildren() {
        return children;
    }

    int getDescendantQuantity() {
        return descendantQuantity;
    }

    private EvenTree getFather() {
        return father;
    }

    int cut() {
        int sum = 0;
        for (EvenTree child : this.getChildren()) {
            if (child.descendantQuantity % 2 == 0) {
                sum = sum + 1 + child.cut();
            } else {
                sum = sum + child.cut();
            }
        }
        return sum;
    }

}
