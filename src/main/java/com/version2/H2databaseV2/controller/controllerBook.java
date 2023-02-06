package com.version2.H2databaseV2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class controllerBook {

  //  @GetMapping(value = {"/printAllBooksNames"})
    @GetMapping(path = {"/printAllBooksNames"})
    public String printAllBooks(){
          String str ="print method executed ...";
        return str;
    }
//     @GetMapping(path = {"/welcome"})
//    public String welcomeMethod(@RequestParam String name){
//
//        return "Hello, this is your first visit for book website " + name + " !";
//    }
//        @GetMapping(path = {"/welcome"})
//    public String welcomeMethod(@RequestParam String bookName ,
//                                @RequestParam String bookNumOfPages,
//                                @RequestParam (required = false , defaultValue = "author was dead") String authName ){
//
//        return "Hello! ,The book name " + bookName + " That have "+ bookNumOfPages + " Author name " + authName + " Does not exist !";
//    }

    @GetMapping(path = {"/welcome"})
    public String welcomeMethod(@RequestParam String bookName ,
                                @RequestParam String bookNumOfPages,
                                @RequestParam (required = false , defaultValue = "author was dead") String authName,
                                @RequestParam String Id ){

        return "Book name: " + bookName + " number of pages: "+ bookNumOfPages + " Author name: " + authName + " Book ID: " + Id;
    }



}
