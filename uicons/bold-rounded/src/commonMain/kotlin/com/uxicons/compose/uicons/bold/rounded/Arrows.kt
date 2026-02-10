package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Arrows: ImageVector? = null

val Icons.Br.Arrows: ImageVector
    get() = _Arrows ?: UXIcon(name = "Arrows") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9.54f)
            lineTo(20.57f, 7.07f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, 2.1f)
            lineToRelative(1.3f, 1.33f)
            horizontalLineTo(13.5f)
            verticalLineTo(4.27f)
            lineToRelative(1.33f, 1.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.1f, -2.14f)
            lineTo(14.46f, 1f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, -1f)
            horizontalLineTo(12f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.54f, 1f)
            lineTo(7.07f, 3.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.1f, 2.14f)
            lineTo(10.5f, 4.26f)
            verticalLineTo(10.5f)
            horizontalLineTo(4.27f)
            lineToRelative(1.3f, -1.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, -2.1f)
            lineTo(1f, 9.54f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 2.44f)
            verticalLineTo(12f)
            horizontalLineTo(0f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.45f)
            lineTo(3.43f, 16.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.14f, -2.1f)
            lineTo(4.26f, 13.5f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(6.24f)
            lineToRelative(-1.33f, -1.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, 2.14f)
            lineToRelative(2.47f, 2.43f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.91f, 0f)
            lineToRelative(2.48f, -2.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, -2.14f)
            lineToRelative(-1.33f, 1.3f)
            verticalLineTo(13.5f)
            horizontalLineToRelative(6.23f)
            lineToRelative(-1.3f, 1.33f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.14f, 2.1f)
            lineTo(23f, 14.46f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.91f)
            close()
        }
    }.also { _Arrows = it }
