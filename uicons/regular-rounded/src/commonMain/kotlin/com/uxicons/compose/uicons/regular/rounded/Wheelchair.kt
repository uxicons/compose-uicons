package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Rr.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21f)
                horizontalLineTo(21.72f)
                lineTo(20.4f, 17.05f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.56f, 15f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, -0.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.95f, 0f)
                arcTo(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.91f, 3.99f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.77f, -6.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -1.98f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.93f, 17f)
                horizontalLineToRelative(1.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, 0.68f)
                lineToRelative(1.54f, 4.63f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 23f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(9f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                close()
            }
        }.also { _Wheelchair = it}
