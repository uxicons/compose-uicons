package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Br.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.66f, 14.29f)
            curveTo(24.83f, 10.97f, 22.51f, 0.04f, 14.5f, 0f)
            horizontalLineTo(7.5f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-7.5f)
            horizontalLineTo(14.5f)
            curveToRelative(0.04f, 0f, 0.08f, -0.01f, 0.11f, -0.01f)
            lineToRelative(4.58f, 8.23f)
            curveToRelative(0.41f, 0.73f, 1.33f, 0.98f, 2.04f, 0.58f)
            curveToRelative(0.72f, -0.4f, 0.98f, -1.31f, 0.58f, -2.04f)
            lineToRelative(-4.15f, -7.48f)
            close()
            moveTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(5.93f, 0.16f, 5.93f, 8.85f, 0f, 9f)
            horizontalLineTo(5f)
            verticalLineTo(5.5f)
            close()
        }
    }.also { _R = it }
