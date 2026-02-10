package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SelfCare: ImageVector? = null

val Icons.Ss.SelfCare: ImageVector
    get() = _SelfCare ?: UXIcon(name = "SelfCare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 23.2f)
                reflectiveCurveToRelative(-4f, -2.78f, -4f, -5.04f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.77f, 2f, 1.96f)
                curveToRelative(0f, -1.19f, 0.9f, -1.96f, 2f, -1.96f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                curveToRelative(0f, 2.26f, -4f, 5.04f, -4f, 5.04f)
                close()
            }
        }.also { _SelfCare = it}
