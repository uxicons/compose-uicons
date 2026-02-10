package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Bs.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.05f, 12f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-3f)
                lineTo(7.86f, 9f)
                lineTo(2.62f, 0.06f)
                lineTo(0.03f, 1.58f)
                lineToRelative(6.11f, 10.42f)
                horizontalLineToRelative(1.81f)
                lineToRelative(4.73f, 4.01f)
                lineToRelative(-2.59f, 2.19f)
                curveToRelative(-0.34f, -0.13f, -0.71f, -0.21f, -1.09f, -0.21f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.15f, -0.01f, -0.3f, -0.03f, -0.45f)
                lineToRelative(3.03f, -2.57f)
                lineToRelative(3.03f, 2.57f)
                curveToRelative(-0.02f, 0.15f, -0.03f, 0.29f, -0.03f, 0.45f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-0.39f, 0f, -0.76f, 0.07f, -1.09f, 0.21f)
                lineToRelative(-2.59f, -2.19f)
                lineToRelative(4.73f, -4.01f)
                close()
                moveTo(12.59f, 12f)
                horizontalLineToRelative(4.83f)
                lineToRelative(-2.41f, 2.05f)
                lineToRelative(-2.41f, -2.05f)
                close()
            }
        }.also { _Stretcher = it}
