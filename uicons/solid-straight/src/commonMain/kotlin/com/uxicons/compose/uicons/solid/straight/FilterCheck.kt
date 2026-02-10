package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterCheck: ImageVector? = null

val Icons.Ss.FilterCheck: ImageVector
    get() = _FilterCheck ?: UXIcon(name = "FilterCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 8.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(14.9f, 13.37f)
                lineTo(14.0f, 14.38f)
                verticalLineToRelative(9.62f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineToRelative(-8.0f, -9.0f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -1.65f, 1.35f, -3.0f, 3f, -3.0f)
                horizontalLineToRelative(9.73f)
                curveToRelative(-1.67f, 1.47f, -2.73f, 3.61f, -2.73f, 6f)
                curveToRelative(0f, 3.31f, 2.02f, 6.16f, 4.89f, 7.37f)
                close()
            }
        }.also { _FilterCheck = it}
