package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheeseburger: ImageVector? = null

val Icons.Ts.Cheeseburger: ImageVector
    get() = _Cheeseburger ?: UXIcon(name = "Cheeseburger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 0f)
                curveTo(5.94f, 0f, 1.0f, 4.94f, 1.0f, 11.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2.0f)
                curveTo(22.99f, 4.83f, 18.16f, 0f, 12.0f, 0f)
                close()
                moveTo(22.0f, 12f)
                lineTo(2.0f, 12f)
                verticalLineToRelative(-1f)
                curveTo(2.0f, 5.49f, 6.49f, 1.0f, 12.0f, 1.0f)
                curveToRelative(5.59f, 0f, 9.99f, 4.39f, 10f, 10f)
                verticalLineToRelative(1f)
                close()
                moveTo(1.0f, 16.0f)
                horizontalLineToRelative(9.29f)
                lineToRelative(5.21f, 5.21f)
                lineToRelative(5.21f, -5.21f)
                horizontalLineToRelative(2.29f)
                verticalLineToRelative(-1f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(1f)
                close()
                moveTo(15.5f, 19.79f)
                lineToRelative(-3.79f, -3.79f)
                horizontalLineToRelative(7.59f)
                lineToRelative(-3.79f, 3.79f)
                close()
                moveTo(21.54f, 18.0f)
                horizontalLineToRelative(1.47f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                reflectiveCurveToRelative(8.46f, 0f, 8.46f, 0f)
                lineToRelative(1f, 1f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1.47f)
                lineToRelative(1f, -1f)
                close()
            }
        }.also { _Cheeseburger = it}
