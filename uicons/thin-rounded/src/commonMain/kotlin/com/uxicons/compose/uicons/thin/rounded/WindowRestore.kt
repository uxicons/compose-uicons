package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowRestore: ImageVector? = null

val Icons.Tr.WindowRestore: ImageVector
    get() = _WindowRestore ?: UXIcon(name = "WindowRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 6f)
                lineTo(4.5f, 6f)
                curveTo(2.02f, 6f, 0f, 8.02f, 0f, 10.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                lineTo(13.5f, 24f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(18f, 10.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(13.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                lineTo(17f, 12f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(17f, 11f)
                lineTo(1f, 11f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(13.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(24f, 4.5f)
                lineTo(24f, 13.5f)
                curveToRelative(0f, 2.05f, -1.39f, 3.85f, -3.38f, 4.36f)
                curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f)
                curveToRelative(-0.22f, 0f, -0.43f, -0.15f, -0.48f, -0.38f)
                curveToRelative(-0.07f, -0.27f, 0.09f, -0.54f, 0.36f, -0.61f)
                curveToRelative(1.55f, -0.4f, 2.62f, -1.79f, 2.62f, -3.39f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(10.5f, 1f)
                curveToRelative(-1.6f, 0f, -2.99f, 1.08f, -3.39f, 2.62f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-0.27f, -0.07f, -0.43f, -0.34f, -0.36f, -0.61f)
                curveToRelative(0.51f, -1.99f, 2.3f, -3.38f, 4.36f, -3.38f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _WindowRestore = it}
