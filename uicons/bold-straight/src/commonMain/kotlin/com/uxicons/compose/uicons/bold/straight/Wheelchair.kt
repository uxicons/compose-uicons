package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Bs.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
                close()
                moveTo(22.02f, 20f)
                lineToRelative(-2f, -5f)
                horizontalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(6f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineToRelative(6.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, 3.38f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 11f)
                verticalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.74f, 10f)
                horizontalLineToRelative(2.25f)
                lineToRelative(2f, 5f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                close()
            }
        }.also { _Wheelchair = it}
