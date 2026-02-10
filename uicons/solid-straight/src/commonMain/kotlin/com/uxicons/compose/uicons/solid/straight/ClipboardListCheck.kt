package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardListCheck: ImageVector? = null

val Icons.Ss.ClipboardListCheck: ImageVector
    get() = _ClipboardListCheck ?: UXIcon(name = "ClipboardListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.67f, 12f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.45f, -1.39f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.19f)
                lineToRelative(2.53f, -2.48f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                close()
                moveTo(18f, 17f)
                lineTo(10f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ClipboardListCheck = it}
