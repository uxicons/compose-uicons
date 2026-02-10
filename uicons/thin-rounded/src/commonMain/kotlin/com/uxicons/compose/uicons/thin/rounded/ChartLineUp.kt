package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Tr.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0.5f)
                curveTo(0f, 0.22f, 0.22f, 0f, 0.5f, 0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(21.5f, 5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                lineToRelative(-5.77f, 5.41f)
                curveToRelative(-0.58f, 0.58f, -1.54f, 0.59f, -2.15f, -0.03f)
                lineToRelative(-0.95f, -0.8f)
                curveToRelative(-0.94f, -0.94f, -2.6f, -0.94f, -3.53f, -0.01f)
                lineToRelative(-5.59f, 5.41f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.12f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                lineToRelative(5.59f, -5.42f)
                curveToRelative(0.57f, -0.57f, 1.52f, -0.6f, 2.15f, 0.03f)
                lineToRelative(0.95f, 0.8f)
                curveToRelative(0.97f, 0.97f, 2.56f, 0.97f, 3.52f, 0.01f)
                lineToRelative(5.77f, -5.41f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.65f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ChartLineUp = it}
