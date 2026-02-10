package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Ts.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, -0.01f)
                verticalLineToRelative(9.97f)
                curveToRelative(-0.02f, -0.02f, -0.05f, -0.04f, -0.07f, -0.05f)
                lineTo(10f, 0.01f)
                verticalLineToRelative(7.28f)
                lineTo(0f, 0.04f)
                verticalLineToRelative(23.94f)
                lineToRelative(10f, -7.27f)
                verticalLineToRelative(7.3f)
                lineToRelative(12.91f, -9.9f)
                curveToRelative(0.03f, -0.02f, 0.06f, -0.04f, 0.09f, -0.06f)
                verticalLineToRelative(9.94f)
                horizontalLineToRelative(1f)
                lineTo(24f, -0.01f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(22.32f, 13.3f)
                lineToRelative(-11.32f, 8.68f)
                verticalLineToRelative(-7.23f)
                lineTo(1f, 22.02f)
                lineTo(1f, 2.0f)
                lineToRelative(10f, 7.25f)
                lineTo(11f, 2.03f)
                lineToRelative(11.33f, 8.67f)
                curveToRelative(0.42f, 0.3f, 0.67f, 0.78f, 0.67f, 1.29f)
                reflectiveCurveToRelative(-0.25f, 1.0f, -0.68f, 1.3f)
                close()
            }
        }.also { _ForwardFast = it}
