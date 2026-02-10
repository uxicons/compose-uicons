package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeHeart: ImageVector? = null

val Icons.Sc.HomeHeart: ImageVector
    get() = _HomeHeart ?: UXIcon(name = "HomeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12.16f)
                curveToRelative(0f, 2.08f, -2.06f, 3.6f, -3.0f, 4.18f)
                curveToRelative(-0.93f, -0.59f, -3.0f, -2.12f, -3.0f, -4.18f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
                moveTo(22f, 14.25f)
                curveToRelative(0f, 4.18f, -0.5f, 6.83f, -0.52f, 6.94f)
                curveToRelative(-0.07f, 0.36f, -0.33f, 0.65f, -0.68f, 0.76f)
                curveToRelative(-0.13f, 0.04f, -3.31f, 1.05f, -8.81f, 1.05f)
                reflectiveCurveToRelative(-8.67f, -1.0f, -8.81f, -1.05f)
                curveToRelative(-0.35f, -0.11f, -0.61f, -0.41f, -0.68f, -0.76f)
                curveToRelative(-0.02f, -0.11f, -0.52f, -2.76f, -0.52f, -6.94f)
                curveToRelative(0f, -4.25f, 0.92f, -6.93f, 0.96f, -7.05f)
                curveToRelative(0.05f, -0.13f, 0.12f, -0.26f, 0.22f, -0.36f)
                curveToRelative(2.16f, -2.27f, 4.99f, -4.21f, 8.41f, -5.75f)
                curveToRelative(0.26f, -0.12f, 0.56f, -0.12f, 0.82f, 0f)
                curveToRelative(3.42f, 1.55f, 6.25f, 3.49f, 8.41f, 5.75f)
                curveToRelative(0.1f, 0.1f, 0.17f, 0.23f, 0.22f, 0.36f)
                curveToRelative(0.04f, 0.11f, 0.96f, 2.79f, 0.96f, 7.05f)
                close()
                moveTo(17f, 12.16f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 3.91f, 4.37f, 6.14f, 4.55f, 6.23f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                reflectiveCurveToRelative(0.31f, -0.04f, 0.45f, -0.1f)
                curveToRelative(0.19f, -0.09f, 4.55f, -2.32f, 4.55f, -6.23f)
                close()
            }
        }.also { _HomeHeart = it}
