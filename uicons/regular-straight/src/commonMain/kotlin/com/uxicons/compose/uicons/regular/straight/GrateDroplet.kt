package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrateDroplet: ImageVector? = null

val Icons.Rs.GrateDroplet: ImageVector
    get() = _GrateDroplet ?: UXIcon(name = "GrateDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.47f, 3.54f)
                reflectiveCurveToRelative(-2.2f, 1.47f, -3.54f, 1.47f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-1.46f, -2.2f, -1.46f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
                lineToRelative(3.54f, -3.46f)
                lineToRelative(3.53f, 3.45f)
                curveToRelative(0.95f, 0.95f, 1.47f, 2.21f, 1.47f, 3.54f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(-2.12f, -2.08f)
                lineToRelative(-2.13f, 2.08f)
                curveToRelative(-0.56f, 0.56f, -0.87f, 1.31f, -0.87f, 2.11f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.88f, 2.12f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                close()
                moveTo(12f, 12f)
                verticalLineToRelative(10f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9.14f)
                lineToRelative(-2f, -1.96f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9.16f)
                lineToRelative(-0.85f, 0.83f)
                horizontalLineToRelative(-4.15f)
                close()
                moveTo(12f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(15f, 2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(10f, 2f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                lineTo(5f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(2f, 20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _GrateDroplet = it}
