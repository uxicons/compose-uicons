package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copyright: ImageVector? = null

val Icons.Sr.Copyright: ImageVector
    get() = _Copyright ?: UXIcon(name = "Copyright", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 512f)
                curveToRelative(141.38f, 0f, 256f, -114.61f, 256f, -256f)
                reflectiveCurveTo(397.39f, 0f, 256f, 0f)
                reflectiveCurveTo(0f, 114.61f, 0f, 256f)
                curveTo(0.15f, 397.32f, 114.68f, 511.85f, 256f, 512f)
                close()
                moveTo(150.4f, 150.4f)
                curveToRelative(58.36f, -58.22f, 152.84f, -58.22f, 211.2f, 0f)
                curveToRelative(8.19f, 8.48f, 7.95f, 21.98f, -0.52f, 30.17f)
                curveToRelative(-8.27f, 7.99f, -21.37f, 7.99f, -29.64f, 0f)
                curveToRelative(-41.66f, -41.65f, -109.2f, -41.64f, -150.85f, 0.02f)
                reflectiveCurveToRelative(-41.64f, 109.2f, 0.02f, 150.85f)
                curveToRelative(41.65f, 41.64f, 109.18f, 41.64f, 150.83f, 0f)
                curveToRelative(8.48f, -8.19f, 21.98f, -7.95f, 30.17f, 0.52f)
                curveToRelative(7.98f, 8.27f, 7.98f, 21.37f, 0f, 29.64f)
                curveToRelative(-58.32f, 58.32f, -152.88f, 58.32f, -211.2f, 0f)
                curveTo(92.08f, 303.28f, 92.08f, 208.72f, 150.4f, 150.4f)
                lineTo(150.4f, 150.4f)
                close()
            }
        }.also { _Copyright = it}
