package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hairdryer: ImageVector? = null

val Icons.Sr.Hairdryer: ImageVector
    get() = _Hairdryer ?: UXIcon(name = "Hairdryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11.63f)
                curveToRelative(-3.69f, 1.44f, -6.68f, 2.37f, -9f, 2.37f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(2.63f, 0f, 6.13f, 1.07f, 9f, 2.15f)
                close()
                moveTo(18f, 2.22f)
                verticalLineToRelative(9.38f)
                lineToRelative(2.98f, 1.3f)
                curveToRelative(1.51f, 0.43f, 3.02f, -0.7f, 3.02f, -2.27f)
                verticalLineToRelative(-7.27f)
                curveToRelative(0f, -1.54f, -1.45f, -2.67f, -2.94f, -2.29f)
                close()
                moveTo(10.81f, 15.46f)
                curveToRelative(-1.47f, 0.37f, -2.7f, 0.54f, -3.81f, 0.54f)
                curveToRelative(-0.71f, 0f, -1.41f, -0.09f, -2.07f, -0.25f)
                lineToRelative(2.67f, 6.53f)
                curveToRelative(0.59f, 1.43f, 2.23f, 2.1f, 3.65f, 1.5f)
                reflectiveCurveToRelative(2.1f, -2.23f, 1.5f, -3.65f)
                close()
            }
        }.also { _Hairdryer = it}
