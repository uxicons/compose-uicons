package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Rc.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.98f, 21.11f)
                curveToRelative(0.12f, 0.63f, -0.38f, 1.16f, -0.99f, 1.2f)
                curveToRelative(-1.07f, 0.2f, -3.59f, 0.68f, -6.49f, 0.68f)
                curveToRelative(-3.63f, 0f, -6.84f, -0.74f, -6.98f, -0.78f)
                curveToRelative(-0.39f, -0.09f, -0.69f, -0.41f, -0.76f, -0.8f)
                curveToRelative(-0.03f, -0.16f, -0.66f, -3.77f, -0.75f, -8.28f)
                curveToRelative(-0.52f, 0.24f, -1.05f, 0.47f, -1.54f, 0.74f)
                curveToRelative(-0.48f, 0.26f, -1.09f, 0.08f, -1.35f, -0.41f)
                curveToRelative(-0.26f, -0.49f, -0.08f, -1.09f, 0.41f, -1.35f)
                curveToRelative(0.8f, -0.42f, 1.63f, -0.82f, 2.48f, -1.19f)
                curveToRelative(0.09f, -4.62f, 0.72f, -8.89f, 0.75f, -9.08f)
                curveToRelative(0.08f, -0.55f, 0.58f, -0.91f, 1.14f, -0.84f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                curveToRelative(-0.01f, 0.04f, -0.56f, 3.8f, -0.71f, 7.99f)
                curveToRelative(2.42f, -0.9f, 5.0f, -1.62f, 7.79f, -2.12f)
                curveToRelative(0.55f, -0.1f, 1.06f, 0.27f, 1.16f, 0.81f)
                reflectiveCurveToRelative(-0.27f, 1.06f, -0.81f, 1.16f)
                curveToRelative(-2.95f, 0.53f, -5.67f, 1.31f, -8.17f, 2.3f)
                curveToRelative(0.02f, 3.6f, 0.43f, 6.79f, 0.63f, 8.13f)
                curveToRelative(1.09f, 0.21f, 3.4f, 0.59f, 5.87f, 0.59f)
                curveToRelative(2.71f, 0f, 5.1f, -0.45f, 6.12f, -0.65f)
                curveToRelative(0.59f, -0.18f, 1.25f, 0.13f, 1.37f, 0.76f)
                close()
            }
        }.also { _LitecoinSign = it}
