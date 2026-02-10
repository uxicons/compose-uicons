package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Rs.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.93f, 14.12f)
                curveToRelative(1.17f, -1.91f, 2.07f, -4.04f, 2.07f, -6.12f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 2.08f, 0.9f, 4.21f, 2.07f, 6.12f)
                curveToRelative(-1.75f, 0.42f, -3.07f, 2.0f, -3.07f, 3.88f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(0.34f)
                curveToRelative(1.86f, 2.49f, 3.84f, 4.28f, 4.0f, 4.41f)
                lineToRelative(0.66f, 0.59f)
                lineToRelative(0.66f, -0.59f)
                curveToRelative(0.16f, -0.14f, 2.13f, -1.92f, 4.0f, -4.41f)
                horizontalLineToRelative(0.34f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.88f, -1.31f, -3.46f, -3.07f, -3.88f)
                close()
                moveTo(12f, 18.29f)
                curveToRelative(-1.69f, -1.66f, -6f, -6.3f, -6f, -10.29f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.98f, -4.31f, 8.63f, -6f, 10.29f)
                close()
                moveTo(15.79f, 9.29f)
                curveToRelative(-0.87f, 0.87f, -2.78f, 0.69f, -2.78f, 0.69f)
                curveToRelative(0f, 0f, -0.17f, -1.91f, 0.69f, -2.78f)
                curveToRelative(0.87f, -0.87f, 2.78f, -0.69f, 2.78f, -0.69f)
                curveToRelative(0f, 0f, 0.17f, 1.91f, -0.69f, 2.78f)
                close()
                moveTo(10.31f, 7.22f)
                curveToRelative(0.87f, 0.87f, 0.69f, 2.78f, 0.69f, 2.78f)
                curveToRelative(0f, 0f, -1.91f, 0.17f, -2.78f, -0.69f)
                reflectiveCurveToRelative(-0.69f, -2.78f, -0.69f, -2.78f)
                curveToRelative(0f, 0f, 1.91f, -0.17f, 2.78f, 0.69f)
                close()
            }
        }.also { _UserAlien = it}
