package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr8: ImageVector? = null

val Icons.Tr.Tr8: ImageVector
    get() = _Tr8 ?: UXIcon(name = "Tr8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.39f, 9.39f)
                curveToRelative(1.55f, -0.85f, 2.61f, -2.5f, 2.61f, -4.39f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 2.24f, 7f, 5f)
                curveToRelative(0f, 1.89f, 1.06f, 3.54f, 2.61f, 4.39f)
                curveToRelative(-2.97f, 1f, -5.11f, 3.81f, -5.11f, 7.11f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -3.3f, -2.14f, -6.11f, -5.11f, -7.11f)
                close()
                moveTo(8f, 5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
            }
        }.also { _Tr8 = it}
