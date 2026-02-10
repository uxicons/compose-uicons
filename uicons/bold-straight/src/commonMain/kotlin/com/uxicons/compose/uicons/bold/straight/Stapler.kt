package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Bs.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.59f, 6.91f)
                lineToRelative(-15.16f, -3.81f)
                curveToRelative(-1.82f, -0.49f, -3.83f, 0.73f, -4.24f, 2.57f)
                lineToRelative(-1.21f, 4.93f)
                lineToRelative(3.02f, 0.76f)
                verticalLineToRelative(3.64f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.72f)
                curveToRelative(0f, -2.07f, -1.41f, -3.87f, -3.41f, -4.37f)
                close()
                moveTo(4.1f, 6.38f)
                curveToRelative(0.13f, -0.32f, 0.26f, -0.4f, 0.6f, -0.37f)
                lineToRelative(15.16f, 3.81f)
                curveToRelative(0.67f, 0.17f, 1.14f, 0.77f, 1.14f, 1.46f)
                verticalLineToRelative(1.51f)
                lineToRelative(-4.41f, -1.11f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(-12.99f, -3.25f)
                lineToRelative(0.5f, -2.03f)
                close()
                moveTo(18.0f, 16.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Stapler = it}
