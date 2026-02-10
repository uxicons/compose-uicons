package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screen: ImageVector? = null

val Icons.Rs.Screen: ImageVector
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
                moveTo(2f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _Screen = it}
