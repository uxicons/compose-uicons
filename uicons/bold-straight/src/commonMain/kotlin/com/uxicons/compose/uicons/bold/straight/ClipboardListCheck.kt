package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardListCheck: ImageVector? = null

val Icons.Bs.ClipboardListCheck: ImageVector
    get() = _ClipboardListCheck ?: UXIcon(name = "ClipboardListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.95f, 9.67f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.41f, 0.42f, -0.96f, 0.62f, -1.52f, 0.62f)
                curveToRelative(-0.56f, 0f, -1.11f, -0.21f, -1.54f, -0.64f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(0.89f, 0.86f)
                lineToRelative(2.19f, -2.14f)
                lineToRelative(2.1f, 2.14f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 2f)
                lineTo(22f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 2f)
                lineTo(7.34f, 2f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.39f, 0f, 2.6f, 0.82f, 3.16f, 2f)
                horizontalLineToRelative(5.34f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(5f, 5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19f, 5f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(-3.06f, 3f)
                horizontalLineToRelative(4.59f)
                close()
            }
        }.also { _ClipboardListCheck = it}
