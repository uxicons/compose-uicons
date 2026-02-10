package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsFromLine: ImageVector? = null

val Icons.Bs.ArrowsFromLine: ImageVector
    get() = _ArrowsFromLine ?: UXIcon(name = "ArrowsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(24f, 10.5f)
                close()
                moveTo(13.5f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, 3.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10.5f, 8f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 4f)
                horizontalLineToRelative(3f)
                lineTo(12.71f, 0.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _ArrowsFromLine = it}
