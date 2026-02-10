package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Tr.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.57f, 12.66f)
                curveToRelative(-0.14f, -0.24f, -0.07f, -0.54f, 0.17f, -0.69f)
                lineToRelative(3.76f, -2.25f)
                verticalLineToRelative(-5.22f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.18f, -0.09f, 0.34f, -0.24f, 0.43f)
                lineToRelative(-4f, 2.4f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.26f, 0.07f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.09f, -0.43f, -0.24f)
                close()
                moveTo(22f, 10.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.05f, 0.01f, -1.13f, 0.02f, -1.18f)
                curveTo(2.37f, 4.12f, 6.71f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9.63f, 4.12f, 9.98f, 9.32f)
                curveToRelative(0.01f, 0.05f, 0.02f, 1.13f, 0.02f, 1.18f)
                close()
                moveTo(3f, 10f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 1f, 12f, 1f)
                reflectiveCurveTo(3f, 5.04f, 3f, 10f)
                close()
                moveTo(21f, 14.36f)
                curveToRelative(-1.62f, 3.34f, -5.05f, 5.64f, -9f, 5.64f)
                reflectiveCurveToRelative(-7.38f, -2.31f, -9f, -5.64f)
                verticalLineToRelative(5.14f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.14f)
                close()
            }
        }.also { _ClockDesk = it}
