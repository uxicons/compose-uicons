package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Ts.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.76f, -1.29f, -3.2f, -3f, -3.44f)
                verticalLineToRelative(8.94f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.27f)
                lineToRelative(-2f, 1.71f)
                verticalLineToRelative(6.56f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.7f)
                lineToRelative(-1f, 0.86f)
                lineToRelative(-1f, -0.86f)
                verticalLineToRelative(5.7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6.56f)
                lineToRelative(-2f, -1.71f)
                verticalLineToRelative(8.27f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.94f)
                curveToRelative(-1.71f, 0.24f, -3f, 1.68f, -3f, 3.44f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(-0.01f, -2.5f, 2.03f, -4.5f, 4.53f, -4.49f)
                lineToRelative(4.47f, 3.83f)
                lineToRelative(4.47f, -3.83f)
                curveToRelative(2.5f, -0.01f, 4.54f, 1.99f, 4.53f, 4.49f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
            }
        }.also { _Referee = it}
