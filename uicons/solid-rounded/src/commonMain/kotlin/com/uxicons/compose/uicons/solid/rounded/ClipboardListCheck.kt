package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardListCheck: ImageVector? = null

val Icons.Sr.ClipboardListCheck: ImageVector
    get() = _ClipboardListCheck ?: UXIcon(name = "ClipboardListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 17f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
                moveTo(7.67f, 12f)
                curveToRelative(-0.45f, 0f, -0.86f, -0.17f, -1.18f, -0.49f)
                lineToRelative(-1.01f, -0.95f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.04f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.04f)
                lineToRelative(0.81f, 0.77f)
                lineToRelative(1.64f, -1.59f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.38f, 1.41f, 0.02f)
                curveToRelative(0.38f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                lineToRelative(-1.86f, 1.8f)
                curveToRelative(-0.3f, 0.3f, -0.72f, 0.48f, -1.17f, 0.48f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
            }
        }.also { _ClipboardListCheck = it}
