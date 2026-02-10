package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spotify: ImageVector? = null

val Icons.Brand.Spotify: ImageVector
    get() = _Spotify ?: UXIcon(name = "Spotify") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            curveToRelative(0f, 6.63f, 5.37f, 12f, 12f, 12f)
            curveToRelative(6.63f, 0f, 12f, -5.37f, 12f, -12f)
            curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
            close()
            moveTo(17.5f, 17.31f)
            curveToRelative(-0.22f, 0.35f, -0.68f, 0.46f, -1.03f, 0.25f)
            curveToRelative(-2.82f, -1.72f, -6.37f, -2.11f, -10.54f, -1.16f)
            curveToRelative(-0.4f, 0.09f, -0.8f, -0.16f, -0.9f, -0.56f)
            curveToRelative(-0.09f, -0.4f, 0.16f, -0.8f, 0.56f, -0.9f)
            curveToRelative(4.57f, -1.04f, 8.49f, -0.59f, 11.65f, 1.34f)
            curveTo(17.61f, 16.5f, 17.72f, 16.96f, 17.5f, 17.31f)
            close()
            moveTo(18.97f, 14.04f)
            curveToRelative(-0.27f, 0.44f, -0.85f, 0.58f, -1.29f, 0.31f)
            curveToRelative(-3.23f, -1.98f, -8.14f, -2.56f, -11.96f, -1.4f)
            curveTo(5.23f, 13.1f, 4.71f, 12.82f, 4.56f, 12.33f)
            curveToRelative(-0.15f, -0.49f, 0.13f, -1.02f, 0.62f, -1.17f)
            curveToRelative(4.36f, -1.32f, 9.78f, -0.68f, 13.48f, 1.59f)
            curveTo(19.1f, 13.03f, 19.24f, 13.6f, 18.97f, 14.04f)
            close()
            moveTo(19.1f, 10.64f)
            curveTo(15.23f, 8.34f, 8.85f, 8.13f, 5.16f, 9.25f)
            curveToRelative(-0.59f, 0.18f, -1.22f, -0.15f, -1.4f, -0.75f)
            curveToRelative(-0.18f, -0.59f, 0.15f, -1.22f, 0.75f, -1.4f)
            curveToRelative(4.24f, -1.29f, 11.29f, -1.04f, 15.74f, 1.6f)
            curveToRelative(0.53f, 0.32f, 0.71f, 1.0f, 0.39f, 1.54f)
            curveTo(20.32f, 10.78f, 19.63f, 10.96f, 19.1f, 10.64f)
            close()
        }
    }.also { _Spotify = it }
