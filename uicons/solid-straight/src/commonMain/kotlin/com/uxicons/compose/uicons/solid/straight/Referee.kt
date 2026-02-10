package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Ss.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(15.71f, 14f)
                lineTo(12f, 17.18f)
                lineTo(8.29f, 14f)
                curveToRelative(-0.42f, 0f, -0.88f, 0.02f, -1.29f, 0.12f)
                verticalLineToRelative(9.88f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.75f)
                lineToRelative(2f, 1.71f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.04f)
                lineToRelative(2f, -1.71f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9.88f)
                curveToRelative(-0.41f, -0.09f, -0.86f, -0.12f, -1.29f, -0.12f)
                close()
                moveTo(3f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.96f)
                curveToRelative(-1.21f, 0.92f, -2f, 2.35f, -2f, 3.96f)
                close()
                moveTo(19f, 15.04f)
                verticalLineToRelative(8.96f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.61f, -0.79f, -3.05f, -2f, -3.96f)
                close()
            }
        }.also { _Referee = it}
