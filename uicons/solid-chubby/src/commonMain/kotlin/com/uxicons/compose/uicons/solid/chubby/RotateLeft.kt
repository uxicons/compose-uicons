package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Sc.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.8f, 1.87f)
                curveToRelative(-3.58f, 0f, -8.21f, 0.7f, -9.71f, 6.08f)
                curveToRelative(-0.39f, -0.17f, -0.86f, -0.17f, -1.27f, 0.03f)
                curveToRelative(-0.74f, 0.37f, -1.04f, 1.27f, -0.67f, 2.01f)
                curveToRelative(0.6f, 1.2f, 0.96f, 1.69f, 2.05f, 2.5f)
                curveToRelative(0.68f, 0.51f, 1.37f, 0.27f, 1.57f, 0.17f)
                curveToRelative(1.23f, -0.59f, 1.71f, -0.96f, 2.58f, -1.99f)
                curveToRelative(0.53f, -0.63f, 0.45f, -1.58f, -0.18f, -2.11f)
                curveToRelative(-0.3f, -0.25f, -0.66f, -0.36f, -1.02f, -0.35f)
                curveToRelative(0.88f, -2.4f, 2.92f, -3.35f, 6.65f, -3.35f)
                curveToRelative(4.56f, 0f, 7.2f, 1.17f, 7.2f, 7.13f)
                reflectiveCurveToRelative(-2.75f, 7.13f, -7.2f, 7.13f)
                curveToRelative(-4.02f, 0f, -5.98f, -1.08f, -6.78f, -3.73f)
                curveToRelative(-0.24f, -0.79f, -1.07f, -1.25f, -1.87f, -1.0f)
                curveToRelative(-0.79f, 0.24f, -1.24f, 1.07f, -1.0f, 1.87f)
                curveToRelative(1.58f, 5.26f, 6.26f, 5.87f, 9.65f, 5.87f)
                curveToRelative(4.38f, 0f, 10.2f, -1.05f, 10.2f, -10.13f)
                reflectiveCurveTo(17.18f, 1.87f, 12.8f, 1.87f)
                close()
            }
        }.also { _RotateLeft = it}
