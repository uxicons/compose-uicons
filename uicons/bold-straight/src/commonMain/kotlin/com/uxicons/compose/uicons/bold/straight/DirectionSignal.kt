package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignal: ImageVector? = null

val Icons.Bs.DirectionSignal: ImageVector
    get() = _DirectionSignal ?: UXIcon(name = "DirectionSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.62f, 16f)
                lineToRelative(-4f, -4f)
                horizontalLineToRelative(-6.12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.5f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-8.51f)
                lineToRelative(0.01f, -2.0f)
                lineToRelative(-3f, -0.01f)
                lineToRelative(-0.01f, 2.0f)
                horizontalLineToRelative(-6.12f)
                lineTo(0.38f, 6f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(6.12f)
                verticalLineToRelative(2f)
                lineTo(2f, 12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8.49f)
                lineToRelative(0.01f, 4.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(-0.01f, -4.0f)
                horizontalLineToRelative(6.13f)
                lineToRelative(4f, -4f)
                close()
                moveTo(4.62f, 6f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(13.38f)
                verticalLineToRelative(2f)
                lineTo(5.62f, 7f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(18.38f, 17f)
                lineTo(5f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13.38f)
                lineToRelative(1f, 1f)
                lineToRelative(-1f, 1f)
                close()
            }
        }.also { _DirectionSignal = it}
