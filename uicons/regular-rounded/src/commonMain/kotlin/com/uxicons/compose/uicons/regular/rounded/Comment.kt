package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Rr.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.25f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.02f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(11.25f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(12.02f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.48f, -3.34f)
                arcToRelative(9.92f, 9.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.48f, -7.81f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.66f, -8.76f)
                arcTo(10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 2f)
                arcTo(9.92f, 9.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.4f, 4.3f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _Comment = it}
