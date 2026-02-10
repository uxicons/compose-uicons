package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oven: ImageVector? = null

val Icons.Rs.Oven: ImageVector
    get() = _Oven ?: UXIcon(name = "Oven") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                lineTo(4f, 8f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 22f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                lineTo(4f, 22f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-8f)
                lineTo(6f, 12f)
                verticalLineToRelative(8f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10.5f, 5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15f, 5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(6f, 5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Oven = it}
