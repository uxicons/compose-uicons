package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter1: ImageVector? = null

val Icons.Ss.Transporter1: ImageVector
    get() = _Transporter1 ?: UXIcon(name = "Transporter1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(4.18f, 12.93f)
                lineToRelative(3.9f, -5.64f)
                curveToRelative(0.56f, -0.81f, 1.48f, -1.29f, 2.47f, -1.29f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.98f, 0f, 1.91f, 0.48f, 2.47f, 1.29f)
                lineToRelative(3.9f, 5.64f)
                lineToRelative(-1.65f, 1.14f)
                lineToRelative(-3.18f, -4.59f)
                verticalLineToRelative(4.52f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4.52f)
                lineToRelative(-3.18f, 4.59f)
                lineToRelative(-1.65f, -1.14f)
                close()
                moveTo(5.17f, 4.67f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineTo(0.5f, 3.5f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                close()
                moveTo(21.5f, 4.5f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                close()
                moveTo(4f, 24f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Transporter1 = it}
