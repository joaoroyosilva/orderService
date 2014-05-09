/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.model;

import java.sql.Date;




/**
 *
 * @author jroyo
 */
public class Call {
    private int id;
    private String title;
    private Date openingTime;
    private int solution;
    private String description;
    private Corporate corporate;
    private Date closingTime;
    private User useropened;
    private User userclosed;
    private String status;
}
