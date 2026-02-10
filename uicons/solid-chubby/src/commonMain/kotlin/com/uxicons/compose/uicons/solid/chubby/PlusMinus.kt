package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Sc.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.97f, 21.81f)
                curveToRelative(-0.15f, 0.7f, -0.77f, 1.19f, -1.47f, 1.19f)
                curveToRelative(-0.64f, -0.04f, -1.99f, -0.45f, -6.5f, -0.47f)
                curveToRelative(-4.08f, 0f, -6.17f, 0.43f, -6.19f, 0.43f)
                curveToRelative(-0.81f, 0.17f, -1.6f, -0.35f, -1.78f, -1.16f)
                curveToRelative(-0.17f, -0.81f, 0.34f, -1.6f, 1.15f, -1.78f)
                curveToRelative(0.1f, -0.02f, 2.37f, -0.5f, 6.81f, -0.5f)
                reflectiveCurveToRelative(6.72f, 0.48f, 6.81f, 0.5f)
                curveToRelative(0.81f, 0.17f, 1.33f, 0.97f, 1.15f, 1.78f)
                close()
                moveTo(5.81f, 10.93f)
                curveToRelative(0.02f, -0.0f, 1.6f, -0.33f, 4.69f, -0.41f)
                verticalLineToRelative(4.98f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.98f)
                curveToRelative(3.53f, 0.11f, 4.36f, 0.4f, 5.0f, 0.44f)
                curveToRelative(0.69f, 0f, 1.31f, -0.48f, 1.47f, -1.19f)
                curveToRelative(0.17f, -0.81f, -0.34f, -1.61f, -1.15f, -1.78f)
                curveToRelative(-0.08f, -0.02f, -1.86f, -0.39f, -5.31f, -0.48f)
                verticalLineToRelative(-5.02f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.02f)
                curveToRelative(-3.45f, 0.09f, -5.23f, 0.46f, -5.31f, 0.48f)
                curveToRelative(-0.81f, 0.17f, -1.32f, 0.97f, -1.15f, 1.78f)
                reflectiveCurveToRelative(0.96f, 1.33f, 1.78f, 1.16f)
                close()
            }
        }.also { _PlusMinus = it}
