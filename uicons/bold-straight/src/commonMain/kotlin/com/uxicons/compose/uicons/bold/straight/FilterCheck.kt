package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterCheck: ImageVector? = null

val Icons.Bs.FilterCheck: ImageVector
    get() = _FilterCheck ?: UXIcon(name = "FilterCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 8.44f)
                lineTo(18.75f, 8.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
                moveTo(13.0f, 12.22f)
                curveToRelative(0.79f, 0.64f, 1.71f, 1.13f, 2.71f, 1.43f)
                lineToRelative(-0.71f, 0.86f)
                verticalLineToRelative(9.49f)
                lineToRelative(-8.01f, -4.79f)
                verticalLineToRelative(-4.68f)
                lineToRelative(-6.99f, -8.49f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9.24f)
                curveToRelative(-0.93f, 0.81f, -1.67f, 1.81f, -2.15f, 2.98f)
                lineToRelative(-7.1f, 0.02f)
                curveToRelative(-0.27f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.46f)
                lineToRelative(6.99f, 8.49f)
                verticalLineToRelative(4.06f)
                lineToRelative(2.01f, 1.2f)
                verticalLineToRelative(-5.27f)
                lineToRelative(1f, -1.21f)
                close()
            }
        }.also { _FilterCheck = it}
