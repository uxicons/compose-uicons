package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQuote: ImageVector? = null

val Icons.Ts.SquareQuote: ImageVector
    get() = _SquareQuote ?: UXIcon(name = "SquareQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10.1f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-1.16f, 0f, -2.1f, 0.94f, -2.1f, 2.1f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.61f, 0.49f, -1.1f, 1.1f, -1.1f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(3f)
                close()
                moveTo(6f, 10.1f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-1.16f, 0f, -2.1f, 0.94f, -2.1f, 2.1f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.61f, 0.49f, -1.1f, 1.1f, -1.1f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.5f, 0f)
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
            }
        }.also { _SquareQuote = it}
