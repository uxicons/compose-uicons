package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Roadmap: ImageVector? = null

val Icons.Bs.Roadmap: ImageVector
    get() = _Roadmap ?: UXIcon(name = "Roadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                lineTo(15f, 7f)
                verticalLineToRelative(3f)
                lineTo(7f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.28f)
                curveToRelative(-0.17f, 0.47f, -0.28f, 0.97f, -0.28f, 1.5f)
                reflectiveCurveToRelative(0.11f, 1.03f, 0.28f, 1.5f)
                horizontalLineToRelative(-1.28f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                close()
                moveTo(19.5f, 14f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.72f, 20f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(12.78f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(2.5f, 19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10f, 15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(20f, 5f)
                lineToRelative(4f, -2.5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 10f)
                horizontalLineToRelative(3f)
                lineTo(20f, 5f)
                close()
            }
        }.also { _Roadmap = it}
