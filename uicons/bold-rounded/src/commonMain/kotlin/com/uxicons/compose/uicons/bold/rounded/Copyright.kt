package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copyright: ImageVector? = null

val Icons.Br.Copyright: ImageVector
    get() = _Copyright ?: UXIcon(name = "Copyright", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 0f)
            curveTo(114.61f, 0f, 0f, 114.61f, 0f, 256f)
            reflectiveCurveToRelative(114.61f, 256f, 256f, 256f)
            reflectiveCurveToRelative(256f, -114.61f, 256f, -256f)
            curveTo(511.85f, 114.68f, 397.32f, 0.15f, 256f, 0f)
            close()
            moveTo(256f, 448f)
            curveToRelative(-106.04f, 0f, -192f, -85.96f, -192f, -192f)
            reflectiveCurveTo(149.96f, 64f, 256f, 64f)
            reflectiveCurveToRelative(192f, 85.96f, 192f, 192f)
            curveTo(447.87f, 361.98f, 361.98f, 447.87f, 256f, 448f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(311.47f, 199.1f)
            curveToRelative(12.5f, 12.49f, 32.76f, 12.49f, 45.26f, -0.01f)
            curveToRelative(12.49f, -12.5f, 12.49f, -32.76f, -0.01f, -45.26f)
            curveToRelative(-56.42f, -56.36f, -147.86f, -56.31f, -204.22f, 0.11f)
            reflectiveCurveToRelative(-56.31f, 147.86f, 0.11f, 204.22f)
            curveToRelative(56.38f, 56.32f, 147.73f, 56.32f, 204.11f, 0f)
            curveToRelative(12.5f, -12.49f, 12.51f, -32.76f, 0.01f, -45.26f)
            curveToRelative(-12.49f, -12.5f, -32.76f, -12.51f, -45.26f, -0.01f)
            lineToRelative(0f, 0f)
            curveToRelative(-31.42f, 31.43f, -82.37f, 31.43f, -113.8f, 0.01f)
            reflectiveCurveToRelative(-31.43f, -82.37f, -0.01f, -113.8f)
            reflectiveCurveToRelative(82.37f, -31.43f, 113.8f, -0.01f)
            curveTo(311.46f, 199.1f, 311.46f, 199.1f, 311.47f, 199.1f)
            close()
        }
    }.also { _Copyright = it }
