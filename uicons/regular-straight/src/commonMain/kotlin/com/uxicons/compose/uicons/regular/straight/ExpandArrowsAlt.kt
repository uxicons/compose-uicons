package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrowsAlt: ImageVector? = null

val Icons.Rs.ExpandArrowsAlt: ImageVector
    get() = _ExpandArrowsAlt ?: UXIcon(name = "ExpandArrowsAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.72f, 4.7f)
                lineTo(24f, 8f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(16.05f)
                lineToRelative(3.26f, 3.28f)
                lineTo(11.99f, 10.6f)
                lineToRelative(-7.3f, -7.3f)
                lineTo(8f, 0f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                verticalLineTo(7.95f)
                lineTo(3.26f, 4.71f)
                lineToRelative(7.31f, 7.31f)
                lineTo(3.29f, 19.3f)
                lineTo(0f, 16f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(7.95f)
                lineTo(4.69f, 20.72f)
                lineToRelative(7.29f, -7.29f)
                lineToRelative(7.3f, 7.3f)
                lineTo(16f, 24f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(16.05f)
                lineToRelative(-3.29f, 3.27f)
                lineToRelative(-7.31f, -7.3f)
                close()
            }
        }.also { _ExpandArrowsAlt = it}
