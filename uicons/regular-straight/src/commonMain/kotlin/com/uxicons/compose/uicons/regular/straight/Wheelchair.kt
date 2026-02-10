package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Rs.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.72f, 21f)
                lineToRelative(-2f, -6f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(13f)
                horizontalLineToRelative(7f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(7.86f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineTo(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(0.91f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 10f)
                verticalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.93f, 9f)
                horizontalLineToRelative(2.35f)
                lineToRelative(2f, 6f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
                moveTo(9f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                close()
            }
        }.also { _Wheelchair = it}
