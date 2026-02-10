package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAi: ImageVector? = null

val Icons.Br.FileAi: ImageVector
    get() = _FileAi ?: UXIcon(name = "FileAi", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(130.96f, 129.77f)
            lineToRelative(29.08f, 0f)
            lineToRelative(-14.49f, -38.36f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(416f, 0f)
            horizontalLineTo(96f)
            curveTo(43.01f, 0.06f, 0.06f, 43.01f, 0f, 96f)
            verticalLineToRelative(320f)
            curveToRelative(0.06f, 52.99f, 43.01f, 95.94f, 96f, 96f)
            horizontalLineToRelative(255.66f)
            curveToRelative(25.48f, 0.08f, 49.92f, -10.05f, 67.88f, -28.12f)
            lineToRelative(64.34f, -64.32f)
            curveToRelative(18.06f, -17.97f, 28.18f, -42.41f, 28.12f, -67.88f)
            verticalLineTo(96f)
            curveTo(511.94f, 43.01f, 468.99f, 0.06f, 416f, 0f)
            close()
            moveTo(202.22f, 165.95f)
            curveToRelative(2.6f, 6.89f, -0.87f, 14.59f, -7.76f, 17.19f)
            curveToRelative(-6.89f, 2.6f, -14.59f, -0.87f, -17.19f, -7.76f)
            lineToRelative(-7.15f, -18.94f)
            horizontalLineToRelative(-49.3f)
            lineToRelative(-7.23f, 18.97f)
            curveToRelative(-2.8f, 6.81f, -10.59f, 10.06f, -17.4f, 7.26f)
            curveToRelative(-6.55f, -2.69f, -9.85f, -10.04f, -7.51f, -16.73f)
            lineToRelative(42.13f, -110.66f)
            curveToRelative(2.38f, -6.12f, 8.26f, -10.16f, 14.83f, -10.18f)
            lineToRelative(0f, 0f)
            curveToRelative(6.43f, 0f, 12.23f, 3.9f, 14.66f, 9.86f)
            lineTo(202.22f, 165.95f)
            close()
            moveTo(226.28f, 58.43f)
            curveToRelative(0f, -7.36f, 5.97f, -13.33f, 13.33f, -13.33f)
            curveToRelative(7.36f, 0f, 13.33f, 5.97f, 13.33f, 13.33f)
            verticalLineToRelative(112.24f)
            curveToRelative(0f, 7.36f, -5.97f, 13.33f, -13.33f, 13.33f)
            curveToRelative(-7.36f, 0f, -13.33f, -5.97f, -13.33f, -13.33f)
            verticalLineTo(58.43f)
            close()
            moveTo(362.67f, 320f)
            curveTo(339.1f, 320f, 320f, 339.1f, 320f, 362.67f)
            verticalLineTo(448f)
            horizontalLineTo(96f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            verticalLineTo(234.67f)
            horizontalLineToRelative(384f)
            verticalLineTo(320f)
            horizontalLineTo(362.67f)
            close()
        }
    }.also { _FileAi = it }
