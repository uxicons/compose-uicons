package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _1: ImageVector? = null

val Icons.Br.One: ImageVector
    get() = _1 ?: UXIcon(name = "One") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(3.95f)
            lineToRelative(-4.32f, 5.48f)
            curveToRelative(-0.51f, 0.65f, -1.46f, 0.76f, -2.11f, 0.25f)
            curveToRelative(-0.65f, -0.51f, -0.76f, -1.46f, -0.25f, -2.11f)
            curveToRelative(0f, 0f, 5.37f, -6.8f, 5.41f, -6.84f)
            curveTo(11.45f, 0.01f, 12.52f, -0.2f, 13.46f, 0.19f)
            curveToRelative(0.94f, 0.39f, 1.54f, 1.29f, 1.54f, 2.31f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _1 = it }
