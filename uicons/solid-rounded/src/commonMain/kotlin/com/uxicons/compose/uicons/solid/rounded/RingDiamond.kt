package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Sr.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.93f, 6.5f)
                lineToRelative(1.67f, -2.11f)
                curveToRelative(0.59f, -0.79f, 0.51f, -1.92f, -0.22f, -2.64f)
                lineToRelative(-1.61f, -1.48f)
                curveToRelative(-0.18f, -0.17f, -0.43f, -0.26f, -0.68f, -0.26f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(-0.25f, 0f, -0.49f, 0.09f, -0.68f, 0.26f)
                lineToRelative(-1.64f, 1.51f)
                curveToRelative(-0.7f, 0.7f, -0.78f, 1.82f, -0.17f, 2.63f)
                lineToRelative(1.65f, 2.09f)
                curveToRelative(-3.53f, 1.22f, -6.07f, 4.57f, -6.07f, 8.5f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.94f, -2.54f, -7.28f, -6.07f, -8.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _RingDiamond = it}
