new Vue({
    el: "#app",
    data: {
        t_class: {
            id: "",
            tname: "",
            enable: "",
            createtime: ""
        },
        classList: []
    },
    methods: {
        queryList: function () {
            var _this = this;
            axios.get('/classController/queryModel.do')
                .then(function (response) {
                    _this.classList = response.data;
                    console.info(_this.classList);
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        showClass: function (cls) {
            var _this = this;
            _this.t_class = cls;
            console.log(_this.t_class.tname);
            console.log(_this.t_class.id);
            changePanel();
        },
        updateClass: function (t_class) {
            var _this = this;
            //console.log("id:" + t_class)
            axios.post('/classController/updateClassName.do', t_class)
                .then(function (response) {
                    $('.changeAllWrap').addClass('hide');
                    _this.queryList();
                })
                .catch(function (error) {
                    console.log(error);
                });

        },
        //刪除
        deleteClassid: function (id) {
            var _this = this;
            console.log("idid:" + id)

            axios.get('/classController/deletaClassId.do', {params: {id: id}})
                .then(function (response) {
                    alert(id);
                    _this.queryList();
                })

                .catch(function (error) {
                    console.log(error);
                    console.log("idid:" + id)
                });
        },
        addClass: function () {
            var _this = this;
            axios.get()
                .then(function (response) {
                    _this.queryList();
                })
                .catch(function (error) {
                    console.log(error);
                })
        }

    },
    created: function () {
        this.queryList();
    },


});