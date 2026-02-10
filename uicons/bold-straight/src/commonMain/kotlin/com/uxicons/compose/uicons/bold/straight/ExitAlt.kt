package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExitAlt: ImageVector? = null

val Icons.Bs.ExitAlt: ImageVector
    get() = _ExitAlt ?: UXIcon(name = "ExitAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(17.74f, 14.37f)
                lineToRelative(-1.11f, -2.4f)
                horizontalLineToRelative(1.39f)
                lineToRelative(1.21f, 2.63f)
                lineToRelative(2.72f, -1.26f)
                lineToRelative(-2.02f, -4.37f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(-1.01f, 0f, -1.97f, 0.44f, -2.63f, 1.19f)
                lineToRelative(-1.64f, 2.81f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.87f)
                lineToRelative(0.75f, -1.31f)
                lineToRelative(1.06f, 2.3f)
                lineToRelative(-3.68f, 2.6f)
                verticalLineToRelative(4.43f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.88f)
                lineToRelative(3.39f, -2.4f)
                curveToRelative(1.44f, -0.91f, 2.01f, -2.71f, 1.34f, -4.34f)
                close()
                moveTo(17.0f, 3.5f)
                lineToRelative(0.0f, 3.5f)
                lineToRelative(3f, -0.0f)
                lineToRelative(-0.0f, -3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, -0f)
                curveTo(2.57f, 0f, 1f, 1.57f, 1f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(19.01f, 19f)
                lineToRelative(-0.02f, -0.05f)
                curveToRelative(-0.39f, 0.55f, -0.88f, 1.04f, -1.48f, 1.42f)
                lineToRelative(-0.91f, 0.65f)
                lineToRelative(0.4f, 0.98f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.99f)
                close()
            }
        }.also { _ExitAlt = it}
