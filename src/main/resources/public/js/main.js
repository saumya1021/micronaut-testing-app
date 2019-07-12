

function getTableData(currentObject){
  var a=$(currentObject).closest('tr');
  var col1=a.find('td:eq(0)').text();
  var col2=a.find('td:eq(1)').text();
  var col3=a.find('td:eq(2)').text();
  var col4=a.find('td:eq(3)').text();
  $('#productName').val(col2);
  $('#productModel').val(col3);
  $('#productPrice').val(col4);
  $("#productId").val(col1);
}

function deleteData(currentObject){
    var a=$(currentObject).closest('tr');
    $("#deleteId").val(a.find('td:eq(0)').text());
    $('#deleteForm').submit();

}
