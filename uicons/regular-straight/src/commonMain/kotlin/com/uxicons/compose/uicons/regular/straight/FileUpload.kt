package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUpload: ImageVector? = null

val Icons.Rs.FileUpload: ImageVector
    get() = _FileUpload ?: UXIcon(name = "FileUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(13.41f, 11.58f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.01f)
                lineToRelative(-2.29f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.78f, -0.77f, 2.04f, -0.78f, 2.81f, 0f)
                close()
            }
        }.also { _FileUpload = it}
