package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Tr.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15.5f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.08f, -0.42f, -0.22f)
                curveToRelative(-0.15f, -0.23f, -0.09f, -0.54f, 0.14f, -0.69f)
                lineToRelative(4.28f, -2.85f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.17f, -0.08f, 0.32f, -0.22f, 0.42f)
                lineToRelative(-4.5f, 3f)
                curveToRelative(-0.09f, 0.06f, -0.18f, 0.08f, -0.28f, 0.08f)
                close()
            }
        }.also { _Clock = it}
