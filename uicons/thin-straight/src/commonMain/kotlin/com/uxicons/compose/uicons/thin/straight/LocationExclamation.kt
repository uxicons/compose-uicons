package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Ts.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.0f, 14.15f)
                lineToRelative(7.07f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(18.37f, 16.36f)
                lineToRelative(-6.37f, 6.23f)
                lineToRelative(-6.36f, -6.22f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.0f, 12.72f)
                close()
                moveTo(12.5f, 13.0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(13f, 16.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LocationExclamation = it}
