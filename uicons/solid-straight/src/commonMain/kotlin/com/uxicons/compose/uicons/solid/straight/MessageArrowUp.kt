package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUp: ImageVector? = null

val Icons.Ss.MessageArrowUp: ImageVector
    get() = _MessageArrowUp ?: UXIcon(name = "MessageArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15.29f, 10.29f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.01f)
                lineToRelative(-2.29f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.77f, 2.81f, 0f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _MessageArrowUp = it}
