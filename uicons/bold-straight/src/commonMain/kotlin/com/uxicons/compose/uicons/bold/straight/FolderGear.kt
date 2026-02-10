package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderGear: ImageVector? = null

val Icons.Bs.FolderGear: ImageVector
    get() = _FolderGear ?: UXIcon(name = "FolderGear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                verticalLineToRelative(7.22f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                verticalLineToRelative(-3.59f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.07f)
                curveToRelative(0.14f, 1.08f, 0.49f, 2.1f, 1.01f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(23.93f, 16.3f)
                lineToRelative(-1.53f, 0.88f)
                curveToRelative(0.05f, 0.27f, 0.08f, 0.54f, 0.08f, 0.82f)
                reflectiveCurveToRelative(-0.03f, 0.55f, -0.08f, 0.82f)
                lineToRelative(1.53f, 0.88f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.54f, -0.89f)
                curveToRelative(-0.41f, 0.35f, -0.88f, 0.63f, -1.4f, 0.81f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.78f)
                curveToRelative(-0.52f, -0.19f, -0.99f, -0.46f, -1.4f, -0.81f)
                lineToRelative(-1.54f, 0.89f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.53f, -0.88f)
                curveToRelative(-0.05f, -0.27f, -0.08f, -0.54f, -0.08f, -0.82f)
                reflectiveCurveToRelative(0.03f, -0.55f, 0.08f, -0.82f)
                lineToRelative(-1.53f, -0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.54f, 0.89f)
                curveToRelative(0.41f, -0.35f, 0.88f, -0.63f, 1.4f, -0.81f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.78f)
                curveToRelative(0.52f, 0.19f, 0.99f, 0.46f, 1.4f, 0.81f)
                lineToRelative(1.54f, -0.89f)
                lineToRelative(1.5f, 2.6f)
                close()
                moveTo(19.49f, 18f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _FolderGear = it}
