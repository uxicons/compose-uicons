package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tornado: ImageVector? = null

val Icons.Rs.Tornado: ImageVector
    get() = _Tornado ?: UXIcon(name = "Tornado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(6f)
                curveTo(-1.93f, 11.75f, -1.93f, 0.25f, 6f, 0f)
                horizontalLineTo(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                horizontalLineTo(6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 24f)
                close()
            }
        }.also { _Tornado = it}
