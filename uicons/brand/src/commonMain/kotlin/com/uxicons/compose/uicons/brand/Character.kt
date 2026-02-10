package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Character: ImageVector? = null

val Icons.Brand.Character: ImageVector
    get() = _Character ?: UXIcon(name = "Character") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.75f, 0.3f)
            horizontalLineTo(4.25f)
            curveTo(1.9f, 0.3f, 0f, 2.2f, 0f, 4.55f)
            verticalLineToRelative(14.9f)
            curveToRelative(0f, 2.35f, 1.9f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.35f, 0f, 4.25f, -1.9f, 4.25f, -4.25f)
            verticalLineTo(4.55f)
            curveTo(24f, 2.2f, 22.1f, 0.3f, 19.75f, 0.3f)
            close()
            moveTo(11.6f, 6.55f)
            verticalLineToRelative(1.81f)
            curveToRelative(0f, 0.1f, -0.04f, 0.13f, -0.11f, 0.1f)
            curveToRelative(-0.3f, -0.14f, -0.63f, -0.24f, -0.96f, -0.29f)
            curveTo(9.51f, 8.02f, 8.43f, 8.02f, 7.5f, 8.53f)
            curveToRelative(-1.08f, 0.6f, -1.63f, 1.8f, -1.61f, 3.01f)
            curveToRelative(0.02f, 1.18f, 0.5f, 2.36f, 1.56f, 2.96f)
            curveToRelative(0.92f, 0.52f, 2.01f, 0.6f, 3.04f, 0.46f)
            curveToRelative(0.3f, -0.04f, 0.59f, -0.11f, 0.87f, -0.22f)
            curveToRelative(0.04f, -0.03f, 0.07f, -0.04f, 0.1f, -0.02f)
            curveToRelative(0.02f, 0.03f, 0.03f, 0.07f, 0.02f, 0.11f)
            verticalLineToRelative(1.66f)
            curveToRelative(0.01f, 0.1f, -0.04f, 0.19f, -0.13f, 0.23f)
            curveToRelative(-0.31f, 0.11f, -0.62f, 0.18f, -0.95f, 0.22f)
            curveToRelative(-1.01f, 0.12f, -2.05f, 0.1f, -3.04f, -0.15f)
            curveToRelative(-1.64f, -0.42f, -3.01f, -1.61f, -3.5f, -3.25f)
            curveToRelative(-0.47f, -1.55f, -0.37f, -3.37f, 0.44f, -4.79f)
            curveToRelative(1.02f, -1.79f, 3.11f, -2.68f, 5.12f, -2.64f)
            curveToRelative(0.42f, 0f, 0.83f, 0.02f, 1.25f, 0.06f)
            curveToRelative(0.29f, 0.03f, 0.57f, 0.1f, 0.85f, 0.19f)
            curveTo(11.58f, 6.41f, 11.61f, 6.48f, 11.6f, 6.55f)
            close()
            moveTo(19.99f, 16.65f)
            curveToRelative(0f, 0.1f, -0.04f, 0.14f, -0.13f, 0.14f)
            horizontalLineToRelative(-1.89f)
            curveToRelative(-0.08f, 0.01f, -0.15f, -0.04f, -0.16f, -0.12f)
            verticalLineToRelative(-4.54f)
            curveToRelative(0.01f, -0.29f, -0.04f, -0.58f, -0.15f, -0.85f)
            curveToRelative(-0.09f, -0.2f, -0.23f, -0.38f, -0.42f, -0.51f)
            curveToRelative(-0.22f, -0.13f, -0.48f, -0.19f, -0.74f, -0.18f)
            curveToRelative(-0.24f, 0f, -0.48f, 0.03f, -0.71f, 0.1f)
            curveToRelative(-0.22f, 0.09f, -0.43f, 0.2f, -0.61f, 0.34f)
            verticalLineToRelative(5.64f)
            curveToRelative(0f, 0.09f, -0.04f, 0.13f, -0.11f, 0.13f)
            horizontalLineToRelative(-2.01f)
            curveToRelative(-0.07f, 0.01f, -0.13f, -0.04f, -0.14f, -0.11f)
            verticalLineTo(5.54f)
            curveToRelative(0f, -0.07f, 0.04f, -0.11f, 0.13f, -0.11f)
            horizontalLineToRelative(2.03f)
            curveToRelative(0.05f, -0.01f, 0.11f, 0.03f, 0.11f, 0.08f)
            verticalLineToRelative(0.03f)
            lineToRelative(0.01f, 3.8f)
            curveToRelative(0.29f, -0.19f, 0.6f, -0.35f, 0.93f, -0.47f)
            curveToRelative(0.65f, -0.24f, 1.46f, -0.2f, 2.12f, -0.01f)
            curveToRelative(0.75f, 0.21f, 1.23f, 0.74f, 1.5f, 1.45f)
            curveToRelative(0.16f, 0.41f, 0.24f, 0.95f, 0.24f, 1.6f)
            verticalLineTo(16.65f)
            close()
        }
    }.also { _Character = it }
