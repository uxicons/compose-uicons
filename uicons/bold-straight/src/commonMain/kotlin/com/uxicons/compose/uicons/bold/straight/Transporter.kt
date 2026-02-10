package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transporter: ImageVector? = null

val Icons.Bs.Transporter: ImageVector
    get() = _Transporter ?: UXIcon(name = "Transporter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(4f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-9.42f)
                lineToRelative(-2.27f, 3.27f)
                lineToRelative(-2.47f, -1.71f)
                lineToRelative(3.9f, -5.64f)
                curveToRelative(0.66f, -0.94f, 1.73f, -1.51f, 2.88f, -1.51f)
                horizontalLineToRelative(3.9f)
                curveToRelative(1.15f, 0f, 2.22f, 0.56f, 2.88f, 1.51f)
                lineToRelative(3.9f, 5.64f)
                lineToRelative(-2.47f, 1.71f)
                lineToRelative(-2.27f, -3.27f)
                verticalLineToRelative(9.42f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
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
                moveTo(4.5f, 6.5f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                close()
            }
        }.also { _Transporter = it}
