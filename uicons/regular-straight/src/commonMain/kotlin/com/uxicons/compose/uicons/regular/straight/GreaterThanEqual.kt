package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Rs.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9.5f)
                lineTo(3f, 18.99f)
                verticalLineToRelative(-2.17f)
                lineToRelative(14.03f, -7.32f)
                lineTo(3f, 2.27f)
                verticalLineTo(0.03f)
                lineToRelative(18.5f, 9.47f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GreaterThanEqual = it}
