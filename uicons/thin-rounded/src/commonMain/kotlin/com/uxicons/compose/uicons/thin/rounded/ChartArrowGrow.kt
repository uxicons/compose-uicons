package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArrowGrow: ImageVector? = null

val Icons.Tr.ChartArrowGrow: ImageVector
    get() = _ChartArrowGrow ?: UXIcon(name = "ChartArrowGrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.52f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0f)
                lineToRelative(-20f, -0.02f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0.45f)
                curveTo(0f, 0.17f, 0.22f, -0.05f, 0.5f, -0.05f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(20.05f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineToRelative(20f, 0.02f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(24f, 5.74f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 0.56f, -0.32f, 1.04f, -0.83f, 1.25f)
                curveToRelative(-0.17f, 0.07f, -0.35f, 0.11f, -0.53f, 0.11f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.14f, -0.95f, -0.4f)
                lineToRelative(-1.8f, -1.8f)
                lineToRelative(-4.15f, 4.15f)
                curveToRelative(-0.67f, 0.67f, -1.83f, 0.67f, -2.5f, 0f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.3f, -0.3f, -0.79f, -0.3f, -1.09f, 0f)
                lineToRelative(-6.6f, 6.6f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(6.6f, -6.6f)
                curveToRelative(0.69f, -0.69f, 1.81f, -0.69f, 2.5f, 0f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.3f, 1.09f, 0f)
                lineToRelative(4.15f, -4.15f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(-0.4f, -0.4f, -0.51f, -0.96f, -0.29f, -1.48f)
                reflectiveCurveToRelative(0.69f, -0.83f, 1.25f, -0.83f)
                horizontalLineToRelative(3.91f)
                curveToRelative(0.96f, 0f, 1.74f, 0.78f, 1.74f, 1.74f)
                close()
                moveTo(23f, 5.74f)
                curveToRelative(0f, -0.41f, -0.33f, -0.73f, -0.73f, -0.73f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(-0.21f, 0f, -0.3f, 0.15f, -0.33f, 0.22f)
                curveToRelative(-0.03f, 0.07f, -0.07f, 0.23f, 0.08f, 0.39f)
                lineToRelative(4.29f, 4.29f)
                curveToRelative(0.15f, 0.15f, 0.32f, 0.1f, 0.39f, 0.08f)
                curveToRelative(0.07f, -0.03f, 0.22f, -0.11f, 0.22f, -0.33f)
                verticalLineToRelative(-3.91f)
                close()
            }
        }.also { _ChartArrowGrow = it}
