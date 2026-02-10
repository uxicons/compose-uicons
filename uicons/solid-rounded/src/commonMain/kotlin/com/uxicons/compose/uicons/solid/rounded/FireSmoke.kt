package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireSmoke: ImageVector? = null

val Icons.Sr.FireSmoke: ImageVector
    get() = _FireSmoke ?: UXIcon(name = "FireSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 23.98f)
                horizontalLineTo(4.69f)
                curveTo(2.21f, 23.98f, 0.15f, 22.12f, 0.01f, 19.75f)
                curveToRelative(-0.14f, -2.34f, 1.5f, -4.37f, 3.82f, -4.71f)
                curveToRelative(1.04f, -1.9f, 3.04f, -3.06f, 5.17f, -3.06f)
                curveToRelative(0.97f, 0f, 1.89f, 0.23f, 2.76f, 0.69f)
                curveToRelative(0.15f, 0.08f, 0.33f, 0.08f, 0.49f, 0f)
                curveToRelative(0.86f, -0.46f, 1.79f, -0.69f, 2.76f, -0.69f)
                curveToRelative(2.14f, 0f, 4.13f, 1.15f, 5.2f, 3.01f)
                lineToRelative(-0.01f, 0.05f)
                curveToRelative(2.31f, 0.35f, 3.94f, 2.38f, 3.8f, 4.71f)
                curveToRelative(-0.14f, 2.37f, -2.2f, 4.23f, -4.68f, 4.23f)
                close()
                moveTo(9f, 9.98f)
                curveToRelative(1.04f, 0f, 2.05f, 0.2f, 3f, 0.59f)
                curveToRelative(0.95f, -0.4f, 1.96f, -0.59f, 3f, -0.59f)
                curveToRelative(1.32f, 0f, 2.6f, 0.33f, 3.73f, 0.93f)
                curveToRelative(0.17f, -0.61f, 0.27f, -1.25f, 0.27f, -1.91f)
                curveToRelative(-0.01f, -4.17f, -3.9f, -6.95f, -4.67f, -7.46f)
                lineTo(12.87f, 0.17f)
                curveToRelative(-0.5f, -0.33f, -1.19f, -0.16f, -1.46f, 0.37f)
                curveToRelative(-0.21f, 0.41f, -0.4f, 1.32f, -0.4f, 1.75f)
                curveToRelative(0f, 1.5f, 1f, 1.95f, 1f, 2.95f)
                curveToRelative(0f, 0.83f, -0.46f, 1.75f, -1.74f, 1.75f)
                reflectiveCurveToRelative(-1.76f, -0.92f, -1.76f, -1.75f)
                curveToRelative(0f, -0.45f, 0.19f, -0.73f, 0.19f, -0.97f)
                curveToRelative(0f, -0.44f, -0.35f, -0.79f, -0.79f, -0.79f)
                curveToRelative(-0.16f, 0f, -0.29f, 0.06f, -0.42f, 0.14f)
                curveToRelative(0f, 0f, -2.48f, 1.5f, -2.48f, 5.38f)
                curveToRelative(0f, 0.67f, 0.1f, 1.31f, 0.27f, 1.92f)
                curveToRelative(1.13f, -0.6f, 2.4f, -0.94f, 3.73f, -0.94f)
                close()
            }
        }.also { _FireSmoke = it}
