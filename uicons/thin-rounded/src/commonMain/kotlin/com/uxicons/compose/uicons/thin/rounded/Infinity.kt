package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Infinity: ImageVector? = null

val Icons.Tr.Infinity: ImageVector
    get() = _Infinity ?: UXIcon(name = "Infinity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.27f, 6f)
                curveToRelative(-3.35f, 0f, -5.41f, 3.13f, -6.27f, 4.8f)
                curveToRelative(-0.86f, -1.67f, -2.92f, -4.8f, -6.27f, -4.8f)
                curveToRelative(-3.16f, 0f, -5.73f, 2.69f, -5.73f, 6f)
                reflectiveCurveToRelative(2.57f, 6f, 5.73f, 6f)
                curveToRelative(3.35f, 0f, 5.41f, -3.13f, 6.27f, -4.8f)
                curveToRelative(0.86f, 1.67f, 2.92f, 4.8f, 6.27f, 4.8f)
                curveToRelative(3.16f, 0f, 5.73f, -2.69f, 5.73f, -6f)
                reflectiveCurveToRelative(-2.57f, -6f, -5.73f, -6f)
                close()
                moveTo(5.73f, 17f)
                curveToRelative(-2.61f, 0f, -4.73f, -2.24f, -4.73f, -5f)
                reflectiveCurveToRelative(2.12f, -5f, 4.73f, -5f)
                curveToRelative(3.38f, 0f, 5.34f, 4.09f, 5.73f, 5f)
                curveToRelative(-0.4f, 0.91f, -2.35f, 5f, -5.73f, 5f)
                close()
                moveTo(18.27f, 17f)
                curveToRelative(-3.38f, 0f, -5.34f, -4.09f, -5.73f, -5f)
                curveToRelative(0.4f, -0.91f, 2.35f, -5f, 5.73f, -5f)
                curveToRelative(2.61f, 0f, 4.73f, 2.24f, 4.73f, 5f)
                reflectiveCurveToRelative(-2.12f, 5f, -4.73f, 5f)
                close()
            }
        }.also { _Infinity = it}
