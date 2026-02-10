package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Ts.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 23.29f)
                lineToRelative(-6.6f, -6.6f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.6f, 6.6f)
                close()
                moveTo(1f, 10f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -4.04f, -9f, -9f)
                close()
                moveTo(7f, 14.66f)
                lineTo(14.99f, 10f)
                lineTo(7f, 5.34f)
                close()
                moveTo(8f, 7.08f)
                lineTo(13.01f, 10f)
                lineTo(8f, 12.92f)
                close()
            }
        }.also { _MagnifyingGlassPlay = it}
