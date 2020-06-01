//document.writeln("<script src=\"js/jquery.min.js\"></script>");
$(function() {
    $("a").each(function() {
        $(this).text().trim() === "个人信息" && $(this).remove();
    });
    $(".dropdown-notification").each(function () {
        $(this).remove()
    })
    $(".dropdown-menu-right").each(function () {
        $(this).empty()
        $(this).prepend("<a class=\"dropdown-item\" href=\"topassword\"><i class=\"ft-user\"></i>更改密码</a>")
        $(this).append("<div class=\"dropdown-divider\"></div><a class=\"dropdown-item\" href=\"#\" onclick=\"logout()\"><i class=\"ft-power\"></i> 退 出</a>")
    })
});