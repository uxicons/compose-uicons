package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Sr.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 512f)
                curveToRelative(141.38f, 0f, 256f, -114.61f, 256f, -256f)
                reflectiveCurveTo(397.39f, 0f, 256f, 0f)
                reflectiveCurveTo(0f, 114.61f, 0f, 256f)
                curveTo(0.15f, 397.32f, 114.68f, 511.85f, 256f, 512f)
                close()
                moveTo(469.33f, 256f)
                curveToRelative(0.1f, 117.73f, -95.26f, 213.24f, -212.98f, 213.34f)
                curveToRelative(-49.31f, 0.04f, -97.12f, -17.02f, -135.26f, -48.27f)
                lineToRelative(299.99f, -299.99f)
                curveTo(452.32f, 159.11f, 469.37f, 206.79f, 469.33f, 256f)
                close()
                moveTo(256f, 42.67f)
                curveToRelative(49.21f, -0.04f, 96.89f, 17.02f, 134.91f, 48.26f)
                lineTo(90.92f, 390.91f)
                curveToRelative(-74.6f, -91.07f, -61.26f, -225.38f, 29.81f, -299.98f)
                curveTo(158.88f, 59.68f, 206.69f, 42.63f, 256f, 42.67f)
                close()
            }
        }.also { _Ban = it}
