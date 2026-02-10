package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserXmark: ImageVector? = null

val Icons.Ts.UserXmark: ImageVector
    get() = _UserXmark ?: UXIcon(name = "UserXmark") {
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
                moveTo(20.71f, 11.5f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.3f, 3.3f)
                close()
            }
        }.also { _UserXmark = it}
