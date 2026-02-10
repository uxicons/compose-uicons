package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Tr.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.01f, 12.01f)
                curveToRelative(0f, -0.73f, 0.18f, -1.47f, 0.54f, -2.13f)
                lineTo(4.03f, 3.39f)
                curveToRelative(0.79f, -1.47f, 2.31f, -2.38f, 3.98f, -2.38f)
                horizontalLineToRelative(8f)
                curveToRelative(1.67f, 0f, 3.2f, 0.92f, 3.99f, 2.39f)
                lineToRelative(3.46f, 6.48f)
                curveToRelative(0.71f, 1.33f, 0.71f, 2.92f, 0f, 4.26f)
                lineToRelative(-3.46f, 6.48f)
                curveToRelative(-0.79f, 1.47f, -2.31f, 2.39f, -3.99f, 2.39f)
                lineTo(8.01f, 23.01f)
                curveToRelative(-1.67f, 0f, -3.19f, -0.91f, -3.98f, -2.38f)
                lineTo(0.55f, 14.15f)
                curveTo(0.19f, 13.48f, 0.01f, 12.75f, 0.01f, 12.01f)
                close()
                moveTo(22.99f, 12.01f)
                curveToRelative(0f, -0.57f, -0.14f, -1.14f, -0.42f, -1.66f)
                lineToRelative(-3.46f, -6.48f)
                curveToRelative(-0.61f, -1.15f, -1.8f, -1.86f, -3.1f, -1.86f)
                lineTo(8.01f, 2.01f)
                curveToRelative(-1.3f, 0f, -2.49f, 0.71f, -3.1f, 1.85f)
                lineTo(1.43f, 10.35f)
                curveToRelative(-0.56f, 1.04f, -0.56f, 2.29f, 0f, 3.33f)
                lineToRelative(3.48f, 6.48f)
                curveToRelative(0.61f, 1.14f, 1.8f, 1.85f, 3.1f, 1.85f)
                horizontalLineToRelative(8f)
                curveToRelative(1.3f, 0f, 2.49f, -0.71f, 3.1f, -1.86f)
                horizontalLineToRelative(0f)
                lineToRelative(3.46f, -6.48f)
                curveToRelative(0.28f, -0.52f, 0.42f, -1.09f, 0.42f, -1.66f)
                close()
            }
        }.also { _Hexagon = it}
