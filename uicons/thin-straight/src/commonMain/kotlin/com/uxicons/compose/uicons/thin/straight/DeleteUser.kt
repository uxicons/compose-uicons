package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteUser: ImageVector? = null

val Icons.Ts.DeleteUser: ImageVector
    get() = _DeleteUser ?: UXIcon(name = "DeleteUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                close()
                moveTo(18f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(21.19f, 9.52f)
                lineToRelative(2.78f, 2.78f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.78f, -2.78f)
                lineToRelative(-2.78f, 2.78f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.78f, -2.78f)
                lineToRelative(-2.78f, -2.78f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.78f, 2.78f)
                lineToRelative(2.78f, -2.78f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.78f, 2.78f)
                close()
            }
        }.also { _DeleteUser = it}
