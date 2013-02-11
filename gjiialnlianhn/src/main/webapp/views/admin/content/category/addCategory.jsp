<table border="0" cellpadding="0" cellspacing="0">
	<tr>
	<td>
		<form name="uploadForm" id="uploadForm" enctype="multipart/form-data" method="post" action="addCategory">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th valign="top">Name:</th>
			<td>
				<input type="text" class="inp-form" name="name" id="name"/>
			</td>
			<td></td>
		</tr>
		<tr>
		<th valign="top">Category:</th>
			<td>	
				<select style="width:200px" id="catOpt" name="catOpt">
					<option value="">Select Category</option>
				</select>
			</td>
		</tr>
		<tr>
			<th valign="top">Url:</th>
			<td><textarea rows="" cols="" class="form-textarea" id="url" name="url"></textarea></td>
			<td></td>
		</tr>
		</table>
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Image 1:</th>
			<td>
				<!--  <form name="uploadForm" id="uploadForm" enctype="multipart/form-data" method="post" action="addCategory">			-->					
					<input type="file" class="file_1 multi max-3 accept-gif|jpg|jpeg|png" id="upload" name="upload" size="40"/>					
				<!-- </form> -->	
			</td>
			<td>
				<div class="bubble-left"></div>
				<div class="bubble-inner">JPEG, GIF 5MB max per image</div>
				<div class="bubble-right"></div>
			</td>
		</tr>
	
		<tr>
			<th>&nbsp;</th>
			<td valign="top">
				<input type="button" class="form-submit"/>
				<input type="reset" class="form-reset"/>
			</td>
		</tr>
		</table>
		</form>
	</td>
	</tr>
</table>