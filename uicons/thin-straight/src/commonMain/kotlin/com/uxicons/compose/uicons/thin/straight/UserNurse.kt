package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurse: ImageVector? = null

val Icons.Ts.UserNurse: ImageVector
    get() = _UserNurse ?: UXIcon(name = "UserNurse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.1f, -1f)
                horizontalLineToRelative(9.8f)
                curveToRelative(0.07f, 0.33f, 0.1f, 0.66f, 0.1f, 1f)
                close()
                moveTo(7f, 1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6f)
                lineTo(7f, 7f)
                lineTo(7f, 1f)
                close()
                moveTo(20.99f, 20.76f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.24f)
                curveToRelative(0f, -2.0f, -1.57f, -3.63f, -3.54f, -3.75f)
                lineToRelative(-4.45f, 5.08f)
                lineToRelative(-4.48f, -5.08f)
                curveToRelative(-1.97f, 0.11f, -3.54f, 1.75f, -3.54f, 3.75f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.24f)
                curveToRelative(0f, -2.62f, 2.13f, -4.76f, 4.76f, -4.76f)
                horizontalLineToRelative(0.23f)
                lineToRelative(4.03f, 4.57f)
                lineToRelative(4.01f, -4.57f)
                horizontalLineToRelative(0.23f)
                curveToRelative(2.62f, 0f, 4.76f, 2.13f, 4.76f, 4.76f)
                close()
                moveTo(12.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _UserNurse = it}
