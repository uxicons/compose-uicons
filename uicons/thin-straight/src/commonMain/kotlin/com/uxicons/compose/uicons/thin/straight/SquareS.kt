package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Ts.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(19f, 7.78f)
                verticalLineToRelative(0.22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.22f)
                curveToRelative(0f, -1.53f, -1.25f, -2.78f, -2.78f, -2.78f)
                horizontalLineToRelative(-6.44f)
                curveToRelative(-1.53f, 0f, -2.78f, 1.25f, -2.78f, 2.78f)
                curveToRelative(0f, 1.24f, 0.83f, 2.33f, 2.02f, 2.67f)
                lineToRelative(8.23f, 2.13f)
                curveToRelative(1.62f, 0.47f, 2.75f, 1.96f, 2.75f, 3.64f)
                curveToRelative(0f, 2.09f, -1.7f, 3.78f, -3.78f, 3.78f)
                horizontalLineToRelative(-6.44f)
                curveToRelative(-2.08f, 0f, -3.78f, -1.7f, -3.78f, -3.78f)
                verticalLineToRelative(-0.22f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.22f)
                curveToRelative(0f, 1.53f, 1.25f, 2.78f, 2.78f, 2.78f)
                horizontalLineToRelative(6.44f)
                curveToRelative(1.53f, 0f, 2.78f, -1.25f, 2.78f, -2.78f)
                curveToRelative(0f, -1.23f, -0.83f, -2.33f, -2.01f, -2.67f)
                lineToRelative(-8.23f, -2.13f)
                curveToRelative(-1.63f, -0.46f, -2.76f, -1.96f, -2.76f, -3.64f)
                curveToRelative(0f, -2.08f, 1.69f, -3.78f, 3.78f, -3.78f)
                horizontalLineToRelative(6.44f)
                curveToRelative(2.08f, 0f, 3.78f, 1.7f, 3.78f, 3.78f)
                close()
            }
        }.also { _SquareS = it}
