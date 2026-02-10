package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tilde: ImageVector? = null

val Icons.Tc.Tilde: ImageVector
    get() = _Tilde ?: UXIcon(name = "Tilde") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.42f, 19f)
                curveToRelative(-3.57f, 0f, -4.58f, -3.01f, -5.39f, -5.43f)
                curveToRelative(-0.32f, -0.99f, -0.68f, -1.82f, -1.01f, -2.81f)
                curveToRelative(-0.84f, -2.45f, -1.64f, -4.76f, -4.52f, -4.76f)
                curveToRelative(-3.41f, 0f, -4.5f, 1.22f, -4.5f, 5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.6f, 0.94f, -6f, 5.5f, -6f)
                curveToRelative(3.59f, 0f, 4.63f, 3.02f, 5.47f, 5.44f)
                curveToRelative(0.33f, 0.99f, 0.69f, 1.81f, 1.01f, 2.81f)
                curveToRelative(0.78f, 2.33f, 1.59f, 4.75f, 4.44f, 4.75f)
                curveToRelative(3.43f, 0f, 4.58f, -1.26f, 4.58f, -5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 4.32f, -1.56f, 6f, -5.58f, 6f)
                close()
            }
        }.also { _Tilde = it}
