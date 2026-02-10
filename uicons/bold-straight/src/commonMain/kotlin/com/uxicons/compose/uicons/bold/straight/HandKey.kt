package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandKey: ImageVector? = null

val Icons.Bs.HandKey: ImageVector
    get() = _HandKey ?: UXIcon(name = "HandKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7.86f)
                curveToRelative(-2.01f, 0f, -3.64f, -1.63f, -3.64f, -3.64f)
                curveToRelative(0f, -1.8f, 1.34f, -3.35f, 3.13f, -3.6f)
                lineToRelative(5.16f, -0.74f)
                lineToRelative(0.42f, 2.97f)
                lineToRelative(-5.16f, 0.74f)
                curveToRelative(-0.31f, 0.04f, -0.55f, 0.32f, -0.55f, 0.64f)
                curveToRelative(0f, 0.35f, 0.29f, 0.64f, 0.64f, 0.64f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(11.77f, 3f)
                lineToRelative(-4.95f, 3.43f)
                curveToRelative(-0.72f, -0.28f, -1.5f, -0.43f, -2.32f, -0.43f)
                curveToRelative(-0.85f, 0f, -1.66f, 0.17f, -2.41f, 0.47f)
                curveToRelative(0.22f, -0.3f, 0.49f, -0.58f, 0.8f, -0.81f)
                lineTo(10.81f, 0f)
                horizontalLineToRelative(9.69f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8.85f, 13.61f)
                curveToRelative(-0.33f, 1.28f, -1.2f, 2.33f, -2.35f, 2.91f)
                verticalLineToRelative(5.48f)
                lineToRelative(-2.0f, 2f)
                lineToRelative(-2.0f, -2f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.03f, -1.08f)
                curveToRelative(-1.68f, -0.65f, -2.87f, -2.27f, -2.87f, -4.18f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.95f, 0f, 1.82f, 0.3f, 2.55f, 0.8f)
                curveToRelative(-0.03f, 0.23f, -0.05f, 0.46f, -0.05f, 0.69f)
                curveToRelative(0f, 1.64f, 0.72f, 3.1f, 1.85f, 4.11f)
                close()
                moveTo(6f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _HandKey = it}
