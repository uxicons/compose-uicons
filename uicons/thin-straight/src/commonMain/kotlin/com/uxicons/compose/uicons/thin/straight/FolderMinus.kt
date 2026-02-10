package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMinus: ImageVector? = null

val Icons.Ts.FolderMinus: ImageVector
    get() = _FolderMinus ?: UXIcon(name = "FolderMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 5.5f)
                verticalLineTo(23f)
                horizontalLineTo(0f)
                verticalLineTo(3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(11.88f)
                lineTo(7.88f, 2f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineToRelative(14f)
                horizontalLineTo(23f)
                close()
            }
        }.also { _FolderMinus = it}
