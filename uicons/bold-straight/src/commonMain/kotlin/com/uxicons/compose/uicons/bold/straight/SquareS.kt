package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Bs.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(15f, 9f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -0.5f, -0.41f, -0.91f, -0.91f, -0.91f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(-0.5f, 0f, -0.9f, 0.41f, -0.9f, 0.9f)
                curveToRelative(0f, 0.4f, 0.27f, 0.76f, 0.66f, 0.87f)
                lineToRelative(5.51f, 1.56f)
                curveToRelative(1.67f, 0.48f, 2.83f, 2.02f, 2.83f, 3.76f)
                curveToRelative(0f, 2.15f, -1.75f, 3.91f, -3.91f, 3.91f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(-2.15f, 0f, -3.91f, -1.75f, -3.91f, -3.91f)
                lineToRelative(3f, -0.09f)
                curveToRelative(0f, 0.59f, 0.41f, 1f, 0.91f, 1f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.5f, 0f, 0.91f, -0.41f, 0.91f, -0.91f)
                curveToRelative(0f, -0.4f, -0.27f, -0.76f, -0.66f, -0.87f)
                lineToRelative(-5.5f, -1.56f)
                curveToRelative(-1.67f, -0.48f, -2.84f, -2.02f, -2.84f, -3.76f)
                curveToRelative(0f, -2.15f, 1.75f, -3.9f, 3.9f, -3.9f)
                horizontalLineToRelative(4.19f)
                curveToRelative(2.15f, 0f, 3.91f, 1.75f, 3.91f, 3.91f)
                lineToRelative(-3f, 0.09f)
                close()
            }
        }.also { _SquareS = it}
