package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Ss.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(10.5f, 13.09f)
                lineToRelative(4f, 4f)
                lineToRelative(7.5f, -7.5f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(18.59f)
                lineToRelative(8.5f, -8.5f)
                close()
                moveTo(7.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 19.91f)
                lineToRelative(-4f, -4f)
                lineTo(2.41f, 24f)
                horizontalLineToRelative(19.59f)
                verticalLineToRelative(-11.59f)
                lineToRelative(-7.5f, 7.5f)
                close()
            }
        }.also { _FileImage = it}
