package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Sr.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveToRelative(-7.85f, 0f, -12f, -1.38f, -12f, -4f)
                reflectiveCurveToRelative(4.15f, -4f, 12f, -4f)
                curveToRelative(7.96f, 0f, 12f, 1.35f, 12f, 4f)
                reflectiveCurveToRelative(-4.04f, 4f, -12f, 4f)
                close()
                moveTo(12.5f, 15f)
                curveToRelative(-7.85f, 0f, -9.5f, -2.17f, -9.5f, -4f)
                reflectiveCurveToRelative(1.65f, -4f, 9.5f, -4f)
                curveToRelative(5.95f, 0f, 9.5f, 1.5f, 9.5f, 4f)
                reflectiveCurveToRelative(-3.55f, 4f, -9.5f, 4f)
                close()
                moveTo(10f, 6f)
                curveToRelative(-3.65f, 0f, -6f, -1.18f, -6f, -3f)
                reflectiveCurveToRelative(2.35f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 1.18f, 6f, 3f)
                reflectiveCurveToRelative(-2.35f, 3f, -6f, 3f)
                close()
            }
        }.also { _Spa = it}
