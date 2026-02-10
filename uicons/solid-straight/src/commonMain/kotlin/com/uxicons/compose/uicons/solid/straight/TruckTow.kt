package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckTow: ImageVector? = null

val Icons.Ss.TruckTow: ImageVector
    get() = _TruckTow ?: UXIcon(name = "TruckTow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.48f, 12f)
                horizontalLineToRelative(1.52f)
                verticalLineToRelative(7f)
                lineTo(0f, 19f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(7.93f)
                lineTo(4f, 3.24f)
                verticalLineToRelative(3.26f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(0f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(2f, 0f)
                horizontalLineToRelative(1.98f)
                lineToRelative(9.5f, 12f)
                close()
                moveTo(3.06f, 21f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                lineTo(3.06f, 21f)
                close()
                moveTo(17.06f, 21f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(-4.88f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _TruckTow = it}
