package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignal: ImageVector? = null

val Icons.Ts.DirectionSignal: ImageVector
    get() = _DirectionSignal ?: UXIcon(name = "DirectionSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 14.5f)
                lineToRelative(-3.5f, -3.5f)
                horizontalLineToRelative(-7.71f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.5f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-9.51f)
                lineToRelative(0.01f, -2.0f)
                lineToRelative(-1f, -0.0f)
                lineToRelative(-0.01f, 2.0f)
                lineTo(3.79f, 2f)
                lineTo(0.29f, 5.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(7.71f)
                verticalLineToRelative(2f)
                lineTo(2f, 11f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9.49f)
                lineToRelative(0.01f, 6.0f)
                lineToRelative(1f, -0.0f)
                lineToRelative(-0.01f, -6.0f)
                horizontalLineToRelative(7.72f)
                lineToRelative(3.5f, -3.5f)
                close()
                moveTo(4.21f, 8f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(2.5f, -2.5f)
                horizontalLineToRelative(16.79f)
                verticalLineToRelative(5f)
                lineTo(4.21f, 8f)
                close()
                moveTo(3f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(16.79f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(3f, 17f)
                close()
            }
        }.also { _DirectionSignal = it}
