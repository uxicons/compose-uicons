package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Ss.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0f, -0.9f, -0.73f, -1.63f, -1.63f, -1.63f)
                horizontalLineToRelative(-4.75f)
                curveToRelative(-0.9f, 0f, -1.62f, 0.73f, -1.62f, 1.62f)
                curveToRelative(0f, 0.72f, 0.48f, 1.36f, 1.18f, 1.56f)
                lineToRelative(6.19f, 1.7f)
                curveToRelative(1.56f, 0.45f, 2.63f, 1.88f, 2.63f, 3.49f)
                curveToRelative(0f, 2.0f, -1.63f, 3.63f, -3.63f, 3.63f)
                horizontalLineToRelative(-4.75f)
                curveToRelative(-2f, 0f, -3.63f, -1.63f, -3.63f, -3.63f)
                verticalLineToRelative(-0.37f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.37f)
                curveToRelative(0f, 0.9f, 0.73f, 1.63f, 1.63f, 1.63f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.9f, 0f, 1.63f, -0.73f, 1.63f, -1.63f)
                curveToRelative(0f, -0.72f, -0.48f, -1.36f, -1.18f, -1.56f)
                lineToRelative(-6.18f, -1.7f)
                curveToRelative(-1.56f, -0.44f, -2.64f, -1.88f, -2.64f, -3.49f)
                curveToRelative(0f, -2.0f, 1.62f, -3.62f, 3.62f, -3.62f)
                horizontalLineToRelative(4.75f)
                curveToRelative(2f, 0f, 3.63f, 1.63f, 3.63f, 3.63f)
                verticalLineToRelative(0.37f)
                close()
            }
        }.also { _SquareS = it}
