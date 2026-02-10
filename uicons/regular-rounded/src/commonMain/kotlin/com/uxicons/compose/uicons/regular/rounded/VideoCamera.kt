package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Rr.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(488.53f, 191.04f)
                curveToRelative(-14.41f, -7.3f, -31.72f, -5.78f, -44.63f, 3.92f)
                lineTo(404.8f, 224f)
                curveToRelative(-5.54f, -54.47f, -51.38f, -95.93f, -106.13f, -96f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-87.94f, -87.92f)
                curveToRelative(-11.97f, -12.05f, -28.26f, -18.81f, -45.25f, -18.75f)
                horizontalLineTo(21.33f)
                curveTo(9.55f, 21.33f, 0f, 30.89f, 0f, 42.67f)
                reflectiveCurveTo(9.55f, 64f, 21.33f, 64f)
                horizontalLineToRelative(142.34f)
                curveToRelative(5.66f, 0.01f, 11.07f, 2.26f, 15.08f, 6.25f)
                lineTo(236.5f, 128f)
                horizontalLineTo(106.67f)
                curveTo(47.79f, 128.07f, 0.07f, 175.79f, 0f, 234.67f)
                verticalLineToRelative(170.67f)
                curveTo(0.07f, 464.21f, 47.79f, 511.93f, 106.67f, 512f)
                horizontalLineToRelative(192f)
                curveToRelative(54.75f, -0.07f, 100.59f, -41.53f, 106.13f, -96f)
                lineToRelative(39.04f, 29.1f)
                curveToRelative(18.85f, 14.14f, 45.6f, 10.32f, 59.73f, -8.53f)
                curveToRelative(5.54f, -7.39f, 8.53f, -16.37f, 8.53f, -25.6f)
                verticalLineTo(229.18f)
                curveTo(512.16f, 213.01f, 503.02f, 198.22f, 488.53f, 191.04f)
                close()
                moveTo(362.67f, 405.33f)
                curveToRelative(0f, 35.35f, -28.65f, 64f, -64f, 64f)
                horizontalLineToRelative(-192f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                verticalLineTo(234.67f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                horizontalLineToRelative(192f)
                curveToRelative(35.35f, 0f, 64f, 28.65f, 64f, 64f)
                verticalLineTo(405.33f)
                close()
                moveTo(469.33f, 410.82f)
                lineToRelative(-64f, -47.7f)
                verticalLineToRelative(-86.23f)
                lineToRelative(64f, -47.7f)
                verticalLineTo(410.82f)
                close()
            }
        }.also { _VideoCamera = it}
