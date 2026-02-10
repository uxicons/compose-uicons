package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Rs.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.71f, 0.8f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.57f, 0f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 9.9f)
                verticalLineTo(24f)
                horizontalLineTo(20f)
                verticalLineTo(10.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 1f)
                close()
                moveTo(18f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                close()
                moveTo(19f, 9f)
                horizontalLineTo(18f)
                verticalLineToRelative(8f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.14f, 0.9f)
                lineTo(8f, 4.78f)
                lineToRelative(0.69f, -1.01f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.63f, 0f)
                lineTo(16f, 4.78f)
                lineTo(16.86f, 3.9f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _HatChef = it}
