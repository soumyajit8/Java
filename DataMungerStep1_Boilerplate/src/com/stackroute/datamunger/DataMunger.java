package com.stackroute.datamunger;

import java.util.Arrays;
import java.util.ArrayList;


/*There are total 5 DataMungertest files:
 *
 * 1)DataMungerTestTask1.java file is for testing following 3 methods
 * a)getSplitStrings()  b) getFileName()  c) getBaseQuery()
 *
 * Once you implement the above 3 methods,run DataMungerTestTask1.java
 *
 * 2)DataMungerTestTask2.java file is for testing following 3 methods
 * a)getFields() b) getConditionsPartQuery() c) getConditions()
 *
 * Once you implement the above 3 methods,run DataMungerTestTask2.java
 *
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getLogicalOperators() b) getOrderByFields()
 *
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 *
 * 4)DataMungerTestTask4.java file is for testing following 2 methods
 * a)getGroupByFields()  b) getAggregateFunctions()
 *
 * Once you implement the above 2 methods,run DataMungerTestTask4.java
 *
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.util.ArrayList;
import java.util.List;

public class DataMunger {

    /*
     * This method will split the query string based on space into an array of words
     * and display it on console
     */

    public String[] getSplitStrings(String queryString) {
//        String speech = "select * from ipl.csv ";
        String[] result = queryString.toLowerCase().split("\\s");
        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
        return result;
    }

    /*
     * Extract the name of the file from the query. File name can be found after a
     * space after "from" clause. Note: ----- CSV file can contain a field that
     * contains from as a part of the column name. For eg: from_date,from_hrs etc.
     *
     * Please consider this while extracting the file name in this method.
     */

    public String getFileName(String queryString) {

        String fileName = queryString.split("from")[1].split("\\s+")[1];
        return fileName;
    }

    /*
     * This method is used to extract the baseQuery from the query string. BaseQuery
     * contains from the beginning of the query till the where clause
     *
     * Note: ------- 1. The query might not contain where clause but contain order
     * by or group by clause 2. The query might not contain where, order by or group
     * by clause 3. The query might not contain where, but can contain both group by
     * and order by clause
     */

    public String getBaseQuery(String queryString) {

        String base = queryString.split("where")[0];

        return base.trim();
    }

    /*
     * This method will extract the fields to be selected from the query string. The
     * query string can have multiple fields separated by comma. The extracted
     * fields will be stored in a String array which is to be printed in console as
     * well as to be returned by the method
     *
     * Note: 1. The field name or value in the condition can contain keywords
     * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The field
     * name can contain '*'
     *
     */

    public String[] getFields(String queryString) {

        String[] str = queryString.split("select")[1].trim().split("from")[0].split("[\\s,]+");
        for (String field : str) {
            System.out.println(field);
        }
        return str;


    }

    /*
     * This method is used to extract the conditions part from the query string. The
     * conditions part contains starting from where keyword till the next keyword,
     * which is either group by or order by clause. In case of absence of both group
     * by and order by clause, it will contain till the end of the query string.
     * Note:  1. The field name or value in the condition can contain keywords
     * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
     * might not contain where clause at all.
     */

    public String getConditionsPartQuery(String queryString) {

        String base = queryString.toLowerCase().split("where")[1];
        return base.trim();

    }

    /*
     * This method will extract condition(s) from the query string. The query can
     * contain one or multiple conditions. In case of multiple conditions, the
     * conditions will be separated by AND/OR keywords. for eg: Input: select
     * city,winner,player_match from ipl.csv where season > 2014 and city
     * ='Bangalore'
     *
     * This method will return a string array ["season > 2014","city ='bangalore'"]
     * and print the array
     *
     * Note: ----- 1. The field name or value in the condition can contain keywords
     * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
     * might not contain where clause at all.
     */

    public String[] getConditions(String queryString) {

//          String base = queryString.toLowerCase().split("order by")[0].trim().split("group by")[0].trim().split("where")[1].trim();
//          String[] base2 = base.split("\\s+and\\s+|\\s+or\\s+");
//          return base2;

        if (queryString.contains("where")) {

            String base = queryString.toLowerCase().split("order by")[0].trim().split("group by")[0].trim().split("where")[1].trim();
            String[] base2 = base.split("\\s+and\\s+|\\s+or\\s+");
            return base2;
        } else {
            return null;
        }
    }

    /*
     * This method will extract logical operators(AND/OR) from the query string. The
     * extracted logical operators will be stored in a String array which will be
     * returned by the method and the same will be printed Note:  1. AND/OR
     * keyword will exist in the query only if where conditions exists and it
     * contains multiple conditions. 2. AND/OR can exist as a substring in the
     * conditions as well. For eg: name='Alexander',color='Red' etc. Please consider
     * these as well when extracting the logical operators.
     *
     */

    public String[] getLogicalOperators(String queryString) {
//
//        String[] logic = queryString.split("order by")[0].trim().split("group by")[0].trim().split("where")[1].trim().split("\\s+");
//
//        return logic;
        String[] lops;

        List<String> ops = new ArrayList<>();

        if (queryString.contains("where")) {

            String[] logical = queryString.toLowerCase().split("order by")[0].trim().split("group by")[0].trim().split("where")[1].trim().split("\\s+");

            for (String str2 : logical) {

                if (str2.equals("and"))
                    ops.add("and");


                else if (str2.equals("or"))
                    ops.add("or");

            }

            lops = new String[ops.size()];
            lops = ops.toArray(lops);
            return lops;
        } else
            return null;
    }

    /*
     * This method extracts the order by fields from the query string. Note:
     * 1. The query string can contain more than one order by fields. 2. The query
     * string might not contain order by clause at all. 3. The field names,condition
     * values might contain "order" as a substring. For eg:order_number,job_order
     * Consider this while extracting the order by fields
     */

    public String[] getOrderByFields(String queryString) {

        if (queryString.contains("order by")) {

            String[] order = queryString.split("order by")[1].trim().split("[\\s,]+");

            return order;
        } else {
            return null;
        }

    }

    /*
     * This method extracts the group by fields from the query string. Note:
     * 1. The query string can contain more than one group by fields. 2. The query
     * string might not contain group by clause at all. 3. The field names,condition
     * values might contain "group" as a substring. For eg: newsgroup_name
     *
     * Consider this while extracting the group by fields
     */

    public String[] getGroupByFields(String queryString) {

        if (queryString.contains("group by")) {

            String[] group = queryString.split("group by")[1].trim().split("[\\s,]+");

            return group;
        } else {
            return null;
        }
    }

    /*
     * This method extracts the aggregate functions from the query string. Note:
     *  1. aggregate functions will start with "sum"/"count"/"min"/"max"/"avg"
     * followed by "(" 2. The field names might
     * contain"sum"/"count"/"min"/"max"/"avg" as a substring. For eg:
     * account_number,consumed_qty,nominee_name
     *
     * Consider this while extracting the aggregate functions
     */

    public String[] getAggregateFunctions(String queryString) {

        if (queryString.contains("avg") || queryString.contains("max") || queryString.contains("min") || queryString.contains("sum") || queryString.contains("count")) {

            String aggre = queryString.split("select")[1].trim().split("from")[0];
//        String aggre2 = aggre.replaceAll("[\\[\\](){}]"," ");
           String[] aggre3 = aggre.split(",");


            return aggre3;

        } else {
            return null;
        }
    }

}