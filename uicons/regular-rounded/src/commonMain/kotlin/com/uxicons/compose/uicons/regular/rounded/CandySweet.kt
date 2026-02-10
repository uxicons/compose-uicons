package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandySweet: ImageVector? = null

val Icons.Rr.CandySweet: ImageVector
    get() = _CandySweet ?: UXIcon(name = "CandySweet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 9.68f)
                curveToRelative(-0.1f, -0.76f, -1.01f, -1.09f, -1.59f, -0.58f)
                lineToRelative(-1.42f, 1.26f)
                curveToRelative(-0.77f, -4.18f, -4.44f, -7.36f, -8.84f, -7.36f)
                reflectiveCurveTo(3.93f, 6.18f, 3.16f, 10.36f)
                lineToRelative(-1.42f, -1.26f)
                curveToRelative(-0.57f, -0.51f, -1.48f, -0.18f, -1.59f, 0.58f)
                curveTo(0.07f, 10.3f, 0f, 11.09f, 0f, 12f)
                reflectiveCurveToRelative(0.07f, 1.7f, 0.15f, 2.32f)
                curveToRelative(0.1f, 0.76f, 1.01f, 1.09f, 1.59f, 0.58f)
                lineToRelative(1.42f, -1.26f)
                curveToRelative(0.77f, 4.18f, 4.44f, 7.36f, 8.84f, 7.36f)
                reflectiveCurveToRelative(8.07f, -3.18f, 8.84f, -7.36f)
                lineToRelative(1.42f, 1.26f)
                curveToRelative(0.57f, 0.51f, 1.48f, 0.18f, 1.59f, -0.58f)
                curveToRelative(0.09f, -0.62f, 0.15f, -1.4f, 0.15f, -2.32f)
                reflectiveCurveToRelative(-0.07f, -1.7f, -0.15f, -2.32f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(0.78f, 0f, 1.52f, 0.13f, 2.22f, 0.37f)
                lineTo(5.37f, 14.22f)
                curveToRelative(-0.23f, -0.7f, -0.37f, -1.44f, -0.37f, -2.22f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                close()
                moveTo(6.33f, 16.09f)
                lineToRelative(9.76f, -9.76f)
                curveToRelative(0.61f, 0.44f, 1.15f, 0.98f, 1.59f, 1.59f)
                lineToRelative(-9.76f, 9.76f)
                curveToRelative(-0.61f, -0.44f, -1.15f, -0.98f, -1.59f, -1.59f)
                close()
                moveTo(12f, 19.0f)
                curveToRelative(-0.78f, 0f, -1.52f, -0.13f, -2.22f, -0.37f)
                lineToRelative(8.85f, -8.85f)
                curveToRelative(0.23f, 0.7f, 0.37f, 1.44f, 0.37f, 2.22f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _CandySweet = it}
