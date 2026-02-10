package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forklift: ImageVector? = null

val Icons.Bs.Forklift: ImageVector
    get() = _Forklift ?: UXIcon(name = "Forklift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18f)
                lineTo(22f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3.19f)
                lineToRelative(-2.02f, -10.19f)
                curveToRelative(-0.33f, -1.63f, -1.77f, -2.81f, -3.43f, -2.81f)
                lineTo(3.5f, -0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.59f, -3f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(6.86f)
                curveToRelative(0.24f, 0f, 0.44f, 0.17f, 0.49f, 0.4f)
                lineToRelative(1.92f, 9.6f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(-0.12f, -0.45f)
                curveToRelative(-0.42f, -1.5f, -1.81f, -2.55f, -3.37f, -2.55f)
                horizontalLineToRelative(-3.64f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(13.77f, 18f)
                lineTo(3f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3.64f)
                curveToRelative(0.22f, 0f, 0.42f, 0.15f, 0.48f, 0.36f)
                lineToRelative(0.74f, 2.64f)
                horizontalLineToRelative(5.51f)
                lineToRelative(0.4f, 2f)
                close()
            }
        }.also { _Forklift = it}
