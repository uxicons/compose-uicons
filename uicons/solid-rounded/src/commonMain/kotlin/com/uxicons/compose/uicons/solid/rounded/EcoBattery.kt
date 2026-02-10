package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Sr.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 2.1f)
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
                moveTo(17f, 13.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0f, 2.42f, -1.72f, 4.43f, -4f, 4.9f)
                verticalLineToRelative(1.1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.1f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                curveToRelative(0f, -2.57f, 2.3f, -5.33f, 3.52f, -6.43f)
                curveToRelative(0.84f, -0.76f, 2.11f, -0.76f, 2.96f, 0f)
                curveToRelative(1.22f, 1.1f, 3.52f, 3.86f, 3.52f, 6.43f)
                close()
                moveTo(15f, 13.0f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(-3.82f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                curveToRelative(0f, -1.63f, 1.67f, -3.87f, 2.86f, -4.95f)
                curveToRelative(0.08f, -0.07f, 0.2f, -0.07f, 0.28f, 0f)
                curveToRelative(1.19f, 1.07f, 2.86f, 3.32f, 2.86f, 4.95f)
                close()
            }
        }.also { _EcoBattery = it}
