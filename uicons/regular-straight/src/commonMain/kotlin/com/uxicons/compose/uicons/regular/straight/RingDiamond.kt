package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Rs.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.9f, 6.48f)
                lineToRelative(2.61f, -3.48f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-5.02f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(2.61f, 3.48f)
                curveToRelative(-3.54f, 1.21f, -6.1f, 4.57f, -6.1f, 8.52f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.95f, -2.56f, -7.31f, -6.1f, -8.52f)
                close()
                moveTo(9.13f, 3.19f)
                lineToRelative(1.19f, -1.19f)
                horizontalLineToRelative(3.36f)
                lineToRelative(1.19f, 1.19f)
                lineToRelative(-2.13f, 2.84f)
                curveToRelative(-0.24f, -0.02f, -0.49f, -0.03f, -0.74f, -0.03f)
                reflectiveCurveToRelative(-0.49f, 0.01f, -0.74f, 0.03f)
                lineToRelative(-2.13f, -2.84f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _RingDiamond = it}
