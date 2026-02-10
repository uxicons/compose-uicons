package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Sr.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23.56f, 15.81f)
                curveToRelative(0.69f, -1.37f, 0.57f, -2.93f, -0.4f, -4.25f)
                lineTo(15.2f, 2.6f)
                curveToRelative(-0.76f, -1.01f, -1.92f, -1.59f, -3.19f, -1.59f)
                curveToRelative(-1.29f, 0f, -2.46f, 0.6f, -3.17f, 1.56f)
                lineTo(0.78f, 11.64f)
                curveTo(0.26f, 12.33f, -0.01f, 13.15f, -0.01f, 13.99f)
                curveToRelative(0f, 0.63f, 0.15f, 1.24f, 0.44f, 1.82f)
                curveToRelative(0.69f, 1.37f, 2.03f, 2.19f, 3.57f, 2.19f)
                horizontalLineToRelative(15.99f)
                curveToRelative(1.54f, 0f, 2.87f, -0.82f, 3.57f, -2.19f)
                close()
            }
        }.also { _Eject = it}
