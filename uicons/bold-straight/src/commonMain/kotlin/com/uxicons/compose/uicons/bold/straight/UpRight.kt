package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Bs.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.83f, 23.3f)
                lineTo(0.71f, 16.18f)
                lineTo(10.4f, 6.49f)
                lineTo(5.05f, 1f)
                horizontalLineToRelative(14.54f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.91f, 0f, 1.76f, 0.35f, 2.4f, 1f)
                curveToRelative(0.64f, 0.64f, 1f, 1.5f, 0.99f, 2.41f)
                verticalLineToRelative(14.53f)
                reflectiveCurveToRelative(-5.48f, -5.33f, -5.48f, -5.33f)
                lineTo(7.83f, 23.3f)
                close()
                moveTo(4.95f, 16.18f)
                lineToRelative(2.88f, 2.88f)
                lineToRelative(9.66f, -9.66f)
                lineToRelative(2.51f, 2.44f)
                lineTo(20f, 4.41f)
                curveToRelative(0f, -0.14f, -0.07f, -0.23f, -0.12f, -0.29f)
                curveToRelative(-0.05f, -0.05f, -0.15f, -0.12f, -0.28f, -0.12f)
                horizontalLineToRelative(-7.44f)
                reflectiveCurveToRelative(2.45f, 2.51f, 2.45f, 2.51f)
                lineTo(4.95f, 16.18f)
                close()
            }
        }.also { _UpRight = it}
