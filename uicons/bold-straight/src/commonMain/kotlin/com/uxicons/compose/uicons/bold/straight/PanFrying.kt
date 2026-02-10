package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PanFrying: ImageVector? = null

val Icons.Bs.PanFrying: ImageVector
    get() = _PanFrying ?: UXIcon(name = "PanFrying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 21.86f)
                lineToRelative(-5.08f, -5.08f)
                curveToRelative(1.31f, -1.75f, 2.09f, -3.93f, 2.09f, -6.29f)
                curveTo(21f, 4.71f, 16.29f, 0f, 10.5f, 0f)
                reflectiveCurveTo(0f, 4.71f, 0f, 10.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(2.35f, 0f, 4.53f, -0.78f, 6.29f, -2.09f)
                lineToRelative(5.08f, 5.08f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(3f, 10.5f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.36f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.36f, -7.5f, -7.5f)
                close()
                moveTo(16f, 10.25f)
                curveToRelative(0f, -1.42f, -1.23f, -2.49f, -2.62f, -2.63f)
                curveToRelative(-0.73f, -1.49f, -2.11f, -2.62f, -3.88f, -2.62f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.79f, 0f, 3.43f, -1.35f, 3.43f, -3.14f)
                curveToRelative(0f, -0.02f, -0.0f, -0.03f, -0.0f, -0.05f)
                curveToRelative(0.89f, -0.46f, 1.57f, -1.49f, 1.57f, -2.56f)
                close()
                moveTo(9f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _PanFrying = it}
