package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationLock: ImageVector? = null

val Icons.Rs.LocationLock: ImageVector
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
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 21.19f)
                verticalLineToRelative(2.8f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-3.91f, -3.91f, -3.91f, -10.25f, -0.01f, -14.15f)
                curveToRelative(1.89f, -1.89f, 4.4f, -2.93f, 7.07f, -2.93f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(1.24f, 1.24f, 2.08f, 2.72f, 2.53f, 4.29f)
                curveToRelative(-0.51f, -0.14f, -1.05f, -0.22f, -1.6f, -0.22f)
                curveToRelative(-0.19f, 0f, -0.39f, 0.01f, -0.57f, 0.03f)
                curveToRelative(-0.39f, -0.98f, -0.98f, -1.9f, -1.77f, -2.69f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                reflectiveCurveToRelative(-4.15f, 0.83f, -5.66f, 2.34f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.2f, 0f, 11.31f)
                close()
                moveTo(11.97f, 10.12f)
                curveToRelative(0.1f, -1.14f, -0.85f, -2.13f, -1.99f, -2.12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 1.11f, 0.91f, 2.01f, 2.02f, 2.0f)
                verticalLineToRelative(2f)
                curveToRelative(-2.21f, 0.01f, -4.01f, -1.79f, -4.01f, -4.0f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(1.66f, 0f, 3.06f, 1.03f, 3.66f, 2.47f)
                curveToRelative(-0.65f, 0.47f, -1.23f, 1.02f, -1.68f, 1.65f)
                close()
            }
        }.also { _LocationLock = it}
