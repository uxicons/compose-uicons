package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Ts.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
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
                moveTo(10.53f, 15f)
                horizontalLineToRelative(-3.53f)
                verticalLineToRelative(-3.54f)
                lineToRelative(5.74f, -5.65f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.53f, 0.0f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(-5.73f, 5.65f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(2.12f)
                lineToRelative(5.44f, -5.36f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.53f, -0.0f, -2.12f)
                reflectiveCurveToRelative(-1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-5.44f, 5.36f)
                verticalLineToRelative(2.12f)
                close()
            }
        }.also { _MapMarkerEdit = it}
