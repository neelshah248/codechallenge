package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Tree{

private String location;

private String surname;

private String parent;

private String forename;

private List<TreeMap> children;

  

public void TreeNode(String location, String surname, String parent, String forename) {

this.location = location;

this.surname = surname;

this.parent = parent;

this.forename = forename;

}

public void TreeNode() {

this.location = "";

this.surname = "";

this.parent = "";

this.forename = "";

children = new ArrayList<TreeNode>();

}

public void setLocation(String location) {

this.location = location;

}

public String getLocation() {

return location;

}

  

public void setSurname(String surname) {

this.surname = surname;

}

  

public String getSurname() {

return surname;

}

  

public void setParent(String parent) {

this.parent = parent;

}

  

public String getParent() {

return parent;

}

public void setForename(String forename) {

this.forename = forename;

}

public String getForename() {

return forename;

}

public void insert(TreeNode root, TreeNode newChild) {

if(root == null) {

root=newChild;

return;

}

if(root.forename==newChild.parent) {

root.children.add(newChild);

return;

}

for(TreeNode child : root.children) {

insert(child,newChild);

}

}

}