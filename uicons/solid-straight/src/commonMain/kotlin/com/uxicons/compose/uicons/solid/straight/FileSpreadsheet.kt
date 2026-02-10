package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileSpreadsheet: ImageVector? = null

val Icons.Ss.FileSpreadsheet: ImageVector
    get() = _FileSpreadsheet ?: UXIcon(name = "FileSpreadsheet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(10f)
                close()
                moveTo(11f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _FileSpreadsheet = it}
