package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Rc.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23.01f)
                curveToRelative(-5.58f, 0f, -9.13f, -1.0f, -9.27f, -1.04f)
                curveToRelative(-0.32f, -0.09f, -0.57f, -0.33f, -0.67f, -0.64f)
                reflectiveCurveToRelative(-0.05f, -0.66f, 0.15f, -0.92f)
                curveToRelative(2.78f, -3.69f, 5.67f, -6.45f, 8.8f, -8.4f)
                curveToRelative(-3.12f, -1.95f, -6.02f, -4.71f, -8.8f, -8.4f)
                curveToRelative(-0.2f, -0.26f, -0.25f, -0.61f, -0.15f, -0.92f)
                reflectiveCurveToRelative(0.36f, -0.55f, 0.67f, -0.64f)
                curveToRelative(0.15f, -0.04f, 3.7f, -1.04f, 9.27f, -1.04f)
                reflectiveCurveToRelative(9.13f, 1.0f, 9.27f, 1.04f)
                curveToRelative(0.43f, 0.12f, 0.73f, 0.52f, 0.73f, 0.96f)
                curveToRelative(0f, 0.07f, -0.01f, 1.82f, -1.17f, 3.56f)
                curveToRelative(-0.31f, 0.46f, -0.93f, 0.58f, -1.39f, 0.28f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.93f, -0.28f, -1.39f)
                curveToRelative(0.41f, -0.61f, 0.61f, -1.22f, 0.72f, -1.68f)
                curveToRelative(-1.32f, -0.28f, -4.14f, -0.76f, -7.89f, -0.76f)
                curveToRelative(-3.22f, 0f, -5.75f, 0.35f, -7.24f, 0.63f)
                curveToRelative(2.75f, 3.4f, 5.61f, 5.85f, 8.71f, 7.49f)
                curveToRelative(0.33f, 0.17f, 0.53f, 0.51f, 0.53f, 0.89f)
                reflectiveCurveToRelative(-0.2f, 0.71f, -0.53f, 0.89f)
                curveToRelative(-3.09f, 1.63f, -5.95f, 4.09f, -8.71f, 7.49f)
                curveToRelative(1.49f, 0.28f, 4.02f, 0.63f, 7.24f, 0.63f)
                curveToRelative(3.75f, 0f, 6.57f, -0.48f, 7.89f, -0.76f)
                curveToRelative(-0.11f, -0.46f, -0.31f, -1.08f, -0.72f, -1.69f)
                curveToRelative(-0.31f, -0.46f, -0.18f, -1.08f, 0.28f, -1.39f)
                curveToRelative(0.46f, -0.31f, 1.08f, -0.18f, 1.39f, 0.28f)
                curveToRelative(1.15f, 1.73f, 1.17f, 3.49f, 1.17f, 3.56f)
                curveToRelative(0f, 0.45f, -0.3f, 0.84f, -0.73f, 0.96f)
                curveToRelative(-0.15f, 0.04f, -3.7f, 1.04f, -9.27f, 1.04f)
                close()
            }
        }.also { _Sigma = it}
