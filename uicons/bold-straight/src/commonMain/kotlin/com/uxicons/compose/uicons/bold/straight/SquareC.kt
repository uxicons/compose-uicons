package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Bs.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
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
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(9.02f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.68f, 1.3f, 3f, 2.95f, 3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.13f, 0f, 2.15f, -0.62f, 2.67f, -1.62f)
                lineToRelative(2.67f, 1.38f)
                curveToRelative(-1.04f, 2.0f, -3.08f, 3.25f, -5.33f, 3.25f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.28f, 0f, -5.95f, -2.69f, -5.95f, -6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, 2.67f, -6f, 5.95f, -6f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.29f, 0f, 4.35f, 1.28f, 5.38f, 3.33f)
                lineToRelative(-2.69f, 1.33f)
                curveToRelative(-0.51f, -1.03f, -1.54f, -1.67f, -2.69f, -1.67f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.66f, 0f, -2.95f, 1.32f, -2.95f, 3f)
                close()
            }
        }.also { _SquareC = it}
