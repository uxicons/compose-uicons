package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Bs.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 15f)
                lineTo(5f, 15f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 12f)
                lineToRelative(5f, -5f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(4.7f, -4.78f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(8.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(8f, 12f)
                close()
                moveTo(17.19f, 20.32f)
                lineToRelative(-14.19f, -3.86f)
                lineTo(3f, 7.71f)
                lineTo(0f, 18.76f)
                lineToRelative(19.3f, 5.24f)
                lineToRelative(1.89f, -7f)
                horizontalLineToRelative(-3.11f)
                lineToRelative(-0.89f, 3.32f)
                close()
            }
        }.also { _Images = it}
