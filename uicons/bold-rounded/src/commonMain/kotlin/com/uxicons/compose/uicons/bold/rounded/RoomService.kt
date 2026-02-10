package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoomService: ImageVector? = null

val Icons.Br.RoomService: ImageVector
    get() = _RoomService ?: UXIcon(name = "RoomService") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 19.09f)
            verticalLineTo(16f)
            arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.12f)
            verticalLineTo(4.31f)
            arcToRelative(2.0f, 2.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(0.81f)
            arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 16f)
            verticalLineToRelative(3.09f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 22f)
            horizontalLineToRelative(21f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19.09f)
            close()
            moveTo(12f, 8f)
            arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
            verticalLineToRelative(3f)
            horizontalLineTo(4f)
            verticalLineTo(16f)
            arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
            close()
        }
    }.also { _RoomService = it }
