package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullCrossbones: ImageVector? = null

val Icons.Bs.SkullCrossbones: ImageVector
    get() = _SkullCrossbones ?: UXIcon(name = "SkullCrossbones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.53f, 18.51f)
                lineToRelative(7.35f, 2.58f)
                lineToRelative(-0.99f, 2.83f)
                lineToRelative(-10.89f, -3.82f)
                lineToRelative(-10.89f, 3.82f)
                lineToRelative(-0.99f, -2.83f)
                lineToRelative(7.35f, -2.58f)
                lineTo(0.12f, 15.93f)
                lineToRelative(0.99f, -2.83f)
                lineToRelative(10.89f, 3.82f)
                lineToRelative(10.89f, -3.82f)
                lineToRelative(0.99f, 2.83f)
                lineToRelative(-7.35f, 2.58f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _SkullCrossbones = it}
