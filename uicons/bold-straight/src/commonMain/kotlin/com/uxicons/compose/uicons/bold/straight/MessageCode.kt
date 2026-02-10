package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCode: ImageVector? = null

val Icons.Bs.MessageCode: ImageVector
    get() = _MessageCode ?: UXIcon(name = "MessageCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.27f, 8.24f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.55f, 0.0f, 3.52f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(9.03f, 4.94f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 20f)
                horizontalLineToRelative(-6.67f)
                lineToRelative(-3.71f, 3.07f)
                curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
                curveToRelative(-0.59f, 0f, -1.19f, -0.21f, -1.67f, -0.63f)
                lineToRelative(-3.6f, -3.03f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(7.84f, 17f)
                lineToRelative(4.17f, 3.51f)
                lineToRelative(4.25f, -3.51f)
                horizontalLineToRelative(4.75f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }.also { _MessageCode = it}
