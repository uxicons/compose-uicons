package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLogout: ImageVector? = null

val Icons.Ts.UserLogout: ImageVector
    get() = _UserLogout ?: UXIcon(name = "UserLogout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(15f, 21.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(23.52f, 17.51f)
                lineTo(20.83f, 15.14f)
                lineTo(20.17f, 15.89f)
                lineTo(22.56f, 18.0f)
                horizontalLineToRelative(-5.56f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.7f)
                lineToRelative(-2.53f, 2.23f)
                lineToRelative(0.66f, 0.75f)
                lineToRelative(2.68f, -2.37f)
                curveToRelative(0.31f, -0.27f, 0.48f, -0.65f, 0.48f, -1.05f)
                reflectiveCurveToRelative(-0.18f, -0.79f, -0.48f, -1.05f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
            }
        }.also { _UserLogout = it}
