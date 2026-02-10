package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorAlt: ImageVector? = null

val Icons.Ss.VectorAlt: ImageVector
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
            }
        }.also { _VectorAlt = it}
