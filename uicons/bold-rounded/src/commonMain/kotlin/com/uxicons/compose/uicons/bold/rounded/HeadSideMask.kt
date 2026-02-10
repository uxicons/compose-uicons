package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Br.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12.95f)
            verticalLineToRelative(2.86f)
            curveToRelative(0f, 4.51f, -3.67f, 8.18f, -8.18f, 8.18f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.63f, 0f, -1.2f, -0.4f, -1.41f, -0.99f)
            lineToRelative(-2.73f, -7.62f)
            lineTo(3.25f, 9f)
            curveToRelative(-0.82f, 3.25f, 0.58f, 5.71f, 1.51f, 6.9f)
            curveToRelative(0.81f, 1.04f, 1.24f, 2.25f, 1.24f, 3.48f)
            verticalLineToRelative(1.12f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-1.12f)
            curveToRelative(0f, -0.71f, -0.33f, -1.28f, -0.61f, -1.64f)
            curveTo(0.22f, 14.95f, -0.51f, 11.43f, 0.39f, 8.1f)
            curveTo(1.5f, 3.97f, 4.95f, 0.85f, 9.18f, 0.15f)
            curveToRelative(4.12f, -0.68f, 8.22f, 0.96f, 10.7f, 4.28f)
            curveToRelative(1.17f, 1.45f, 4.12f, 6.92f, 4.12f, 8.52f)
            close()
            moveTo(20.12f, 10.83f)
            curveToRelative(-0.78f, -1.62f, -1.89f, -3.67f, -2.6f, -4.55f)
            curveToRelative(-1.85f, -2.46f, -4.84f, -3.66f, -7.85f, -3.17f)
            curveToRelative(-2.03f, 0.33f, -3.85f, 1.48f, -5.07f, 3.09f)
            lineToRelative(7.95f, 6.79f)
            horizontalLineToRelative(1.04f)
            curveToRelative(2.34f, 0f, 4.65f, -0.77f, 6.53f, -2.17f)
            close()
            moveTo(21f, 13.86f)
            curveToRelative(-2.06f, 1.29f, -4.45f, 2.03f, -6.87f, 2.13f)
            lineToRelative(1.79f, 5.01f)
            curveToRelative(2.81f, -0.05f, 5.08f, -2.36f, 5.08f, -5.18f)
            verticalLineToRelative(-1.96f)
            close()
        }
    }.also { _HeadSideMask = it }
