var vue = new Vue({
    el:'#app',
    data:{
        userList:[],
        user:{}
    },
    methods:{
        findAll:function(){
            var _this=this; //this代表是vue对象
            axios.get("./user/findAll").then(function(response){
//          this变成了window（可以使用_this或者vue）
                vue.userList = response.data;
            })
        },
        findOne:function (id) {
            var _this = this;
            axios.get("./user/findOne/" + id).then(function (response) {
                //this 编程了window,使用_this
                _this.user = response.data;
            });
        },
        update:function() {
            var _this = this;
            axios.post("./user/update",this.user).then(function(response){
                _this.findAll();
            }).catch(function(err){
                alert("修改失败");
            })
        }
        }

    },
    created:function(){
        this.findAll();
    }

})
