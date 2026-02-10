package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Tr.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 24f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0.5f)
                curveTo(0f, 0.22f, 0.22f, 0f, 0.5f, 0f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(24f, 18.51f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -0.62f, -0.23f, -1.22f, -0.65f, -1.68f)
                lineToRelative(-2.59f, -2.86f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(-4.23f, -4.23f)
                curveToRelative(-0.94f, -0.94f, -2.6f, -0.94f, -3.53f, -0.0f)
                lineToRelative(-3.48f, 3.41f)
                curveToRelative(-0.48f, 0.47f, -0.75f, 1.12f, -0.75f, 1.79f)
                verticalLineToRelative(7.57f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(21.5f, 21f)
                curveToRelative(1.37f, 0f, 2.5f, -1.12f, 2.5f, -2.49f)
                close()
                moveTo(10.06f, 6.44f)
                horizontalLineToRelative(0f)
                lineToRelative(4.59f, 4.58f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.59f, -2.58f)
                curveToRelative(0.57f, -0.57f, 1.57f, -0.55f, 2.1f, -0.02f)
                lineToRelative(2.57f, 2.84f)
                curveToRelative(0.25f, 0.28f, 0.39f, 0.63f, 0.39f, 1.01f)
                verticalLineToRelative(6.23f)
                curveToRelative(-0.0f, 0.82f, -0.68f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 20.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7.57f)
                curveToRelative(0f, -0.4f, 0.16f, -0.79f, 0.45f, -1.07f)
                lineToRelative(3.49f, -3.42f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                reflectiveCurveToRelative(0.78f, 0.16f, 1.06f, 0.44f)
                close()
            }
        }.also { _ChartArea = it}
