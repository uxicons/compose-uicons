package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Br.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 5f)
            horizontalLineToRelative(-0.2f)
            curveToRelative(-0.16f, -0.23f, -0.31f, -0.43f, -0.41f, -0.56f)
            curveTo(17.39f, 1.12f, 13.29f, -0.52f, 9.18f, 0.15f)
            curveTo(4.95f, 0.85f, 1.5f, 3.97f, 0.39f, 8.1f)
            curveToRelative(-0.9f, 3.33f, -0.17f, 6.85f, 2.0f, 9.64f)
            curveToRelative(0.28f, 0.36f, 0.61f, 0.93f, 0.61f, 1.64f)
            verticalLineToRelative(0.11f)
            curveToRelative(0f, 2.49f, 2.02f, 4.51f, 4.5f, 4.51f)
            horizontalLineToRelative(5f)
            curveToRelative(1.97f, 0f, 3.65f, -1.27f, 4.26f, -3.04f)
            curveToRelative(1.7f, -0.21f, 3.23f, -1.21f, 4.1f, -2.71f)
            curveToRelative(0.41f, -0.72f, 0.17f, -1.64f, -0.55f, -2.05f)
            curveToRelative(-0.72f, -0.41f, -1.64f, -0.17f, -2.05f, 0.55f)
            curveToRelative(-0.45f, 0.77f, -1.27f, 1.25f, -2.17f, 1.25f)
            horizontalLineToRelative(-0.6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(7.5f, 21.0f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.68f, -1.5f, -1.51f)
            verticalLineToRelative(-0.11f)
            curveToRelative(0f, -1.23f, -0.43f, -2.43f, -1.24f, -3.48f)
            curveToRelative(-0.72f, -0.93f, -1.74f, -2.64f, -1.76f, -4.9f)
            horizontalLineToRelative(6.25f)
            curveToRelative(0.62f, 1.75f, 2.29f, 3f, 4.24f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(9.67f, 3.11f)
            curveToRelative(2.43f, -0.4f, 4.84f, 0.3f, 6.66f, 1.89f)
            horizontalLineToRelative(-2.83f)
            curveToRelative(-1.96f, 0f, -3.62f, 1.25f, -4.24f, 3f)
            lineTo(3.58f, 8f)
            curveToRelative(1.02f, -2.52f, 3.37f, -4.44f, 6.09f, -4.89f)
            close()
            moveTo(21f, 10.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _HeadVr = it }
