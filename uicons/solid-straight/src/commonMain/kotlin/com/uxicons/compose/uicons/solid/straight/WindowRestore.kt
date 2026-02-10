package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowRestore: ImageVector? = null

val Icons.Ss.WindowRestore: ImageVector
    get() = _WindowRestore ?: UXIcon(name = "WindowRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                lineTo(0f, 13f)
                lineTo(18f, 13f)
                close()
                moveTo(18f, 11f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(18f, 11f)
                close()
                moveTo(21f, 0f)
                lineTo(9f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1f)
                lineTo(15f, 4f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _WindowRestore = it}
