package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heading: ImageVector? = null

val Icons.Rs.Heading: ImageVector
    get() = _Heading ?: UXIcon(name = "Heading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Heading = it}
