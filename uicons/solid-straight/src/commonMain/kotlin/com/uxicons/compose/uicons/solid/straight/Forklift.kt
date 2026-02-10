package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forklift: ImageVector? = null

val Icons.Ss.Forklift: ImageVector
    get() = _Forklift ?: UXIcon(name = "Forklift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 21f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(3f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveTo(21f, 17f)
                lineTo(21f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-10.76f)
                lineToRelative(-0.64f, -2.27f)
                curveToRelative(-0.12f, -0.43f, -0.52f, -0.73f, -0.96f, -0.73f)
                lineTo(0f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9.53f, 11.19f)
                lineToRelative(0.23f, 0.81f)
                horizontalLineToRelative(5.95f)
                lineToRelative(-1.91f, -9.59f)
                curveToRelative(-0.28f, -1.4f, -1.52f, -2.41f, -2.94f, -2.41f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6.64f)
                curveToRelative(1.34f, 0f, 2.53f, 0.9f, 2.89f, 2.19f)
                close()
            }
        }.also { _Forklift = it}
