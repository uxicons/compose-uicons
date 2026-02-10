package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Tc.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(-7.81f, 0f, -11f, 1.88f, -11f, 6.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 4.62f, 3.19f, 6.5f, 11f, 6.5f)
                reflectiveCurveToRelative(11f, -1.88f, 11f, -6.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -4.62f, -3.19f, -6.5f, -11f, -6.5f)
                close()
                moveTo(12f, 4f)
                curveToRelative(8.3f, 0f, 10f, 2.2f, 10f, 5.5f)
                curveToRelative(0f, 0.45f, -0.04f, 0.88f, -0.11f, 1.29f)
                curveToRelative(-1.5f, -1.94f, -4.56f, -2.79f, -9.89f, -2.79f)
                reflectiveCurveToRelative(-8.38f, 0.85f, -9.89f, 2.79f)
                curveToRelative(-0.08f, -0.41f, -0.11f, -0.84f, -0.11f, -1.29f)
                curveToRelative(0f, -3.3f, 1.7f, -5.5f, 10f, -5.5f)
                close()
                moveTo(21.47f, 12.01f)
                curveToRelative(-0.97f, 1.86f, -3.52f, 3.0f, -9.47f, 3.0f)
                reflectiveCurveToRelative(-8.5f, -1.14f, -9.47f, -3.0f)
                curveToRelative(1.07f, -2.07f, 4.01f, -3.0f, 9.47f, -3.0f)
                reflectiveCurveToRelative(8.4f, 0.93f, 9.47f, 3.0f)
                close()
                moveTo(22f, 14.5f)
                curveToRelative(0f, 3.3f, -1.7f, 5.5f, -10f, 5.5f)
                reflectiveCurveToRelative(-10f, -2.2f, -10f, -5.5f)
                verticalLineToRelative(-1.42f)
                curveToRelative(1.48f, 2.04f, 4.65f, 2.92f, 10f, 2.92f)
                reflectiveCurveToRelative(8.53f, -0.88f, 10f, -2.92f)
                close()
            }
        }.also { _Ring = it}
