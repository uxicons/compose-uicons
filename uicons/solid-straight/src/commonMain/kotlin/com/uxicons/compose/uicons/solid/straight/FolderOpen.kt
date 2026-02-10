package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Ss.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.83f, 10f)
                lineToRelative(-3.6f, 13f)
                horizontalLineTo(4.09f)
                lineToRelative(4.13f, -13f)
                horizontalLineToRelative(15.61f)
                close()
                moveTo(2f, 23f)
                lineToRelative(4.8f, -15f)
                horizontalLineToRelative(14.2f)
                reflectiveCurveToRelative(0f, -2f, 0f, -2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-7.76f)
                lineTo(6.24f, 1f)
                horizontalLineToRelative(-3.24f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _FolderOpen = it}
