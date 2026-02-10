package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowRestore: ImageVector? = null

val Icons.Sr.WindowRestore: ImageVector
    get() = _WindowRestore ?: UXIcon(name = "WindowRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(0f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineTo(13f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(0f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineTo(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                horizontalLineTo(0f)
                close()
                moveTo(19f, 0f)
                horizontalLineTo(11f)
                curveToRelative(-1.8f, 0f, -3.38f, 0.96f, -4.26f, 2.39f)
                curveToRelative(-0.43f, 0.7f, 0.08f, 1.61f, 0.91f, 1.61f)
                horizontalLineToRelative(5.35f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                verticalLineToRelative(6.9f)
                curveToRelative(2.28f, -0.46f, 4f, -2.48f, 4f, -4.9f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _WindowRestore = it}
