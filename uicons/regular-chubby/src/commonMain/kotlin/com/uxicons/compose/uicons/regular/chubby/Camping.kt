package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Rc.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.97f, 18.72f)
                curveTo(20.56f, 8.86f, 12.92f, 3.12f, 12.6f, 2.88f)
                curveToRelative(-0.35f, -0.26f, -0.84f, -0.26f, -1.19f, 0f)
                curveToRelative(-0.32f, 0.24f, -7.96f, 5.98f, -10.38f, 15.83f)
                curveToRelative(-0.13f, 0.53f, 0.18f, 1.06f, 0.71f, 1.2f)
                curveToRelative(3.36f, 0.93f, 6.81f, 1.39f, 10.27f, 1.39f)
                reflectiveCurveToRelative(6.91f, -0.46f, 10.27f, -1.39f)
                curveToRelative(0.52f, -0.14f, 0.83f, -0.68f, 0.71f, -1.2f)
                close()
                moveTo(9.26f, 19.21f)
                curveToRelative(0.7f, -1.98f, 1.99f, -3.43f, 2.74f, -4.14f)
                curveToRelative(0.76f, 0.72f, 2.04f, 2.15f, 2.74f, 4.14f)
                curveToRelative(-1.82f, 0.14f, -3.66f, 0.14f, -5.48f, 0f)
                close()
                moveTo(16.78f, 19.0f)
                curveToRelative(-1.14f, -3.77f, -4.05f, -5.96f, -4.18f, -6.06f)
                curveToRelative(-0.35f, -0.26f, -0.84f, -0.26f, -1.19f, 0f)
                curveToRelative(-0.13f, 0.1f, -3.04f, 2.29f, -4.18f, 6.06f)
                curveToRelative(-1.34f, -0.18f, -2.68f, -0.43f, -4.0f, -0.75f)
                curveToRelative(2.06f, -7.07f, 7.05f, -11.8f, 8.78f, -13.27f)
                curveToRelative(1.72f, 1.46f, 6.72f, 6.18f, 8.77f, 13.27f)
                curveToRelative(-1.32f, 0.33f, -2.66f, 0.58f, -4.0f, 0.75f)
                close()
            }
        }.also { _Camping = it}
