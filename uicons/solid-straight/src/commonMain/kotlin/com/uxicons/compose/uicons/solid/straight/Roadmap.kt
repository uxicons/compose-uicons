package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Roadmap: ImageVector? = null

val Icons.Ss.Roadmap: ImageVector
    get() = _Roadmap ?: UXIcon(name = "Roadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(10.5f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-3.63f)
                curveToRelative(0.08f, 0.32f, 0.13f, 0.66f, 0.13f, 1f)
                reflectiveCurveToRelative(-0.04f, 0.68f, -0.13f, 1f)
                horizontalLineToRelative(3.63f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                lineTo(5.87f, 21f)
                curveToRelative(0.08f, 0.32f, 0.13f, 0.66f, 0.13f, 1f)
                reflectiveCurveToRelative(-0.04f, 0.68f, -0.13f, 1f)
                horizontalLineToRelative(14.13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 5f)
                lineToRelative(4f, -2.5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 10f)
                horizontalLineToRelative(2f)
                lineTo(20f, 5f)
                close()
                moveTo(6f, 16.95f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(2.63f)
                curveToRelative(-0.08f, -0.32f, -0.13f, -0.66f, -0.13f, -1f)
                reflectiveCurveToRelative(0.04f, -0.68f, 0.13f, -1f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-2f)
                lineTo(6.5f, 8f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 2.31f, 1.76f, 4.2f, 4f, 4.45f)
                close()
            }
        }.also { _Roadmap = it}
