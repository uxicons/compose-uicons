package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Rs.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                curveTo(19f, 3.14f, 15.86f, 0f, 12f, 0f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 2.09f, 0.93f, 4.06f, 2.52f, 5.38f)
                lineToRelative(-2.52f, 11.62f)
                horizontalLineToRelative(13.98f)
                lineToRelative(-2.52f, -11.62f)
                curveToRelative(1.59f, -1.32f, 2.52f, -3.29f, 2.52f, -5.38f)
                close()
                moveTo(16.51f, 22f)
                lineTo(7.49f, 22f)
                lineToRelative(2.27f, -10.48f)
                curveToRelative(-1.63f, -0.94f, -2.78f, -2.6f, -2.76f, -4.52f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0.03f, 1.92f, -1.12f, 3.58f, -2.76f, 4.52f)
                lineToRelative(2.27f, 10.48f)
                close()
            }
        }.also { _KeyHole = it}
