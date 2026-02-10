package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Rs.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.06f, 19.93f)
                lineToRelative(-1.08f, 1.85f)
                curveToRelative(-1.33f, -0.25f, -2.61f, -0.72f, -3.77f, -1.44f)
                curveToRelative(-3.26f, -2.03f, -5.2f, -5.52f, -5.2f, -9.35f)
                curveToRelative(0f, -6.07f, 4.93f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 1.48f, -0.3f, 2.89f, -0.83f, 4.18f)
                lineToRelative(-1.36f, -2.33f)
                curveToRelative(0.12f, -0.6f, 0.19f, -1.21f, 0.19f, -1.84f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 4.04f, -9f, 9.0f)
                curveToRelative(0f, 3.13f, 1.59f, 6.0f, 4.26f, 7.65f)
                curveToRelative(1.15f, 0.71f, 2.45f, 1.14f, 3.8f, 1.28f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-14f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _SessionTimeout = it}
