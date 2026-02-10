package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raygun: ImageVector? = null

val Icons.Ss.Raygun: ImageVector
    get() = _Raygun ?: UXIcon(name = "Raygun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.14f, 15.27f)
                curveToRelative(1.65f, 1.05f, 3.62f, 1.85f, 5.54f, 2.43f)
                lineToRelative(-1.67f, 6.3f)
                lineTo(0f, 24.0f)
                lineToRelative(0.04f, -1.63f)
                lineToRelative(2.1f, -7.1f)
                close()
                moveTo(20f, 8f)
                lineTo(20f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.35f, 0f, -3.9f, 0.37f, -6.51f, 1.15f)
                curveTo(6.15f, 0.47f, 3.73f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, 2.22f, 1.79f, 2.47f, 4.93f)
                curveTo(0.99f, 6.04f, 0f, 7.39f, 0f, 9f)
                curveToRelative(0f, 5.51f, 11.51f, 8f, 15f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(2.42f, 1.19f, 4f, 3f, 4f, 3f)
                lineTo(24f, 5f)
                reflectiveCurveToRelative(-1.58f, 1.81f, -4f, 3f)
                close()
            }
        }.also { _Raygun = it}
