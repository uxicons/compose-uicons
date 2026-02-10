package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileChartLine: ImageVector? = null

val Icons.Ss.FileChartLine: ImageVector
    get() = _FileChartLine ?: UXIcon(name = "FileChartLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                lineTo(13f, 11f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _FileChartLine = it}
