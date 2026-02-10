package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExitAlt: ImageVector? = null

val Icons.Ss.ExitAlt: ImageVector
    get() = _ExitAlt ?: UXIcon(name = "ExitAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 21f)
                lineToRelative(-0.4f, -0.98f)
                lineToRelative(0.91f, -0.65f)
                curveToRelative(0.32f, -0.2f, 0.6f, -0.44f, 0.86f, -0.7f)
                lineToRelative(0.13f, 0.32f)
                horizontalLineToRelative(4f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6.0f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineToRelative(-0.0f, 21f)
                horizontalLineToRelative(8.02f)
                verticalLineToRelative(-4.97f)
                lineToRelative(2.83f, -2.31f)
                lineToRelative(-1.67f, -3.62f)
                lineToRelative(-1.09f, 1.9f)
                horizontalLineToRelative(-5.1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.94f)
                lineToRelative(1.73f, -2.98f)
                curveToRelative(0.57f, -0.65f, 1.39f, -1.02f, 2.26f, -1.02f)
                horizontalLineToRelative(4.71f)
                lineToRelative(1.89f, 4.08f)
                lineToRelative(-1.81f, 0.84f)
                lineToRelative(-1.35f, -2.92f)
                horizontalLineToRelative(-1.99f)
                lineToRelative(1.43f, 3.11f)
                curveToRelative(0.56f, 1.37f, 0.09f, 2.89f, -1.1f, 3.68f)
                lineToRelative(-2.68f, 2.19f)
                verticalLineToRelative(4.03f)
                horizontalLineToRelative(8.98f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(11.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _ExitAlt = it}
