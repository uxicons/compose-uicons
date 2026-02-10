package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Bs.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5.27f)
                curveToRelative(0.31f, 1.39f, 0.67f, 2.91f, 0.92f, 4f)
                horizontalLineToRelative(3.35f)
                verticalLineToRelative(3f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -1.37f, -0.47f, -2.63f, -1.24f, -3.64f)
                lineToRelative(-4.55f, 3.64f)
                horizontalLineToRelative(2.79f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                lineTo(15.28f, 0.98f)
                curveToRelative(-0.94f, -0.62f, -2.07f, -0.98f, -3.28f, -0.98f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
            }
        }.also { _UserInjured = it}
