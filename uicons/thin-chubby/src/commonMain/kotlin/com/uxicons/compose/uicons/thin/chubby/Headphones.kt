package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headphones: ImageVector? = null

val Icons.Tc.Headphones: ImageVector
    get() = _Headphones ?: UXIcon(name = "Headphones") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.61f, 12.5f)
                curveToRelative(-0.03f, -7.51f, -2.61f, -10.72f, -8.61f, -10.72f)
                curveTo(6.08f, 1.78f, 3.42f, 5.09f, 3.39f, 12.5f)
                curveToRelative(-1.38f, 0.67f, -2.39f, 1.99f, -2.39f, 4.53f)
                curveToRelative(0f, 4.6f, 3.28f, 5.19f, 6.14f, 5.19f)
                curveToRelative(0.22f, 0f, 0.41f, -0.14f, 0.47f, -0.34f)
                curveToRelative(1.03f, -3.12f, 1.03f, -6.57f, 0f, -9.69f)
                curveToRelative(-0.07f, -0.2f, -0.26f, -0.34f, -0.47f, -0.34f)
                curveToRelative(-0.91f, 0f, -1.87f, 0.06f, -2.75f, 0.29f)
                curveToRelative(0.14f, -8.21f, 3.73f, -9.35f, 7.61f, -9.35f)
                reflectiveCurveToRelative(7.47f, 1.15f, 7.61f, 9.35f)
                curveToRelative(-0.88f, -0.23f, -1.84f, -0.29f, -2.75f, -0.29f)
                curveToRelative(-0.22f, 0f, -0.41f, 0.14f, -0.47f, 0.34f)
                curveToRelative(-1.03f, 3.13f, -1.03f, 6.57f, 0f, 9.69f)
                curveToRelative(0.07f, 0.2f, 0.26f, 0.34f, 0.47f, 0.34f)
                curveToRelative(2.86f, 0f, 6.14f, -0.59f, 6.14f, -5.19f)
                curveToRelative(0f, -2.55f, -1.01f, -3.86f, -2.39f, -4.53f)
                close()
                moveTo(6.78f, 21.22f)
                curveToRelative(-3.43f, -0.08f, -4.78f, -1.27f, -4.78f, -4.19f)
                reflectiveCurveToRelative(1.35f, -4.11f, 4.78f, -4.19f)
                curveToRelative(0.82f, 2.71f, 0.82f, 5.66f, 0f, 8.37f)
                close()
                moveTo(17.22f, 21.22f)
                curveToRelative(-0.82f, -2.71f, -0.82f, -5.66f, 0f, -8.37f)
                curveToRelative(3.43f, 0.08f, 4.78f, 1.27f, 4.78f, 4.19f)
                reflectiveCurveToRelative(-1.35f, 4.11f, -4.78f, 4.19f)
                close()
            }
        }.also { _Headphones = it}
