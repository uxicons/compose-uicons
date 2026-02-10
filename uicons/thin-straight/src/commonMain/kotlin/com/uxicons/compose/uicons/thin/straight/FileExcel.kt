package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExcel: ImageVector? = null

val Icons.Ts.FileExcel: ImageVector
    get() = _FileExcel ?: UXIcon(name = "FileExcel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(15.44f, 11f)
                lineToRelative(-2.77f, 4.5f)
                lineToRelative(2.77f, 4.5f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2.27f, -3.69f)
                lineToRelative(-2.27f, 3.69f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(2.77f, -4.5f)
                lineToRelative(-2.77f, -4.5f)
                horizontalLineToRelative(1.17f)
                lineToRelative(2.27f, 3.69f)
                lineToRelative(2.27f, -3.69f)
                horizontalLineToRelative(1.17f)
                close()
            }
        }.also { _FileExcel = it}
