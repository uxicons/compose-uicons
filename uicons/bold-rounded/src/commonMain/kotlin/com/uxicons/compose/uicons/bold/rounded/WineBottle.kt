package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Br.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.31f, 7.55f)
            lineToRelative(-2.35f, -1.4f)
            lineToRelative(0.03f, -4.64f)
            curveToRelative(0.0f, -0.4f, -0.15f, -0.78f, -0.44f, -1.07f)
            curveToRelative(-0.28f, -0.28f, -0.67f, -0.44f, -1.06f, -0.44f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.63f)
            lineToRelative(-2.35f, 1.42f)
            curveToRelative(-1.64f, 0.99f, -2.65f, 2.79f, -2.65f, 4.71f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.23f)
            curveToRelative(0f, -1.93f, -1.03f, -3.74f, -2.69f, -4.73f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(6.03f, 12f)
            curveToRelative(0.08f, -0.77f, 0.5f, -1.48f, 1.17f, -1.88f)
            lineToRelative(3.07f, -1.86f)
            curveToRelative(0.45f, -0.27f, 0.72f, -0.76f, 0.72f, -1.28f)
            verticalLineToRelative(-1.97f)
            horizontalLineToRelative(1.98f)
            lineToRelative(-0.01f, 1.99f)
            curveToRelative(-0.0f, 0.53f, 0.28f, 1.03f, 0.73f, 1.3f)
            lineToRelative(3.08f, 1.84f)
            curveToRelative(0.75f, 0.45f, 1.22f, 1.27f, 1.22f, 2.15f)
            verticalLineToRelative(6.23f)
            close()
        }
    }.also { _WineBottle = it }
