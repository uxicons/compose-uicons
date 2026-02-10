package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToLeft: ImageVector? = null

val Icons.Rr.ArrowToLeft: ImageVector
    get() = _ArrowToLeft ?: UXIcon(name = "ArrowToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.02f, 18.02f)
                verticalLineTo(13.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, 0.28f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-4.3f, -4.3f)
                horizontalLineTo(22.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(4.31f)
                lineToRelative(4.3f, -4.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 5.3f)
                lineToRelative(-4.95f, 4.95f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, 0.28f)
                verticalLineTo(6.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _ArrowToLeft = it}
