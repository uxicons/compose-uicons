package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Br.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.37f, 22f)
            curveToRelative(-0.43f, 0f, -0.87f, -0.08f, -1.28f, -0.25f)
            curveToRelative(-1.26f, -0.52f, -2.08f, -1.73f, -2.08f, -3.1f)
            verticalLineToRelative(-1.65f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(-1.64f)
            curveToRelative(0f, -1.37f, 0.82f, -2.59f, 2.08f, -3.1f)
            curveToRelative(1.26f, -0.52f, 2.7f, -0.23f, 3.66f, 0.73f)
            lineToRelative(6f, 5.97f)
            curveToRelative(1.68f, 1.68f, 1.68f, 4.4f, 0f, 6.08f)
            curveToRelative(0f, 0f, -6f, 5.97f, -6f, 5.97f)
            curveToRelative(-0.64f, 0.64f, -1.5f, 0.99f, -2.38f, 0.99f)
            close()
            moveTo(3.5f, 10f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.27f, 0.23f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(12.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3.14f)
            curveToRelative(0f, 0.15f, 0.08f, 0.27f, 0.23f, 0.33f)
            curveToRelative(0.15f, 0.06f, 0.28f, 0.04f, 0.4f, -0.08f)
            lineToRelative(6f, -5.97f)
            curveToRelative(0.5f, -0.5f, 0.5f, -1.33f, 0f, -1.83f)
            lineToRelative(-6f, -5.97f)
            curveToRelative(-0.12f, -0.12f, -0.25f, -0.14f, -0.4f, -0.08f)
            curveToRelative(-0.15f, 0.06f, -0.22f, 0.17f, -0.23f, 0.33f)
            verticalLineToRelative(3.13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(3.5f)
            close()
        }
    }.also { _Right = it }
