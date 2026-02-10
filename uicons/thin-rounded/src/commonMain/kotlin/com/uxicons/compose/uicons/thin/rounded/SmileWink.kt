package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileWink: ImageVector? = null

val Icons.Tr.SmileWink: ImageVector
    get() = _SmileWink ?: UXIcon(name = "SmileWink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17.37f, 15.17f)
                curveToRelative(0.18f, 0.21f, 0.17f, 0.52f, -0.04f, 0.71f)
                curveToRelative(-0.1f, 0.09f, -2.41f, 2.13f, -5.33f, 2.13f)
                reflectiveCurveToRelative(-5.24f, -2.04f, -5.33f, -2.13f)
                curveToRelative(-0.21f, -0.18f, -0.22f, -0.5f, -0.04f, -0.71f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.71f, -0.04f)
                curveToRelative(0.02f, 0.02f, 2.14f, 1.87f, 4.67f, 1.87f)
                reflectiveCurveToRelative(4.65f, -1.85f, 4.67f, -1.87f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.17f, 0.71f, 0.04f)
                close()
                moveTo(9.5f, 11f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.5f, 1.45f, 1.5f, 2.5f, 1.5f)
                reflectiveCurveToRelative(2.5f, 0f, 2.5f, -1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.5f, 10f)
                curveToRelative(-1.35f, 0f, -1.5f, -0.1f, -1.5f, -0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.4f, -0.15f, 0.5f, -1.5f, 0.5f)
                close()
            }
        }.also { _SmileWink = it}
