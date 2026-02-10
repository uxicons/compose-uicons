package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDot: ImageVector? = null

val Icons.Bs.ArrowsToDot: ImageVector
    get() = _ArrowsToDot ?: UXIcon(name = "ArrowsToDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(11.18f, 8.12f)
                curveToRelative(0.46f, 0.46f, 1.19f, 0.46f, 1.65f, 0f)
                lineToRelative(4.12f, -4.12f)
                horizontalLineToRelative(-3.45f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.45f)
                close()
                moveTo(8.12f, 12.82f)
                curveToRelative(0.46f, -0.46f, 0.46f, -1.19f, 0f, -1.65f)
                lineToRelative(-4.12f, -4.12f)
                verticalLineToRelative(3.45f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.45f)
                close()
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.45f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(-0.46f, 0.46f, -0.46f, 1.19f, 0f, 1.65f)
                lineToRelative(4.12f, 4.12f)
                verticalLineToRelative(-3.45f)
                horizontalLineToRelative(4f)
                close()
                moveTo(12.82f, 15.88f)
                curveToRelative(-0.46f, -0.46f, -1.19f, -0.46f, -1.65f, 0f)
                lineToRelative(-4.12f, 4.12f)
                horizontalLineToRelative(3.45f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.45f)
                close()
            }
        }.also { _ArrowsToDot = it}
