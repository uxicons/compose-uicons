package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Tc.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5.01f)
                curveToRelative(-5.53f, 0f, -8f, 2.77f, -8f, 8.99f)
                reflectiveCurveToRelative(2.47f, 9f, 8f, 9f)
                reflectiveCurveToRelative(8f, -2.78f, 8f, -9f)
                reflectiveCurveToRelative(-2.47f, -8.99f, -8f, -8.99f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.64f, 0f, -7f, -0.97f, -7f, -8f)
                reflectiveCurveToRelative(3.36f, -7.99f, 7f, -7.99f)
                reflectiveCurveToRelative(7f, 0.97f, 7f, 7.99f)
                reflectiveCurveToRelative(-3.36f, 8f, -7f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.67f, 2.97f)
                curveToRelative(0.03f, -0.01f, 2.67f, -0.97f, 7.33f, -0.97f)
                reflectiveCurveToRelative(7.3f, 0.96f, 7.33f, 0.97f)
                curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.17f, 0.03f)
                curveToRelative(0.2f, 0f, 0.4f, -0.12f, 0.47f, -0.33f)
                curveToRelative(0.1f, -0.26f, -0.04f, -0.55f, -0.29f, -0.64f)
                curveToRelative(-0.11f, -0.04f, -2.82f, -1.03f, -7.67f, -1.03f)
                reflectiveCurveToRelative(-7.56f, 0.99f, -7.67f, 1.03f)
                curveToRelative(-0.26f, 0.1f, -0.39f, 0.38f, -0.29f, 0.64f)
                curveToRelative(0.1f, 0.26f, 0.39f, 0.39f, 0.64f, 0.29f)
                close()
            }
        }.also { _Overline = it}
