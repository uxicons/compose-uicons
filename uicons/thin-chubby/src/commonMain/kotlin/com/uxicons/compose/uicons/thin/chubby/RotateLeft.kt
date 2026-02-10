package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateLeft: ImageVector? = null

val Icons.Tc.RotateLeft: ImageVector
    get() = _RotateLeft ?: UXIcon(name = "RotateLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.89f, 1.86f)
                curveTo(8.54f, 1.86f, 3.54f, 2.83f, 2.86f, 10.19f)
                curveToRelative(-0.36f, -0.37f, -0.57f, -0.72f, -0.91f, -1.4f)
                curveToRelative(-0.12f, -0.25f, -0.42f, -0.35f, -0.67f, -0.23f)
                curveToRelative(-0.25f, 0.12f, -0.35f, 0.42f, -0.23f, 0.67f)
                curveToRelative(0.59f, 1.19f, 0.9f, 1.57f, 1.94f, 2.4f)
                curveToRelative(0.19f, 0.15f, 0.42f, 0.11f, 0.53f, 0.06f)
                curveToRelative(1.2f, -0.58f, 1.6f, -0.89f, 2.46f, -1.92f)
                curveToRelative(0.18f, -0.21f, 0.15f, -0.53f, -0.06f, -0.7f)
                curveToRelative(-0.21f, -0.18f, -0.53f, -0.15f, -0.7f, 0.06f)
                curveToRelative(-0.55f, 0.66f, -0.85f, 0.96f, -1.37f, 1.27f)
                curveToRelative(0.43f, -5.34f, 3.1f, -7.54f, 9.05f, -7.54f)
                curveToRelative(6.47f, 0f, 9.11f, 2.65f, 9.11f, 9.14f)
                reflectiveCurveToRelative(-2.64f, 9.14f, -9.11f, 9.14f)
                curveToRelative(-4.98f, 0f, -7.55f, -1.5f, -8.6f, -5.01f)
                curveToRelative(-0.08f, -0.26f, -0.35f, -0.41f, -0.62f, -0.34f)
                curveToRelative(-0.27f, 0.08f, -0.42f, 0.36f, -0.34f, 0.62f)
                curveToRelative(1.51f, 5.07f, 5.9f, 5.72f, 9.56f, 5.72f)
                curveToRelative(4.71f, 0f, 10.11f, -1.15f, 10.11f, -10.14f)
                reflectiveCurveTo(17.6f, 1.86f, 12.89f, 1.86f)
                close()
            }
        }.also { _RotateLeft = it}
