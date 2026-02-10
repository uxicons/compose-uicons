package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Ts.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2.6f)
                curveToRelative(0f, -5.9f, -4.67f, -10.73f, -10.5f, -10.99f)
                lineTo(12.5f, 3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.41f)
                curveTo(5.67f, 5.67f, 1f, 10.5f, 1f, 16.4f)
                verticalLineToRelative(2.6f)
                lineTo(11.5f, 19f)
                verticalLineToRelative(2f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                lineTo(24f, 22f)
                verticalLineToRelative(-1f)
                lineTo(12.5f, 21f)
                close()
                moveTo(2f, 18f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0f, -5.51f, 4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                verticalLineToRelative(1.6f)
                lineTo(2f, 18f)
                close()
            }
        }.also { _ConciergeBell = it}
