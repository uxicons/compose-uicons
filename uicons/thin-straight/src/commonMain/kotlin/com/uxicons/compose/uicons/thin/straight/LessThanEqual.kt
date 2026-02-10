package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Ts.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 23f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 0f)
                lineTo(2.5f, 9.5f)
                lineToRelative(18.5f, 9.5f)
                verticalLineToRelative(-1.12f)
                lineTo(4.74f, 9.5f)
                lineTo(21f, 1.09f)
                verticalLineTo(0f)
                close()
            }
        }.also { _LessThanEqual = it}
