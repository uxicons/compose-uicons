package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorAlt: ImageVector? = null

val Icons.Rs.VectorAlt: ImageVector
    get() = _VectorAlt ?: UXIcon(name = "VectorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(12f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.37f, -7f)
                horizontalLineToRelative(2.65f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.01f, -2f)
                horizontalLineToRelative(-4.41f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.14f, 3f)
                horizontalLineTo(3.72f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.01f, 2f)
                horizontalLineTo(6.37f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                verticalLineToRelative(4f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, 5.94f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.96f, 0f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                verticalLineToRelative(4f)
                horizontalLineTo(16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16f)
                close()
                moveTo(6f, 22f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(22f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _VectorAlt = it}
