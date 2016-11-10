(function(a){
    a(document).ready(function(c){
        a("#da-ex-accordion, #da-ex-accordion-plain").accordion();
        a("#da-ex-tabs, #da-ex-tabs-plain").tabs();
        a("#da-ex-datepicker, #da-ex-datepicker-inline").datepicker({
            showOtherMonths:true
        });
        a("#da-ex-datepicker-week").datepicker({
            showOtherMonths:true,
            showWeek:true
        });
        a("#da-ex-datepicker-months").datepicker({
            showOtherMonths:true,
            numberOfMonths:3
        });
        a("#da-ex-datetimepicker").datetimepicker();
        a("#da-ex-datetimepicker1").datetimepicker();
        a("#da-ex-timepicker").timepicker({});
        a(".da-ex-buttons").button();
        a("#da-ex-buttons-radio, #da-ex-buttons-checkbox").buttonset();
        a("#da-ex-buttons-icon button:first").button({
            icons:{
                primary:"ui-icon-locked"
            },
            text:false
        }).next().button({
            icons:{
                primary:"ui-icon-locked"
            }
        }).next().button({
        icons:{
            primary:"ui-icon-gear",
            secondary:"ui-icon-triangle-1-s"
        }
    }).next().button({
        icons:{
            primary:"ui-icon-gear",
            secondary:"ui-icon-triangle-1-s"
        },
        text:false
    });
    var b=["ActionScript","AppleScript","Asp","BASIC","C","C++","Clojure","COBOL","ColdFusion","Erlang","Fortran","Groovy","Haskell","Java","JavaScript","Lisp","Perl","PHP","Python","Ruby","Scala","Scheme"];
    a("#da-ex-autocomplete").autocomplete({
        source:b
    });
    a("#da-ex-slider").slider();
    a("#da-ex-slider-range").slider({
        range:true,
        min:0,
        max:500,
        values:[75,300],
        slide:function(d,e){
            a("#da-ex-slider-range-info .da-highlight").html("$"+e.values[0]+" - $"+e.values[1])
            }
        });
a(".da-ex-color-slider").slider({
    range:"min",
    value:45,
    min:1,
    max:100
});
a("#da-ex-slider-range-fixed").slider({
    range:"min",
    value:37,
    min:1,
    max:700,
    slide:function(d,e){
        a("#da-ex-slider-range-fixed-info .da-highlight").html("$"+e.value)
        }
    });
a("#da-slider-equalizer > span").each(function(){
    var d=parseInt(a(this).text(),10);
    a(this).empty().slider({
        value:d,
        range:"min",
        animate:true,
        orientation:"vertical"
    })
    });
a(".da-ex-color-pb, #da-ex-pb, #da-ex-pba").each(function(){
    a(this).progressbar({
        value:25+Math.floor(Math.random()*50)
        })
    });
a("#da-ex-pba-trigger").bind("click",function(d){
    a(this).parent().next("#da-ex-pba").progressbar("value",20+Math.floor(Math.random()*80));
    d.preventDefault()
    });
a("#da-ex-dialog-div").dialog({
    autoOpen:false,
    title:"Default UI Dialog",
    modal:true,
    width:"640",
    buttons:[{
        text:"Close Dialog",
        click:function(){
            a(this).dialog("close")
            }
        }]
});
a("#da-ex-dialog-form-div").dialog({
    autoOpen:false,
    title:"UI Dialog Modal Form",
    modal:true,
    width:"640",
    buttons:[{
        text:"Submit",
        click:function(){
            a(this).find("form#da-ex-dialog-form-val").submit()
            }
        }]
}).find("#da-ex-dialog-dp").datepicker({
    dateFormat:"yy-mm-dd"
}).end().find("form").validate({
    rules:{
        reqField:{
            required:true
        },
        picture:{
            required:true,
            accept:["jpeg","jpg","png","gif"]
            },
        dateField:{
            required:true,
            date:true
        },
        gender:{
            required:true
        }
    },
invalidHandler:function(f,d){
    var g=d.numberOfInvalids();
    if(g){
        var e=g==1?"You missed 1 field. It has been highlighted":"You missed "+g+" fields. They have been highlighted";
        a("#da-validate-error").html(e).show()
        }else{
        a("#da-validate-error").hide()
        }
    }
});
a("#da-ex-dialog").bind("click",function(d){
    a("#da-ex-dialog-div").dialog("option",{
        modal:false
    }).dialog("open");
    d.preventDefault()
    });
a("#da-ex-dialog-modal").bind("click",function(d){
    a("#da-ex-dialog-div").dialog("option",{
        modal:true
    }).dialog("open");
    d.preventDefault()
    });
a("#da-ex-dialog-form").bind("click",function(d){
    a("#da-ex-dialog-form-div").dialog("option",{
        modal:true
    }).dialog("open");
    d.preventDefault()
    });
if(a.jGrowl){
    a("#da-ex-growl").bind("click",function(d){
        a.jGrowl("Hello World!",{
            position:"bottom-right"
        })
        });
    a("#da-ex-growl-1").bind("click",function(d){
        a.jGrowl("A sticky message",{
            sticky:true,
            position:"bottom-right"
        })
        });
    a("#da-ex-growl-2").bind("click",function(d){
        a.jGrowl("Message with Header",{
            header:"Important!",
            position:"bottom-right"
        })
        })
    }
})
})(jQuery);