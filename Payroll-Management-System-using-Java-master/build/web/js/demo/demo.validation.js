(function(a){
    a(document).ready(function(b){
       
        if(a.fn.validate){
            
            a("#da-ex-validate-employee").validate({
                rules:{
                    efirstname:{
                        required:true
                    },
                    emiddlename:{
                        required:true                        
                    },
                    elastname:{
                        required:true
                    },
                    esex:{
                        required:true
                    },
                    address:{
                        required:"#souvenirs:checked"
                    },
                    ecity:{
                        required:true
                    },
                    estate:{
                        required:true
                    },
                    ecountry:{
                        required:true
                    },
                    ezipcode:{
                        required:true,
                        digits:true
                    },
                    emobilephone:{
                        required:true,
                        digits:true
                    },
                    eemailid:{
                        required:true,
                        email:true
                    }
                    
                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-emp").html(d).show()
                    }else{
                        a("#da-ex-val1-error-emp").hide()
                    }
                }
            })

        }
    });

    a(document).ready(function(b){

        if(a.fn.validate){
            a("#da-ex-company").validate({
                rules:{
                    cfullname:{
                        required:true
                    },
                    cshortname:{
                        required:true

                    },
                    caddress:{
                        required:true

                    },
                    ccity:{
                        required:true
                    },
                    cstate:{
                        required:true

                    },
                    ccountry:{
                        required:true

                    },
                    cphoneno:{
                        required:true,
                        digits:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-company").html(d).show()
                    }else{
                        a("#da-ex-val1-error-company").hide()
                    }
                }
            })
        }

    });
    a(document).ready(function(b){

        if(a.fn.validate){
            a("#da-ex-exception").validate({
                rules:{
                    ename:{
                        required:true
                    },
                    ecode:{
                        required:true

                    },
                    eseverity:{
                        required:true

                    },
                    egrancetime:{
                        required:true
                    },
                    ewindow:{
                        required:true

                    },
                    estatus:{
                        required:true

                    }
                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-exception").html(d).show()
                    }else{
                        a("#da-ex-val1-error-exception").hide()
                    }
                }
            })
        }

    });
    a(document).ready(function(b){

        if(a.fn.validate){
            a("#da-ex-meal").validate({
                rules:{
                    mpolicyname:{
                        required:true
                    },
                    mactiveafter:{
                        required:true

                    },
                    mmealtime:{
                        required:true

                    },
                    mmintime:{
                        required:true
                    },
                    mmaxtime:{
                        required:true

                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-meal").html(d).show()
                    }else{
                        a("#da-ex-val1-error-meal").hide()
                    }
                }
            })
        }

    });
    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-validate-break").validate({

                rules:{

                    bpolicyname:{
                        required:true
                    },
                    bactiveafter:{
                        required:true

                    },
                    bdeductiontime:{
                        required:true

                    },
                    bmintime:{
                        required:true
                    },
                    bmaxtime:{
                        required:true

                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-break").html(d).show()
                    }else{
                        a("#da-ex-val1-error-break").hide()
                    }
                }
            })
        }

    });
    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-validate-department").validate({

                rules:{

                    dname:{
                        required:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-department").html(d).show()
                    }else{
                        a("#da-ex-val1-error-department").hide()
                    }
                }
            })
        }

    });

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-validate-register").validate({
                rules:{
                    username:{
                        required:true
                    },
                    emailid:{
                        required:true,
                        email:true
                    },
                    password:{
                        required:true,
                        minlength:5
                    },
                    mobileno:{
                        required:true,
                        digits:true
                    },



                    city:{
                        required:true
                    },
                    state:{
                        required:true
                    },
                    country:{
                        required:true
                    },

                    pincode:{
                        required:true,
                        digits:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-register").html(d).show()
                    }else{
                        a("#da-ex-val1-error-register").hide()
                    }
                }
            })

        }
    });

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-PayPeriodSchedule").validate({

                rules:{

                    pay_period_schedule_name:{
                        required:true
                    },
                    pay_period_type:{
                        required:true
                    }
                //                    transaction_date:{
                //                        required:true,
                //                        digits:true
                //                    },
                //
                //                    pay_periods_from:{
                //                        required:true,
                //                        digits:true
                //                    }
                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-PayPeriodSchedule").html(d).show()
                    }else{
                        a("#da-ex-val1-error-PayPeriodSchedule").hide()
                    }
                }
            })
        }

    });
    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-PolicyGroup").validate({

                rules:{

                    pgname:{
                        required:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-PolicyGroup").html(d).show()
                    }else{
                        a("#da-ex-val1-error-PolicyGroup").hide()
                    }
                }
            })
        }

    });

    // a(document).ready(function(b){
    //
    //        if(a.fn.validate){
    //
    //            a("#da-ex-ReccuringScheduleMaster").validate({
    //
    //                rules:{
    //
    //                     rssweek:{
    //                        required:true,
    //                        digits:true
    //                    },
    //                    rssdate:{
    //                        required:true,
    //                        digits:true
    //                    },
    //                     rsedate:{
    //                        required:true,
    //                        digits:true
    //                    }
    //
    //                },
    //                invalidHandler:function(e,c){
    //                    var f=c.numberOfInvalids();
    //                    if(f){
    //                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
    //                        a("#da-ex-val1-error-ReccuringScheduleMaster").html(d).show()
    //                    }else{
    //                        a("#da-ex-val1-error-ReccuringScheduleMaster").hide()
    //                    }
    //                }
    //            })
    //        }
    //
    //    });


    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-RecurringHoliday").validate({

                rules:{

                    recurring_holiday_name:{
                        required:true
                    },
                    // pay_periods_from:{
                    //                        required:true,
                    //                        digits:true
                    //                    }
                    recurring_holiday_desc:{
                        required:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-RecurringHoliday").html(d).show()
                    }else{
                        a("#da-ex-val1-error-RecurringHoliday").hide()
                    }
                }
            })
        }

    });

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-absencepolicy").validate({

                rules:{

                    AbsencePolicyName:{
                        required:true
                    },
                    
                    AbsencePolicyType:{
                        required:true
                    },

                    data:{
                        required:true
                    },
                    TotalAmount:{
                        required:true,
                        digits:true
                    }
                    

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-absencepolicy").html(d).show()
                    }else{
                        a("#da-ex-val1-error-absencepolicy").hide()
                    }
                }
            })
        }

    });

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-HolidayPolicyDetails").validate({

                rules:{

                    holidaypolicyname:{
                        required:true
                    }

                    

                //                    HolidayPolicyMasterData:{
                //                        required:true
                //                    }


                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-HolidayPolicyDetails").html(d).show()
                    }else{
                        a("#da-ex-val1-error-HolidayPolicyDetails").hide()
                    }
                }
            })
        }

    });

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-holidaypolicymaster").validate({

                rules:{

                    HolidayMasterName:{
                        required:true
                    },

                    MinimunEmployedDays:{
                        required:true,
                        digits:true
                    }
                //                     TotalAmount:{
                //                        required:true,
                //                        digits:true
                //                    }

               


                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-holidaypolicymaster").html(d).show()
                    }else{
                        a("#da-ex-val1-error-holidaypolicymaster").hide()
                    }
                }
            })
        }

    });

    /*a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-payperiodemployeesschedule").validate({

                rules:{

                    HolidayMasterName:{
                        required:true
                    },

                     MinimunEmployedDays:{
                        required:true,
                        digits:true
                    }
//                     TotalAmount:{
//                        required:true,
//                        digits:true
//                    }




                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-payperiodemployeesschedule").html(d).show()
                    }else{
                        a("#da-ex-val1-error-payperiodemployeesschedule").hide()
                    }
                }
            })
        }

    });*/

    a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-reccuringscheduletemplate").validate({

                rules:{

                    reccuringscheduletemplatename:{
                        required:true
                    },

                    reccuringscheduledesc:{
                        required:true
                    },

                    reccuringscheduleweek:{
                        required:true,
                        digits:true
                    }

                //                    sun:{
                //            required:true
                //        }
                //                     starttime:{
                //                        required:true,
                //                        digits:true
                //                    }

              //  endtime:{
                //                        required:true,
                //                        digits:true
                //                    }



                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-reccuringscheduletemplate").html(d).show()
                    }else{
                        a("#da-ex-val1-error-reccuringscheduletemplate").hide()
                    }
                }
            })
        }

    });

a(document).ready(function(b){

        if(a.fn.validate){

            a("#da-ex-schedulepolicymaster").validate({

                rules:{

                    Schedulepolicyname:{
                        required:true
                    }

                },
                invalidHandler:function(e,c){
                    var f=c.numberOfInvalids();
                    if(f){
                        var d=f==1?"You missed 1 field. It has been highlighted":"You missed "+f+" fields. They have been highlighted";
                        a("#da-ex-val1-error-schedulepolicymaster").html(d).show()
                    }else{
                        a("#da-ex-val1-error-schedulepolicymaster").hide()
                    }
                }
            })
        }

    });


})(jQuery);