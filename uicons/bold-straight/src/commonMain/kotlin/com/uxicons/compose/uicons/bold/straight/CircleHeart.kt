package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Bs.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.7f)
                curveToRelative(0f, 2.83f, -5f, 6.3f, -5f, 6.3f)
                curveToRelative(0f, 0f, -5f, -3.47f, -5f, -6.3f)
                curveToRelative(0f, -1.49f, 1.12f, -2.7f, 2.5f, -2.7f)
                reflectiveCurveToRelative(2.5f, 0.96f, 2.5f, 2.45f)
                curveToRelative(0f, -1.49f, 1.12f, -2.45f, 2.5f, -2.45f)
                reflectiveCurveToRelative(2.5f, 1.21f, 2.5f, 2.7f)
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
        }.also { _CircleHeart = it}
