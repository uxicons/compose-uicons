package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToTop: ImageVector? = null

val Icons.Rr.ArrowToTop: ImageVector
    get() = _ArrowToTop ?: UXIcon(name = "ArrowToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.03f)
                horizontalLineToRelative(4.52f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, 0.23f)
                lineToRelative(-4.95f, 4.95f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.7f, 8.63f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(4.32f)
                lineToRelative(4.3f, 4.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-4.95f, -4.95f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -0.23f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
            }
        }.also { _ArrowToTop = it}
