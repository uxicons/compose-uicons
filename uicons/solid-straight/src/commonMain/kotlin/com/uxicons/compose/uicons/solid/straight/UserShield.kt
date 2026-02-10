package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Ss.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(18.46f, 23.97f)
                lineToRelative(-0.6f, -0.3f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.43f)
                curveToRelative(0f, -1.08f, 0.69f, -2.03f, 1.71f, -2.37f)
                lineToRelative(3.79f, -1.25f)
                lineToRelative(3.79f, 1.25f)
                curveToRelative(1.02f, 0.34f, 1.71f, 1.29f, 1.71f, 2.37f)
                verticalLineToRelative(3.43f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                lineToRelative(-0.63f, 0.25f)
                close()
                moveTo(11f, 17.4f)
                verticalLineToRelative(-3.4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14.65f)
                curveToRelative(-1.73f, -1.35f, -3.65f, -3.54f, -3.65f, -6.6f)
                close()
            }
        }.also { _UserShield = it}
