package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Ss.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3f)
                close()
                moveTo(21.72f, 21f)
                lineToRelative(-2f, -6f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(13f)
                horizontalLineToRelative(7f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(5.28f)
                lineToRelative(2f, 6f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
                moveTo(8f, 14f)
                verticalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.41f, 11f)
                horizontalLineTo(13f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14f)
                close()
            }
        }.also { _Wheelchair = it}
