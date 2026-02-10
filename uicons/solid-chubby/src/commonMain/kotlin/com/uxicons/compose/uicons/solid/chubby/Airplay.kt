package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Sc.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 22f)
                curveToRelative(-3.91f, 0f, -7.12f, -0.83f, -7.26f, -0.87f)
                curveToRelative(-0.64f, -0.15f, -0.95f, -0.95f, -0.59f, -1.5f)
                curveToRelative(1.88f, -3.0f, 4.26f, -5.44f, 7.29f, -7.47f)
                curveToRelative(0.34f, -0.23f, 0.78f, -0.23f, 1.11f, 0f)
                curveToRelative(3.03f, 2.02f, 5.41f, 4.46f, 7.29f, 7.47f)
                curveToRelative(0.36f, 0.54f, 0.04f, 1.35f, -0.59f, 1.5f)
                curveToRelative(-0.14f, 0.04f, -3.34f, 0.87f, -7.25f, 0.87f)
                close()
                moveTo(22.2f, 3.63f)
                curveToRelative(-0.1f, -0.32f, -0.35f, -0.56f, -0.68f, -0.66f)
                curveToRelative(-0.14f, -0.04f, -3.46f, -0.97f, -9.53f, -0.97f)
                reflectiveCurveToRelative(-9.39f, 0.93f, -9.53f, 0.97f)
                curveToRelative(-0.32f, 0.09f, -0.57f, 0.34f, -0.68f, 0.66f)
                curveToRelative(-0.03f, 0.1f, -0.8f, 2.53f, -0.8f, 6.37f)
                reflectiveCurveToRelative(0.77f, 6.27f, 0.8f, 6.37f)
                curveToRelative(0.1f, 0.32f, 0.35f, 0.56f, 0.68f, 0.66f)
                curveToRelative(0.04f, 0.01f, 0.34f, 0.1f, 0.88f, 0.21f)
                curveToRelative(1.88f, -2.64f, 4.17f, -4.85f, 6.98f, -6.73f)
                curveToRelative(1.01f, -0.68f, 2.32f, -0.68f, 3.33f, 0f)
                curveToRelative(2.8f, 1.87f, 5.1f, 4.09f, 6.98f, 6.73f)
                curveToRelative(0.54f, -0.11f, 0.84f, -0.2f, 0.88f, -0.21f)
                curveToRelative(0.32f, -0.09f, 0.57f, -0.34f, 0.68f, -0.66f)
                curveToRelative(0.03f, -0.1f, 0.8f, -2.53f, 0.8f, -6.37f)
                reflectiveCurveToRelative(-0.77f, -6.27f, -0.8f, -6.37f)
                close()
            }
        }.also { _Airplay = it}
