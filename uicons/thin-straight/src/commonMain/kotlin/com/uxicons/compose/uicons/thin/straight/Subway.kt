package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Ts.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(6.06f, 19f)
                lineToRelative(-3.06f, 5f)
                horizontalLineToRelative(1.17f)
                lineToRelative(3.06f, -5f)
                horizontalLineToRelative(9.53f)
                lineToRelative(3.06f, 5f)
                horizontalLineToRelative(1.17f)
                lineToRelative(-3.06f, -5f)
                horizontalLineToRelative(4.06f)
                lineTo(22f, 3.5f)
                close()
                moveTo(5.5f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(3f, 4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.5f, 12f)
                lineTo(12.5f, 5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7f)
                lineTo(12.5f, 12f)
                close()
                moveTo(3f, 12f)
                lineTo(3f, 5f)
                lineTo(11.5f, 5f)
                verticalLineToRelative(7f)
                lineTo(3f, 12f)
                close()
                moveTo(3f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                lineTo(3f, 18f)
                close()
            }
        }.also { _Subway = it}
