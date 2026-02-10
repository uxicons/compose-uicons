package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Ts.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.96f, 19f)
                lineToRelative(0.5f, 1f)
                horizontalLineToRelative(-6.96f)
                curveToRelative(-2.55f, 0f, -4.74f, -1.73f, -5.34f, -4.2f)
                lineTo(1.02f, 7f)
                horizontalLineToRelative(1.03f)
                lineToRelative(2.08f, 8.56f)
                curveToRelative(0.49f, 2.02f, 2.29f, 3.44f, 4.37f, 3.44f)
                horizontalLineToRelative(6.46f)
                close()
                moveTo(20.31f, 23f)
                lineToRelative(-3.5f, -7f)
                horizontalLineToRelative(-8.31f)
                curveToRelative(-0.7f, 0f, -1.3f, -0.47f, -1.46f, -1.15f)
                lineToRelative(-0.68f, -2.85f)
                horizontalLineToRelative(7.65f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.88f)
                lineToRelative(-0.96f, -4f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(1.93f, 8.08f)
                curveToRelative(0.27f, 1.13f, 1.27f, 1.92f, 2.43f, 1.92f)
                horizontalLineToRelative(7.7f)
                lineToRelative(3.5f, 7f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.69f)
                close()
                moveTo(2.02f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(3.02f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _PersonSeatReclined = it}
