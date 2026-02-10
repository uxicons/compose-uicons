package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Br.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7f, 8.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(22f, 8.16f)
            verticalLineToRelative(10.34f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            close()
            moveTo(5f, 5.5f)
            verticalLineToRelative(11.38f)
            lineToRelative(3.71f, -3.71f)
            curveToRelative(1.54f, -1.54f, 4.04f, -1.54f, 5.58f, 0f)
            lineToRelative(0.61f, 0.61f)
            curveToRelative(0.33f, 0.33f, 0.86f, 0.33f, 1.19f, 0f)
            curveToRelative(0f, 0f, 2.89f, -2.88f, 2.91f, -2.9f)
            verticalLineToRelative(-1.88f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(13f, 3f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(19f, 18.5f)
            verticalLineToRelative(-3.38f)
            lineToRelative(-0.79f, 0.79f)
            curveToRelative(-1.5f, 1.5f, -3.93f, 1.5f, -5.43f, 0f)
            lineToRelative(-0.61f, -0.61f)
            curveToRelative(-0.37f, -0.37f, -0.97f, -0.37f, -1.34f, 0f)
            lineToRelative(-5.03f, 5.03f)
            curveToRelative(0.45f, 0.42f, 1.05f, 0.67f, 1.71f, 0.67f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _FileImage = it }
