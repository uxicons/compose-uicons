package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Rr.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.17f, 8.41f)
                curveToRelative(-0.99f, 1.11f, -2.17f, 2.8f, -2.17f, 4.59f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(1.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                curveToRelative(0f, -1.79f, -1.18f, -3.48f, -2.17f, -4.59f)
                curveToRelative(-0.93f, -1.04f, -2.73f, -1.04f, -3.67f, 0f)
                close()
                moveTo(13f, 14.72f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.22f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                curveToRelative(0f, -0.9f, 0.59f, -2.06f, 1.66f, -3.26f)
                curveToRelative(0.26f, -0.22f, 0.42f, -0.22f, 0.68f, 0f)
                curveToRelative(1.07f, 1.2f, 1.66f, 2.36f, 1.66f, 3.26f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(16f, 2.1f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.1f)
                curveToRelative(-2.28f, 0.47f, -4f, 2.48f, -4f, 4.9f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _EcoBattery = it}
