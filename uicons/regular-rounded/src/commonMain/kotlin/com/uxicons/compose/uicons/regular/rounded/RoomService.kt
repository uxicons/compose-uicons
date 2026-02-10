package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoomService: ImageVector? = null

val Icons.Rr.RoomService: ImageVector
    get() = _RoomService ?: UXIcon(name = "RoomService") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                verticalLineTo(17f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.05f)
                verticalLineTo(4.72f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineTo(6.05f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                close()
                moveTo(3f, 17f)
                curveTo(3.47f, 5.07f, 20.53f, 5.08f, 21f, 17f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _RoomService = it}
