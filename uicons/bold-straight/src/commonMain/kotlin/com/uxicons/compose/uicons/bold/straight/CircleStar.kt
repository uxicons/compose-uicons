package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleStar: ImageVector? = null

val Icons.Bs.CircleStar: ImageVector
    get() = _CircleStar ?: UXIcon(name = "CircleStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.74f, 17.39f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.33f, 4.03f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _CircleStar = it}
