package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimePast: ImageVector? = null

val Icons.Rr.TimePast: ImageVector
    get() = _TimePast ?: UXIcon(name = "TimePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3.07f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 1f)
                verticalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                horizontalLineTo(5f)
                arcToRelative(0.85f, 0.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.1f, -0.02f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(13f, 11.59f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
        }.also { _TimePast = it}
