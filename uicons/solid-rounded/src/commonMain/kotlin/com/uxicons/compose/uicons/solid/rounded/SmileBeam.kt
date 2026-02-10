package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Sr.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 0.82f)
                curveTo(114.68f, 0.98f, 0.15f, 115.5f, 0f, 256.82f)
                curveToRelative(12.8f, 339.2f, 499.2f, 339.07f, 512f, 0f)
                curveTo(511.85f, 115.5f, 397.32f, 0.98f, 256f, 0.82f)
                close()
                moveTo(106.67f, 240.42f)
                curveToRelative(5.29f, -112.75f, 122.73f, -112.68f, 128f, 0f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                curveToRelative(0f, -22.49f, -14.51f, -42.67f, -21.33f, -42.67f)
                curveToRelative(-6.83f, 0f, -21.33f, 20.18f, -21.33f, 42.67f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                reflectiveCurveTo(106.67f, 252.2f, 106.67f, 240.42f)
                close()
                moveTo(376.88f, 341.67f)
                curveToRelative(-68.35f, 62.78f, -173.4f, 62.78f, -241.75f, 0f)
                curveToRelative(-8.79f, -7.85f, -9.55f, -21.33f, -1.71f, -30.12f)
                reflectiveCurveToRelative(21.33f, -9.55f, 30.12f, -1.71f)
                curveToRelative(52.1f, 48.54f, 132.86f, 48.54f, 184.96f, 0f)
                curveToRelative(8.97f, -7.64f, 22.44f, -6.55f, 30.07f, 2.42f)
                curveToRelative(7.39f, 8.69f, 6.64f, 21.65f, -1.7f, 29.43f)
                verticalLineTo(341.67f)
                close()
                moveTo(384f, 261.75f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                curveToRelative(0f, -22.49f, -14.51f, -42.67f, -21.33f, -42.67f)
                reflectiveCurveTo(320f, 217.93f, 320f, 240.42f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                curveToRelative(0f, -40.36f, 26.28f, -85.33f, 64f, -85.33f)
                reflectiveCurveToRelative(64f, 44.97f, 64f, 85.33f)
                curveTo(405.33f, 252.2f, 395.78f, 261.75f, 384f, 261.75f)
                close()
            }
        }.also { _SmileBeam = it}
