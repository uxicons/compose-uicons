package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Bs.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 2.12f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.12f)
                curveTo(5.14f, 2.85f, 1f, 7.45f, 1f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -5.55f, -4.14f, -10.15f, -9.5f, -10.88f)
                close()
                moveTo(13.5f, 20.85f)
                verticalLineToRelative(-1.85f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.85f)
                curveToRelative(-3.21f, -0.61f, -5.74f, -3.15f, -6.35f, -6.35f)
                horizontalLineToRelative(1.85f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(0.61f, -3.21f, 3.15f, -5.74f, 6.35f, -6.35f)
                verticalLineToRelative(1.85f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.85f)
                curveToRelative(3.21f, 0.61f, 5.74f, 3.15f, 6.35f, 6.35f)
                horizontalLineToRelative(-1.85f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.85f)
                curveToRelative(-0.61f, 3.21f, -3.15f, 5.74f, -6.35f, 6.35f)
                close()
                moveTo(13.81f, 11.19f)
                lineToRelative(2.71f, 6.33f)
                lineToRelative(-6.33f, -2.71f)
                lineToRelative(-2.71f, -6.33f)
                lineToRelative(6.33f, 2.71f)
                close()
            }
        }.also { _CompassAlt = it}
