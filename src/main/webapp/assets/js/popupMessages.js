function run()
{
	break;
}

function showMessage(check)
{
let status = check;
switch(status) 
{
  case 'loginSucess':
   let toastMixin = Swal.mixin({
        toast: true,
        icon: 'success',
        title: 'General Title',
        animation: false,
        position: 'top-right',
        showConfirmButton: false,
        timer: 1500,
        timerProgressBar: true,
        didOpen: toast => {
        toast.addEventListener('mouseenter', Swal.stopTimer)
        toast.addEventListener('mouseleave', Swal.resumeTimer)
        }
        });
        toastMixin.fire({
        animation: true,
        title: 'Login Successfull'
        }); 
    run();
  case 'deleteSucess':
   let toastMixin = Swal.mixin({
			toast: true,
			icon: 'success',
			title: 'General Title',
			animation: false,
			position: 'top-right',
			showConfirmButton: false,
			timer: 3000,
			timerProgressBar: true,
			didOpen: toast => {
			toast.addEventListener('mouseenter', Swal.stopTimer)
			toast.addEventListener('mouseleave', Swal.resumeTimer)
			}
			});
			toastMixin.fire({
			animation: true,
			title: 'Successfully Deleted'
			});	
    run();
	case 'deleteFailure':
   let toastMixin = Swal.mixin({
			toast: true,
			icon: 'success',
			title: 'General Title',
			animation: false,
			position: 'top-right',
			showConfirmButton: false,
			timer: 1500,
			timerProgressBar: true,
			didOpen: toast => {
			toast.addEventListener('mouseenter', Swal.stopTimer)
			toast.addEventListener('mouseleave', Swal.resumeTimer)
			}
			});
			toastMixin.fire({
			animation: true,
			title: 'Unable To Delete Product Something Went Wrong'
			});	
	run();				
	case 'productUpdated':
		Swal.fire({
			  icon: 'success',
			  title: 'Product Details Updated',
			  showConfirmButton: false,
			  timer: 2000})
	run();
	case 'productAdded':
	   let toastMixin = Swal.mixin({
			toast: true,
			icon: 'success',
			title: 'General Title',
			animation: false,
			position: 'top-right',
			showConfirmButton: false,
			timer: 1500,
			timerProgressBar: true,
			didOpen: toast => {
			toast.addEventListener('mouseenter', Swal.stopTimer)
			toast.addEventListener('mouseleave', Swal.resumeTimer)
			}
			});	
			toastMixin.fire({
			animation: true,
			title: 'New Product Added Successfully'
			});
	run();
	case 'Entered Center not found in data':
		Swal.fire({
			  icon: 'error',
			  title:status,
			  showConfirmButton: false,
			  timer: 2000})
		run();
	case 'orderSucess':
		Swal.fire({
			  icon: 'success',
			  title: 'Order Placed Successfully',
			  showConfirmButton: false,
			  timer: 2000})
	run();
	case 'Not enough Money In Wallet':
		Swal.fire({
			  icon: 'error',
			  title: status+',Go To profile and Recharge Wallet',
			  showConfirmButton: true,
			  timer: false})
	run();
	case 'Delivery Address Not Found,Please update your Address':
		Swal.fire({
			  icon: 'error',
			  title: status,
			  showConfirmButton: true,
			  timer: false})
	run();
	}	
}