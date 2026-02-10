package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrows: ImageVector? = null

val Icons.Br.ExpandArrows: ImageVector
    get() = _ExpandArrows ?: UXIcon(name = "ExpandArrows") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
            verticalLineToRelative(-4f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(2.38f)
            lineTo(12f, 9.88f)
            lineTo(5.12f, 3f)
            horizontalLineTo(7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-4f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
            verticalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(5.12f)
            lineTo(9.88f, 12f)
            lineTo(3f, 18.88f)
            verticalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(4f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(5.12f)
            lineTo(12f, 14.12f)
            lineTo(18.88f, 21f)
            horizontalLineTo(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(4f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
            verticalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(2.38f)
            lineTo(14.12f, 12f)
            lineTo(21f, 5.12f)
            verticalLineTo(7.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 9f)
            close()
        }
    }.also { _ExpandArrows = it }
