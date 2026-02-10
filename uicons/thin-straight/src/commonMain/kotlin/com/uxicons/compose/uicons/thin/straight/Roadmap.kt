package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Roadmap: ImageVector? = null

val Icons.Ts.Roadmap: ImageVector
    get() = _Roadmap ?: UXIcon(name = "Roadmap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(2f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(10.5f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.87f, 23f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(2f, 13f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(6f, 10f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0f, 0.34f, 0.04f, 0.68f, 0.13f, 1f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
                moveTo(19f, 5.98f)
                lineToRelative(4.94f, -2.98f)
                lineTo(19.09f, 0f)
                horizontalLineToRelative(-1.09f)
                lineTo(18f, 10f)
                horizontalLineToRelative(1f)
                lineTo(19f, 5.98f)
                close()
                moveTo(19f, 1.12f)
                lineToRelative(3.02f, 1.87f)
                lineToRelative(-3.02f, 1.82f)
                lineTo(19f, 1.12f)
                close()
            }
        }.also { _Roadmap = it}
