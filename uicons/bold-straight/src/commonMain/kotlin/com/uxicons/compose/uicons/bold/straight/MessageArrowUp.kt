package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUp: ImageVector? = null

val Icons.Bs.MessageArrowUp: ImageVector
    get() = _MessageArrowUp ?: UXIcon(name = "MessageArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.74f)
                lineToRelative(3.6f, 3.03f)
                curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
                curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
                lineToRelative(3.71f, -3.06f)
                horizontalLineToRelative(6.67f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 17f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.25f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                lineTo(3f, 17f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(12.71f, 5.29f)
                lineToRelative(3.79f, 3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
            }
        }.also { _MessageArrowUp = it}
