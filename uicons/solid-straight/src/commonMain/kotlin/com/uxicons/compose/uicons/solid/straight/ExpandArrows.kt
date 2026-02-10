package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrows: ImageVector? = null

val Icons.Ss.ExpandArrows: ImageVector
    get() = _ExpandArrows ?: UXIcon(name = "ExpandArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineToRelative(4.59f)
                lineTo(12f, 10.59f)
                lineTo(3.41f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(3.41f)
                lineTo(10.59f, 12f)
                lineTo(2f, 20.59f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(3.41f)
                lineTo(12f, 13.41f)
                lineTo(20.59f, 22f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineToRelative(4.59f)
                lineTo(13.41f, 12f)
                lineTo(22f, 3.41f)
                verticalLineTo(8f)
                close()
            }
        }.also { _ExpandArrows = it}
