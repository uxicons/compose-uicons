package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDroplet: ImageVector? = null

val Icons.Sc.HandHoldingDroplet: ImageVector
    get() = _HandHoldingDroplet ?: UXIcon(name = "HandHoldingDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.99f, 10f)
                curveToRelative(-2.69f, 0f, -4f, -1.31f, -4f, -4f)
                curveToRelative(0f, -2.62f, 3.12f, -4.63f, 3.47f, -4.85f)
                curveToRelative(0.32f, -0.2f, 0.73f, -0.2f, 1.05f, 0f)
                curveToRelative(0.35f, 0.22f, 3.47f, 2.23f, 3.47f, 4.85f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                close()
                moveTo(22.65f, 13.78f)
                curveToRelative(-3.34f, 5.63f, -8.22f, 9.25f, -14.65f, 9.22f)
                curveToRelative(-3.06f, 0f, -5.59f, -0.5f, -5.7f, -0.52f)
                curveToRelative(-0.38f, -0.07f, -0.68f, -0.36f, -0.77f, -0.74f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.14f, -0.53f, -4.24f)
                reflectiveCurveToRelative(0.51f, -4.16f, 0.53f, -4.24f)
                curveToRelative(0.09f, -0.38f, 0.4f, -0.67f, 0.78f, -0.74f)
                curveToRelative(0.11f, -0.02f, 2.21f, -0.52f, 5.19f, -0.52f)
                curveToRelative(2.5f, 0f, 4.27f, 0.53f, 4.28f, 0.53f)
                curveToRelative(0.72f, 0.22f, 1.22f, 0.89f, 1.22f, 1.65f)
                curveToRelative(0f, 0.79f, -0.46f, 1.46f, -1.22f, 1.76f)
                curveToRelative(-0.91f, 0.39f, -2.3f, 0.92f, -3.88f, 1.07f)
                curveToRelative(-0.55f, 0.05f, -0.95f, 0.54f, -0.9f, 1.09f)
                curveToRelative(0.05f, 0.52f, 0.48f, 0.9f, 0.99f, 0.9f)
                curveToRelative(1.98f, -0.1f, 3.54f, -0.79f, 4.54f, -1.22f)
                curveToRelative(1.06f, -0.42f, 1.84f, -1.25f, 2.21f, -2.27f)
                curveToRelative(1.4f, -1.13f, 2.56f, -2.56f, 3.6f, -4.29f)
                curveToRelative(0.71f, -1.19f, 2.24f, -1.57f, 3.43f, -0.87f)
                curveToRelative(1.17f, 0.66f, 1.58f, 2.29f, 0.87f, 3.43f)
                close()
            }
        }.also { _HandHoldingDroplet = it}
