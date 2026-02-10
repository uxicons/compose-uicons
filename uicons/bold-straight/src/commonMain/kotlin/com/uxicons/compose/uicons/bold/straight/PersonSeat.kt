package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeat: ImageVector? = null

val Icons.Bs.PersonSeat: ImageVector
    get() = _PersonSeat ?: UXIcon(name = "PersonSeat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.13f, 21f)
                lineToRelative(-2f, -7f)
                horizontalLineToRelative(-6.63f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.37f)
                lineToRelative(2f, 7f)
                horizontalLineToRelative(4.13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.87f)
                close()
                moveTo(11.5f, 19f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(3.72f)
                lineToRelative(-0.86f, -3f)
                horizontalLineToRelative(-2.86f)
                close()
            }
        }.also { _PersonSeat = it}
