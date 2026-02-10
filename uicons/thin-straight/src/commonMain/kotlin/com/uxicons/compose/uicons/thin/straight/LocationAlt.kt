package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationAlt: ImageVector? = null

val Icons.Ts.LocationAlt: ImageVector
    get() = _LocationAlt ?: UXIcon(name = "LocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.0f, 14.15f)
                lineToRelative(6.06f, 5.92f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.99f)
                lineToRelative(6.06f, -5.93f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(12f, 22.59f)
                lineToRelative(-6.36f, -6.22f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.0f, 12.72f)
                lineToRelative(-6.37f, 6.23f)
                close()
                moveTo(7f, 6.89f)
                verticalLineToRelative(6.67f)
                lineToRelative(5f, 2.5f)
                lineToRelative(5f, -2.5f)
                verticalLineToRelative(-6.67f)
                lineToRelative(-5f, -2.45f)
                lineToRelative(-5f, 2.45f)
                close()
                moveTo(15.38f, 7.21f)
                lineToRelative(-3.38f, 1.73f)
                lineToRelative(-3.38f, -1.73f)
                lineToRelative(3.38f, -1.66f)
                lineToRelative(3.38f, 1.66f)
                close()
                moveTo(12f, 14.94f)
                lineToRelative(-4f, -2f)
                verticalLineToRelative(-4.92f)
                lineToRelative(4f, 2.04f)
                lineToRelative(4f, -2.04f)
                verticalLineToRelative(4.92f)
                lineToRelative(-4f, 2f)
                close()
            }
        }.also { _LocationAlt = it}
