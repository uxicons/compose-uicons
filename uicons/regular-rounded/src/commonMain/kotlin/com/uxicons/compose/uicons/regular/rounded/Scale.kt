package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Rr.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                horizontalLineTo(16.46f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.8f, 0.12f)
                arcTo(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.59f, 2f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                close()
                moveTo(12f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(12.87f)
                lineToRelative(0.96f, -1.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, -1.11f)
                lineTo(10.46f, 7f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                horizontalLineTo(6.39f)
                arcTo(6.48f, 6.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6.21f)
                arcTo(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.79f, 9f)
                horizontalLineToRelative(6.43f)
                arcTo(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6.35f)
                arcTo(7.57f, 7.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.66f, 4f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _Scale = it}
