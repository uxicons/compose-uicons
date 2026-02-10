package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Ss.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.93f, 16f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 15f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                close()
                moveTo(10.59f, 6.08f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.75f, -1.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.51f)
                lineToRelative(-1.75f, 1.76f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.76f, -2.76f)
                close()
                moveTo(24f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 21f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(8.14f, 17f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(8.14f)
                close()
            }
        }.also { _ScreenShare = it}
