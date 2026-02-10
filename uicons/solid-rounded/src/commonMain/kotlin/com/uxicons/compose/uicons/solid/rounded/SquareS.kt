package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Sr.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(8f, 8.62f)
                curveToRelative(0f, 0.72f, 0.48f, 1.36f, 1.18f, 1.56f)
                lineToRelative(6.19f, 1.7f)
                curveToRelative(1.56f, 0.45f, 2.63f, 1.88f, 2.63f, 3.49f)
                curveToRelative(0f, 2.0f, -1.63f, 3.63f, -3.63f, 3.63f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-1.77f, 0f, -3.28f, -1.27f, -3.57f, -3.01f)
                curveToRelative(-0.09f, -0.55f, 0.27f, -1.06f, 0.82f, -1.15f)
                curveToRelative(0.55f, -0.09f, 1.06f, 0.27f, 1.15f, 0.82f)
                curveToRelative(0.13f, 0.78f, 0.81f, 1.35f, 1.6f, 1.35f)
                horizontalLineToRelative(4.79f)
                curveToRelative(0.9f, 0f, 1.63f, -0.73f, 1.63f, -1.63f)
                curveToRelative(0f, -0.72f, -0.48f, -1.36f, -1.18f, -1.56f)
                lineToRelative(-6.18f, -1.7f)
                curveToRelative(-1.56f, -0.44f, -2.64f, -1.88f, -2.64f, -3.49f)
                curveToRelative(0f, -2.0f, 1.62f, -3.62f, 3.62f, -3.62f)
                horizontalLineToRelative(4.79f)
                curveToRelative(1.77f, 0f, 3.28f, 1.27f, 3.57f, 3.01f)
                curveToRelative(0.09f, 0.55f, -0.27f, 1.06f, -0.82f, 1.15f)
                curveToRelative(-0.54f, 0.1f, -1.06f, -0.27f, -1.15f, -0.82f)
                curveToRelative(-0.13f, -0.78f, -0.81f, -1.35f, -1.6f, -1.35f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-0.9f, 0f, -1.62f, 0.73f, -1.62f, 1.62f)
                close()
            }
        }.also { _SquareS = it}
