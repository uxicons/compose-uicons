package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArrowDown: ImageVector? = null

val Icons.Tr.ChartArrowDown: ImageVector
    get() = _ChartArrowDown ?: UXIcon(name = "ChartArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineToRelative(-20.0f, -0.0f)
                curveToRelative(-0.92f, -0.03f, -1.81f, -0.36f, -2.48f, -1.02f)
                curveToRelative(-0.66f, -0.66f, -1.03f, -1.54f, -1.03f, -2.48f)
                lineTo(0f, 0.5f)
                curveTo(0f, 0.22f, 0.22f, 0f, 0.5f, 0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(20.0f)
                curveToRelative(0f, 0.67f, 0.26f, 1.3f, 0.73f, 1.77f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(0.0f)
                lineToRelative(20.0f, 0.0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 13.36f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 0.96f, -0.78f, 1.74f, -1.74f, 1.74f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(-0.56f, 0f, -1.04f, -0.32f, -1.25f, -0.83f)
                reflectiveCurveToRelative(-0.1f, -1.08f, 0.29f, -1.48f)
                lineToRelative(1.78f, -1.78f)
                lineToRelative(-4.17f, -4.17f)
                curveToRelative(-0.29f, -0.29f, -0.75f, -0.28f, -1.04f, 0f)
                lineToRelative(-0.74f, 0.74f)
                curveToRelative(-0.68f, 0.68f, -1.77f, 0.68f, -2.45f, 0f)
                lineToRelative(-6.63f, -6.63f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(6.63f, 6.63f)
                curveToRelative(0.29f, 0.28f, 0.75f, 0.28f, 1.04f, 0f)
                lineToRelative(0.74f, -0.74f)
                curveToRelative(0.68f, -0.68f, 1.77f, -0.68f, 2.45f, 0f)
                lineToRelative(4.17f, 4.17f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.4f, -0.4f, 0.96f, -0.51f, 1.48f, -0.29f)
                curveToRelative(0.52f, 0.21f, 0.83f, 0.69f, 0.83f, 1.25f)
                close()
                moveTo(23f, 13.36f)
                curveToRelative(0f, -0.21f, -0.17f, -0.35f, -0.36f, -0.35f)
                curveToRelative(-0.07f, 0f, -0.16f, 0.02f, -0.24f, 0.1f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.15f, 0.15f, -0.1f, 0.32f, -0.08f, 0.39f)
                curveToRelative(0.03f, 0.07f, 0.11f, 0.22f, 0.33f, 0.22f)
                horizontalLineToRelative(3.91f)
                curveToRelative(0.41f, 0f, 0.73f, -0.33f, 0.73f, -0.73f)
                verticalLineToRelative(-3.91f)
                close()
            }
        }.also { _ChartArrowDown = it}
