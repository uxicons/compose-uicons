package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subfolder: ImageVector? = null

val Icons.Ss.Subfolder: ImageVector
    get() = _Subfolder ?: UXIcon(name = "Subfolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(3.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.71f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(3.29f)
                curveToRelative(1.13f, 0f, 2.16f, 0.39f, 3f, 1.03f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(12.24f)
                lineTo(8.24f, 1f)
                horizontalLineTo(3f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                close()
            }
        }.also { _Subfolder = it}
