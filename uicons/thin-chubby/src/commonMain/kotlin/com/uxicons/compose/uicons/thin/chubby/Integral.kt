package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Integral: ImageVector? = null

val Icons.Tc.Integral: ImageVector
    get() = _Integral ?: UXIcon(name = "Integral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.25f, 23f)
                curveToRelative(-1.23f, 0f, -2.9f, -0.25f, -3.2f, -2.43f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.43f, -0.56f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.15f, 0.56f, 0.43f)
                curveToRelative(0.13f, 0.97f, 0.55f, 1.57f, 2.21f, 1.57f)
                curveToRelative(1.68f, 0f, 2.25f, -0.57f, 2.25f, -2.25f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -2.25f, 1.0f, -3.25f, 3.25f, -3.25f)
                curveToRelative(1.23f, 0f, 2.9f, 0.25f, 3.2f, 2.43f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.43f, 0.56f)
                curveToRelative(-0.28f, 0.04f, -0.53f, -0.15f, -0.56f, -0.43f)
                curveToRelative(-0.13f, -0.97f, -0.55f, -1.57f, -2.21f, -1.57f)
                curveToRelative(-1.68f, 0f, -2.25f, 0.57f, -2.25f, 2.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 2.25f, -1.0f, 3.25f, -3.25f, 3.25f)
                close()
            }
        }.also { _Integral = it}
