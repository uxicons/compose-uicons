package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWinter: ImageVector? = null

val Icons.Rr.HatWinter: ImageVector
    get() = _HatWinter ?: UXIcon(name = "HatWinter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.9f, 17.3f)
                curveToRelative(-0.53f, -5.15f, -3.46f, -11.68f, -8.14f, -13.03f)
                curveToRelative(0.45f, -0.45f, 0.73f, -1.08f, 0.73f, -1.77f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.69f, 0.28f, 1.32f, 0.73f, 1.77f)
                curveToRelative(-4.67f, 1.35f, -7.61f, 7.88f, -8.14f, 13.03f)
                curveToRelative(-1.23f, 0.54f, -2.1f, 1.77f, -2.1f, 3.2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.43f, -0.86f, -2.66f, -2.1f, -3.2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(3.86f, 0f, 7.16f, 5.61f, 7.86f, 11f)
                lineTo(4.14f, 17f)
                curveToRelative(0.09f, -0.67f, 0.22f, -1.34f, 0.38f, -2f)
                horizontalLineToRelative(11.48f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5.13f, 13f)
                curveToRelative(1.41f, -3.85f, 3.98f, -7f, 6.87f, -7f)
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
