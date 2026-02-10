package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExport: ImageVector? = null

val Icons.Ts.FileExport: ImageVector
    get() = _FileExport ?: UXIcon(name = "FileExport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.57f, 17.55f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.14f, -3.14f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9.7f)
                lineToRelative(-3.14f, -3.14f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.52f, 0f, 2.11f)
                close()
                moveTo(1f, 23f)
                horizontalLineTo(20f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineTo(2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineTo(12.71f)
                lineToRelative(7.29f, 7.29f)
                verticalLineToRelative(2.71f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineTo(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(23f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(13f, 1.71f)
                verticalLineTo(7f)
                close()
            }
        }.also { _FileExport = it}
