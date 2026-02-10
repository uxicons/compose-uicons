package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Ss.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.39f, 11f)
                horizontalLineToRelative(2.61f)
                verticalLineToRelative(-2f)
                lineTo(7.55f, 9f)
                lineTo(1.84f, 0.04f)
                lineTo(0.16f, 1.12f)
                lineToRelative(6.29f, 9.88f)
                horizontalLineToRelative(2.15f)
                lineToRelative(4.93f, 4.61f)
                lineToRelative(-2.93f, 2.87f)
                curveToRelative(-0.47f, -0.3f, -1.01f, -0.47f, -1.6f, -0.47f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.33f, -0.07f, -0.64f, -0.16f, -0.94f)
                lineToRelative(3.16f, -3.09f)
                lineToRelative(3.16f, 3.09f)
                curveToRelative(-0.1f, 0.3f, -0.16f, 0.61f, -0.16f, 0.94f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                curveToRelative(-0.59f, 0f, -1.14f, 0.18f, -1.6f, 0.47f)
                lineToRelative(-2.93f, -2.87f)
                lineToRelative(4.93f, -4.61f)
                close()
                moveTo(11.53f, 11f)
                horizontalLineToRelative(6.93f)
                lineToRelative(-3.47f, 3.24f)
                lineToRelative(-3.47f, -3.24f)
                close()
            }
        }.also { _Stretcher = it}
