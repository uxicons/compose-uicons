package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Rc.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 10f)
                curveToRelative(0f, 3.85f, -0.77f, 6.27f, -0.8f, 6.37f)
                curveToRelative(-0.17f, 0.53f, -0.74f, 0.81f, -1.26f, 0.65f)
                curveToRelative(-0.53f, -0.17f, -0.81f, -0.73f, -0.65f, -1.26f)
                curveToRelative(0.01f, -0.02f, 0.7f, -2.25f, 0.7f, -5.76f)
                curveToRelative(0f, -2.52f, -0.36f, -4.38f, -0.56f, -5.23f)
                curveToRelative(-1.13f, -0.25f, -4.03f, -0.77f, -8.44f, -0.77f)
                reflectiveCurveToRelative(-7.3f, 0.52f, -8.44f, 0.77f)
                curveToRelative(-0.2f, 0.86f, -0.56f, 2.72f, -0.56f, 5.23f)
                curveToRelative(0f, 3.51f, 0.7f, 5.74f, 0.7f, 5.76f)
                curveToRelative(0.17f, 0.53f, -0.12f, 1.09f, -0.65f, 1.26f)
                curveToRelative(-0.53f, 0.17f, -1.09f, -0.12f, -1.26f, -0.65f)
                curveToRelative(-0.03f, -0.1f, -0.8f, -2.53f, -0.8f, -6.37f)
                reflectiveCurveToRelative(0.76f, -6.27f, 0.8f, -6.37f)
                curveToRelative(0.1f, -0.32f, 0.35f, -0.56f, 0.68f, -0.66f)
                curveToRelative(0.14f, -0.04f, 3.46f, -0.97f, 9.53f, -0.97f)
                reflectiveCurveToRelative(9.39f, 0.93f, 9.53f, 0.97f)
                curveToRelative(0.32f, 0.09f, 0.57f, 0.34f, 0.68f, 0.66f)
                curveToRelative(0.03f, 0.1f, 0.8f, 2.53f, 0.8f, 6.37f)
                close()
                moveTo(19.85f, 19.64f)
                curveToRelative(0.36f, 0.54f, 0.04f, 1.35f, -0.59f, 1.5f)
                curveToRelative(-0.14f, 0.04f, -3.34f, 0.87f, -7.25f, 0.87f)
                reflectiveCurveToRelative(-7.12f, -0.83f, -7.26f, -0.87f)
                curveToRelative(-0.64f, -0.15f, -0.95f, -0.95f, -0.59f, -1.5f)
                curveToRelative(1.88f, -3.0f, 4.26f, -5.44f, 7.29f, -7.47f)
                curveToRelative(0.34f, -0.23f, 0.78f, -0.23f, 1.11f, 0f)
                curveToRelative(3.03f, 2.02f, 5.41f, 4.46f, 7.29f, 7.47f)
                close()
                moveTo(17.35f, 19.5f)
                curveToRelative(-1.46f, -2.04f, -3.23f, -3.78f, -5.35f, -5.28f)
                curveToRelative(-2.12f, 1.5f, -3.89f, 3.24f, -5.35f, 5.28f)
                curveToRelative(1.25f, 0.23f, 3.2f, 0.51f, 5.35f, 0.51f)
                reflectiveCurveToRelative(4.1f, -0.28f, 5.35f, -0.51f)
                close()
            }
        }.also { _Airplay = it}
