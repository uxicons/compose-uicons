package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Login: ImageVector? = null

val Icons.Ss.Login: ImageVector
    get() = _Login ?: UXIcon(name = "Login") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22.59f)
                lineToRelative(-4.3f, -4.32f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(-9.74f, -3.54f)
                curveToRelative(-0.7f, -0.25f, -1.49f, -0.08f, -2.01f, 0.45f)
                curveToRelative(-0.53f, 0.53f, -0.7f, 1.3f, -0.45f, 2.01f)
                lineToRelative(3.54f, 9.74f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(4.3f, 4.32f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(11.5f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11.3f, 19.91f)
                curveToRelative(-0.43f, 0.06f, -0.86f, 0.09f, -1.3f, 0.09f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 0.43f, -0.04f, 0.86f, -0.09f, 1.27f)
                lineToRelative(-5.66f, -2.06f)
                curveToRelative(-0.6f, -0.22f, -1.24f, -0.27f, -1.86f, -0.18f)
                curveToRelative(0.68f, -0.64f, 1.1f, -1.54f, 1.1f, -2.54f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.12f, 0f, 0.23f, -0.02f, 0.35f, -0.04f)
                curveToRelative(-0.64f, 0.52f, -1.06f, 1.27f, -1.24f, 2.04f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.27f)
                curveToRelative(0.57f, 0.65f, 1.25f, 1.21f, 2f, 1.64f)
                verticalLineToRelative(-1.92f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.02f, 0.08f, 0.04f, 0.16f, 0.07f, 0.24f)
                close()
            }
        }.also { _Login = it}
