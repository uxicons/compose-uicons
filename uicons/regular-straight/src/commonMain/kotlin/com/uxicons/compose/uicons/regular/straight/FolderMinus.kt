package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMinus: ImageVector? = null

val Icons.Rs.FolderMinus: ImageVector
    get() = _FolderMinus ?: UXIcon(name = "FolderMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 6f)
                verticalLineTo(23f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(3f)
                horizontalLineTo(22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(11.76f)
                lineTo(7.76f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 21f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineToRelative(12f)
                horizontalLineTo(22f)
                close()
            }
        }.also { _FolderMinus = it}
