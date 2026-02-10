package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTimes: ImageVector? = null

val Icons.Bs.FolderTimes: ImageVector
    get() = _FolderTimes ?: UXIcon(name = "FolderTimes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                lineTo(24f, 23f)
                horizontalLineToRelative(-6.72f)
                curveToRelative(0.93f, -0.81f, 1.66f, -1.84f, 2.13f, -3f)
                horizontalLineToRelative(1.59f)
                lineTo(21f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.19f, 2.13f, 3f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18f, 17f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(15.06f, 17.94f)
                lineToRelative(-1.56f, -1.56f)
                verticalLineToRelative(-2.38f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.62f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _FolderTimes = it}
