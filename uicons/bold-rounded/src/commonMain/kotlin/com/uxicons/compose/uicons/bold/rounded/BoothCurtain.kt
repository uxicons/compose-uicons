package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Br.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-3.09f)
            curveToRelative(-0.75f, 0f, -1.44f, -0.34f, -1.9f, -0.92f)
            curveToRelative(-0.46f, -0.58f, -0.62f, -1.31f, -0.45f, -2.02f)
            curveToRelative(0.55f, -2.31f, 2.01f, -4.15f, 3.43f, -5.47f)
            curveToRelative(-1.84f, -1.0f, -3.97f, -2.68f, -5.49f, -5.44f)
            verticalLineToRelative(10.36f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            lineTo(3.5f, 24.0f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(3f, 5.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(7f)
            lineTo(10f, 3f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(10f, 20.5f)
            verticalLineToRelative(-6.5f)
            lineTo(3f, 14f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            close()
            moveTo(21f, 13.49f)
            verticalLineToRelative(-7.99f)
            curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 0.7f, -0.91f, 0.98f, -1.3f, 0.39f)
            curveToRelative(-0.8f, -1.21f, -1.4f, -2.76f, -1.61f, -4.7f)
            horizontalLineToRelative(-2.01f)
            curveToRelative(0.52f, 6.88f, 4.55f, 9.53f, 6.93f, 10.49f)
            close()
            moveTo(21f, 17.36f)
            curveToRelative(-1.05f, 0.89f, -2.2f, 2.13f, -2.79f, 3.64f)
            horizontalLineToRelative(2.29f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-3.14f)
            close()
        }
    }.also { _BoothCurtain = it }
