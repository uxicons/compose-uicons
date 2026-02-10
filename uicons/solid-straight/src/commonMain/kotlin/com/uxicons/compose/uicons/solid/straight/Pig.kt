package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Ss.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-0.3f, -1.37f, -0.93f, -2.62f, -1.82f, -3.62f)
                curveToRelative(-0.94f, -1.05f, -2.13f, -1.77f, -3.46f, -2.13f)
                lineTo(17.0f, 1f)
                curveToRelative(-1.87f, -0.11f, -3.43f, 1.25f, -3.88f, 3f)
                horizontalLineToRelative(-5.62f)
                curveToRelative(-2.0f, 0f, -3.82f, 0.73f, -5.22f, 1.95f)
                curveToRelative(-0.18f, -0.55f, -0.28f, -1.2f, -0.28f, -1.95f)
                lineTo(0f, 4f)
                curveToRelative(0f, 1.43f, 0.28f, 2.63f, 0.83f, 3.59f)
                curveTo(-0.01f, 8.86f, -0.5f, 10.37f, -0.5f, 12f)
                curveToRelative(0f, 2.85f, 1.55f, 5.5f, 4f, 6.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.59f)
                curveToRelative(2.02f, -0.82f, 3.6f, -2.44f, 4.41f, -4.41f)
                horizontalLineToRelative(2.09f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Pig = it}
