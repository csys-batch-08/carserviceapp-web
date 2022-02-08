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
	case 'Username and Password does not match try again':
		Swal.fire({
			  icon: 'error',
			  title: 'Username and Password does not match try again',
			  showConfirmButton: false,
			  timer: 3000})
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
	case 'Entered UserID not found in data':
		Swal.fire({
			  icon: 'success',
			  title: 'Order Placed Successfully',
			  showConfirmButton: false,
			  timer: 2000})
	break;
	case 'Entered MailID is  already registered':
		Swal.fire({
			  icon: 'error',
			  title:'Entered MailID is  already registered',
			  showConfirmButton: true,
			  timer: false})
	break;
	case 'Entered mobileno is  already registered':
		Swal.fire({
			  icon: 'error',
			  title: 'Entered mobileno is  already registered',
			  showConfirmButton: true,
			  timer: false})
	break;
	}	
}