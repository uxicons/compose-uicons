package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Br.NoFoodCircle: ImageVector
    get() = _NoFoodCircle ?: UXIcon(name = "NoFoodCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.03f, 18f)
            horizontalLineToRelative(-4.17f)
            curveToRelative(-1.25f, 0f, -2.31f, -0.93f, -2.48f, -2.17f)
            lineToRelative(-0.69f, -5.17f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
            reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
            lineToRelative(2.99f, 2.99f)
            lineToRelative(0.11f, -0.91f)
            curveToRelative(0.12f, -1.0f, 0.98f, -1.75f, 1.98f, -1.75f)
            horizontalLineToRelative(1.12f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-1.12f)
            lineToRelative(-0.12f, 1f)
            horizontalLineToRelative(0.74f)
            curveToRelative(1.17f, 0f, 2.07f, 1.04f, 1.91f, 2.2f)
            lineToRelative(-0.11f, 0.8f)
            horizontalLineToRelative(2.21f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2.88f)
            lineToRelative(3.21f, 3.21f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
            lineToRelative(-12.53f, -12.53f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
        }
    }.also { _NoFoodCircle = it }
