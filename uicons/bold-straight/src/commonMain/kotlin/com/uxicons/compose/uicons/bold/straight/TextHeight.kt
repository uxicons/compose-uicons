package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Bs.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(12f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(9f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 6f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(21f, 12f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.4f, -3.7f)
                curveToRelative(-0.35f, -0.4f, -0.97f, -0.4f, -1.33f, 0f)
                lineToRelative(-3.27f, 3.7f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.27f, 3.7f)
                curveToRelative(0.35f, 0.4f, 0.97f, 0.4f, 1.33f, 0f)
                lineToRelative(3.4f, -3.7f)
                horizontalLineToRelative(-2.5f)
                lineTo(21f, 12f)
                close()
            }
        }.also { _TextHeight = it}
