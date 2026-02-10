package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDroplet: ImageVector? = null

val Icons.Br.HandHoldingDroplet: ImageVector
    get() = _HandHoldingDroplet ?: UXIcon(name = "HandHoldingDroplet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(4.98f, 5.62f)
            curveToRelative(0f, -1.25f, 1.08f, -2.84f, 2.04f, -4.01f)
            curveToRelative(0.76f, -0.93f, 2.19f, -0.93f, 2.95f, 0f)
            curveToRelative(0.96f, 1.17f, 2.04f, 2.76f, 2.04f, 4.01f)
            curveToRelative(0f, 1.86f, -1.57f, 3.38f, -3.51f, 3.38f)
            reflectiveCurveToRelative(-3.51f, -1.51f, -3.51f, -3.38f)
            close()
            moveTo(23.01f, 14.47f)
            lineToRelative(-5.2f, 5.94f)
            curveToRelative(-1.99f, 2.28f, -4.88f, 3.59f, -7.91f, 3.59f)
            horizontalLineToRelative(-5.41f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(7.86f)
            curveToRelative(0.94f, 0f, 1.8f, 0.36f, 2.45f, 0.95f)
            lineToRelative(2.44f, -2.68f)
            curveToRelative(0.7f, -0.77f, 1.66f, -1.22f, 2.69f, -1.27f)
            curveToRelative(1.04f, -0.04f, 2.03f, 0.31f, 2.79f, 1.01f)
            curveToRelative(1.56f, 1.43f, 1.69f, 3.87f, 0.28f, 5.46f)
            close()
            moveTo(20.71f, 11.23f)
            curveToRelative(-0.17f, -0.16f, -0.4f, -0.25f, -0.64f, -0.23f)
            curveToRelative(-0.24f, 0.01f, -0.45f, 0.11f, -0.61f, 0.29f)
            lineToRelative(-3.5f, 3.84f)
            curveToRelative(-0.22f, 1.58f, -1.48f, 2.88f, -3.09f, 3.12f)
            lineToRelative(-5.16f, 0.74f)
            curveToRelative(-0.82f, 0.11f, -1.58f, -0.45f, -1.7f, -1.27f)
            curveToRelative(-0.12f, -0.82f, 0.45f, -1.58f, 1.27f, -1.7f)
            lineToRelative(5.16f, -0.74f)
            curveToRelative(0.31f, -0.04f, 0.55f, -0.32f, 0.55f, -0.64f)
            curveToRelative(0f, -0.35f, -0.29f, -0.64f, -0.64f, -0.64f)
            horizontalLineToRelative(-7.86f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5.41f)
            curveToRelative(2.17f, 0f, 4.22f, -0.94f, 5.65f, -2.56f)
            lineToRelative(5.21f, -5.95f)
            curveToRelative(0.33f, -0.37f, 0.3f, -0.93f, -0.05f, -1.25f)
            close()
        }
    }.also { _HandHoldingDroplet = it }
