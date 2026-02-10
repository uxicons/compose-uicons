package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskPen: ImageVector? = null

val Icons.Ts.FloppyDiskPen: ImageVector
    get() = _FloppyDiskPen ?: UXIcon(name = "FloppyDiskPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(11f)
                lineTo(15f, 1f)
                horizontalLineToRelative(0.42f)
                lineToRelative(4.58f, 4.58f)
                verticalLineToRelative(3.68f)
                curveToRelative(0.32f, -0.11f, 0.65f, -0.19f, 1f, -0.23f)
                verticalLineToRelative(-3.86f)
                lineTo(15.84f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(1f, 20f)
                lineTo(1f, 3f)
                close()
                moveTo(14f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6f)
                close()
                moveTo(23.27f, 11.73f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.98f, -3.54f, 0f)
                lineToRelative(-8.73f, 8.73f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(8.73f, -8.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                close()
                moveTo(22.56f, 14.56f)
                lineToRelative(-8.44f, 8.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(8.44f, -8.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
                moveTo(13f, 14.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(10f, 16.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _FloppyDiskPen = it}
