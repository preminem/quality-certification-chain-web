function hasPermission(permission) {
    var permissions = JSON.parse(localStorage.getItem("permissions"));
    var hs = permissions.stringPermissions.indexOf(permission) > -1
    return hs
}
document.write('<script src="../js/layer/layer.js"></script>\n')
window.alert = function (message) {
    var index = layer.open({
        title: '提示信息'
        ,content: message
    });
    setTimeout(function () {
        layer.close(index)
    },3000);
};

my_confirm=function (message,callback) {
    layer.open({
        title: '提示信息'
        ,content: message,
        yes:function (index) {
            callback();
            layer.close(index);
        }
    })
}
function dateToStr(datetime) {

    var year = datetime.getFullYear();
    var month = datetime.getMonth() + 1;
    var date = datetime.getDate();
    var hour = datetime.getHours();
    var minutes = datetime.getMinutes();
    var second = datetime.getSeconds();

    if (month < 10) {
        month = "0" + month;
    }
    if (date < 10) {
        date = "0" + date;
    }
    if (hour < 10) {
        hour = "0" + hour;
    }
    if (minutes < 10) {
        minutes = "0" + minutes;
    }
    if (second < 10) {
        second = "0" + second;
    }

    var time = year + "-" + month + "-" + date + " " + hour + ":" + minutes + ":" + second;
    return time;
}

function dateToMs(date) {
    var result = new Date(date).getTime();
    return result;
}

function getQueryString(name) {
    var reg = new RegExp("(^|&amp;)" + name + "=([^&amp;]*)(&amp;|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

function StringFormat() {
    if (arguments.length == 0)
        return null;
    var str = arguments[0];
    for (var i = 1; i < arguments.length; i++) {
        var re = new RegExp('\\{' + (i - 1) + '\\}', 'gm');
        str = str.replace(re, arguments[i]);
    }
    return str;
}

function checkPermission() {
    if (Cookies.get("unittype") == "2") {
        disable($(".renzhengAndshenheyuan"));
        disable($(".renzhengAndyewuyuan"));
        // $(".renzhengAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
        // $(".renzhengAndyewuyuan  ").parent().attr("style", "pointer-events: none;");

        if (Cookies.get("usertype") == "1") {
            disable($(".jianceAndshenheyuan"));
            // $(".jianceAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
        } else if (Cookies.get("usertype") == "2") {
            disable($(".jianceAndyewuyuan"));
            // $(".jianceAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
        } else if (Cookies.get("usertype") == "3") {

        } else {
            disable($(".jianceAndyewuyuan"));
            disable($(".jianceAndshenheyuan"));
            // $(".jianceAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
            // $(".jianceAndshenheyuan  ").parent().attr("style", "pointer-events: none;");

        }
    } else if (Cookies.get("unittype") == "1") {
        disable($(".jianceAndyewuyuan"));
        disable($(".jianceAndshenheyuan"));
        // $(".jianceAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
        // $(".jianceAndshenheyuan  ").parent().attr("style", "pointer-events: none;");

        if (Cookies.get("usertype") == "1") {
            disable($(".renzhengAndshenheyuan"));

            // $(".renzhengAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
        } else if (Cookies.get("usertype") == "2") {
            disable($(".renzhengAndyewuyuan"));

            // $(".renzhengAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
        } else if (Cookies.get("usertype") == "3") {

        } else {
            $(".renzhengAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
            $(".renzhengAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
        }
    } else {
        disable($(".jianceAndyewuyuan"));
        disable($(".jianceAndshenheyuan"));
        disable($(".renzhengAndshenheyuan"));
        disable($(".renzhengAndyewuyuan"));
        // $(".jianceAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
        // $(".jianceAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
        // $(".renzhengAndshenheyuan  ").parent().attr("style", "pointer-events: none;");
        // $(".renzhengAndyewuyuan  ").parent().attr("style", "pointer-events: none;");
    }
    var name = Cookies.get("username")
    if(name=="admin1" || name=="admin2" || name=="admin3"){
        //$(".renzhengAndyewuyuan  ").parent().attr("style", "pointer-events: none;")
        disable($(".renzhengAndyewuyuan"));
        disable($(".jianceAndyewuyuan"))
        disable($(".renzhengAndshenheyuan"))
        disable($(".jianceAndshenheyuan"))
    }
}

function disable(el) {

    var lis = el.parent().find('.menu-content').find('.menu-item');
    lis.attr("href","#");
    lis.css("color","gray");

}

$(function () {
    checkPermission();
});