package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Ts.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12.02f)
                curveToRelative(0f, -0.4f, 0.1f, -0.81f, 0.29f, -1.18f)
                lineTo(4.82f, 2.33f)
                curveToRelative(0.43f, -0.82f, 1.28f, -1.32f, 2.2f, -1.32f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.93f, 0f, 1.77f, 0.51f, 2.2f, 1.33f)
                lineToRelative(4.51f, 8.5f)
                curveToRelative(0.39f, 0.73f, 0.39f, 1.61f, 0f, 2.35f)
                lineToRelative(-4.51f, 8.5f)
                curveToRelative(-0.43f, 0.82f, -1.28f, 1.33f, -2.2f, 1.33f)
                lineTo(7.03f, 23.02f)
                curveToRelative(-0.92f, 0f, -1.77f, -0.51f, -2.2f, -1.32f)
                lineTo(0.29f, 13.19f)
                curveTo(0.1f, 12.83f, 0f, 12.42f, 0f, 12.02f)
                close()
                moveTo(23f, 12.02f)
                curveToRelative(0f, -0.24f, -0.06f, -0.48f, -0.18f, -0.7f)
                lineTo(18.31f, 2.81f)
                curveToRelative(-0.26f, -0.49f, -0.77f, -0.8f, -1.32f, -0.8f)
                lineTo(7.03f, 2.01f)
                curveToRelative(-0.55f, 0f, -1.06f, 0.3f, -1.32f, 0.79f)
                lineTo(1.18f, 11.31f)
                curveToRelative(-0.24f, 0.44f, -0.24f, 0.97f, 0f, 1.41f)
                lineToRelative(4.53f, 8.5f)
                curveToRelative(0.26f, 0.49f, 0.77f, 0.79f, 1.32f, 0.79f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.55f, 0f, 1.06f, -0.3f, 1.32f, -0.8f)
                lineToRelative(4.51f, -8.5f)
                curveToRelative(0.12f, -0.22f, 0.18f, -0.46f, 0.18f, -0.7f)
                close()
            }
        }.also { _Hexagon = it}
