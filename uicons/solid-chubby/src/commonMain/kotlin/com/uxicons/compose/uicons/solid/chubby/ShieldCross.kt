package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Sc.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.03f, 18.75f)
                curveToRelative(-1.98f, 2.1f, -6.27f, 3.67f, -8.02f, 4.25f)
                verticalLineToRelative(-10.87f)
                horizontalLineToRelative(9.09f)
                curveToRelative(0.12f, 2.88f, -0.09f, 5.58f, -1.07f, 6.62f)
                close()
                moveTo(21.07f, 3.51f)
                curveToRelative(-0.06f, -0.28f, -0.23f, -0.53f, -0.48f, -0.67f)
                curveToRelative(-0.12f, -0.07f, -2.88f, -1.65f, -7.57f, -1.84f)
                verticalLineToRelative(9.1f)
                reflectiveCurveToRelative(8.96f, 0f, 8.96f, 0f)
                curveToRelative(-0.23f, -2.79f, -0.67f, -5.43f, -0.91f, -6.59f)
                close()
                moveTo(2.97f, 18.75f)
                curveToRelative(1.98f, 2.1f, 6.26f, 3.67f, 8.01f, 4.25f)
                verticalLineToRelative(-10.87f)
                reflectiveCurveToRelative(-9.09f, 0f, -9.09f, 0f)
                curveToRelative(-0.12f, 2.88f, 0.09f, 5.58f, 1.07f, 6.62f)
                close()
                moveTo(2.93f, 3.51f)
                curveToRelative(-0.24f, 1.16f, -0.68f, 3.8f, -0.91f, 6.59f)
                horizontalLineToRelative(8.96f)
                verticalLineToRelative(-9.1f)
                curveToRelative(-4.67f, 0.19f, -7.45f, 1.77f, -7.57f, 1.84f)
                curveToRelative(-0.25f, 0.14f, -0.42f, 0.39f, -0.48f, 0.67f)
                close()
            }
        }.also { _ShieldCross = it}
