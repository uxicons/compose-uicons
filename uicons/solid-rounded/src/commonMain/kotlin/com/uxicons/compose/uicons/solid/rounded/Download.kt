package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Download: ImageVector? = null

val Icons.Sr.Download: ImageVector
    get() = _Download ?: UXIcon(name = "Download", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(210.73f, 386.6f)
                curveToRelative(24.99f, 25f, 65.51f, 25.01f, 90.51f, 0.03f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
                lineToRelative(68.5f, -68.5f)
                curveToRelative(7.9f, -8.74f, 7.22f, -22.23f, -1.52f, -30.13f)
                curveToRelative(-8.14f, -7.36f, -20.53f, -7.34f, -28.65f, 0.03f)
                lineToRelative(-62.42f, 62.44f)
                lineToRelative(0.15f, -329.11f)
                curveTo(277.33f, 9.55f, 267.78f, 0f, 256f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                lineToRelative(-0.19f, 328.7f)
                lineTo(172.4f, 288f)
                curveToRelative(-8.34f, -8.33f, -21.85f, -8.32f, -30.18f, 0.01f)
                curveToRelative(-8.33f, 8.34f, -8.32f, 21.85f, 0.01f, 30.18f)
                lineTo(210.73f, 386.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(490.67f, 341.33f)
                lineTo(490.67f, 341.33f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineTo(448f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                horizontalLineTo(64f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineToRelative(-85.33f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                lineToRelative(0f, 0f)
                curveTo(9.55f, 341.33f, 0f, 350.89f, 0f, 362.67f)
                verticalLineTo(448f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(384f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-85.33f)
                curveTo(512f, 350.89f, 502.45f, 341.33f, 490.67f, 341.33f)
                close()
            }
        }.also { _Download = it}
