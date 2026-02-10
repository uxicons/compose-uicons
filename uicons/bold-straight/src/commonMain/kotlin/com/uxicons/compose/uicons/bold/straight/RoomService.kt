package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoomService: ImageVector? = null

val Icons.Bs.RoomService: ImageVector
    get() = _RoomService ?: UXIcon(name = "RoomService") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                verticalLineTo(16f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.12f)
                verticalLineTo(4.31f)
                arcToRelative(2.0f, 2.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                verticalLineToRelative(0.81f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 16f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineTo(19f)
                close()
                moveTo(4f, 16f)
                curveTo(4.4f, 5.4f, 19.6f, 5.41f, 20f, 16f)
                verticalLineToRelative(3f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _RoomService = it}
