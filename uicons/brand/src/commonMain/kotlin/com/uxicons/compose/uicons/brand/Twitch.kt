package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Twitch: ImageVector? = null

val Icons.Brand.Twitch: ImageVector
    get() = _Twitch ?: UXIcon(name = "Twitch") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 0f)
            lineTo(1.71f, 4.29f)
            verticalLineToRelative(15.43f)
            horizontalLineToRelative(5.14f)
            verticalLineTo(24f)
            lineToRelative(4.29f, -4.29f)
            horizontalLineToRelative(3.43f)
            lineTo(22.29f, 12f)
            verticalLineTo(0f)
            horizontalLineTo(6f)
            close()
            moveTo(20.57f, 11.14f)
            lineToRelative(-3.43f, 3.43f)
            horizontalLineToRelative(-3.43f)
            lineToRelative(-3f, 3f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6.86f)
            verticalLineTo(1.71f)
            horizontalLineToRelative(13.71f)
            verticalLineTo(11.14f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.29f, 4.71f)
            horizontalLineToRelative(1.71f)
            verticalLineToRelative(5.14f)
            horizontalLineToRelative(-1.71f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.57f, 4.71f)
            horizontalLineToRelative(1.71f)
            verticalLineToRelative(5.14f)
            horizontalLineToRelative(-1.71f)
            close()
        }
    }.also { _Twitch = it }
