package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerHorizontal: ImageVector? = null

val Icons.Rr.RulerHorizontal: ImageVector
    get() = _RulerHorizontal ?: UXIcon(name = "RulerHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6.96f)
                lineTo(4f, 6.96f)
                curveTo(1.79f, 6.96f, 0f, 8.75f, 0f, 10.96f)
                verticalLineToRelative(2.04f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(20f, 17f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-1.02f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineTo(20f, 8.96f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2.04f)
                close()
            }
        }.also { _RulerHorizontal = it}
