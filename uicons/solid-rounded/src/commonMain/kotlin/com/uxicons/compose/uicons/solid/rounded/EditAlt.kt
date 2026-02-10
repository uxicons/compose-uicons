package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditAlt: ImageVector? = null

val Icons.Sr.EditAlt: ImageVector
    get() = _EditAlt ?: UXIcon(name = "EditAlt", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(304.66f, 287.06f)
                lineTo(499.61f, 92.12f)
                curveToRelative(16.2f, -16.17f, 18.97f, -47.97f, -9.07f, -65.34f)
                curveToRelative(-23.99f, -11.81f, -42.54f, -1.74f, -51.18f, 8.34f)
                lineTo(252.31f, 242.28f)
                curveTo(274.23f, 251.02f, 292.64f, 266.76f, 304.66f, 287.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(106.67f, 405.33f)
                horizontalLineToRelative(106.67f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.65f, -64f, -64f, -64f)
                curveTo(128f, 277.33f, 106.67f, 405.33f, 106.67f, 405.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(341.33f, 405.33f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                horizontalLineTo(512f)
                verticalLineToRelative(-201.28f)
                lineTo(319.15f, 332.91f)
                curveToRelative(0.23f, 2.84f, 0.85f, 5.55f, 0.85f, 8.43f)
                curveTo(319.93f, 400.21f, 272.21f, 447.93f, 213.33f, 448f)
                horizontalLineTo(106.67f)
                curveToRelative(-23.56f, 0f, -42.67f, -19.1f, -42.67f, -42.66f)
                curveToRelative(0f, -2.35f, 0.19f, -4.7f, 0.58f, -7.02f)
                curveToRelative(9.69f, -58.07f, 49.24f, -154.32f, 136.38f, -162.82f)
                lineTo(407.57f, 6.68f)
                curveToRelative(2.03f, -2.05f, 4.17f, -3.98f, 6.4f, -5.8f)
                curveTo(411.07f, 0.64f, 408.3f, 0f, 405.33f, 0f)
                horizontalLineTo(106.67f)
                curveTo(47.79f, 0.07f, 0.07f, 47.79f, 0f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(0.07f, 464.21f, 47.79f, 511.93f, 106.67f, 512f)
                horizontalLineToRelative(234.67f)
                verticalLineTo(405.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(405.33f, 384f)
                curveTo(393.55f, 384f, 384f, 393.55f, 384f, 405.33f)
                verticalLineTo(505.6f)
                curveToRelative(15.05f, -5.16f, 28.74f, -13.65f, 40.06f, -24.83f)
                lineToRelative(56.7f, -56.7f)
                curveToRelative(11.18f, -11.32f, 19.67f, -25.01f, 24.83f, -40.06f)
                horizontalLineTo(405.33f)
                close()
            }
        }.also { _EditAlt = it}
