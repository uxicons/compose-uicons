package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Ss.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 4.67f)
                verticalLineToRelative(-4.67f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(-16.99f, 0f, -17.33f, -16.63f, -17.33f, -17.33f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.87f)
                curveToRelative(-0.83f, 0f, -1.62f, -0.33f, -2.21f, -0.92f)
                lineToRelative(-7.01f, -7.01f)
                curveToRelative(-0.59f, -0.59f, -0.92f, -1.37f, -0.92f, -2.21f)
                verticalLineToRelative(-2.87f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.87f)
                curveToRelative(0f, 0.3f, 0.12f, 0.58f, 0.33f, 0.79f)
                lineToRelative(7.01f, 7.01f)
                curveToRelative(0.21f, 0.21f, 0.49f, 0.33f, 0.79f, 0.33f)
                horizontalLineToRelative(2.87f)
                close()
                moveTo(9.44f, 11.56f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                reflectiveCurveToRelative(-1.54f, 0.59f, -2.12f, 0f)
                close()
                moveTo(16.44f, 18.56f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                reflectiveCurveToRelative(-1.54f, 0.59f, -2.12f, 0f)
                close()
            }
        }.also { _SkatePark = it}
