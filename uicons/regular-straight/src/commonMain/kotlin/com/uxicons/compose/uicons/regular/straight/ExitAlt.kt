package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExitAlt: ImageVector? = null

val Icons.Rs.ExitAlt: ImageVector
    get() = _ExitAlt ?: UXIcon(name = "ExitAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.8f, 14.11f)
                lineToRelative(-1.43f, -3.11f)
                horizontalLineToRelative(1.99f)
                lineToRelative(1.35f, 2.92f)
                lineToRelative(1.81f, -0.84f)
                lineToRelative(-1.89f, -4.08f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-0.86f, 0f, -1.69f, 0.37f, -2.26f, 1.02f)
                lineToRelative(-1.73f, 2.98f)
                horizontalLineToRelative(-3.94f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.1f)
                lineToRelative(1.09f, -1.9f)
                lineToRelative(1.67f, 3.62f)
                lineToRelative(-2.83f, 2.31f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.03f)
                lineToRelative(2.68f, -2.19f)
                curveToRelative(1.19f, -0.79f, 1.66f, -2.31f, 1.1f, -3.68f)
                close()
                moveTo(18f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(4.0f, 0f)
                curveTo(2.35f, 0f, 1.0f, 1.35f, 1.0f, 3f)
                lineToRelative(-0.0f, 21f)
                horizontalLineToRelative(2f)
                lineToRelative(0.0f, -21f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18f, 19f)
                lineToRelative(-0.13f, -0.32f)
                curveToRelative(-0.26f, 0.26f, -0.54f, 0.49f, -0.86f, 0.7f)
                lineToRelative(-0.91f, 0.65f)
                lineToRelative(0.4f, 0.98f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _ExitAlt = it}
