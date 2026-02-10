package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderArchive: ImageVector? = null

val Icons.Bs.FolderArchive: ImageVector
    get() = _FolderArchive ?: UXIcon(name = "FolderArchive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.41f, -2.5f, 1.06f)
                curveToRelative(-0.64f, -0.65f, -1.52f, -1.06f, -2.5f, -1.06f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(10f, 21f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 10f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 10f)
                close()
                moveTo(8f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _FolderArchive = it}
