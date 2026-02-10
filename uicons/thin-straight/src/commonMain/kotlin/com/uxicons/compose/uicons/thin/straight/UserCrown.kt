package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Ts.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 17f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(6f, 8f)
                lineTo(6f, 0.02f)
                lineToRelative(3.22f, 2.74f)
                lineTo(12f, 0.01f)
                lineToRelative(2.78f, 2.76f)
                lineTo(18f, 0.02f)
                verticalLineToRelative(7.98f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3.81f)
                lineToRelative(-2.28f, 1.94f)
                lineToRelative(-2.72f, -2.71f)
                lineToRelative(-2.72f, 2.71f)
                lineToRelative(-2.28f, -1.94f)
                verticalLineToRelative(3.81f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                lineTo(7f, 7f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _UserCrown = it}
