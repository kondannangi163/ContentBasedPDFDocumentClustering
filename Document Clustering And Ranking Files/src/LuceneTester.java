/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.FuzzyQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.TopDocs;

public class LuceneTester {

String indexDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Index";
String dataDir = null;
Indexer indexer;
Searcher searcher;

public static void main(String[] args) {
  LuceneTester tester;
  try {
      tester = new LuceneTester();
       tester.createIndex();
        //String st[]=tester.search();
   
  } catch (IOException e) {
      e.printStackTrace();
  }		
}
public void createIndex() throws IOException {
  indexer = new Indexer(indexDir);
  int numIndexed;
  long startTime = System.currentTimeMillis();	
  numIndexed = indexer.createIndex(dataDir, new TextFileFilter());
  long endTime = System.currentTimeMillis();
  indexer.close();
  System.out.println(numIndexed+" File indexed, time taken: "
     +(endTime-startTime)+" ms");		
}
public String[] search(String searchQuery) throws IOException, ParseException {
      searcher = new Searcher(indexDir);
	String st[]=new String[1000];
	int i=0;
      long startTime = System.currentTimeMillis();
      TopDocs hits = searcher.search(searchQuery);
      long endTime = System.currentTimeMillis();   
      System.out.println(hits.totalHits +
         " documents found. Time :" + (endTime - startTime));
      for(ScoreDoc scoreDoc : hits.scoreDocs) {
         Document doc = searcher.getDocument(scoreDoc);
            System.out.println("score=    "+scoreDoc.score+"        id:"+scoreDoc.doc+"       File: "
            + doc.get(LuceneConstants.FILE_PATH));
	st[i]="score=        "+scoreDoc.score+"                     id:       "+scoreDoc.doc+"               File: "
            + doc.get(LuceneConstants.FILE_PATH);
	i++;
      }

      searcher.close();
	return st;
   }

}
