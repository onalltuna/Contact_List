
/**
 * Contact List class for linked list implementation.
 * Node class and displayList method are already given for you. You need to implement rest of the methods.
 *
 * addToEnd(Contact new_contact): Add a new contact to the end of linked list.
 * Notice that if the list is empty, this new contact will be your first contact.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * insertAfter(Contact prev_contact, Contact new_contact) :  Add a new contact after a given previous contact.
 * If there is no such previous contact, do not do anything.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * insertBefore(Contact next_contact, Contact new_contact) : Add a new contact before a given 'next contact' .
 * If there is no such next contact, do not do anything.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * delete(Contact del_contact): Delete a given contact from the ContactList.
 * If there is no such contact, do not do anything.
 *
 * addToFav(Contact contact_to_fav): Change position of the given contact to the very beginning of the linked list.
 * If the given contact is already in favourites do not change its position.
 * Change the fav boolean of the contact to true.
 * Do not add a new contact to list with this method.
 *
 * removeFromFav(Contact contact_to_fav): Change position of the given contact to the very end of the linked list.
 * If the given contact is already not in favourites do not change its position.
 * Change the fav boolean of the contact to false.
 * Do not add a new contact to list with this method.
 *
 * displayList(): DO NOT change this method. It is important to have same output format.
 *
 * You are free to add some helper methods in the ContactList class (e.g. search, addToBeginning).
 * But you can also implement this class without any helper methods.
 */

class ContactList
{
    Node head;

    class Node
    {
        Contact data;
        Node next;
        Node(Contact d)
        {
            data = d;
            next = null;
        }
    }
    
//this function checks if the new contact input is null or not
//then if the list is empty makes the new contact head of the list
//if the list is not empty goes till the end of the list and adds new contact to the end of the list
    public void addToEnd(Contact new_contact) {
        // Your code here
    	if(new_contact == null) {
    		
    		try {
        		throw new NullPointerException();

    			} catch(NullPointerException e) {
    				System.out.println("Null contact entry denied!");
    			}
    	}
    	
    	Node added = new Node(new_contact);
    	
    	if (head == null) {
    		head = added;
    		
    	} else {
    		Node current = head;
    		while(current.next != null) {
    			current = current.next;
    		}
    		current.next = added;
    	
    	}
    }
    
 //this function checks if the new contact input is null or no
 //then finds the previous contact in the lis if it exists then inserts new contact after the prev_contact 
    public void insertAfter(Contact prev_contact, Contact new_contact) {
        // Your code here
    	if(new_contact == null) {
    		
    		try {
        		throw new NullPointerException();

    			} catch(NullPointerException e) {
    				System.out.println("Null contact entry denied!");
    			}
    	}
    	Node added = new Node(new_contact);
    	Node current = head;
    	
    	while (current != null) {
    		if(current.data == prev_contact) {
    			added.next = current.next;
    			current.next = added;
    			break;
    		}
    		current = current.next;
    	
    	}
    }
 //this function checks if the new contact input is null or not
 //then finds nex_contact and inserts new_contact before the next_contact 
    public void insertBefore(Contact next_contact, Contact new_contact) {
        // Your code here
    	if(new_contact == null) {
    		
    		try {
        		throw new NullPointerException();

    			} catch(NullPointerException e) {
    				System.out.println("Null contact entry denied!");
    			}
    	}
    	Node added = new Node(new_contact);
    	Node current = head;
    	
    	if(current != null && current.data == next_contact) {
    		added.next = head;
    		head = added;
    	}
    	
    	while(current.next != null) {
    		if(current.next.data == next_contact) {
    			added.next = current.next;
    			current.next = added;
    			break;
    		}
    		current = current.next;
    	}
    	
    }
//this function searches the list if the del_contact is in the list deletes del_contact
    public void delete(Contact del_contact) {
        // Your code here
    	Node current = head;
    	if(current.data == del_contact) {
    		head = current.next;
    	}
    	
    	while(current.next != null) {
    		if(current.next.data == del_contact || current.data == del_contact) {
    			current.next = current.next.next;
    			break;
    			
    		}
    		current = current.next;
    	}
    }
//this function searches for the contac_to_fav if it is in the list puts it to the beginning of the list and makes 
//its fav boolean true
    public void addToFav(Contact contact_to_fav){
        // Your code here
    	
    	Node current = head;
    	
    	while(current.next != null) {
    		if(current.next.data == contact_to_fav && current.next.data.getFav() == false) {
    			Node temp = current.next;
    			current.next = current.next.next;
    			temp.next = head;
    			head = temp;
    			temp.data.setFav(true);
    			break;
    		}
    		current = current.next;
    		
    	}
    }
 
//this function searches for the contact_to_fav and if that contact exists and a fav contact than puts it to the end of the list 
//and makes its fav boolean false
    public void removeFromFav(Contact contact_to_fav){
        // Your code here
    	Node current = head;
    	Node temp = null;
    	
    	while(current.next != null) {
    		if(current.data == contact_to_fav && current.data.getFav() == true) {
        		current.data.setFav(false);
        		temp = current;
        		delete(current.data);
        		addToEnd(temp.data);
        		break;

        	}
    		current = current.next;
    	}
    	
    }
    

    public void displayList() {
        Node temp = head;
        while (temp != null)
        {
            temp.data.displayInfo();
            temp = temp.next;
        }
    }

}