package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Sc.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.39f, 10.74f)
                curveToRelative(-1.69f, -0.85f, -3.45f, -1.45f, -5.39f, -1.88f)
                curveToRelative(-0.0f, -0.49f, -0.01f, -1.04f, -0.01f, -1.22f)
                curveToRelative(0.03f, -2.62f, -0.21f, -4.81f, -0.22f, -4.92f)
                curveToRelative(-0.15f, -1.09f, -1.16f, -1.86f, -2.25f, -1.7f)
                curveToRelative(-1.09f, 0.15f, -1.86f, 1.16f, -1.71f, 2.25f)
                curveToRelative(0.0f, 0.03f, 0.22f, 2.17f, 0.09f, 4.96f)
                curveToRelative(-0.96f, -0.08f, -1.86f, -0.15f, -2.62f, -0.21f)
                curveToRelative(-0.77f, -0.06f, -1.43f, 0.57f, -1.38f, 1.34f)
                curveToRelative(0.07f, 1.68f, 0.09f, 2.38f, 0.1f, 4.63f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0f, -1.0f, -0.0f, -2.45f, -0.0f, -2.9f)
                curveToRelative(-0.69f, 0.18f, -1.7f, 0.48f, -2.41f, 0.86f)
                curveToRelative(-1.35f, 0.71f, -2.02f, 2.4f, -1.5f, 3.63f)
                curveToRelative(0.05f, 0.14f, 1.26f, 3.59f, 5.3f, 6.7f)
                curveToRelative(0.12f, 0.09f, 0.26f, 0.16f, 0.41f, 0.19f)
                curveToRelative(0.11f, 0.02f, 2.63f, 0.52f, 5.7f, 0.52f)
                reflectiveCurveToRelative(5.13f, -0.44f, 5.21f, -0.46f)
                curveToRelative(0.27f, -0.06f, 0.51f, -0.23f, 0.65f, -0.47f)
                curveToRelative(1.85f, -3.16f, 2.58f, -6.18f, 2.59f, -10.42f)
                curveToRelative(0f, -0.38f, -0.21f, -0.74f, -0.55f, -0.91f)
                close()
            }
        }.also { _HandMiddleFinger = it}
