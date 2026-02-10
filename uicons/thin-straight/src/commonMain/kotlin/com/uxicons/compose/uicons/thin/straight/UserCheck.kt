package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCheck: ImageVector? = null

val Icons.Ts.UserCheck: ImageVector
    get() = _UserCheck ?: UXIcon(name = "UserCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(5.24f, 1f, 8f, 1f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(23.98f, 9.17f)
                lineToRelative(-5.33f, 5.35f)
                curveToRelative(-0.32f, 0.32f, -0.73f, 0.48f, -1.15f, 0.48f)
                reflectiveCurveToRelative(-0.83f, -0.16f, -1.15f, -0.48f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.24f, 0.24f, 0.65f, 0.24f, 0.89f, 0f)
                lineToRelative(5.33f, -5.35f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _UserCheck = it}
