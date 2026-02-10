package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Bs.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(22f, 5.67f)
                verticalLineToRelative(18.34f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(19f, 16.12f)
                lineToRelative(-3f, 3f)
                lineToRelative(-4f, -4f)
                lineToRelative(-5.88f, 5.88f)
                horizontalLineToRelative(12.88f)
                verticalLineToRelative(-4.88f)
                close()
                moveTo(19f, 8.0f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(14.88f)
                lineToRelative(7f, -7f)
                lineToRelative(4f, 4f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-3.88f)
                close()
            }
        }.also { _FileImage = it}
