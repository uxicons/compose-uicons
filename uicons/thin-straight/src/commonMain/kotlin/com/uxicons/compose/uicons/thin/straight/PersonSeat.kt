package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeat: ImageVector? = null

val Icons.Ts.PersonSeat: ImageVector
    get() = _PersonSeat ?: UXIcon(name = "PersonSeat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(-2f, -7f)
                horizontalLineToRelative(-7.62f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(7f, 12f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.38f)
                lineToRelative(2f, 7f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(14.61f, 19f)
                lineToRelative(0.29f, 1f)
                horizontalLineToRelative(-6.4f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6.11f)
                close()
            }
        }.also { _PersonSeat = it}
