package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SelfCare: ImageVector? = null

val Icons.Sr.SelfCare: ImageVector
    get() = _SelfCare ?: UXIcon(name = "SelfCare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(13.15f, 22.3f)
                curveToRelative(-0.67f, 0.57f, -1.64f, 0.57f, -2.31f, 0f)
                curveToRelative(-1.18f, -1.0f, -2.85f, -2.68f, -2.85f, -4.14f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.77f, 2f, 1.96f)
                curveToRelative(0f, -1.19f, 0.9f, -1.96f, 2f, -1.96f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                curveToRelative(0f, 1.46f, -1.67f, 3.13f, -2.85f, 4.14f)
                close()
            }
        }.also { _SelfCare = it}
