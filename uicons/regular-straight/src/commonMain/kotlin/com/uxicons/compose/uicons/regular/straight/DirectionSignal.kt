package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignal: ImageVector? = null

val Icons.Rs.DirectionSignal: ImageVector
    get() = _DirectionSignal ?: UXIcon(name = "DirectionSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 14.5f)
                lineToRelative(-3.5f, -3.5f)
                horizontalLineToRelative(-6.91f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-9.01f)
                lineToRelative(0.01f, -2.0f)
                lineToRelative(-2f, -0.01f)
                lineToRelative(-0.01f, 2.0f)
                horizontalLineToRelative(-6.91f)
                lineTo(0.59f, 5.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(6.91f)
                verticalLineToRelative(2f)
                lineTo(2f, 11f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8.99f)
                lineToRelative(0.01f, 6.0f)
                lineToRelative(2f, -0.0f)
                lineToRelative(-0.01f, -6.0f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(3.41f, 5.5f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(15.09f)
                verticalLineToRelative(3f)
                lineTo(4.91f, 7f)
                lineToRelative(-1.5f, -1.5f)
                close()
                moveTo(4f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(15.09f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(4f, 16f)
                close()
            }
        }.also { _DirectionSignal = it}
