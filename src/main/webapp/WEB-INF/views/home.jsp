<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
    <script type="text/javascript">
        var obj = {
          number: 1,
          show: function(){
              console.log('obj = %d',this.number);
          }
        };
        obj.show();


        function obj2(){
            var name = 'obj2';
            console.dir('obj2 ='+this.name);
        };

        obj2();


        function obj3(){
            var my_name = 'obj3';
            return {
                show : function() {
                    return my_name;
                }
            }
        }

        var obj_3 = new obj3();
        console.log('obj3 = %s',obj_3.show());
    </script>
    </body>
</html>
