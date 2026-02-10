package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Ss.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.12f, 2.9f)
                curveToRelative(-1.2f, -1.25f, -2.8f, -1.9f, -4.66f, -1.9f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.25f, 0.05f, -4.36f, 1.33f, -5.46f, 3.29f)
                curveToRelative(-1.11f, -1.96f, -3.21f, -3.25f, -5.48f, -3.29f)
                curveToRelative(-1.84f, 0f, -3.44f, 0.66f, -4.64f, 1.91f)
                curveTo(0.61f, 4.22f, -0.07f, 6.09f, 0f, 8.01f)
                curveToRelative(0f, 6.63f, 10.25f, 14.13f, 11.42f, 14.96f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(0.58f, -0.41f)
                curveToRelative(0.47f, -0.33f, 11.42f, -8.16f, 11.42f, -14.89f)
                curveToRelative(0.07f, -1.98f, -0.61f, -3.87f, -1.88f, -5.18f)
                close()
                moveTo(13f, 20.16f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.62f, 0.75f, -2.73f, 0.75f, -2.73f)
                curveToRelative(0.76f, -1.37f, 2.19f, -2.23f, 3.73f, -2.27f)
                curveToRelative(1.28f, 0f, 2.38f, 0.45f, 3.19f, 1.29f)
                curveToRelative(0.89f, 0.93f, 1.37f, 2.28f, 1.32f, 3.76f)
                curveToRelative(0f, 3.76f, -4.92f, 8.89f, -9f, 12.11f)
                close()
            }
        }.also { _HeartHalfStroke = it}
