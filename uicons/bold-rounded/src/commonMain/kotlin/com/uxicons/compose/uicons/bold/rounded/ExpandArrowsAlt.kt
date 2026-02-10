package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrowsAlt: ImageVector? = null

val Icons.Br.ExpandArrowsAlt: ImageVector
    get() = _ExpandArrowsAlt ?: UXIcon(name = "ExpandArrowsAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.33f, 16.59f)
            lineTo(20.52f, 18.4f)
            lineToRelative(-6.4f, -6.4f)
            lineToRelative(6.4f, -6.4f)
            lineToRelative(1.81f, 1.81f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 6.73f)
            lineToRelative(0.04f, -5.63f)
            arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.94f, 0f)
            lineTo(17.31f, 0.04f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.69f, 1.67f)
            lineTo(18.4f, 3.48f)
            lineTo(12f, 9.88f)
            lineToRelative(-6.4f, -6.4f)
            lineTo(7.41f, 1.67f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.73f, 0f)
            lineTo(1.09f, -0.04f)
            arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.06f)
            lineTo(0.04f, 6.69f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.67f, 0.69f)
            lineTo(3.48f, 5.6f)
            lineToRelative(6.4f, 6.4f)
            lineToRelative(-6.4f, 6.4f)
            lineTo(1.71f, 16.62f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.67f, 0.69f)
            lineTo(0f, 22.94f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.09f, 1.09f)
            lineTo(6.73f, 24f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, -1.67f)
            lineTo(5.6f, 20.52f)
            lineToRelative(6.4f, -6.4f)
            lineToRelative(6.4f, 6.4f)
            lineToRelative(-1.77f, 1.77f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 1.67f)
            lineTo(22.94f, 24f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.09f, -1.09f)
            lineTo(24f, 17.27f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.33f, 16.59f)
            close()
        }
    }.also { _ExpandArrowsAlt = it }
