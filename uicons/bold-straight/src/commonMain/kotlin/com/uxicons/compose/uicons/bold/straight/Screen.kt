package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screen: ImageVector? = null

val Icons.Bs.Screen: ImageVector
    get() = _Screen ?: UXIcon(name = "Screen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineTo(21f)
                horizontalLineToRelative(-4f)
                verticalLineTo(19f)
                close()
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _Screen = it}
