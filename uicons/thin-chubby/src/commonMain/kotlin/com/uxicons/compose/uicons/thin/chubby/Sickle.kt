package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Tc.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 11.04f)
                curveToRelative(0f, -7.1f, -2.9f, -9.99f, -9.99f, -9.99f)
                reflectiveCurveToRelative(-9.99f, 2.89f, -9.99f, 9.99f)
                curveToRelative(0f, 4.13f, 0.97f, 6.7f, 3.12f, 8.23f)
                curveToRelative(-1.48f, 1.15f, -3.12f, 2.09f, -4.82f, 2.77f)
                curveToRelative(-0.26f, 0.1f, -0.38f, 0.39f, -0.28f, 0.65f)
                curveToRelative(0.1f, 0.26f, 0.4f, 0.38f, 0.65f, 0.28f)
                curveToRelative(2.65f, -1.05f, 5.13f, -2.71f, 7.19f, -4.8f)
                curveToRelative(0.16f, -0.17f, 0.19f, -0.42f, 0.06f, -0.62f)
                curveToRelative(-0.01f, -0.01f, -0.93f, -1.47f, -0.93f, -3.45f)
                curveToRelative(0f, -5.17f, 1.92f, -7.1f, 7.1f, -7.1f)
                curveToRelative(4.27f, 0f, 6.39f, 1.72f, 6.9f, 5.56f)
                curveToRelative(0.03f, 0.25f, 0.27f, 0.44f, 0.51f, 0.44f)
                curveToRelative(0.26f, -0.01f, 0.47f, -0.2f, 0.48f, -0.46f)
                curveToRelative(0.03f, -0.35f, -0.01f, -1.28f, -0.01f, -1.5f)
                close()
                moveTo(15.11f, 6f)
                curveToRelative(-5.67f, 0f, -8.1f, 2.42f, -8.1f, 8.1f)
                curveToRelative(0f, 1.69f, 0.57f, 3.02f, 0.88f, 3.63f)
                curveToRelative(-0.31f, 0.3f, -0.63f, 0.6f, -0.96f, 0.88f)
                curveToRelative(-2.03f, -1.31f, -2.93f, -3.65f, -2.93f, -7.57f)
                curveToRelative(0f, -6.47f, 2.52f, -8.99f, 8.99f, -8.99f)
                curveToRelative(5.75f, 0f, 8.38f, 1.99f, 8.89f, 6.97f)
                curveToRelative(-1.25f, -2.04f, -3.47f, -3.02f, -6.79f, -3.02f)
                close()
            }
        }.also { _Sickle = it}
