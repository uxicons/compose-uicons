package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Sc.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.97f, 18.72f)
                curveTo(20.56f, 8.86f, 12.92f, 3.12f, 12.6f, 2.89f)
                curveToRelative(-0.35f, -0.26f, -0.84f, -0.26f, -1.19f, 0f)
                curveToRelative(-0.32f, 0.24f, -7.96f, 5.98f, -10.38f, 15.83f)
                curveToRelative(-0.13f, 0.53f, 0.18f, 1.06f, 0.71f, 1.2f)
                curveToRelative(1.63f, 0.45f, 3.27f, 0.79f, 4.93f, 1.02f)
                curveToRelative(1.3f, -4.25f, 4.46f, -7.6f, 4.61f, -7.75f)
                curveToRelative(0.38f, -0.4f, 1.07f, -0.4f, 1.45f, 0f)
                curveToRelative(0.14f, 0.15f, 3.31f, 3.5f, 4.61f, 7.75f)
                curveToRelative(1.66f, -0.23f, 3.31f, -0.57f, 4.93f, -1.02f)
                curveToRelative(0.52f, -0.14f, 0.83f, -0.68f, 0.71f, -1.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.41f)
                curveToRelative(-0.91f, 1.13f, -2.46f, 3.29f, -3.3f, 5.75f)
                curveToRelative(1.1f, 0.09f, 2.2f, 0.14f, 3.3f, 0.14f)
                reflectiveCurveToRelative(2.2f, -0.05f, 3.3f, -0.14f)
                curveToRelative(-0.84f, -2.47f, -2.39f, -4.62f, -3.3f, -5.75f)
                close()
            }
        }.also { _Camping = it}
