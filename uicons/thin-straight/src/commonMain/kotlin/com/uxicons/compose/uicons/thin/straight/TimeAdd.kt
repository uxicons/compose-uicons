package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Ts.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(1.41f, 0f, 2.76f, -0.28f, 4f, -0.76f)
                verticalLineToRelative(1.06f)
                curveToRelative(-1.25f, 0.45f, -2.6f, 0.7f, -4f, 0.7f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 1.4f, -0.26f, 2.75f, -0.7f, 4f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(0.49f, -1.24f, 0.76f, -2.59f, 0.76f, -4f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                close()
                moveTo(12f, 11.72f)
                lineToRelative(-4.76f, 2.85f)
                lineToRelative(0.52f, 0.86f)
                lineToRelative(5.24f, -3.15f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.72f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _TimeAdd = it}
