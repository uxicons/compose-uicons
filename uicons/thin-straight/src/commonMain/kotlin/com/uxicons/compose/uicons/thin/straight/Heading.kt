package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heading: ImageVector? = null

val Icons.Ts.Heading: ImageVector
    get() = _Heading ?: UXIcon(name = "Heading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 1f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                horizontalLineTo(3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(18f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Heading = it}
