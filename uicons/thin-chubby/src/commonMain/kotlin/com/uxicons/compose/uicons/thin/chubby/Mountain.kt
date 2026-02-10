package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountain: ImageVector? = null

val Icons.Tc.Mountain: ImageVector
    get() = _Mountain ?: UXIcon(name = "Mountain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 21.31f)
                curveToRelative(-0.32f, -1.49f, -1.39f, -5.52f, -4.25f, -10.84f)
                curveToRelative(-3.41f, -6.34f, -6.09f, -9.04f, -6.39f, -9.33f)
                curveToRelative(-0.19f, -0.19f, -0.5f, -0.19f, -0.7f, 0f)
                curveToRelative(-0.29f, 0.29f, -2.98f, 2.99f, -6.39f, 9.33f)
                curveToRelative(-2.86f, 5.32f, -3.92f, 9.35f, -4.25f, 10.84f)
                curveToRelative(-0.06f, 0.27f, 0.12f, 0.55f, 0.39f, 0.6f)
                curveToRelative(1.72f, 0.33f, 6.2f, 1.1f, 10.59f, 1.1f)
                reflectiveCurveToRelative(8.87f, -0.77f, 10.59f, -1.1f)
                curveToRelative(0.27f, -0.05f, 0.46f, -0.33f, 0.39f, -0.6f)
                close()
                moveTo(12f, 2.23f)
                curveToRelative(0.78f, 0.86f, 2.8f, 3.27f, 5.27f, 7.66f)
                curveToRelative(-0.56f, 1.63f, -1.67f, 3.12f, -2.26f, 3.83f)
                curveToRelative(-0.62f, -0.8f, -1.12f, -1.57f, -1.57f, -2.45f)
                curveToRelative(-0.18f, -0.38f, -0.74f, -0.35f, -0.9f, 0.02f)
                curveToRelative(-0.57f, 1.24f, -1.15f, 2.32f, -2.07f, 3.46f)
                curveToRelative(-0.75f, -0.81f, -2.47f, -2.78f, -3.65f, -5.03f)
                curveToRelative(2.42f, -4.28f, 4.4f, -6.65f, 5.17f, -7.5f)
                close()
                moveTo(12f, 22.0f)
                curveToRelative(-3.93f, 0f, -7.93f, -0.63f, -9.89f, -0.98f)
                curveToRelative(0.42f, -1.73f, 1.51f, -5.38f, 4.04f, -10.07f)
                curveToRelative(0.04f, -0.07f, 0.07f, -0.12f, 0.11f, -0.19f)
                curveToRelative(1.6f, 2.81f, 3.8f, 5.0f, 3.9f, 5.1f)
                curveToRelative(0.2f, 0.2f, 0.55f, 0.19f, 0.73f, -0.03f)
                curveToRelative(0.96f, -1.1f, 1.6f, -2.12f, 2.15f, -3.23f)
                curveToRelative(0.45f, 0.77f, 0.96f, 1.48f, 1.58f, 2.23f)
                curveToRelative(0.18f, 0.23f, 0.55f, 0.23f, 0.75f, 0.02f)
                curveToRelative(0.07f, -0.08f, 1.6f, -1.73f, 2.53f, -3.83f)
                curveToRelative(2.5f, 4.65f, 3.58f, 8.28f, 4f, 10f)
                curveToRelative(-1.96f, 0.36f, -5.96f, 0.98f, -9.89f, 0.98f)
                close()
            }
        }.also { _Mountain = it}
