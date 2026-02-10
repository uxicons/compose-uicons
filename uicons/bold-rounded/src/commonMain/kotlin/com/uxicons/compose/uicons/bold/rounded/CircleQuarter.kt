package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Br.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 13f)
            horizontalLineTo(3.36f)
            curveToRelative(-1.03f, 0f, -1.98f, -0.46f, -2.62f, -1.26f)
            curveToRelative(-0.64f, -0.81f, -0.88f, -1.85f, -0.65f, -2.86f)
            horizontalLineTo(0.09f)
            curveTo(1.08f, 4.53f, 4.53f, 1.08f, 8.87f, 0.09f)
            curveToRelative(1.01f, -0.23f, 2.05f, 0f, 2.86f, 0.65f)
            curveToRelative(0.8f, 0.64f, 1.26f, 1.6f, 1.26f, 2.62f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(3.01f, 9.54f)
            curveToRelative(-0.04f, 0.16f, 0.03f, 0.27f, 0.07f, 0.32f)
            curveToRelative(0.05f, 0.06f, 0.14f, 0.13f, 0.28f, 0.13f)
            horizontalLineToRelative(6.64f)
            verticalLineTo(3.36f)
            curveToRelative(0f, -0.14f, -0.07f, -0.23f, -0.13f, -0.28f)
            curveToRelative(-0.05f, -0.04f, -0.17f, -0.11f, -0.32f, -0.07f)
            curveToRelative(-3.23f, 0.74f, -5.79f, 3.31f, -6.53f, 6.53f)
            horizontalLineToRelative(0f)
            close()
        }
    }.also { _CircleQuarter = it }
