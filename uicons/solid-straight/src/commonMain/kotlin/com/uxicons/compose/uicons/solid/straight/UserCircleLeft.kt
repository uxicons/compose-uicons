package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCircleLeft: ImageVector? = null

val Icons.Ss.UserCircleLeft: ImageVector
    get() = _UserCircleLeft ?: UXIcon(name = "UserCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(17.5f, 0f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(21f, 7.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2.69f, -2.69f)
                curveToRelative(-0.42f, -0.42f, -0.42f, -1.09f, 0f, -1.51f)
                lineToRelative(2.69f, -2.69f)
                verticalLineToRelative(2.38f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _UserCircleLeft = it}
