package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartUser: ImageVector? = null

val Icons.Bs.ChartUser: ImageVector
    get() = _ChartUser ?: UXIcon(name = "ChartUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 17f)
                lineTo(3.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 0f)
                lineTo(8.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.71f)
                curveToRelative(0.48f, -0.14f, 0.98f, -0.21f, 1.5f, -0.21f)
                reflectiveCurveToRelative(1.02f, 0.08f, 1.5f, 0.21f)
                lineTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 15f)
                lineTo(10.74f, 15f)
                reflectiveCurveToRelative(-0.08f, 0.08f, -0.11f, 0.12f)
                curveToRelative(1.64f, 0.34f, 3.02f, 1.43f, 3.76f, 2.88f)
                horizontalLineToRelative(9.61f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(13.5f, 12.62f)
                lineToRelative(3.36f, -3.36f)
                lineToRelative(2.14f, 2.1f)
                lineTo(19f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.21f, 2.17f)
                lineToRelative(-3.33f, 3.33f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _ChartUser = it}
