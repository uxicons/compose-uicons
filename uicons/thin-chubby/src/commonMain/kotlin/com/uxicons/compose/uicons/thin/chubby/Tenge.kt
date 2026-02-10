package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Tc.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.03f, 2.71f)
                curveToRelative(-0.09f, -0.26f, 0.05f, -0.55f, 0.32f, -0.63f)
                curveToRelative(0.13f, -0.04f, 3.32f, -1.08f, 9.66f, -1.08f)
                reflectiveCurveToRelative(9.53f, 1.04f, 9.66f, 1.08f)
                curveToRelative(0.26f, 0.09f, 0.4f, 0.37f, 0.32f, 0.63f)
                curveToRelative(-0.09f, 0.26f, -0.37f, 0.41f, -0.63f, 0.32f)
                curveToRelative(-0.03f, -0.01f, -3.19f, -1.03f, -9.34f, -1.03f)
                reflectiveCurveToRelative(-9.31f, 1.02f, -9.34f, 1.03f)
                curveToRelative(-0.26f, 0.09f, -0.55f, -0.05f, -0.63f, -0.32f)
                close()
                moveTo(21.66f, 5.08f)
                curveToRelative(-0.13f, -0.04f, -3.32f, -1.08f, -9.66f, -1.08f)
                reflectiveCurveToRelative(-9.53f, 1.04f, -9.66f, 1.08f)
                curveToRelative(-0.26f, 0.09f, -0.4f, 0.37f, -0.32f, 0.63f)
                curveToRelative(0.09f, 0.26f, 0.38f, 0.4f, 0.63f, 0.32f)
                curveToRelative(0.03f, -0.01f, 3.0f, -0.97f, 8.84f, -1.02f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-17.5f)
                curveToRelative(5.82f, 0.05f, 8.81f, 1.01f, 8.84f, 1.02f)
                curveToRelative(0.27f, 0.09f, 0.55f, -0.06f, 0.63f, -0.32f)
                curveToRelative(0.09f, -0.26f, -0.05f, -0.54f, -0.32f, -0.63f)
                close()
            }
        }.also { _Tenge = it}
