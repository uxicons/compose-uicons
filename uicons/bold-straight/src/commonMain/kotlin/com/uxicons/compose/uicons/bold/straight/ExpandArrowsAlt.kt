package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrowsAlt: ImageVector? = null

val Icons.Bs.ExpandArrowsAlt: ImageVector
    get() = _ExpandArrowsAlt ?: UXIcon(name = "ExpandArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.07f, 5.05f)
                lineTo(24f, 8f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(16.05f)
                lineToRelative(2.91f, 2.93f)
                lineTo(11.99f, 9.9f)
                lineToRelative(-6.95f, -6.95f)
                lineTo(8f, 0f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                verticalLineTo(7.95f)
                lineTo(2.91f, 5.06f)
                lineToRelative(6.96f, 6.96f)
                lineTo(2.93f, 18.95f)
                lineTo(0f, 16f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(7.95f)
                lineToRelative(-2.9f, -2.92f)
                lineToRelative(6.94f, -6.94f)
                lineToRelative(6.95f, 6.95f)
                lineTo(16f, 24f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(16.05f)
                lineTo(21.06f, 18.97f)
                lineToRelative(-6.95f, -6.95f)
                close()
            }
        }.also { _ExpandArrowsAlt = it}
