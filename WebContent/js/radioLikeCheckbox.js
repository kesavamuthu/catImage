
function CheckBoxToRadio(selectorOfCheckBox, radioBehave) {
    $(selectorOfCheckBox).each(function()
    {
      $(this).change(function()
      {
        var isCheckedThis = $(this).prop('checked');
        $(selectorOfCheckBox).prop('checked',false);

        if (isCheckedThis === true | radioBehave === true) {
          $(this).prop('checked', true);
        }
      });
    });
  }
  function checkboxCleaner(selectorOfCheckBox){
    alert('you have already chose three options');
    $(selectorOfCheckBox).each(function(){
      $(this).change(function(){
        $(selectorOfCheckBox).prop('checked', false);
      });
    });
  }



function crazyCheck(selectorOfCheckBox){
  var checkedCount = -1;
//  var ano = selectorOfCheckBox.split(' ');
  //var x = document.getElementsByClassName(ano[1]);
  var firstTime = true;
  var x = document.getElementsByTagName('input');
  for(var i = 0; i < x.length; ++i){
    if(x[i].checked === true)
    ++checkedCount;
  }
  console.log(checkedCount + ' ' + firstTime);
  if(checkedCount < 3){
  CheckBoxToRadio(selectorOfCheckBox, true);
  if(checkedCount + 1 === 3 && firstTime){
      firstTime = false;
      $('form').append('<br><input type="submit">');
    }
}
  else
  checkboxCleaner(selectorOfCheckBox);
}

//CheckBoxToRadio(".checkbox-wrapper .chb");
//CheckBoxToRadio(".checkbox-wrapper2 .chb", true);
