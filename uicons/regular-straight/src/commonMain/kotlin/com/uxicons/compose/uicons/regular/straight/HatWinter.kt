package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Rs.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.91f, 17.3f)
                curveToRelative(-0.56f, -5.28f, -3.56f, -11.68f, -8.13f, -13.04f)
                curveToRelative(0.45f, -0.45f, 0.72f, -1.07f, 0.72f, -1.76f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.69f, 0.28f, 1.31f, 0.72f, 1.76f)
                curveToRelative(-4.57f, 1.35f, -7.58f, 7.76f, -8.13f, 13.04f)
                curveToRelative(-1.23f, 0.54f, -2.09f, 1.77f, -2.09f, 3.2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.43f, -0.86f, -2.66f, -2.09f, -3.2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(3.83f, 0f, 7.17f, 5.64f, 7.87f, 11f)
                lineTo(4.13f, 17f)
                curveToRelative(0.09f, -0.67f, 0.21f, -1.34f, 0.38f, -2f)
                horizontalLineToRelative(12.91f)
                curveToRelative(-0.19f, -0.69f, -0.42f, -1.36f, -0.69f, -2f)
                lineTo(5.13f, 13f)
                curveToRelative(1.42f, -3.84f, 4.01f, -7f, 6.87f, -7f)
                close()
                moveTo(20.5f, 22f)
                lineTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HatWinter = it}
