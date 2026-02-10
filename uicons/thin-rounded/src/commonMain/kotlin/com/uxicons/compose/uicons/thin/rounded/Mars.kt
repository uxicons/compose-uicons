package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mars: ImageVector? = null

val Icons.Tr.Mars: ImageVector
    get() = _Mars ?: UXIcon(name = "Mars") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                lineToRelative(-8.0f, 8.0f)
                curveToRelative(-1.5f, -1.34f, -3.48f, -2.15f, -5.64f, -2.15f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -2.16f, -0.81f, -4.14f, -2.15f, -5.64f)
                lineTo(22.85f, 1.85f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.65f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8.5f, 23f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                close()
            }
        }.also { _Mars = it}
