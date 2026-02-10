package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRight: ImageVector? = null

val Icons.Rr.ArrowRight: ImageVector
    get() = _ArrowRight ?: UXIcon(name = "ArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.91f)
                lineTo(19.25f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineTo(21.39f, 11f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                horizontalLineTo(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(21.45f)
                lineToRelative(-3.62f, 3.61f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.42f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0f)
                lineToRelative(3.87f, -3.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.91f)
                close()
            }
        }.also { _ArrowRight = it}
