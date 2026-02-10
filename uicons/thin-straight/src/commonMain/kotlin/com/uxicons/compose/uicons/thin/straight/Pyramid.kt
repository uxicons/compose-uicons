package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Ts.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.99f)
                lineTo(0f, 23.99f)
                lineTo(10.1f, 1.23f)
                curveToRelative(0.35f, -0.77f, 1.06f, -1.23f, 1.91f, -1.23f)
                reflectiveCurveToRelative(1.56f, 0.46f, 1.9f, 1.23f)
                lineToRelative(10.1f, 22.76f)
                close()
                moveTo(1.54f, 22.99f)
                horizontalLineToRelative(20.93f)
                lineTo(12.99f, 1.64f)
                curveToRelative(-0.18f, -0.41f, -0.54f, -0.64f, -0.99f, -0.64f)
                reflectiveCurveToRelative(-0.81f, 0.23f, -0.99f, 0.64f)
                lineTo(1.54f, 22.99f)
                close()
            }
        }.also { _Pyramid = it}
