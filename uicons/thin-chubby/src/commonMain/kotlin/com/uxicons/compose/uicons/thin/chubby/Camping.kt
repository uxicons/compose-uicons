package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Tc.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.98f, 19.2f)
                curveTo(20.5f, 9.02f, 12.63f, 3.09f, 12.3f, 2.85f)
                curveToRelative(-0.18f, -0.13f, -0.42f, -0.13f, -0.6f, 0f)
                curveToRelative(-0.33f, 0.25f, -8.2f, 6.17f, -10.69f, 16.36f)
                curveToRelative(-0.06f, 0.26f, 0.09f, 0.53f, 0.35f, 0.6f)
                curveToRelative(3.48f, 0.96f, 7.06f, 1.44f, 10.63f, 1.44f)
                reflectiveCurveToRelative(7.16f, -0.48f, 10.63f, -1.44f)
                curveToRelative(0.26f, -0.07f, 0.42f, -0.34f, 0.35f, -0.6f)
                close()
                moveTo(8.39f, 20.08f)
                curveToRelative(0.79f, -2.94f, 2.84f, -4.93f, 3.61f, -5.6f)
                curveToRelative(0.77f, 0.67f, 2.81f, 2.66f, 3.61f, 5.6f)
                curveToRelative(-2.4f, 0.22f, -4.81f, 0.22f, -7.21f, 0f)
                close()
                moveTo(16.61f, 19.98f)
                curveToRelative(-1.03f, -4.07f, -4.18f, -6.44f, -4.31f, -6.54f)
                curveToRelative(-0.18f, -0.13f, -0.42f, -0.13f, -0.6f, 0f)
                curveToRelative(-0.14f, 0.1f, -3.28f, 2.47f, -4.31f, 6.54f)
                curveToRelative(-1.78f, -0.21f, -3.54f, -0.55f, -5.28f, -1.01f)
                curveTo(4.35f, 10.51f, 10.56f, 5.05f, 12f, 3.88f)
                curveToRelative(1.44f, 1.17f, 7.65f, 6.63f, 9.89f, 15.08f)
                curveToRelative(-1.74f, 0.46f, -3.51f, 0.79f, -5.28f, 1.01f)
                close()
            }
        }.also { _Camping = it}
