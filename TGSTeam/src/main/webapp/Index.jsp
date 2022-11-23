<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thế giới sách</title>
   <link rel="stylesheet" href="Css/Style.css">
     <link rel="stylesheet" href="icon/fontawesome-free-5.15.4-web/css/all.min.css">
</head>
<body>
<div class="Container">
        <!-- Header -->
          
        <!-- Header -->
        <!-- MenuBar Star-->
        <div class="MenuBar" id="item">
            <div class="Logo">TGS Team</div>
            <div class="Header_menu">
                <ul>
                <li class="Header_menuItem"><a href="#" target="" class="Header_menuItem_Link">
                           <i class="far fa-user"></i> Tài khoản </a></li>
                    <li class="Header_menuItem"><a href="index.html" class="Header_menuItem_Link">
                            <i class="fas fa-home"></i> Trang Chủ</a></li>
                    <li class="Header_menuItem"><a href="#" class="Header_menuItem_Link">
                           <i class="far fa-bell"></i> Thông Báo</a>
                    </li>
                    <li class="Header_menuItem"><a href="#" target="" class="Header_menuItem_Link">
                          <i class="far fa-question-circle"></i>  Giới Thiệu</a></li>
                    
                           <li class="Header_menuItem"><a href="#" target="" class="Header_menuItem_Link">
                        <i class="fas fa-cart-plus"></i> Giỏ hàng </a>
                        <div class="GioHang">
                        <div class="title">
                        <div class="title_SanPham">Sản phẩm</div>
                         <div class="title_DonGia">Đơn giá</div>
                          <div class="title_SoLuong">SL</div>
                        
                        </div>
                        <c:forEach items="${ListP}" var="o">
                        <div class="Prdin">
                        <div class="Prdin_Hinh">
                        <img src="${o.getHinhAnh()}" alt="">
                        </div>
                         <div class="Prdin_TenSP"> ${o.getTenSP()}</div>
                          <div class="Prdin_Gia"> ${o.getDonGia()} VND </div>
                           <input class="Prdin_SoLuong" type="number" name="points" min="1" value="1">
                        	<input class="Prdin_Select" type="checkbox" name="points" min="1">
                        </div>
                         </c:forEach>
                        </div>
                        </li>
                </ul>
            </div>
            <div class="Header_seach">
            <form action="Seach" method="post">
                <input type="text" class="TimKiem" name="SeachProduct">
                <button type="submit"><i class="fas fa-search"></i></button>
</form>
            </div>
            <div class="Header_LogInLogOut">
                <a href="DangNhap.html"><i class="fas fa-sign-in-alt"></i>Đăng nhập</a>
                <a href="DangKy.html"><i class="fas fa-user-plus"></i> Đăng ký</a>
            </div>
        </div>
          <!-- MenuBar End-->
          <!-- List star -->
        <div class="Lists" id="item">
        
            <ol type="1" class="Lists_List">
                <h3>Danh mục sách</h3>
                 <c:forEach items="${ListL}" var="o">
                <li class="Lists_List_Item"><a href="SelectListItem?cid=${o.getMaLoaiSanPham()}" class="Lists_List_Item_Link">
                      <i class="fas fa-stream"></i> ${o.getTenLoaiSanPham()}</a></li>
                 </c:forEach>
            </ol>

        </div>
         <!-- List end -->
         <!-- SlideBar star -->
         <div class="SlideBar">
            <a href=""><img src="Images/sach4.png" alt="" width="100%" height="400px" id="is"></a>
             <button id="back" onclick="lui()">
                Back
            </button>
            <div class="buttons">
                <button onclick="play()">
                    Play
                </button>
                <button onclick="stop()">
                    Stop
                </button>
            </div>
            <button id="next" onclick="toi()">Next</button>
         </div>
            <!-- SlideBar star -->
        <div class="Product" id="item">
        <c:forEach items="${ListP}" var="o">
            <div class="prd">
                <div class="NameProduct">
                ${o.getTenSP()}
                </div>
                <img src="${o.getHinhAnh()}" alt="">
                <div class="PriceProduct"> ${o.getDonGia()} VND </div>
                <button class="BuyProduct"><i class="fas fa-shopping-cart"></i>Mua</button>
                <button>Thêm vào giỏ hàng</button>
            </div>
            </c:forEach>
        </div>
        <div class="Footer" id="item">
            <div class="footerrow row1">
                <ul class="footer_list">
                    <h3>DỊCH VỤ</h3>
                    <li><a href="">Điều khoản sử dụng</a></li>
                    <li><a href="">Chính sách bảo mật</a></li>
                    <li><a href="">Giới thiệu về BookFree</a></li>
                    <li><a href="">Hệ thống trung tâm nhà sách</a></li>
                </ul>
            </div>
            <div class="footerrow row2">
                <ul class="footer_list">
                    <h3>HỖ TRỢ</h3>
                    <li><a href="">Chính sách đổi trả - Hoàn tiền</a></li>
                    <li><a href="">Chính sách khách sỉ</a></li>
                    <li><a href="">Phương thức vận chuyển</a></li>
                    <li><a href="">Phương thức thanh toán và xuất HD</a></li>
                </ul>
            </div>
            <div class="footerrow row3">
                <ul class="footer_list">
                    <h3>TÀI KHOẢN CỦA TÔI</h3>
                    <li><a href="">Đăng nhập/ Tạo tài khoản mới</a></li>
                    <li><a href="">Thay đổi địa chỉ khách hàng</a></li>
                    <li><a href="">Chi tiết tài khoản</a></li>
                    <li><a href="">Lịch sử mua hàng</a></li>
                </ul>
            </div>
            <div class="footerrow row4">
                <ul class="footer_list">
                    <h3>THEO DÕI CHÚNG TÔI</h3>
                    <li> <a href="">
                            <i class="fab fa-facebook"></i>
                            FaceBook</a></li>
                    <li><a href="">
                            <i class="fab fa-instagram-square"></i>
                            Intagram</a></li>
                    <li><a href="">
                            <i class="fab fa-linkedin"></i>
                            Linked</a></li>
                    <li><a href="">
                            <i class="fab fa-telegram-plane"></i>
                            Telegram</a></li>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>