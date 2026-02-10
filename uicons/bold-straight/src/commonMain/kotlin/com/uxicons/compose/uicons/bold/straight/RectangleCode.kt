package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleCode: ImageVector? = null

val Icons.Bs.RectangleCode: ImageVector
    get() = _RectangleCode ?: UXIcon(name = "RectangleCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 17.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(11.15f, 14.94f)
                lineToRelative(-2.94f, -2.94f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.55f, 0f, 3.52f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5.5f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                close()
            }
        }.also { _RectangleCode = it}
