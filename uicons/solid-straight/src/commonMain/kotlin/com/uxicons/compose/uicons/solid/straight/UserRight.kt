package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserRight: ImageVector? = null

val Icons.Ss.UserRight: ImageVector
    get() = _UserRight ?: UXIcon(name = "UserRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(7.5f, 14f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(23.55f, 3.94f)
                lineTo(20.21f, 0.6f)
                lineTo(18.79f, 2.02f)
                lineTo(20.78f, 4f)
                horizontalLineToRelative(-5.78f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.85f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.34f, -3.34f)
                curveToRelative(0.6f, -0.6f, 0.6f, -1.59f, 0f, -2.19f)
                close()
            }
        }.also { _UserRight = it}
