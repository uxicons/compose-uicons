package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Tr.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.7f, 20.12f)
                lineTo(14.21f, 1.4f)
                curveToRelative(-0.43f, -0.84f, -1.27f, -1.37f, -2.21f, -1.37f)
                curveToRelative(-0.94f, 0f, -1.78f, 0.52f, -2.21f, 1.37f)
                lineTo(0.29f, 20.12f)
                curveToRelative(-0.43f, 0.85f, -0.39f, 1.83f, 0.11f, 2.64f)
                curveToRelative(0.49f, 0.8f, 1.33f, 1.27f, 2.26f, 1.27f)
                horizontalLineToRelative(18.67f)
                curveToRelative(0.93f, 0f, 1.77f, -0.48f, 2.26f, -1.27f)
                curveToRelative(0.5f, -0.81f, 0.54f, -1.79f, 0.11f, -2.64f)
                close()
                moveTo(6.55f, 10f)
                horizontalLineToRelative(10.9f)
                lineToRelative(3.04f, 6f)
                lineTo(3.51f, 16f)
                lineToRelative(3.04f, -6f)
                close()
                moveTo(10.68f, 1.85f)
                curveToRelative(0.26f, -0.51f, 0.75f, -0.82f, 1.32f, -0.82f)
                curveToRelative(0.57f, 0f, 1.06f, 0.31f, 1.32f, 0.82f)
                lineToRelative(3.62f, 7.15f)
                lineTo(7.05f, 9f)
                lineToRelative(3.62f, -7.15f)
                close()
                moveTo(22.75f, 22.24f)
                curveToRelative(-0.31f, 0.5f, -0.83f, 0.8f, -1.41f, 0.8f)
                lineTo(2.67f, 23.03f)
                curveToRelative(-0.58f, 0f, -1.11f, -0.3f, -1.41f, -0.8f)
                curveToRelative(-0.31f, -0.51f, -0.34f, -1.13f, -0.07f, -1.67f)
                lineToRelative(1.81f, -3.57f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                horizontalLineToRelative(18f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(1.81f, 3.57f)
                curveToRelative(0.27f, 0.53f, 0.24f, 1.16f, -0.07f, 1.67f)
                close()
            }
        }.also { _ChartPyramid = it}
