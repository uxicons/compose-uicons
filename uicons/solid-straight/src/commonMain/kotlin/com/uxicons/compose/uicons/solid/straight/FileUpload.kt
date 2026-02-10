package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUpload: ImageVector? = null

val Icons.Ss.FileUpload: ImageVector
    get() = _FileUpload ?: UXIcon(name = "FileUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(15.29f, 16.29f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.01f)
                lineToRelative(-2.29f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.78f, -0.77f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _FileUpload = it}
