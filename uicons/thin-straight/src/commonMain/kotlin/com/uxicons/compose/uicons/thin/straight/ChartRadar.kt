package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartRadar: ImageVector? = null

val Icons.Ts.ChartRadar: ImageVector
    get() = _ChartRadar ?: UXIcon(name = "ChartRadar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.01f, 1f)
                lineTo(5.99f, 1f)
                lineTo(0f, 12f)
                lineToRelative(5.99f, 11f)
                horizontalLineToRelative(12.03f)
                lineToRelative(5.99f, -11f)
                lineTo(18.01f, 1f)
                close()
                moveTo(17.42f, 22f)
                lineTo(6.58f, 22f)
                lineTo(1.14f, 12f)
                lineTo(6.58f, 2f)
                horizontalLineToRelative(10.84f)
                lineToRelative(5.44f, 10f)
                lineToRelative(-5.44f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.03f, -0.52f, 0.08f)
                lineToRelative(-2.08f, -3.65f)
                curveToRelative(0.37f, -0.36f, 0.61f, -0.87f, 0.61f, -1.43f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.56f, 0.23f, 1.07f, 0.61f, 1.43f)
                lineToRelative(-2.08f, 3.65f)
                curveToRelative(-0.17f, -0.05f, -0.34f, -0.08f, -0.52f, -0.08f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.93f, 0f, 1.71f, -0.64f, 1.93f, -1.5f)
                horizontalLineToRelative(4.14f)
                curveToRelative(0.22f, 0.86f, 1f, 1.5f, 1.93f, 1.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(8f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(14.07f, 14.5f)
                horizontalLineToRelative(-4.14f)
                curveToRelative(-0.09f, -0.36f, -0.28f, -0.68f, -0.54f, -0.93f)
                lineToRelative(2.08f, -3.65f)
                curveToRelative(0.17f, 0.05f, 0.34f, 0.08f, 0.52f, 0.08f)
                reflectiveCurveToRelative(0.35f, -0.03f, 0.52f, -0.08f)
                lineToRelative(2.08f, 3.65f)
                curveToRelative(-0.26f, 0.25f, -0.44f, 0.57f, -0.54f, 0.93f)
                close()
                moveTo(16f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ChartRadar = it}
