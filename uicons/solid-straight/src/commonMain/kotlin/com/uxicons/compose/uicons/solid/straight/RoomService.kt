package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoomService: ImageVector? = null

val Icons.Ss.RoomService: ImageVector
    get() = _RoomService ?: UXIcon(name = "RoomService") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 19f)
                verticalLineTo(17f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.05f)
                verticalLineTo(4.72f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineTo(6.05f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 21f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
            }
        }.also { _RoomService = it}
