package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screen: ImageVector? = null

val Icons.Ss.Screen: ImageVector
    get() = _Screen ?: UXIcon(name = "Screen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.also { _Screen = it}
