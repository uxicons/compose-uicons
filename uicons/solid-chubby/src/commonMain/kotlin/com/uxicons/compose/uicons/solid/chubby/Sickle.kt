package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Sc.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 13.08f)
                curveToRelative(-0.04f, 0.52f, -0.47f, 0.92f, -0.99f, 0.92f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.52f, 0f, -0.95f, -0.39f, -1.0f, -0.91f)
                curveToRelative(-0.33f, -3.57f, -2.13f, -5.09f, -6.0f, -5.09f)
                curveToRelative(-4.43f, 0f, -6f, 1.57f, -6f, 6f)
                curveToRelative(0f, 1.43f, 0.56f, 2.53f, 0.72f, 2.81f)
                curveToRelative(0.33f, 0.57f, 0.28f, 1.32f, -0.2f, 1.81f)
                curveToRelative(-1.83f, 1.85f, -4.01f, 3.29f, -6.47f, 4.27f)
                curveToRelative(-0.75f, 0.3f, -1.64f, -0.06f, -1.95f, -0.84f)
                curveToRelative(-0.31f, -0.77f, 0.07f, -1.64f, 0.84f, -1.95f)
                curveToRelative(1.18f, -0.47f, 2.25f, -1.06f, 3.25f, -1.75f)
                curveToRelative(-1.5f, -1.59f, -2.19f, -3.93f, -2.19f, -7.35f)
                curveToRelative(0f, -7.01f, 2.99f, -10.0f, 10f, -10.0f)
                reflectiveCurveToRelative(10f, 2.99f, 10f, 10f)
                curveToRelative(0f, 0.17f, 0.03f, 1.69f, -0.0f, 2.08f)
                close()
            }
        }.also { _Sickle = it}
