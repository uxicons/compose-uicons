package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Ts.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineTo(10.5f)
                curveToRelative(0f, -0.1f, -0.13f, -10.5f, -11.62f, -10.5f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.1f, 0.38f)
                curveToRelative(-0.85f, 3.39f, -2.94f, 4.76f, -6.06f, 5.89f)
                curveToRelative(-1.09f, 0.4f, -1.83f, 1.44f, -1.83f, 2.59f)
                verticalLineToRelative(2.15f)
                horizontalLineToRelative(7.92f)
                curveToRelative(-1.09f, 6.79f, -6.26f, 11.3f, -7.1f, 12f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.0f, 10.56f)
                lineToRelative(0.07f, -0.56f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0f, -0.73f, 0.47f, -1.4f, 1.17f, -1.65f)
                curveToRelative(2.6f, -0.94f, 5.45f, -2.27f, 6.59f, -6.2f)
                curveToRelative(10.1f, 0.22f, 10.24f, 9.11f, 10.24f, 9.5f)
                verticalLineToRelative(12.5f)
                horizontalLineTo(4.33f)
                curveToRelative(1.91f, -1.79f, 5.88f, -6.19f, 6.66f, -12.44f)
                close()
            }
        }.also { _ChessKnight = it}
