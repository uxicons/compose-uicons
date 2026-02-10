package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSquare: ImageVector? = null

val Icons.Sr.PenSquare: ImageVector
    get() = _PenSquare ?: UXIcon(name = "PenSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.25f, 11.66f)
                lineToRelative(-4.25f, 4.25f)
                curveToRelative(-0.37f, 0.37f, -0.89f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.59f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.53f, 0.21f, -1.04f, 0.59f, -1.41f)
                lineToRelative(4.25f, -4.25f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(15.29f, 7.79f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(18.12f, 6.38f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-6.71f, 6.71f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.59f)
                curveToRelative(1.07f, 0f, 2.07f, -0.42f, 2.83f, -1.17f)
                lineToRelative(6.71f, -6.71f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
            }
        }.also { _PenSquare = it}
