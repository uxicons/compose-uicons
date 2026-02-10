package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Tc.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 19.5f)
                curveToRelative(0f, 2.4f, -1.06f, 3.48f, -3.44f, 3.5f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f)
                curveToRelative(-1.17f, 0f, -2.12f, -0.37f, -2.73f, -1.08f)
                curveToRelative(-0.7f, -0.8f, -0.96f, -1.97f, -0.76f, -3.46f)
                curveToRelative(0.07f, -0.55f, 0.17f, -1.15f, 0.27f, -1.77f)
                curveToRelative(0.2f, -1.28f, 0.43f, -2.73f, 0.54f, -4.21f)
                curveToRelative(0.12f, -1.58f, 0.18f, -3.26f, 0.18f, -4.99f)
                curveToRelative(0.01f, -1.52f, -0.07f, -4.2f, -0.1f, -5.16f)
                curveToRelative(-4.1f, -0.33f, -7.99f, -0.34f, -8.05f, -0.34f)
                curveToRelative(-0.34f, 0f, -0.66f, 0.01f, -0.96f, 0.03f)
                curveToRelative(0.05f, 0.84f, 0.12f, 2.56f, 0.12f, 4.72f)
                curveToRelative(-0.01f, 1.84f, -0.07f, 3.62f, -0.2f, 5.31f)
                curveToRelative(-0.41f, 5.61f, -1.38f, 10.49f, -1.39f, 10.54f)
                curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f)
                curveToRelative(-0.27f, -0.05f, -0.45f, -0.32f, -0.39f, -0.59f)
                curveToRelative(0.01f, -0.05f, 0.97f, -4.87f, 1.37f, -10.41f)
                curveToRelative(0.12f, -1.66f, 0.19f, -3.42f, 0.19f, -5.24f)
                curveToRelative(0.01f, -2.1f, -0.06f, -3.77f, -0.11f, -4.62f)
                curveToRelative(-3.4f, 0.48f, -4.82f, 2.39f, -4.89f, 6.38f)
                curveToRelative(-0.01f, 0.27f, -0.23f, 0.49f, -0.5f, 0.49f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.28f, -0.01f, -0.5f, -0.23f, -0.49f, -0.51f)
                curveToRelative(0.1f, -5.25f, 2.44f, -7.49f, 7.85f, -7.49f)
                curveToRelative(0.34f, 0f, 8.51f, 0.01f, 13.75f, 1.06f)
                curveToRelative(0.27f, 0.05f, 0.45f, 0.32f, 0.39f, 0.59f)
                reflectiveCurveToRelative(-0.32f, 0.45f, -0.59f, 0.39f)
                curveToRelative(-1.35f, -0.27f, -2.92f, -0.47f, -4.5f, -0.62f)
                curveToRelative(0.03f, 1.05f, 0.11f, 3.6f, 0.1f, 5.08f)
                curveToRelative(-0.01f, 1.75f, -0.07f, 3.45f, -0.19f, 5.06f)
                curveToRelative(-0.11f, 1.53f, -0.35f, 3.0f, -0.55f, 4.29f)
                curveToRelative(-0.1f, 0.62f, -0.19f, 1.2f, -0.27f, 1.75f)
                curveToRelative(-0.16f, 1.17f, 0.02f, 2.09f, 0.52f, 2.66f)
                curveToRelative(0.42f, 0.48f, 1.07f, 0.73f, 1.93f, 0.74f)
                curveToRelative(1.88f, 0.01f, 2.57f, -0.6f, 2.56f, -2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Pi = it}
