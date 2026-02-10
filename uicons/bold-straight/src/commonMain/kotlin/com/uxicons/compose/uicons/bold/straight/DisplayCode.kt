package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayCode: ImageVector? = null

val Icons.Bs.DisplayCode: ImageVector
    get() = _DisplayCode ?: UXIcon(name = "DisplayCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.27f, 7.74f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(9.03f, 4.44f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                lineTo(6f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(13.5f, 19f)
                close()
                moveTo(3f, 16f)
                lineTo(21f, 16f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
            }
        }.also { _DisplayCode = it}
