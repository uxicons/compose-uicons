package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Tc.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 22.57f)
                curveToRelative(-0.04f, 0.25f, -0.25f, 0.43f, -0.49f, 0.43f)
                curveToRelative(-0.3f, 0.0f, -0.54f, -0.27f, -0.5f, -0.57f)
                curveToRelative(0.51f, -3.59f, 0.5f, -7.39f, 0.49f, -7.43f)
                curveToRelative(0f, -7.03f, -2.68f, -9.86f, -9.5f, -9.99f)
                verticalLineToRelative(17.49f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-17.49f)
                curveToRelative(-6.82f, 0.13f, -9.5f, 2.96f, -9.5f, 9.99f)
                curveToRelative(0f, 0.04f, -0.02f, 3.84f, 0.49f, 7.43f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.42f, 0.56f)
                curveToRelative(-0.27f, 0.03f, -0.53f, -0.15f, -0.57f, -0.42f)
                curveToRelative(-0.52f, -3.67f, -0.51f, -7.54f, -0.51f, -7.57f)
                curveToRelative(0.0f, -7.64f, 3.06f, -10.85f, 10.5f, -10.98f)
                verticalLineToRelative(-2.51f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.51f)
                curveToRelative(7.44f, 0.14f, 10.5f, 3.35f, 10.5f, 10.99f)
                curveToRelative(0f, 0.04f, 0.02f, 3.9f, -0.51f, 7.57f)
                close()
            }
        }.also { _ManatSign = it}
