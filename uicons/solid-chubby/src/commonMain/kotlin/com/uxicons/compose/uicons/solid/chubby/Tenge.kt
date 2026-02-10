package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Sc.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.05f, 3.73f)
                curveToRelative(-0.2f, -0.8f, 0.28f, -1.62f, 1.08f, -1.82f)
                curveToRelative(1.33f, -0.34f, 4.25f, -0.91f, 8.87f, -0.91f)
                reflectiveCurveToRelative(7.54f, 0.57f, 8.87f, 0.91f)
                curveToRelative(0.8f, 0.2f, 1.29f, 1.02f, 1.08f, 1.82f)
                curveToRelative(-0.2f, 0.81f, -1.04f, 1.29f, -1.82f, 1.08f)
                curveToRelative(-0.96f, -0.24f, -3.67f, -0.81f, -8.13f, -0.81f)
                reflectiveCurveToRelative(-7.17f, 0.57f, -8.13f, 0.81f)
                curveToRelative(-0.8f, 0.21f, -1.62f, -0.28f, -1.82f, -1.08f)
                close()
                moveTo(20.87f, 6.91f)
                curveToRelative(-1.33f, -0.34f, -4.25f, -0.91f, -8.87f, -0.91f)
                reflectiveCurveToRelative(-7.54f, 0.57f, -8.87f, 0.91f)
                curveToRelative(-0.8f, 0.2f, -1.29f, 1.02f, -1.08f, 1.82f)
                curveToRelative(0.2f, 0.8f, 1.02f, 1.29f, 1.82f, 1.08f)
                curveToRelative(0.85f, -0.21f, 3.06f, -0.68f, 6.63f, -0.79f)
                verticalLineToRelative(12.48f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-12.48f)
                curveToRelative(3.57f, 0.11f, 5.78f, 0.57f, 6.63f, 0.79f)
                curveToRelative(0.78f, 0.21f, 1.62f, -0.27f, 1.82f, -1.08f)
                curveToRelative(0.2f, -0.8f, -0.28f, -1.62f, -1.08f, -1.82f)
                close()
            }
        }.also { _Tenge = it}
