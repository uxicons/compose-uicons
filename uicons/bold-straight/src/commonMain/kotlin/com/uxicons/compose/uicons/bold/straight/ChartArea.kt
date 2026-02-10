package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Bs.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 21f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(24f, 8.05f)
                verticalLineToRelative(10.95f)
                lineTo(5f, 19f)
                lineTo(5f, 8.05f)
                lineToRelative(3.02f, -3.02f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(1.52f, -1.52f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                lineToRelative(2.02f, 2.02f)
                close()
                moveTo(21f, 9.29f)
                lineToRelative(-1.15f, -1.15f)
                curveToRelative(-0.13f, -0.13f, -0.28f, -0.15f, -0.35f, -0.15f)
                reflectiveCurveToRelative(-0.23f, 0.02f, -0.35f, 0.15f)
                lineToRelative(-3.65f, 3.65f)
                lineToRelative(-4.65f, -4.65f)
                curveToRelative(-0.13f, -0.13f, -0.28f, -0.15f, -0.35f, -0.15f)
                reflectiveCurveToRelative(-0.23f, 0.02f, -0.35f, 0.15f)
                lineToRelative(-2.15f, 2.15f)
                verticalLineToRelative(6.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-6.71f)
                close()
            }
        }.also { _ChartArea = it}
