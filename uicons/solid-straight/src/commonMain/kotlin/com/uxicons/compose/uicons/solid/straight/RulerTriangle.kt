package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerTriangle: ImageVector? = null

val Icons.Ss.RulerTriangle: ImageVector
    get() = _RulerTriangle ?: UXIcon(name = "RulerTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 19.87f)
                lineToRelative(-3.19f, -3.19f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-1.47f, -1.47f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.5f, -2.5f)
                lineTo(4.13f, 0.71f)
                curveTo(3.44f, 0.02f, 2.4f, -0.19f, 1.5f, 0.19f)
                curveTo(0.59f, 0.56f, 0.0f, 1.44f, 0.0f, 2.42f)
                lineTo(0.0f, 24f)
                lineTo(21.58f, 24f)
                curveToRelative(0.98f, 0f, 1.86f, -0.59f, 2.23f, -1.49f)
                reflectiveCurveToRelative(0.17f, -1.94f, -0.52f, -2.63f)
                close()
                moveTo(6.0f, 18f)
                verticalLineToRelative(-5.41f)
                lineToRelative(5.41f, 5.41f)
                lineTo(6.0f, 18f)
                close()
            }
        }.also { _RulerTriangle = it}
