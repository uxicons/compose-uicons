package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Tr.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(3.1f)
                curveToRelative(0f, -1.22f, -0.87f, -1.86f, -1.61f, -2.03f)
                curveToRelative(-0.74f, -0.17f, -1.8f, 0.01f, -2.35f, 1.1f)
                lineToRelative(-6.59f, 13.55f)
                curveToRelative(-0.17f, 0.34f, -0.73f, 0.34f, -0.9f, 0f)
                lineTo(4.95f, 2.16f)
                curveToRelative(-0.54f, -1.09f, -1.6f, -1.27f, -2.35f, -1.09f)
                curveToRelative(-0.74f, 0.17f, -1.61f, 0.81f, -1.61f, 2.03f)
                verticalLineTo(23.5f)
                curveToRelative(0.01f, 0.65f, -1.01f, 0.65f, -1f, 0f)
                verticalLineTo(3.1f)
                curveTo(0f, 1.41f, 1.2f, 0.37f, 2.38f, 0.09f)
                curveToRelative(1.18f, -0.28f, 2.72f, 0.11f, 3.47f, 1.62f)
                lineToRelative(6.15f, 12.64f)
                lineTo(18.15f, 1.72f)
                curveToRelative(0.76f, -1.51f, 2.29f, -1.91f, 3.47f, -1.63f)
                curveToRelative(1.19f, 0.28f, 2.38f, 1.32f, 2.38f, 3.0f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _M = it}
