package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationLock: ImageVector? = null

val Icons.Ss.LocationLock: ImageVector
    get() = _LocationLock ?: UXIcon(name = "LocationLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(10f, 7.11f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(10.66f, 23.44f)
                reflectiveCurveToRelative(-0.01f, 0.01f, -0.02f, 0.01f)
                lineToRelative(-0.65f, 0.55f)
                lineToRelative(-0.65f, -0.55f)
                curveToRelative(-0.95f, -0.81f, -9.35f, -8.06f, -9.35f, -13.34f)
                curveToRelative(0.01f, -5.52f, 4.48f, -9.99f, 10f, -10f)
                curveToRelative(4.52f, 0.01f, 8.33f, 3.01f, 9.57f, 7.12f)
                curveToRelative(-0.5f, -0.14f, -1.02f, -0.23f, -1.57f, -0.23f)
                curveToRelative(-1.28f, 0f, -2.45f, 0.42f, -3.43f, 1.1f)
                curveToRelative(-0.77f, -1.76f, -2.53f, -2.99f, -4.57f, -2.99f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                verticalLineToRelative(5.89f)
                curveToRelative(0f, 0.89f, 0.25f, 1.72f, 0.66f, 2.44f)
                close()
            }
        }.also { _LocationLock = it}
