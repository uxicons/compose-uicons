package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareX: ImageVector? = null

val Icons.Ts.SquareX: ImageVector
    get() = _SquareX ?: UXIcon(name = "SquareX") {
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
                moveTo(12.62f, 12.0f)
                lineToRelative(5.93f, 8.0f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-5.32f, -7.15f)
                lineToRelative(-5.2f, 7.15f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(5.82f, -8f)
                lineTo(5.53f, 4f)
                horizontalLineToRelative(1.24f)
                lineToRelative(5.23f, 7.16f)
                lineToRelative(5.17f, -7.16f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-5.8f, 8.0f)
                close()
            }
        }.also { _SquareX = it}
