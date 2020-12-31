# Key-Value-Datastore

Datastore

  A file-based key-value data store that supports the basic CRD (create, read, and delete) operations.This data store is meant to be used as a local storage for one single process on one laptop. The data store can be exposed as a library to clients that can instantiate a class and work with the data store.
  
Usage of Datastore Library:

First create a project and add the DataStore dependency, then you will be able instantiate and use the DataStore for your project usecase.


/**
* Constructor initialize the DataStore with default storage location
*/
DataStore myDataStore = new DataStore();// default location will be "C:\Users\Public\Documents"

/**
* Constructor initialize the DataStore with given storage location
*
* @param filePath
*            the storage location path
*/
DataStore myDataStore = new DataStore(String filePath);//pass file location

/**
*
* Method to create an element in the DataStore
*
* @param key
*            The key of the element
* @param value
*            The value of the element
* @return status of the operation
*/
myDataStore.create(String key, JSONObject value);

/**
* Method to create an element in the DataStore
*
* @param key
*            The key of the element
* @param value
*            The value of the element
* @param timeToLive
*            Number of seconds after which the element is destroyed
* @return status of the operation
*/
myDataStore.create(String key, JSONObject value, int timeToLive);

/**
* Method to read an element from the DataStore
*
* @param key
*            The key of the element to read the element
* @return The value as type of JSONObject
*/
myDataStore.read(String key)

/**
* Method to delete an element from the DataStore
*
* @param key
*            The key of the element to read the element
* @return The status of the delete operation
*/
myDataStore.delete(String key)



