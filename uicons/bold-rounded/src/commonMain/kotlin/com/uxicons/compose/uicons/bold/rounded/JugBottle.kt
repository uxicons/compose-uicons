package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Br.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 8.5f)
            reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
            curveToRelative(-0.01f, 0f, -0.04f, 0.0f, -0.01f, 0f)
            close()
            moveTo(22f, 9.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.36f)
            curveToRelative(0f, -2.28f, 1.43f, -4.35f, 3.57f, -5.15f)
            lineToRelative(0.43f, -0.16f)
            verticalLineToRelative(-1.92f)
            curveToRelative(-0.58f, -0.21f, -1f, -0.76f, -1f, -1.41f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.65f, -0.42f, 1.21f, -1f, 1.41f)
            verticalLineToRelative(1.71f)
            lineToRelative(4.33f, 0.81f)
            curveToRelative(1.84f, 0.35f, 3.67f, 2.06f, 3.67f, 4.06f)
            close()
            moveTo(18.97f, 18.88f)
            curveToRelative(-0.31f, 0.08f, -0.64f, 0.12f, -0.97f, 0.12f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.63f, 0.14f, -1.22f, 0.4f, -1.75f)
            lineToRelative(-2.18f, -0.41f)
            curveToRelative(-0.71f, -0.13f, -1.22f, -0.75f, -1.22f, -1.47f)
            verticalLineToRelative(-2.87f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2.87f)
            curveToRelative(0f, 0.62f, -0.39f, 1.19f, -0.97f, 1.41f)
            lineToRelative(-1.4f, 0.53f)
            curveToRelative(-0.97f, 0.36f, -1.62f, 1.3f, -1.62f, 2.34f)
            verticalLineToRelative(8.36f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.25f, 0f, 2.29f, -0.92f, 2.47f, -2.12f)
            close()
            moveTo(19f, 9.5f)
            curveToRelative(0f, -0.59f, -0.49f, -0.99f, -0.99f, -1f)
            curveToRelative(0.0f, 0f, 0f, 0f, -0.01f, 0f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-5.5f)
            close()
        }
    }.also { _JugBottle = it }
