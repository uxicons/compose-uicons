package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserUp: ImageVector? = null

val Icons.Ss.UserUp: ImageVector
    get() = _UserUp ?: UXIcon(name = "UserUp") {
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
                moveTo(23.47f, 3.79f)
                lineTo(20.13f, 0.45f)
                curveToRelative(-0.29f, -0.29f, -0.68f, -0.45f, -1.09f, -0.45f)
                curveToRelative(-0.41f, 0f, -0.8f, 0.16f, -1.09f, 0.45f)
                lineToRelative(-3.34f, 3.34f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.98f, -1.98f)
                verticalLineToRelative(5.78f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.85f)
                lineToRelative(2.06f, 2.06f)
                close()
            }
        }.also { _UserUp = it}
