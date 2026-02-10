package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Rr.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(12.47f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -0.1f)
                lineTo(8.87f, 1.32f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.53f, 1f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(8f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                close()
                moveTo(5f, 3f)
                horizontalLineTo(7.53f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, 0.1f)
                lineToRelative(3.16f, 1.58f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.47f, 5f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.78f, 1.88f)
                lineTo(2f, 6.99f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                close()
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(8.99f)
                lineToRelative(20f, -0.11f)
                verticalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                close()
            }
        }.also { _Folder = it}
