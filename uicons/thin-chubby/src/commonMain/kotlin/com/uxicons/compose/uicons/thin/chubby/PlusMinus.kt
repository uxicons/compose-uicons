package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Tc.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.17f, 22.59f)
                curveToRelative(-0.06f, 0.28f, -0.34f, 0.45f, -0.61f, 0.39f)
                curveToRelative(-0.03f, -0.01f, -2.58f, -0.54f, -7.56f, -0.54f)
                reflectiveCurveToRelative(-7.54f, 0.53f, -7.56f, 0.54f)
                curveToRelative(-0.28f, 0.06f, -0.55f, -0.12f, -0.61f, -0.39f)
                curveToRelative(-0.06f, -0.28f, 0.12f, -0.55f, 0.39f, -0.61f)
                curveToRelative(0.11f, -0.02f, 2.67f, -0.56f, 7.78f, -0.56f)
                reflectiveCurveToRelative(7.67f, 0.54f, 7.78f, 0.56f)
                curveToRelative(0.28f, 0.06f, 0.45f, 0.33f, 0.39f, 0.61f)
                close()
                moveTo(4.44f, 10.23f)
                curveToRelative(0.02f, -0.01f, 2.41f, -0.5f, 7.05f, -0.53f)
                verticalLineToRelative(7.15f)
                curveToRelative(0f, 0.28f, 0.23f, 0.51f, 0.51f, 0.51f)
                reflectiveCurveToRelative(0.51f, -0.23f, 0.51f, -0.51f)
                verticalLineToRelative(-7.15f)
                curveToRelative(4.64f, 0.04f, 7.03f, 0.53f, 7.05f, 0.53f)
                curveToRelative(0.27f, 0.06f, 0.55f, -0.12f, 0.61f, -0.39f)
                curveToRelative(0.06f, -0.28f, -0.12f, -0.55f, -0.39f, -0.61f)
                curveToRelative(-0.1f, -0.02f, -2.5f, -0.52f, -7.26f, -0.56f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0f, -0.28f, -0.23f, -0.51f, -0.51f, -0.51f)
                reflectiveCurveToRelative(-0.51f, 0.23f, -0.51f, 0.51f)
                verticalLineToRelative(7.16f)
                curveToRelative(-4.76f, 0.03f, -7.16f, 0.53f, -7.26f, 0.56f)
                curveToRelative(-0.28f, 0.06f, -0.45f, 0.33f, -0.39f, 0.61f)
                curveToRelative(0.06f, 0.28f, 0.33f, 0.46f, 0.61f, 0.39f)
                close()
            }
        }.also { _PlusMinus = it}
