package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Tc.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                curveToRelative(0f, 5.29f, 0.94f, 11.45f, 0.95f, 11.51f)
                curveToRelative(0.03f, 0.19f, 0.17f, 0.35f, 0.36f, 0.41f)
                curveToRelative(0.16f, 0.04f, 3.89f, 1.08f, 7.69f, 1.08f)
                reflectiveCurveToRelative(7.53f, -1.04f, 7.69f, -1.08f)
                curveToRelative(0.19f, -0.05f, 0.33f, -0.21f, 0.36f, -0.41f)
                curveToRelative(0.01f, -0.06f, 0.95f, -6.22f, 0.95f, -11.51f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                close()
                moveTo(12f, 2f)
                curveToRelative(5.83f, 0f, 8f, 2.17f, 8f, 8f)
                reflectiveCurveToRelative(-2.17f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -2.17f, -8f, -8f)
                reflectiveCurveToRelative(2.17f, -8f, 8f, -8f)
                close()
                moveTo(19.11f, 21.04f)
                curveToRelative(-0.97f, 0.25f, -4.06f, 0.96f, -7.11f, 0.96f)
                reflectiveCurveToRelative(-6.14f, -0.72f, -7.11f, -0.96f)
                curveToRelative(-0.11f, -0.77f, -0.39f, -2.81f, -0.6f, -5.26f)
                curveToRelative(1.37f, 2.22f, 3.86f, 3.23f, 7.71f, 3.23f)
                reflectiveCurveToRelative(6.35f, -1.01f, 7.71f, -3.23f)
                curveToRelative(-0.22f, 2.46f, -0.49f, 4.5f, -0.6f, 5.26f)
                close()
                moveTo(9.15f, 12.85f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.35f, -2.35f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.13f, -0.05f, 0.26f, -0.15f, 0.35f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                close()
            }
        }.also { _ClockDesk = it}
