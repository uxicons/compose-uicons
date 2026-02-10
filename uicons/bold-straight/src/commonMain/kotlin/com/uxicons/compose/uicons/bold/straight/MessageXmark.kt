package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageXmark: ImageVector? = null

val Icons.Bs.MessageXmark: ImageVector
    get() = _MessageXmark ?: UXIcon(name = "MessageXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.57f, 7.53f)
                lineToRelative(-2.48f, 2.48f)
                lineToRelative(2.48f, 2.48f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.48f, -2.48f)
                lineToRelative(-2.48f, 2.48f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(-2.48f, -2.48f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.48f, 2.48f)
                lineToRelative(2.48f, -2.48f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(-6.67f)
                lineToRelative(-3.71f, 3.07f)
                curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
                curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.67f, -0.64f)
                lineToRelative(-3.6f, -3.03f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(4.84f)
                lineToRelative(4.17f, 3.51f)
                lineToRelative(4.25f, -3.51f)
                horizontalLineToRelative(4.75f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _MessageXmark = it}
