package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Sr.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(295.41f, 368.36f)
                lineToRelative(-69.59f, 69.59f)
                curveToRelative(-42.45f, 41.32f, -110.36f, 40.4f, -151.68f, -2.05f)
                curveToRelative(-40.52f, -41.63f, -40.53f, -107.96f, -0.02f, -149.6f)
                lineToRelative(69.59f, -69.65f)
                curveToRelative(8.33f, -8.34f, 8.32f, -21.85f, -0.01f, -30.18f)
                curveToRelative(-8.34f, -8.33f, -21.85f, -8.32f, -30.18f, 0.01f)
                lineToRelative(-69.57f, 69.65f)
                curveToRelative(-58.54f, 58.57f, -58.51f, 153.5f, 0.05f, 212.04f)
                reflectiveCurveToRelative(153.5f, 58.51f, 212.04f, -0.05f)
                lineToRelative(69.59f, -69.59f)
                curveToRelative(8.19f, -8.48f, 7.95f, -21.98f, -0.52f, -30.17f)
                curveToRelative(-8.27f, -7.99f, -21.37f, -7.99f, -29.64f, 0f)
                horizontalLineTo(295.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(468.19f, 43.97f)
                curveTo(440.15f, 15.74f, 401.97f, -0.1f, 362.18f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-39.77f, -0.11f, -77.93f, 15.69f, -105.98f, 43.88f)
                lineTo(186.5f, 113.49f)
                curveToRelative(-8.34f, 8.33f, -8.34f, 21.84f, -0.01f, 30.18f)
                curveToRelative(8.33f, 8.34f, 21.84f, 8.34f, 30.18f, 0.01f)
                lineToRelative(69.65f, -69.59f)
                curveToRelative(20.06f, -20.18f, 47.36f, -31.5f, 75.82f, -31.42f)
                lineToRelative(0f, 0f)
                curveToRelative(59.24f, 0.02f, 107.25f, 48.06f, 107.23f, 107.3f)
                curveToRelative(-0.01f, 28.43f, -11.31f, 55.7f, -31.41f, 75.81f)
                lineToRelative(-69.59f, 69.59f)
                curveToRelative(-8.34f, 8.34f, -8.34f, 21.85f, 0f, 30.19f)
                curveToRelative(8.34f, 8.34f, 21.85f, 8.34f, 30.19f, 0f)
                lineToRelative(0f, 0f)
                lineToRelative(69.59f, -69.55f)
                curveTo(526.6f, 197.42f, 526.62f, 102.57f, 468.19f, 43.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(304.96f, 176.92f)
                lineToRelative(-128f, 128f)
                curveToRelative(-8.48f, 8.19f, -8.71f, 21.69f, -0.52f, 30.17f)
                reflectiveCurveToRelative(21.69f, 8.71f, 30.17f, 0.52f)
                curveToRelative(0.18f, -0.17f, 0.35f, -0.35f, 0.52f, -0.52f)
                lineToRelative(128f, -128f)
                curveToRelative(8.19f, -8.48f, 7.95f, -21.98f, -0.52f, -30.17f)
                curveTo(326.34f, 168.93f, 313.23f, 168.93f, 304.96f, 176.92f)
                lineTo(304.96f, 176.92f)
                close()
            }
        }.also { _Link = it}
