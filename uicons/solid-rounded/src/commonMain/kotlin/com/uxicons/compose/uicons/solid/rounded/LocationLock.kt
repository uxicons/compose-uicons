package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationLock: ImageVector? = null

val Icons.Sr.LocationLock: ImageVector
    get() = _LocationLock ?: UXIcon(name = "LocationLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.56f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, -0.81f, -2.75f, -2f, -3.44f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(11.37f, 23.81f)
                curveToRelative(-1.96f, 0.55f, -4.14f, -0.13f, -5.42f, -1.88f)
                curveToRelative(-3.92f, -5.36f, -5.92f, -9.38f, -5.92f, -11.95f)
                curveToRelative(0.01f, -5.51f, 4.47f, -9.97f, 9.98f, -9.98f)
                curveToRelative(4.55f, 0.01f, 8.39f, 3.06f, 9.59f, 7.23f)
                curveToRelative(-0.51f, -0.14f, -1.05f, -0.23f, -1.61f, -0.23f)
                curveToRelative(-1.63f, 0f, -3.1f, 0.65f, -4.18f, 1.71f)
                curveToRelative(-0.53f, -1.6f, -2.03f, -2.75f, -3.8f, -2.75f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.72f, 0f, 1.4f, -0.19f, 1.98f, -0.53f)
                verticalLineToRelative(0.12f)
                curveToRelative(-1.25f, 1.13f, -2f, 2.75f, -2f, 4.45f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.45f, 0.51f, 2.77f, 1.37f, 3.81f)
                close()
            }
        }.also { _LocationLock = it}
