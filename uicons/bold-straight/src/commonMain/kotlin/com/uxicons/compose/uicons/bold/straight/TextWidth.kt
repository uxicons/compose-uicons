package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Bs.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6f)
                horizontalLineToRelative(-3f)
                lineTo(4f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                lineTo(13.5f, 15f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(23.7f, 18.77f)
                lineToRelative(-3.7f, -3.27f)
                verticalLineToRelative(2.5f)
                lineTo(4f, 18f)
                verticalLineToRelative(-2.5f)
                lineTo(0.3f, 18.77f)
                curveToRelative(-0.4f, 0.35f, -0.4f, 0.97f, 0f, 1.33f)
                lineToRelative(3.7f, 3.4f)
                verticalLineToRelative(-2.5f)
                lineTo(20f, 21f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.7f, -3.4f)
                curveToRelative(0.4f, -0.35f, 0.4f, -0.97f, 0f, -1.33f)
                close()
            }
        }.also { _TextWidth = it}
