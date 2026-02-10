package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Rs.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.5f)
                curveToRelative(0f, -4.38f, -3.33f, -7.99f, -7.59f, -8.45f)
                curveTo(15.83f, 3.07f, 12.39f, 0f, 8.25f, 0f)
                curveTo(3.7f, 0f, 0f, 3.7f, 0f, 8.25f)
                lineToRelative(0.04f, 15.75f)
                lineToRelative(2f, -0.0f)
                lineToRelative(-0.04f, -15.75f)
                curveToRelative(0f, -3.45f, 2.8f, -6.25f, 6.25f, -6.25f)
                curveToRelative(3.04f, 0f, 5.59f, 2.19f, 6.14f, 5.07f)
                curveToRelative(-4.16f, 0.55f, -7.39f, 4.12f, -7.39f, 8.43f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(9.02f, 15f)
                curveToRelative(0.26f, -3.35f, 3.06f, -6f, 6.48f, -6f)
                reflectiveCurveToRelative(6.22f, 2.65f, 6.48f, 6f)
                horizontalLineToRelative(-12.96f)
                close()
            }
        }.also { _LampStreet = it}
