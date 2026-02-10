package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Ts.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 13f)
                lineTo(0.33f, 13f)
                lineToRelative(9.83f, 10.23f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.49f, 0.49f, 1.14f, 0.76f, 1.83f, 0.76f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.69f, 0f, 1.35f, -0.27f, 1.84f, -0.77f)
                lineToRelative(9.83f, -10.23f)
                horizontalLineToRelative(-6.67f)
                lineTo(17.0f, 4f)
                close()
                moveTo(21.33f, 14f)
                lineToRelative(-8.2f, 8.53f)
                curveToRelative(-0.3f, 0.3f, -0.7f, 0.47f, -1.13f, 0.47f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, 0f, -0.82f, -0.17f, -1.12f, -0.47f)
                lineTo(2.67f, 14f)
                horizontalLineToRelative(5.33f)
                lineTo(8f, 5f)
                horizontalLineToRelative(8f)
                lineTo(16f, 14f)
                horizontalLineToRelative(5.33f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(0f, 9f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _DownFromBracket = it}
