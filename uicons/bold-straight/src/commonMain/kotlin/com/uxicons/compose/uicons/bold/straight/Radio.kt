package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radio: ImageVector? = null

val Icons.Bs.Radio: ImageVector
    get() = _Radio ?: UXIcon(name = "Radio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.7f, 1.22f, -3.13f, 2.84f, -3.44f)
                lineTo(20.07f, 0.0f)
                lineToRelative(0.99f, 2.83f)
                lineToRelative(-9.01f, 3.17f)
                horizontalLineToRelative(8.44f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 9.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.53f, 9f)
                lineToRelative(-0.36f, 0.13f)
                curveToRelative(-0.1f, 0.09f, -0.17f, 0.23f, -0.17f, 0.37f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-11.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _Radio = it}
