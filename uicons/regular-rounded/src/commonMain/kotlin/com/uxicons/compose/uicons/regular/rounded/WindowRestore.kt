package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowRestore: ImageVector? = null

val Icons.Rr.WindowRestore: ImageVector
    get() = _WindowRestore ?: UXIcon(name = "WindowRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                lineTo(5f, 6f)
                curveTo(2.24f, 6f, 0f, 8.24f, 0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(13f, 24f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(18f, 11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 8f)
                lineTo(13f, 8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(2f, 11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(13f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 13.54f)
                curveToRelative(0f, 1.78f, -0.96f, 3.44f, -2.5f, 4.33f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.18f, -0.87f, -0.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.36f, -1.37f)
                curveToRelative(0.93f, -0.54f, 1.5f, -1.53f, 1.5f, -2.6f)
                lineTo(21.99f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(10.46f, 2f)
                curveToRelative(-1.07f, 0f, -2.06f, 0.58f, -2.6f, 1.5f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.36f)
                curveToRelative(-0.48f, -0.28f, -0.64f, -0.89f, -0.36f, -1.37f)
                curveToRelative(0.89f, -1.54f, 2.55f, -2.5f, 4.33f, -2.5f)
                horizontalLineToRelative(8.54f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _WindowRestore = it}
