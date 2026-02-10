package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Br.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(3.87f)
            curveToRelative(0f, -0.62f, -0.47f, -0.79f, -0.67f, -0.84f)
            curveToRelative(-0.2f, -0.05f, -0.69f, -0.1f, -0.97f, 0.45f)
            lineToRelative(-6.01f, 12.66f)
            curveToRelative(-0.49f, 1.12f, -2.22f, 1.12f, -2.71f, 0f)
            lineTo(4.62f, 3.46f)
            curveToRelative(-0.26f, -0.52f, -0.76f, -0.47f, -0.96f, -0.43f)
            curveToRelative(-0.2f, 0.05f, -0.67f, 0.22f, -0.67f, 0.84f)
            verticalLineTo(22.5f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            verticalLineTo(3.87f)
            curveTo(0f, 2.04f, 1.2f, 0.53f, 2.98f, 0.11f)
            curveToRelative(1.78f, -0.42f, 3.52f, 0.4f, 4.34f, 2.03f)
            lineToRelative(4.68f, 9.86f)
            lineTo(16.67f, 2.17f)
            curveToRelative(0.83f, -1.66f, 2.58f, -2.48f, 4.36f, -2.06f)
            curveToRelative(1.78f, 0.42f, 2.98f, 1.93f, 2.98f, 3.76f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _M = it }
