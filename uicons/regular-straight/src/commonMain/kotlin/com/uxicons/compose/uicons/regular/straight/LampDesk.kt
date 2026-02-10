package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDesk: ImageVector? = null

val Icons.Rs.LampDesk: ImageVector
    get() = _LampDesk ?: UXIcon(name = "LampDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.1f, 8.58f)
                lineToRelative(2.85f, -2.85f)
                lineTo(16.59f, 0.82f)
                curveToRelative(-1.93f, -1.29f, -4.52f, -1.03f, -6.16f, 0.61f)
                curveToRelative(-1.31f, 1.31f, -1.74f, 3.23f, -1.2f, 4.93f)
                lineToRelative(-4.23f, 4.23f)
                verticalLineToRelative(11.41f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-10.59f)
                lineToRelative(3.22f, -3.22f)
                lineToRelative(4.51f, 6.76f)
                lineToRelative(2.85f, -2.85f)
                curveToRelative(0.04f, 0.06f, 0.09f, 0.11f, 0.15f, 0.17f)
                curveToRelative(0.98f, 0.98f, 2.56f, 0.98f, 3.54f, 0f)
                reflectiveCurveToRelative(0.98f, -2.56f, 0f, -3.54f)
                curveToRelative(-0.06f, -0.06f, -0.11f, -0.1f, -0.17f, -0.15f)
                close()
                moveTo(11.48f, 6.48f)
                curveToRelative(-0.76f, -1.14f, -0.61f, -2.67f, 0.36f, -3.63f)
                curveToRelative(0.56f, -0.56f, 1.29f, -0.84f, 2.04f, -0.84f)
                curveToRelative(0.55f, 0f, 1.11f, 0.16f, 1.59f, 0.48f)
                lineToRelative(5.34f, 3.56f)
                lineToRelative(-5.77f, 5.77f)
                lineToRelative(-3.56f, -5.34f)
                close()
            }
        }.also { _LampDesk = it}
