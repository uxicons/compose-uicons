package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cryptocurrency: ImageVector? = null

val Icons.Rr.Cryptocurrency: ImageVector
    get() = _Cryptocurrency ?: UXIcon(name = "Cryptocurrency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(9.17f, 9.17f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                curveToRelative(1.56f, 1.56f, 4.1f, 1.56f, 5.66f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.91f, 0.92f, -2.06f, 1.46f, -3.24f, 1.66f)
                verticalLineToRelative(1.1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.1f)
                curveToRelative(-1.19f, -0.2f, -2.33f, -0.74f, -3.24f, -1.66f)
                curveToRelative(-2.34f, -2.34f, -2.34f, -6.15f, 0f, -8.48f)
                curveToRelative(0.91f, -0.92f, 2.06f, -1.46f, 3.24f, -1.66f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.1f)
                curveToRelative(1.19f, 0.2f, 2.33f, 0.74f, 3.24f, 1.66f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-1.56f, -1.56f, -4.1f, -1.56f, -5.66f, 0f)
                close()
            }
        }.also { _Cryptocurrency = it}
