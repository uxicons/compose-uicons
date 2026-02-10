package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Bs.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.12f, 20f)
                horizontalLineToRelative(0.88f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.4f, 0f, -0.8f, 0.07f, -1.18f, 0.2f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.84f, -1.84f)
                close()
                moveTo(19.5f, 4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.88f)
                lineTo(6.12f, 4f)
                horizontalLineToRelative(13.38f)
                close()
                moveTo(13.95f, 18.9f)
                lineToRelative(2.13f, 2.13f)
                lineToRelative(-2.46f, 2.04f)
                curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
                curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.68f, -0.64f)
                lineToRelative(-3.6f, -3.03f)
                lineTo(1f, 20f)
                lineTo(1f, 5.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(8.05f)
                horizontalLineToRelative(3.84f)
                lineToRelative(4.17f, 3.51f)
                lineToRelative(1.95f, -1.61f)
                close()
            }
        }.also { _MessageSlash = it}
