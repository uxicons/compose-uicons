package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raygun: ImageVector? = null

val Icons.Rs.Raygun: ImageVector
    get() = _Raygun ?: UXIcon(name = "Raygun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                lineTo(20f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.35f, 0f, -3.89f, 0.37f, -6.5f, 1.14f)
                curveTo(6.16f, 0.46f, 3.73f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, 2.21f, 1.79f, 2.48f, 4.92f)
                curveTo(0.99f, 6.03f, 0f, 7.39f, 0f, 9f)
                curveToRelative(0f, 1.71f, 1.1f, 3.12f, 2.73f, 4.26f)
                lineTo(0.04f, 22.37f)
                lineToRelative(-0.04f, 1.63f)
                horizontalLineToRelative(7.01f)
                lineToRelative(2.12f, -7.96f)
                curveToRelative(2.38f, 0.65f, 4.63f, 0.96f, 5.87f, 0.96f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(2.41f, 1.19f, 4f, 3f, 4f, 3f)
                lineTo(24.0f, 5f)
                reflectiveCurveToRelative(-1.59f, 1.81f, -4f, 3f)
                close()
                moveTo(5.47f, 22f)
                horizontalLineToRelative(-3.24f)
                lineToRelative(2.27f, -7.69f)
                curveToRelative(0.85f, 0.43f, 1.77f, 0.81f, 2.71f, 1.13f)
                lineToRelative(-1.74f, 6.56f)
                close()
                moveTo(14f, 14.94f)
                curveToRelative(-3.89f, -0.38f, -12f, -2.68f, -12f, -5.94f)
                reflectiveCurveTo(10.11f, 3.44f, 14f, 3.06f)
                verticalLineToRelative(11.89f)
                close()
            }
        }.also { _Raygun = it}
