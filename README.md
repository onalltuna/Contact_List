# ContactList

This Java program implements a ContactList using a linked list data structure. It allows you to add, delete, and manage contacts, including marking them as favorites.


The ContactList is a Java program that provides a simple way to manage a list of contacts. You can add new contacts, delete contacts, and mark them as favorites.

## Project Details

The project consists of the following classes:

- `Contact`: Represents an individual contact with details such as name, phone number, and email. It includes methods for setting and retrieving contact information.

- `ContactList`: Manages the list of contacts using a linked list. This class implements methods for adding contacts, deleting contacts, and managing favorites.

## Implementation Details

Here's a brief overview of the methods implemented in the `ContactList` class:

- `addToEnd(Contact new_contact)`: Add a new contact to the end of the list.

- `insertAfter(Contact prev_contact, Contact new_contact)`: Insert a new contact after a specified previous contact.

- `insertBefore(Contact next_contact, Contact new_contact)`: Insert a new contact before a specified next contact.

- `delete(Contact del_contact)`: Delete a specified contact from the list.

- `addToFav(Contact contact_to_fav)`: Mark a contact as a favorite and move it to the beginning of the list.

- `removeFromFav(Contact contact_to_fav)`: Remove a contact from the favorites and move it to the end of the list.


