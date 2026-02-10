package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Bs.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.05f, 2.98f)
                curveToRelative(-1.23f, -1.28f, -2.94f, -1.98f, -4.85f, -1.98f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.06f, 0.04f, -3.99f, 1.05f, -5.2f, 2.69f)
                curveToRelative(-1.22f, -1.63f, -3.14f, -2.65f, -5.23f, -2.69f)
                curveToRelative(-1.88f, 0f, -3.59f, 0.71f, -4.83f, 1.99f)
                curveTo(0.63f, 4.34f, -0.07f, 6.28f, 0f, 8.24f)
                curveToRelative(0f, 6.6f, 9.99f, 13.91f, 11.12f, 14.73f)
                lineToRelative(0.87f, 0.62f)
                lineToRelative(0.87f, -0.62f)
                curveToRelative(0.45f, -0.32f, 11.13f, -7.96f, 11.13f, -14.64f)
                curveToRelative(0.08f, -2.04f, -0.63f, -3.98f, -1.94f, -5.34f)
                close()
                moveTo(13f, 19.09f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.44f, 1.15f, -3.12f, 1.15f, -3.12f)
                curveToRelative(0.63f, -1.13f, 1.82f, -1.86f, 3.09f, -1.88f)
                curveToRelative(1.07f, 0f, 1.99f, 0.37f, 2.66f, 1.07f)
                curveToRelative(0.75f, 0.78f, 1.15f, 1.92f, 1.1f, 3.21f)
                curveToRelative(0f, 3.25f, -4.35f, 7.85f, -8f, 10.82f)
                close()
            }
        }.also { _HeartHalfStroke = it}
