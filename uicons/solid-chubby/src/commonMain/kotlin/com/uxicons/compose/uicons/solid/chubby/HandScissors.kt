package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Sc.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.48f, 7.8f)
                curveToRelative(-0.03f, -0.15f, -0.09f, -0.29f, -0.19f, -0.41f)
                curveToRelative(-3.11f, -4.04f, -6.55f, -5.25f, -6.7f, -5.3f)
                curveToRelative(-1.23f, -0.52f, -2.93f, 0.15f, -3.63f, 1.5f)
                curveToRelative(-0.37f, 0.71f, -0.67f, 1.72f, -0.86f, 2.41f)
                curveToRelative(0.45f, 0f, 1.9f, 0.0f, 2.9f, 0.0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1f, 1.0f)
                curveToRelative(-1.9f, 0.01f, -2.79f, 0.01f, -4f, -0.01f)
                curveToRelative(-3.65f, -0.13f, -6.42f, -0.92f, -6.45f, -0.92f)
                curveToRelative(-1.06f, -0.3f, -2.17f, 0.32f, -2.47f, 1.38f)
                curveToRelative(-0.3f, 1.06f, 0.31f, 2.17f, 1.37f, 2.47f)
                curveToRelative(0.11f, 0.03f, 2.8f, 0.78f, 5.77f, 1.08f)
                curveToRelative(-2.96f, 0.31f, -5.66f, 1.05f, -5.77f, 1.08f)
                curveToRelative(-1.06f, 0.3f, -1.68f, 1.41f, -1.37f, 2.47f)
                curveToRelative(0.3f, 1.06f, 1.41f, 1.68f, 2.47f, 1.38f)
                curveToRelative(0.03f, -0.01f, 2.18f, -0.62f, 5.19f, -0.85f)
                curveToRelative(0.43f, 1.91f, 1.04f, 3.71f, 1.87f, 5.38f)
                curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.9f, 0.55f)
                curveToRelative(4.24f, 0f, 7.4f, -0.79f, 10.56f, -2.64f)
                curveToRelative(0.24f, -0.14f, 0.41f, -0.38f, 0.47f, -0.65f)
                curveToRelative(0.02f, -0.09f, 0.46f, -2.14f, 0.46f, -5.21f)
                reflectiveCurveToRelative(-0.5f, -5.59f, -0.52f, -5.7f)
                close()
            }
        }.also { _HandScissors = it}
