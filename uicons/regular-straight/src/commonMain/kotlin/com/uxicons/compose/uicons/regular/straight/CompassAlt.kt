package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Rs.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2.05f)
                curveTo(5.4f, 2.56f, 1f, 7.27f, 1f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -5.73f, -4.4f, -10.44f, -10f, -10.95f)
                close()
                moveTo(13f, 21.94f)
                verticalLineToRelative(-1.94f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.94f)
                curveToRelative(-4.17f, -0.46f, -7.48f, -3.78f, -7.94f, -7.94f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.94f)
                curveToRelative(0.46f, -4.16f, 3.78f, -7.48f, 7.94f, -7.94f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.94f)
                curveToRelative(4.17f, 0.46f, 7.48f, 3.78f, 7.94f, 7.94f)
                horizontalLineToRelative(-1.94f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.94f)
                curveToRelative(-0.46f, 4.17f, -3.78f, 7.48f, -7.94f, 7.94f)
                close()
                moveTo(6.56f, 7.56f)
                lineToRelative(2.92f, 7.91f)
                lineToRelative(7.98f, 3.0f)
                lineToRelative(-3.0f, -7.98f)
                lineToRelative(-7.91f, -2.92f)
                close()
                moveTo(11.04f, 13.91f)
                lineToRelative(-1.1f, -2.97f)
                lineToRelative(2.97f, 1.1f)
                lineToRelative(1.13f, 3f)
                lineToRelative(-3f, -1.13f)
                close()
            }
        }.also { _CompassAlt = it}
