package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorAlt: ImageVector? = null

val Icons.Sr.VectorAlt: ImageVector
    get() = _VectorAlt ?: UXIcon(name = "VectorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(12f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, -7f)
                horizontalLineToRelative(2.63f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.01f, -2f)
                horizontalLineToRelative(-4.41f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.14f, 3f)
                horizontalLineTo(3.72f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.01f, 2f)
                horizontalLineTo(6.36f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, 5.93f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.96f, 0f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                close()
            }
        }.also { _VectorAlt = it}
