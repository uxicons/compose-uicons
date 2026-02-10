package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrows: ImageVector? = null

val Icons.Bs.ExpandArrows: ImageVector
    get() = _ExpandArrows ?: UXIcon(name = "ExpandArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineToRelative(3.88f)
                lineTo(12f, 9.88f)
                lineTo(5.12f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(5.12f)
                lineTo(9.88f, 12f)
                lineTo(3f, 18.88f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(5.12f)
                lineTo(12f, 14.12f)
                lineTo(18.88f, 21f)
                horizontalLineTo(15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.5f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineToRelative(3.88f)
                lineTo(14.12f, 12f)
                lineTo(21f, 5.12f)
                verticalLineTo(9f)
                close()
            }
        }.also { _ExpandArrows = it}
