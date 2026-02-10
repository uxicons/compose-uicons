package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireSmoke: ImageVector? = null

val Icons.Ss.FireSmoke: ImageVector
    get() = _FireSmoke ?: UXIcon(name = "FireSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -2.25f, 1.61f, -4.09f, 3.77f, -4.43f)
                curveToRelative(1.05f, -1.88f, 3.05f, -3.06f, 5.23f, -3.06f)
                curveToRelative(1.06f, 0f, 2.08f, 0.28f, 3f, 0.82f)
                curveToRelative(0.92f, -0.54f, 1.94f, -0.82f, 3f, -0.82f)
                curveToRelative(2.18f, 0f, 4.17f, 1.19f, 5.23f, 3.06f)
                curveToRelative(2.16f, 0.34f, 3.77f, 2.19f, 3.77f, 4.43f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(9f, 10f)
                curveToRelative(1.03f, 0f, 2.05f, 0.2f, 3f, 0.59f)
                curveToRelative(0.95f, -0.39f, 1.97f, -0.59f, 3f, -0.59f)
                curveToRelative(1.32f, 0f, 2.59f, 0.33f, 3.72f, 0.93f)
                curveToRelative(0.18f, -0.62f, 0.28f, -1.27f, 0.28f, -1.94f)
                curveToRelative(-0.01f, -4.17f, -3.9f, -6.94f, -4.67f, -7.45f)
                lineToRelative(-2.33f, -1.53f)
                reflectiveCurveToRelative(-1f, 1.28f, -1f, 2.28f)
                curveToRelative(0f, 1.5f, 1f, 1.95f, 1f, 2.95f)
                curveToRelative(0f, 0.83f, -0.46f, 1.75f, -1.74f, 1.75f)
                reflectiveCurveToRelative(-1.76f, -0.92f, -1.76f, -1.75f)
                curveToRelative(0f, -1f, 1f, -2.75f, 1f, -2.75f)
                curveToRelative(0f, 0f, -4.5f, 1.52f, -4.5f, 6.5f)
                curveToRelative(0f, 0.67f, 0.1f, 1.32f, 0.28f, 1.94f)
                curveToRelative(1.13f, -0.6f, 2.4f, -0.93f, 3.72f, -0.93f)
                close()
            }
        }.also { _FireSmoke = it}
