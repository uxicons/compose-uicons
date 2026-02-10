package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Sr.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 24f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.47f, -0.01f, -0.86f, -0.35f, -0.96f, -0.8f)
                lineToRelative(-2.02f, -13.7f)
                lineToRelative(-1.02f, 8.7f)
                curveToRelative(-0.1f, 0.48f, -0.54f, 0.83f, -1.01f, 0.8f)
                curveToRelative(-0.49f, -0.02f, -0.89f, -0.38f, -0.96f, -0.87f)
                lineTo(0.04f, 3.47f)
                curveToRelative(-0.15f, -0.82f, 0.08f, -1.71f, 0.64f, -2.4f)
                reflectiveCurveTo(2.09f, 0f, 2.98f, 0f)
                horizontalLineToRelative(18.05f)
                curveToRelative(0.88f, 0f, 1.71f, 0.39f, 2.28f, 1.06f)
                curveToRelative(0.57f, 0.68f, 0.8f, 1.56f, 0.65f, 2.43f)
                lineToRelative(-2.97f, 18.21f)
                curveToRelative(-0.08f, 0.47f, -0.48f, 0.82f, -0.96f, 0.84f)
                curveToRelative(-0.51f, -0.01f, -0.9f, -0.32f, -1.0f, -0.78f)
                lineToRelative(-2.02f, -12.25f)
                lineToRelative(-1.53f, 7.87f)
                curveToRelative(-0.11f, 0.82f, -0.51f, 1.12f, -0.96f, 1.13f)
                curveToRelative(-0.47f, -0.02f, -0.85f, -0.29f, -0.97f, -0.72f)
                lineToRelative(-1.54f, -8.28f)
                lineToRelative(-3.03f, 13.74f)
                curveToRelative(-0.11f, 0.45f, -0.51f, 0.76f, -0.97f, 0.76f)
                close()
            }
        }.also { _Icicles = it}
