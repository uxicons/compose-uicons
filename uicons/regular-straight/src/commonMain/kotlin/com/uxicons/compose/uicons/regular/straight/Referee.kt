package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Rs.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.29f, -0.84f, -2.4f, -2f, -2.81f)
                verticalLineToRelative(7.82f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.75f)
                lineToRelative(-2f, 1.71f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.04f)
                lineToRelative(-2f, -1.71f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.82f)
                curveToRelative(-1.16f, 0.42f, -2f, 1.52f, -2f, 2.81f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.7f, 2.2f, -4.94f, 4.91f, -4.99f)
                lineToRelative(0.38f, -0.01f)
                lineToRelative(3.71f, 3.18f)
                lineToRelative(3.71f, -3.18f)
                lineToRelative(0.38f, 0.01f)
                curveToRelative(2.71f, 0.05f, 4.91f, 2.29f, 4.91f, 4.99f)
                close()
            }
        }.also { _Referee = it}
