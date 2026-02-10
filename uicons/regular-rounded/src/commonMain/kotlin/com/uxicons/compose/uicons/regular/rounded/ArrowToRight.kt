package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToRight: ImageVector? = null

val Icons.Rr.ArrowToRight: ImageVector
    get() = _ArrowToRight ?: UXIcon(name = "ArrowToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 6.01f)
                verticalLineToRelative(4.52f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, -0.28f)
                lineTo(16.8f, 5.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(1.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(19.69f)
                lineToRelative(-4.3f, 4.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.8f, 18.73f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, -0.28f)
                verticalLineToRelative(4.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                close()
            }
        }.also { _ArrowToRight = it}
