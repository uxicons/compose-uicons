package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameBoardAlt: ImageVector? = null

val Icons.Ts.GameBoardAlt: ImageVector
    get() = _GameBoardAlt ?: UXIcon(name = "GameBoardAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(13f, 18.21f)
                lineToRelative(5.21f, -5.21f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-8.79f, 8.79f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(13f, 16.79f)
                verticalLineToRelative(-3.79f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-3.79f, 3.79f)
                close()
                moveTo(23f, 13.21f)
                verticalLineToRelative(3.09f)
                lineToRelative(-6.71f, 6.71f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(9.79f, -9.79f)
                close()
                moveTo(11f, 5.79f)
                lineToRelative(-5.21f, 5.21f)
                lineTo(2.21f, 11f)
                lineTo(11f, 2.21f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(11f, 7.21f)
                verticalLineToRelative(3.79f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(3.79f, -3.79f)
                close()
                moveTo(1f, 7.71f)
                lineTo(7.71f, 1f)
                horizontalLineToRelative(3.09f)
                lineTo(1f, 10.79f)
                verticalLineToRelative(-3.09f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineToRelative(3.79f)
                lineTo(1f, 6.29f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 1f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 12f)
                lineTo(12f, 12f)
                verticalLineToRelative(11f)
                lineTo(1f, 23f)
                lineTo(1f, 12f)
                close()
                moveTo(17.71f, 23f)
                lineToRelative(5.29f, -5.29f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(-5.29f)
                close()
            }
        }.also { _GameBoardAlt = it}
