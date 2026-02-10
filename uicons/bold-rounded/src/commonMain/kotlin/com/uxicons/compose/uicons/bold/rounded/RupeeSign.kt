package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupeeSign: ImageVector? = null

val Icons.Br.RupeeSign: ImageVector
    get() = _RupeeSign ?: UXIcon(name = "RupeeSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.23f, 15.32f)
            curveTo(19.02f, 11.82f, 16.66f, 0.1f, 8f, 0f)
            horizontalLineToRelative(-2.5f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            lineTo(0f, 22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.06f, 0f, 0.12f, 0f, 0.17f, -0.0f)
            lineToRelative(4.02f, 7.23f)
            curveToRelative(0.4f, 0.73f, 1.33f, 0.98f, 2.04f, 0.58f)
            curveToRelative(0.72f, -0.4f, 0.98f, -1.31f, 0.58f, -2.04f)
            lineToRelative(-3.58f, -6.45f)
            close()
            moveTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(6.61f, 0.21f, 6.61f, 9.79f, 0f, 10f)
            lineTo(3f, 13f)
            lineTo(3f, 5.5f)
            close()
            moveTo(24f, 20.41f)
            curveToRelative(0f, 1.98f, -1.61f, 3.59f, -3.59f, 3.59f)
            horizontalLineToRelative(-1.18f)
            curveToRelative(-1.25f, 0f, -2.41f, -0.67f, -3.03f, -1.75f)
            curveToRelative(-0.41f, -0.72f, -0.17f, -1.64f, 0.55f, -2.05f)
            curveToRelative(0.72f, -0.41f, 1.63f, -0.17f, 2.05f, 0.55f)
            curveToRelative(0.09f, 0.16f, 0.25f, 0.25f, 0.43f, 0.25f)
            horizontalLineToRelative(1.18f)
            curveToRelative(0.63f, 0.02f, 0.81f, -0.92f, 0.22f, -1.13f)
            lineToRelative(-2.38f, -0.95f)
            curveToRelative(-3.63f, -1.43f, -2.56f, -6.93f, 1.33f, -6.92f)
            horizontalLineToRelative(1.18f)
            curveToRelative(1.25f, 0f, 2.41f, 0.67f, 3.03f, 1.75f)
            curveToRelative(0.41f, 0.72f, 0.17f, 1.64f, -0.55f, 2.05f)
            curveToRelative(-0.72f, 0.41f, -1.64f, 0.17f, -2.05f, -0.55f)
            curveToRelative(-0.09f, -0.16f, -0.25f, -0.25f, -0.43f, -0.25f)
            horizontalLineToRelative(-1.18f)
            curveToRelative(-0.63f, -0.02f, -0.81f, 0.92f, -0.22f, 1.13f)
            lineToRelative(2.38f, 0.95f)
            curveToRelative(1.37f, 0.55f, 2.25f, 1.85f, 2.25f, 3.33f)
            close()
        }
    }.also { _RupeeSign = it }
