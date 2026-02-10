package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrateDroplet: ImageVector? = null

val Icons.Sr.GrateDroplet: ImageVector
    get() = _GrateDroplet ?: UXIcon(name = "GrateDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4f)
                lineTo(6f, 0f)
                horizontalLineToRelative(4f)
                close()
                moveTo(10f, 22f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(4f, 0.1f)
                curveTo(1.72f, 0.56f, 0f, 2.58f, 0f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                lineTo(4f, 0.1f)
                close()
                moveTo(4f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.42f, 1.72f, 4.44f, 4f, 4.9f)
                verticalLineToRelative(-9.9f)
                close()
                moveTo(18f, 0.1f)
                verticalLineToRelative(9.9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.42f, -1.72f, -4.44f, -4f, -4.9f)
                close()
                moveTo(19f, 24f)
                curveToRelative(-1.34f, 0f, -2.59f, -0.52f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-1.46f, -2.2f, -1.46f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
                lineToRelative(2.21f, -2.96f)
                curveToRelative(0.73f, -0.72f, 1.93f, -0.72f, 2.66f, 0f)
                lineToRelative(2.2f, 2.96f)
                curveToRelative(0.95f, 0.95f, 1.47f, 2.21f, 1.47f, 3.54f)
                reflectiveCurveToRelative(-0.52f, 2.59f, -1.47f, 3.54f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.47f, -3.54f, 1.47f)
                close()
                moveTo(15.57f, 12f)
                horizontalLineToRelative(-3.57f)
                verticalLineToRelative(7f)
                curveToRelative(0f, -1.82f, 0.69f, -3.53f, 1.94f, -4.84f)
                lineToRelative(1.63f, -2.16f)
                close()
            }
        }.also { _GrateDroplet = it}
