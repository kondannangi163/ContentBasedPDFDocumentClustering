# ContentBasedPDFDocumentClustering
Aim : 
       Retrieving the document based on the query of the user by analyzing the whole list of the documents internally. 
       We propose this work of document clustering and ranking, which is an automatic grouping of documents into clusters. 
       Retrieving the information and documents as per the user requested query(keyword) which would be relevant to what the user is expecting.
 
Steps:

1. Firstly the user enters into the application they have 2 options either to insert the document or to search for any document.
2. In case of insertion, once a book is been uploaded, which we consider as pdf or text format, if it is pdf file we would convert it to text file, else we would proceed our     analysis of the words present in the document.
3. We then tend to maintain the words which is to stored into the index file.
4. This index file  is in turn helpful to us in retrieving the documents .
5. In case of searching, when the user generates the query which can be either boolean, phrase, fuzzy, wildcard etc. then the index file is been searched for that  query.
6. This index file helps us to decide the ranking of that word with respect to the documents present with us. Score is also being generated based on the query.
7. The maintenance of the index file is helpful in reducing the processing time of the searching.




    
