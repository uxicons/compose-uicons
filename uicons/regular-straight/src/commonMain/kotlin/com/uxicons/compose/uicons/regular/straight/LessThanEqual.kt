package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Rs.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.27f)
                lineToRelative(-14.03f, 7.23f)
                lineToRelative(14.03f, 7.32f)
                verticalLineToRelative(2.17f)
                lineTo(2.5f, 9.5f)
                lineTo(21f, 0.03f)
                verticalLineToRelative(2.25f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LessThanEqual = it}
