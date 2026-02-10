package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Ts.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                close()
                moveTo(19.5f, 24f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-7.0f, -11.99f)
                lineToRelative(-7.0f, 11.99f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(5.25f, -9.01f)
                lineToRelative(5.25f, 9.01f)
                horizontalLineToRelative(-2.75f)
                close()
                moveTo(17.5f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(6.23f, 18.99f)
                curveToRelative(-3.22f, -1.63f, -5.23f, -4.88f, -5.23f, -8.49f)
                curveToRelative(0f, -5.24f, 4.26f, -9.5f, 9.5f, -9.5f)
                reflectiveCurveToRelative(9.5f, 4.26f, 9.5f, 9.5f)
                curveToRelative(0f, 0.76f, -0.1f, 1.5f, -0.27f, 2.22f)
                lineToRelative(0.69f, 1.19f)
                curveToRelative(0.37f, -1.07f, 0.58f, -2.21f, 0.58f, -3.4f)
                curveToRelative(0f, -5.79f, -4.71f, -10.5f, -10.5f, -10.5f)
                reflectiveCurveToRelative(-10.5f, 4.71f, -10.5f, 10.5f)
                curveToRelative(0f, 3.99f, 2.21f, 7.58f, 5.77f, 9.38f)
                curveToRelative(1.17f, 0.59f, 2.41f, 0.94f, 3.7f, 1.06f)
                lineToRelative(0.56f, -0.97f)
                curveToRelative(-1.33f, -0.06f, -2.62f, -0.38f, -3.81f, -0.99f)
                close()
            }
        }.also { _SessionTimeout = it}
