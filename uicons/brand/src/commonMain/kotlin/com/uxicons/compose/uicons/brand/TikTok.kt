package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TikTok: ImageVector? = null

val Icons.Brand.TikTok: ImageVector
    get() = _TikTok ?: UXIcon(name = "TikTok") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.46f, 9.87f)
            curveToRelative(-2.14f, 0f, -4.12f, -0.68f, -5.74f, -1.85f)
            verticalLineToRelative(8.38f)
            curveToRelative(0f, 4.19f, -3.41f, 7.59f, -7.59f, 7.59f)
            curveToRelative(-1.62f, 0f, -3.12f, -0.51f, -4.35f, -1.38f)
            curveToRelative(-1.96f, -1.38f, -3.24f, -3.65f, -3.24f, -6.22f)
            curveToRelative(0f, -4.19f, 3.41f, -7.59f, 7.59f, -7.59f)
            curveToRelative(0.35f, 0f, 0.69f, 0.03f, 1.02f, 0.07f)
            verticalLineToRelative(0.98f)
            verticalLineToRelative(3.23f)
            curveToRelative(-0.32f, -0.1f, -0.67f, -0.16f, -1.02f, -0.16f)
            curveToRelative(-1.91f, 0f, -3.47f, 1.56f, -3.47f, 3.47f)
            curveToRelative(0f, 1.33f, 0.76f, 2.49f, 1.86f, 3.07f)
            curveToRelative(0.48f, 0.25f, 1.03f, 0.4f, 1.61f, 0.4f)
            curveToRelative(1.87f, 0f, 3.39f, -1.49f, 3.46f, -3.34f)
            lineTo(12.6f, 0f)
            horizontalLineToRelative(4.13f)
            curveToRelative(0f, 0.36f, 0.04f, 0.71f, 0.1f, 1.05f)
            curveToRelative(0.29f, 1.57f, 1.22f, 2.92f, 2.52f, 3.76f)
            curveToRelative(0.9f, 0.59f, 1.97f, 0.93f, 3.13f, 0.93f)
            verticalLineTo(9.87f)
            close()
        }
    }.also { _TikTok = it }
