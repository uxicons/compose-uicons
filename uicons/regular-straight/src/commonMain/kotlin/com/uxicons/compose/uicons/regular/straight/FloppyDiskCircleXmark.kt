package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskCircleXmark: ImageVector? = null

val Icons.Rs.FloppyDiskCircleXmark: ImageVector
    get() = _FloppyDiskCircleXmark ?: UXIcon(name = "FloppyDiskCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 19f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                lineTo(16f, 2.82f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(2.41f)
                curveToRelative(0.7f, 0.16f, 1.37f, 0.4f, 2f, 0.72f)
                verticalLineToRelative(-3.96f)
                lineTo(16.01f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 21f)
                lineTo(8.95f, 21f)
                curveToRelative(-0.31f, -0.63f, -0.56f, -1.3f, -0.72f, -2f)
                lineTo(2f, 19f)
                close()
                moveTo(7f, 6f)
                lineTo(7f, 2f)
                horizontalLineToRelative(7f)
                lineTo(14f, 6f)
                lineTo(7f, 6f)
                close()
                moveTo(10.5f, 10f)
                curveToRelative(0.26f, 0f, 0.5f, 0.03f, 0.74f, 0.08f)
                curveToRelative(-1.74f, 1.45f, -2.92f, 3.55f, -3.19f, 5.92f)
                curveToRelative(-0.65f, -0.64f, -1.06f, -1.52f, -1.06f, -2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(20.05f, 15.36f)
                lineToRelative(-1.64f, 1.64f)
                lineToRelative(1.64f, 1.64f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.64f, -1.64f)
                lineToRelative(-1.64f, 1.64f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.64f, -1.64f)
                lineToRelative(-1.64f, -1.64f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.64f, 1.64f)
                lineToRelative(1.64f, -1.64f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _FloppyDiskCircleXmark = it}
