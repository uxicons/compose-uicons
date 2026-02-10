package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrateDroplet: ImageVector? = null

val Icons.Ss.GrateDroplet: ImageVector
    get() = _GrateDroplet ?: UXIcon(name = "GrateDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 22.54f)
                horizontalLineToRelative(0f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-3.53f, -3.45f)
                lineToRelative(-3.54f, 3.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.46f, 3.54f)
                reflectiveCurveToRelative(2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                close()
                moveTo(6f, 0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(10f, 22f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                close()
                moveTo(16f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(16f, 0f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                close()
                moveTo(4f, 10f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-1f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                close()
                moveTo(16.15f, 12f)
                horizontalLineToRelative(-4.15f)
                verticalLineToRelative(7f)
                curveToRelative(0f, -1.87f, 0.73f, -3.63f, 2.05f, -4.95f)
                lineToRelative(2.1f, -2.05f)
                close()
            }
        }.also { _GrateDroplet = it}
