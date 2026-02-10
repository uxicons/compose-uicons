package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Sc.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.96f, 19.65f)
                curveToRelative(-0.2f, -0.81f, -1.01f, -1.3f, -1.81f, -1.1f)
                curveToRelative(-0.04f, 0.01f, -4.04f, 0.96f, -9.15f, 0.96f)
                reflectiveCurveToRelative(-9.11f, -0.95f, -9.15f, -0.96f)
                curveToRelative(-0.81f, -0.19f, -1.62f, 0.3f, -1.81f, 1.1f)
                curveToRelative(-0.2f, 0.81f, 0.3f, 1.61f, 1.1f, 1.81f)
                curveToRelative(0.17f, 0.04f, 4.35f, 1.04f, 9.85f, 1.04f)
                reflectiveCurveToRelative(9.68f, -1f, 9.85f, -1.04f)
                curveToRelative(0.81f, -0.2f, 1.3f, -1.0f, 1.1f, -1.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.37f, 7.77f)
                curveToRelative(0.91f, -0.85f, 2.09f, -1.93f, 3.38f, -2.99f)
                curveToRelative(0.74f, -0.61f, 1.51f, -1.22f, 2.3f, -1.81f)
                curveToRelative(-2.22f, -0.21f, -4.81f, 0.05f, -6.82f, 1.71f)
                curveToRelative(-0.39f, 0.32f, -0.57f, 0.78f, -0.5f, 1.26f)
                curveToRelative(0.07f, 0.46f, 0.29f, 1.01f, 1.64f, 1.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.89f, 13.61f)
                lineToRelative(4.83f, 3.69f)
                curveToRelative(0.18f, 0.14f, 0.39f, 0.2f, 0.61f, 0.2f)
                curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.51f, -0.14f)
                curveToRelative(0.17f, -0.1f, 4.27f, -2.56f, 8.04f, -5.52f)
                curveToRelative(2.4f, -1.88f, 4.95f, -4.13f, 5.55f, -4.73f)
                curveToRelative(1.19f, -1.2f, 1.41f, -2.97f, 0.55f, -4.31f)
                curveToRelative(-0.41f, -0.64f, -1.05f, -1.08f, -1.78f, -1.24f)
                curveToRelative(-0.79f, -0.17f, -1.61f, 0.0f, -2.33f, 0.47f)
                curveToRelative(-2.15f, 1.41f, -4.06f, 2.82f, -5.84f, 4.29f)
                curveToRelative(-1.9f, 1.57f, -3.56f, 3.15f, -4.47f, 4.05f)
                lineToRelative(-0.15f, -0.05f)
                curveToRelative(-1.17f, -0.39f, -2.47f, -0.22f, -3.58f, 0.48f)
                lineToRelative(-1.86f, 1.17f)
                curveToRelative(-0.28f, 0.17f, -0.45f, 0.47f, -0.47f, 0.8f)
                reflectiveCurveToRelative(0.13f, 0.64f, 0.39f, 0.84f)
                close()
            }
        }.also { _PlaneDeparture = it}
