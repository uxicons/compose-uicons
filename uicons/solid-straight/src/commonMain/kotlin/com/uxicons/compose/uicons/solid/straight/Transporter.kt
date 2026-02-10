package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter: ImageVector? = null

val Icons.Ss.Transporter: ImageVector
    get() = _Transporter ?: UXIcon(name = "Transporter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-12.52f)
                lineToRelative(-3.18f, 4.59f)
                lineToRelative(-1.65f, -1.14f)
                lineToRelative(3.9f, -5.64f)
                curveToRelative(0.56f, -0.81f, 1.48f, -1.29f, 2.47f, -1.29f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.98f, 0f, 1.91f, 0.48f, 2.47f, 1.29f)
                lineToRelative(3.9f, 5.64f)
                lineToRelative(-1.65f, 1.14f)
                lineToRelative(-3.18f, -4.59f)
                verticalLineToRelative(12.52f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveTo(21.67f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                close()
                moveTo(6.5f, 5.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                close()
            }
        }.also { _Transporter = it}
