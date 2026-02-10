package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Haskell: ImageVector? = null

val Icons.Brand.Haskell: ImageVector
    get() = _Haskell ?: UXIcon(name = "Haskell") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 20.46f)
            lineTo(5.65f, 12f)
            lineTo(0f, 3.54f)
            horizontalLineToRelative(4.24f)
            lineTo(9.88f, 12f)
            lineToRelative(-5.65f, 8.46f)
            horizontalLineTo(0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.65f, 20.46f)
            lineTo(11.29f, 12f)
            lineTo(5.65f, 3.54f)
            horizontalLineToRelative(4.24f)
            lineToRelative(11.29f, 16.93f)
            horizontalLineToRelative(-4.24f)
            lineToRelative(-3.53f, -5.29f)
            lineToRelative(-3.53f, 5.29f)
            horizontalLineTo(5.65f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.29f, 15.53f)
            lineToRelative(-1.88f, -2.82f)
            horizontalLineTo(24f)
            verticalLineToRelative(2.82f)
            lineTo(19.29f, 15.53f)
            lineTo(19.29f, 15.53f)
            close()
            moveTo(16.47f, 11.29f)
            lineToRelative(-1.88f, -2.82f)
            horizontalLineTo(24f)
            verticalLineToRelative(2.82f)
            horizontalLineTo(16.47f)
            close()
        }
    }.also { _Haskell = it }
