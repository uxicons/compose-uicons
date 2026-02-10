package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonCheck: ImageVector? = null

val Icons.Sc.OctagonCheck: ImageVector
    get() = _OctagonCheck ?: UXIcon(name = "OctagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.47f, 7.76f)
                curveToRelative(-0.04f, -0.18f, -0.14f, -0.34f, -0.26f, -0.47f)
                lineToRelative(-5.5f, -5.5f)
                curveToRelative(-0.13f, -0.13f, -0.29f, -0.22f, -0.47f, -0.26f)
                curveToRelative(-0.09f, -0.02f, -2.14f, -0.53f, -4.24f, -0.53f)
                reflectiveCurveToRelative(-4.16f, 0.51f, -4.24f, 0.53f)
                curveToRelative(-0.18f, 0.04f, -0.34f, 0.14f, -0.47f, 0.26f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-0.13f, 0.13f, -0.22f, 0.29f, -0.26f, 0.47f)
                curveToRelative(-0.02f, 0.09f, -0.53f, 2.14f, -0.53f, 4.24f)
                reflectiveCurveToRelative(0.51f, 4.16f, 0.53f, 4.24f)
                curveToRelative(0.04f, 0.18f, 0.14f, 0.34f, 0.26f, 0.47f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.13f, 0.13f, 0.29f, 0.22f, 0.47f, 0.26f)
                curveToRelative(0.09f, 0.02f, 2.14f, 0.53f, 4.24f, 0.53f)
                reflectiveCurveToRelative(4.16f, -0.51f, 4.24f, -0.53f)
                curveToRelative(0.18f, -0.04f, 0.34f, -0.14f, 0.47f, -0.26f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.13f, -0.13f, 0.22f, -0.29f, 0.26f, -0.47f)
                curveToRelative(0.02f, -0.09f, 0.53f, -2.14f, 0.53f, -4.24f)
                reflectiveCurveToRelative(-0.51f, -4.16f, -0.53f, -4.24f)
                close()
                moveTo(17.3f, 9.54f)
                curveToRelative(-1.31f, 2.05f, -3.18f, 4.63f, -6.0f, 6.32f)
                curveToRelative(-0.32f, 0.19f, -0.73f, 0.19f, -1.05f, -0.01f)
                curveToRelative(-1.52f, -0.96f, -2.66f, -1.99f, -3.6f, -3.25f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.21f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.21f)
                curveToRelative(0.67f, 0.9f, 1.49f, 1.68f, 2.54f, 2.4f)
                curveToRelative(2.16f, -1.46f, 3.65f, -3.51f, 4.82f, -5.35f)
                curveToRelative(0.3f, -0.47f, 0.92f, -0.6f, 1.38f, -0.3f)
                curveToRelative(0.47f, 0.3f, 0.6f, 0.92f, 0.3f, 1.38f)
                close()
            }
        }.also { _OctagonCheck = it}
