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
    break;
  case 'deleteSucess':
   let toastMixinone = Swal.mixin({
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
			toastMixinone.fire({
			animation: true,
			title: 'Successfully Deleted'
			});	
    break;
	case 'deleteFailure':
   let toastMixintwo = Swal.mixin({
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
			toastMixintwo.fire({
			animation: true,
			title: 'Unable To Delete Product Something Went Wrong'
			});	
	break;			
	case 'productUpdated':
		Swal.fire({
			  icon: 'success',
			  title: 'Product Details Updated',
			  showConfirmButton: false,
			  timer: 2000})
	break;
	case 'productAdded':
	   let toastMixinthree = Swal.mixin({
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
			toastMixinthree.fire({
			animation: true,
			title: 'New Product Added Successfully'
			});
	break;
	case 'Entered Center not found in data':
		Swal.fire({
			  icon: 'error',
			  title:status,
			  showConfirmButton: false,
			  timer: 2000})
		break;
	case 'orderSucess':
		Swal.fire({
			  icon: 'success',
			  title: 'Order Placed Successfully',
			  showConfirmButton: false,
			  timer: 2000})
	break;
	case 'Not enough Money In Wallet':
		Swal.fire({
			  icon: 'error',
			  title: status+',Go To profile and Recharge Wallet',
			  showConfirmButton: true,
			  timer: false})
	break;
	case 'Delivery Address Not Found,Please update your Address':
		Swal.fire({
			  icon: 'error',
			  title: status,
			  showConfirmButton: true,
			  timer: false})
	break;
	}	
}