package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImproveUser: ImageVector? = null

val Icons.Bs.ImproveUser: ImageVector
    get() = _ImproveUser ?: UXIcon(name = "ImproveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-2f)
                lineToRelative(2.95f, -2.88f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0f)
                lineToRelative(2.95f, 2.88f)
                close()
                moveTo(4.05f, 14.12f)
                curveToRelative(-0.3f, -0.3f, -0.8f, -0.3f, -1.1f, 0f)
                lineToRelative(-2.95f, 2.88f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                lineToRelative(-2.95f, -2.88f)
                close()
                moveTo(18.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-4.3f)
                lineTo(11.15f, 0.03f)
                lineToRelative(-2.29f, 1.94f)
                lineToRelative(5.95f, 7.03f)
                horizontalLineToRelative(5.7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }.also { _ImproveUser = it}
