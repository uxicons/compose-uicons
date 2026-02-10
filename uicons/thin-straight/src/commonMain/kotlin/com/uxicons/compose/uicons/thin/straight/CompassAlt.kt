package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Ts.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 2.02f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.02f)
                curveTo(5.67f, 2.29f, 1f, 7.1f, 1f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -5.9f, -4.67f, -10.71f, -10.5f, -10.97f)
                close()
                moveTo(12.5f, 22.97f)
                verticalLineToRelative(-1.98f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.98f)
                curveToRelative(-5.11f, -0.26f, -9.22f, -4.36f, -9.47f, -9.47f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.98f)
                curveTo(2.28f, 7.38f, 6.39f, 3.28f, 11.5f, 3.02f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.98f)
                curveToRelative(5.11f, 0.26f, 9.22f, 4.36f, 9.47f, 9.47f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.26f, 5.11f, -4.36f, 9.22f, -9.47f, 9.47f)
                close()
                moveTo(6.05f, 7.05f)
                lineToRelative(3.57f, 8.33f)
                lineToRelative(8.33f, 3.57f)
                lineToRelative(-3.57f, -8.33f)
                lineTo(6.05f, 7.05f)
                close()
                moveTo(10.38f, 14.62f)
                lineToRelative(-2.43f, -5.67f)
                lineToRelative(5.67f, 2.43f)
                lineToRelative(2.43f, 5.67f)
                lineToRelative(-5.67f, -2.43f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CompassAlt = it}
