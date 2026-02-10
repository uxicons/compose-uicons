package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldXmark: ImageVector? = null

val Icons.Tc.ShieldXmark: ImageVector
    get() = _ShieldXmark ?: UXIcon(name = "ShieldXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.35f, 8.85f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(2.65f, 2.65f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(-2.65f, 2.65f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(-2.65f, -2.65f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.65f, 2.65f)
                lineToRelative(2.65f, -2.65f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(21.0f, 18.48f)
                curveToRelative(-1.93f, 2.04f, -6.48f, 3.79f, -8.86f, 4.5f)
                curveToRelative(-0.09f, 0.03f, -0.2f, 0.03f, -0.29f, 0f)
                curveToRelative(-2.38f, -0.71f, -6.92f, -2.45f, -8.86f, -4.5f)
                curveToRelative(-1.78f, -1.88f, -0.81f, -10.89f, 0.1f, -15.3f)
                curveToRelative(0.03f, -0.14f, 0.12f, -0.26f, 0.24f, -0.33f)
                curveToRelative(0.01f, -0.06f, 3.66f, -1.85f, 8.76f, -1.85f)
                curveToRelative(5.32f, 0f, 8.44f, 1.77f, 8.57f, 1.85f)
                curveToRelative(0.12f, 0.07f, 0.21f, 0.19f, 0.24f, 0.33f)
                curveToRelative(0.91f, 4.41f, 1.88f, 13.43f, 0.1f, 15.3f)
                close()
                moveTo(19.97f, 3.62f)
                curveToRelative(-0.74f, -0.37f, -3.56f, -1.62f, -7.88f, -1.62f)
                curveToRelative(-4.09f, 0f, -7.39f, 1.25f, -8.06f, 1.62f)
                curveToRelative(-1.1f, 5.48f, -1.48f, 12.94f, -0.31f, 14.18f)
                curveToRelative(1.75f, 1.85f, 6.1f, 3.52f, 8.28f, 4.18f)
                curveToRelative(2.18f, -0.67f, 6.52f, -2.33f, 8.27f, -4.18f)
                curveToRelative(1.18f, -1.24f, 0.8f, -8.7f, -0.3f, -14.18f)
                close()
            }
        }.also { _ShieldXmark = it}
