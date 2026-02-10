package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Sr.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(12f, 2.09f)
                verticalLineTo(6f)
                horizontalLineToRelative(8.27f)
                arcTo(13.93f, 13.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.09f)
                close()
                moveTo(6f, 2f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineTo(2f)
                close()
                moveTo(21.95f, 8f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(19.99f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, -5.19f)
                arcTo(14.05f, 14.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.95f, 8f)
                close()
                moveTo(4f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(6f)
                close()
            }
        }.also { _TrainSide = it}
