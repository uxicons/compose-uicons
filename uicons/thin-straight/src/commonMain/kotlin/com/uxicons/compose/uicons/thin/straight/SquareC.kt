package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareC: ImageVector? = null

val Icons.Ts.SquareC: ImageVector
    get() = _SquareC ?: UXIcon(name = "SquareC") {
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
                moveTo(6f, 10.64f)
                verticalLineToRelative(2.73f)
                curveToRelative(0f, 3.11f, 2.5f, 5.64f, 5.57f, 5.64f)
                horizontalLineToRelative(0.68f)
                curveToRelative(2.12f, 0f, 4.04f, -1.17f, 5.01f, -3.05f)
                lineToRelative(0.89f, 0.46f)
                curveToRelative(-1.15f, 2.22f, -3.41f, 3.59f, -5.9f, 3.59f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-3.62f, 0f, -6.57f, -2.98f, -6.57f, -6.64f)
                verticalLineToRelative(-2.73f)
                curveToRelative(0f, -3.66f, 2.95f, -6.64f, 6.57f, -6.64f)
                horizontalLineToRelative(0.68f)
                curveToRelative(2.54f, 0f, 4.82f, 1.41f, 5.95f, 3.69f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-0.96f, -1.93f, -2.9f, -3.13f, -5.05f, -3.13f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-3.07f, 0f, -5.57f, 2.53f, -5.57f, 5.64f)
                close()
            }
        }.also { _SquareC = it}
