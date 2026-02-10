package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExport: ImageVector? = null

val Icons.Bs.FileExport: ImageVector
    get() = _FileExport ?: UXIcon(name = "FileExport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(14.38f, 0f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(2.34f)
                lineTo(12f, 8f)
                reflectiveCurveToRelative(0f, -5f, 0f, -5f)
                lineTo(3f, 3f)
                lineTo(3f, 21f)
                close()
                moveTo(23.71f, 13.79f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                lineTo(12f, 13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _FileExport = it}
