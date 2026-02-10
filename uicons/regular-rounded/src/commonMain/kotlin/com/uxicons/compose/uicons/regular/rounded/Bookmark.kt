package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Rr.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.14f, 24f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.83f)
                lineTo(12f, 17.05f)
                lineTo(5.85f, 23.17f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.1f, 0.61f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21.15f)
                verticalLineTo(5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                horizontalLineTo(18f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineTo(21.15f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, 2.62f)
                arcTo(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.14f, 24f)
                close()
                moveTo(6f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(21.15f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, 0.6f)
                horizontalLineToRelative(0f)
                lineTo(11.3f, 14.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineToRelative(6.86f, 6.82f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, -0.6f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
        }.also { _Bookmark = it}
