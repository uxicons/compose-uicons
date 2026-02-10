package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Tc.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.53f, 1.81f)
                curveToRelative(-0.05f, -0.15f, -0.17f, -0.27f, -0.32f, -0.32f)
                curveToRelative(-0.14f, -0.04f, -3.38f, -1.09f, -6.54f, 0.11f)
                curveToRelative(-0.26f, 0.1f, -0.39f, 0.39f, -0.29f, 0.65f)
                curveToRelative(0.1f, 0.26f, 0.39f, 0.39f, 0.65f, 0.29f)
                curveToRelative(1.93f, -0.73f, 3.95f, -0.51f, 5.05f, -0.29f)
                lineToRelative(-6.8f, 6.78f)
                curveToRelative(-3.57f, -3.21f, -7.14f, -3.1f, -10.62f, 0.34f)
                curveToRelative(-3.55f, 3.6f, -3.55f, 7.3f, 0.03f, 11.01f)
                curveToRelative(1.79f, 1.74f, 3.67f, 2.6f, 5.53f, 2.6f)
                reflectiveCurveToRelative(3.71f, -0.86f, 5.46f, -2.59f)
                curveToRelative(3.39f, -3.44f, 3.5f, -7.11f, 0.31f, -10.65f)
                lineToRelative(6.8f, -6.78f)
                curveToRelative(0.22f, 1.09f, 0.44f, 3.11f, -0.29f, 5.04f)
                curveToRelative(-0.1f, 0.26f, 0.03f, 0.55f, 0.29f, 0.65f)
                curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f)
                curveToRelative(0.2f, 0f, 0.39f, -0.12f, 0.47f, -0.32f)
                curveToRelative(1.2f, -3.16f, 0.15f, -6.39f, 0.11f, -6.53f)
                close()
                moveTo(13.97f, 19.66f)
                curveToRelative(-3.14f, 3.1f, -6.37f, 3.1f, -9.58f, -0.01f)
                curveToRelative(-3.2f, -3.32f, -3.21f, -6.37f, -0.03f, -9.59f)
                curveToRelative(1.58f, -1.57f, 3.16f, -2.35f, 4.75f, -2.35f)
                reflectiveCurveToRelative(3.2f, 0.79f, 4.84f, 2.37f)
                curveToRelative(3.15f, 3.27f, 3.16f, 6.41f, 0.02f, 9.59f)
                close()
            }
        }.also { _Mars = it}
