package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSimple: ImageVector? = null

val Icons.Tc.PersonSimple: ImageVector
    get() = _PersonSimple ?: UXIcon(name = "PersonSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(1.35f, 0f, 2f, -0.65f, 2f, -2f)
                reflectiveCurveToRelative(-0.65f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.65f, -2f, 2f)
                reflectiveCurveToRelative(0.65f, 2f, 2f, 2f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.79f, 0f, 1f, 0.21f, 1f, 1f)
                reflectiveCurveToRelative(-0.21f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.21f, -1f, -1f)
                reflectiveCurveToRelative(0.21f, -1f, 1f, -1f)
                close()
                moveTo(16.49f, 6.74f)
                curveToRelative(-0.05f, -0.19f, -0.2f, -0.34f, -0.4f, -0.38f)
                curveToRelative(-0.08f, -0.01f, -2.07f, -0.36f, -4.09f, -0.36f)
                reflectiveCurveToRelative(-4.0f, 0.35f, -4.09f, 0.36f)
                curveToRelative(-0.2f, 0.04f, -0.35f, 0.18f, -0.4f, 0.38f)
                curveToRelative(-0.02f, 0.09f, -0.51f, 2.23f, -0.51f, 4.76f)
                reflectiveCurveToRelative(0.49f, 4.67f, 0.51f, 4.76f)
                curveToRelative(0.04f, 0.19f, 0.2f, 0.34f, 0.4f, 0.38f)
                curveToRelative(0.06f, 0.01f, 0.93f, 0.16f, 2.09f, 0.27f)
                verticalLineToRelative(5.6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.53f)
                curveToRelative(0.33f, 0.02f, 0.66f, 0.03f, 1f, 0.03f)
                reflectiveCurveToRelative(0.67f, -0.01f, 1f, -0.03f)
                verticalLineToRelative(5.53f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.6f)
                curveToRelative(1.16f, -0.1f, 2.03f, -0.26f, 2.09f, -0.27f)
                curveToRelative(0.2f, -0.04f, 0.35f, -0.18f, 0.4f, -0.38f)
                curveToRelative(0.02f, -0.09f, 0.51f, -2.23f, 0.51f, -4.76f)
                reflectiveCurveToRelative(-0.49f, -4.67f, -0.51f, -4.76f)
                close()
                moveTo(15.58f, 15.7f)
                curveToRelative(-0.64f, 0.1f, -2.12f, 0.3f, -3.58f, 0.3f)
                reflectiveCurveToRelative(-2.94f, -0.2f, -3.58f, -0.3f)
                curveToRelative(-0.13f, -0.68f, -0.42f, -2.35f, -0.42f, -4.2f)
                reflectiveCurveToRelative(0.28f, -3.52f, 0.42f, -4.2f)
                curveToRelative(0.64f, -0.1f, 2.12f, -0.3f, 3.58f, -0.3f)
                reflectiveCurveToRelative(2.94f, 0.2f, 3.58f, 0.3f)
                curveToRelative(0.13f, 0.68f, 0.42f, 2.35f, 0.42f, 4.2f)
                reflectiveCurveToRelative(-0.28f, 3.52f, -0.42f, 4.2f)
                close()
            }
        }.also { _PersonSimple = it}
