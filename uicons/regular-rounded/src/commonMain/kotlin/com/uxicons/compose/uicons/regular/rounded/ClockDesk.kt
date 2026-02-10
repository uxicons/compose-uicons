package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Rr.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.17f, 12.55f)
                curveToRelative(-0.31f, -0.46f, -0.18f, -1.08f, 0.28f, -1.39f)
                lineToRelative(2.56f, -1.7f)
                verticalLineToRelative(-3.46f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.33f, -0.17f, 0.65f, -0.45f, 0.83f)
                lineToRelative(-3f, 2f)
                curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.55f, 0.17f)
                curveToRelative(-0.32f, 0f, -0.64f, -0.16f, -0.83f, -0.45f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.08f, 0.03f, -0.73f, 0.03f, -0.73f)
                curveTo(2.4f, 4.1f, 6.73f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9.6f, 4.1f, 9.97f, 9.27f)
                curveToRelative(0.02f, 0.07f, 0.03f, 0.65f, 0.03f, 0.73f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveTo(16.41f, 2f, 12f, 2f)
                reflectiveCurveTo(4f, 5.59f, 4f, 10f)
                close()
                moveTo(20f, 15.99f)
                curveToRelative(-1.83f, 2.43f, -4.73f, 4.01f, -8f, 4.01f)
                reflectiveCurveToRelative(-6.17f, -1.58f, -8f, -4.01f)
                verticalLineToRelative(3.01f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3.01f)
                close()
            }
        }.also { _ClockDesk = it}
