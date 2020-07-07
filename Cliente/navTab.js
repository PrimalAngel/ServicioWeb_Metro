$(document).ready(function() {
  $('ul.menu li a:first').addClass('active');
  $('.secciones article').hide();
  $('.secciones article:first').show();

  $('ul.menu li a').click(function() {
    $('ul.menu li a').removeClass('active');
    $(this).addClass('active');
    $('.secciones article').hide();

    var activeTab = $(this).attr('href');
    console.log(activeTab);
    $(activeTab).show();
    return false;
  });
});
