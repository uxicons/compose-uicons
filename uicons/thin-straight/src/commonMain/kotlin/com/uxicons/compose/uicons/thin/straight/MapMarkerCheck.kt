package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Ts.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.99f)
                lineToRelative(-7.07f, -6.91f)
                curveToRelative(-3.9f, -3.9f, -3.9f, -10.25f, -0.0f, -14.15f)
                curveTo(6.82f, 1.04f, 9.33f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(-7.07f, 6.92f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-2.4f, 0f, -4.66f, 0.94f, -6.36f, 2.64f)
                curveToRelative(-3.51f, 3.51f, -3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(6.36f, 6.22f)
                lineToRelative(6.37f, -6.23f)
                curveToRelative(3.5f, -3.5f, 3.5f, -9.21f, -0.0f, -12.72f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                close()
                moveTo(11.56f, 12.56f)
                lineToRelative(5.79f, -5.71f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-5.8f, 5.71f)
                curveToRelative(-0.19f, 0.2f, -0.51f, 0.2f, -0.71f, -0.01f)
                lineToRelative(-2.79f, -2.71f)
                lineToRelative(-0.69f, 0.72f)
                lineToRelative(2.79f, 2.7f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                close()
            }
        }.also { _MapMarkerCheck = it}
