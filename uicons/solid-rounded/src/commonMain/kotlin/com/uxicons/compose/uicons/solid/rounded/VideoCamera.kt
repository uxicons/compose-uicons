package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Sr.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.02f, 6.11f)
                lineTo(9.79f, 1.88f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.67f, 1f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3f)
                horizontalLineTo(7.67f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0.29f)
                lineTo(11.09f, 6f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.02f, 6.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.9f, 8.96f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, 0.18f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineTo(20.26f)
                lineToRelative(0.8f, 0.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, -1.6f)
                verticalLineTo(10.74f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.9f, 8.96f)
                close()
            }
        }.also { _VideoCamera = it}
