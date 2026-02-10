package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVapingCircle: ImageVector? = null

val Icons.Rs.NoVapingCircle: ImageVector
    get() = _NoVapingCircle ?: UXIcon(name = "NoVapingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.73f, 17f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-7.73f)
                verticalLineToRelative(-7.73f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(3.73f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.32f, 2.26f)
                lineToRelative(3.04f, 3.04f)
                curveToRelative(0.4f, -0.19f, 0.84f, -0.3f, 1.29f, -0.3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.59f)
                lineToRelative(2.74f, 2.74f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                close()
                moveTo(10.41f, 9f)
                lineTo(15f, 13.59f)
                verticalLineToRelative(-4.59f)
                close()
                moveTo(12f, 22f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(-14.06f, -14.06f)
                curveToRelative(-1.41f, 1.73f, -2.26f, 3.93f, -2.26f, 6.32f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
            }
        }.also { _NoVapingCircle = it}
