package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVapingCircle: ImageVector? = null

val Icons.Ts.NoVapingCircle: ImageVector
    get() = _NoVapingCircle ?: UXIcon(name = "NoVapingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-3.11f, -3.11f)
                verticalLineToRelative(-11.29f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.23f, 0f, -0.47f, 0.04f, -0.69f, 0.1f)
                lineToRelative(-4.21f, -4.21f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                close()
                moveTo(16f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(6.29f)
                lineToRelative(-6.29f, -6.29f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(15.52f, 15.52f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(15.46f, 19f)
                horizontalLineToRelative(-8.46f)
                verticalLineToRelative(-8.46f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(6.46f)
                close()
            }
        }.also { _NoVapingCircle = it}
