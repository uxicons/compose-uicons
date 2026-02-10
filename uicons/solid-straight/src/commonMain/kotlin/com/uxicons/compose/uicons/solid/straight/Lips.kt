package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lips: ImageVector? = null

val Icons.Ss.Lips: ImageVector
    get() = _Lips ?: UXIcon(name = "Lips") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.88f, 11.52f)
                curveToRelative(-2.23f, -4.05f, -5.11f, -6.85f, -6.89f, -8.02f)
                curveToRelative(-1.22f, -0.79f, -2.84f, -0.62f, -3.88f, 0.41f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(-1.11f, -1.11f)
                curveToRelative(-1.03f, -1.03f, -2.66f, -1.2f, -3.88f, -0.41f)
                curveTo(5.14f, 4.73f, 2.29f, 7.67f, 0.13f, 11.48f)
                lineToRelative(-0.13f, 0.27f)
                verticalLineToRelative(0.53f)
                lineToRelative(0.13f, 0.23f)
                curveToRelative(0.17f, 0.31f, 4.37f, 7.49f, 11.87f, 7.49f)
                reflectiveCurveToRelative(11.69f, -7.18f, 11.87f, -7.48f)
                lineToRelative(0.13f, -0.25f)
                verticalLineToRelative(-0.52f)
                lineToRelative(-0.12f, -0.23f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-4.52f, 0f, -9.55f, -2f, -9.55f, -2f)
                curveToRelative(0f, 0f, 5.03f, -2f, 9.55f, -2f)
                reflectiveCurveToRelative(9.54f, 2.0f, 9.55f, 2f)
                curveToRelative(0f, 0f, -5.03f, 2f, -9.55f, 2f)
                close()
            }
        }.also { _Lips = it}
