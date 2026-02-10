package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PollH: ImageVector? = null

val Icons.Ts.PollH: ImageVector
    get() = _PollH ?: UXIcon(name = "PollH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(16f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 6f)
                lineTo(5f, 6f)
                verticalLineToRelative(-1f)
                lineTo(13f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                lineTo(5f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                lineTo(5f, 18f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _PollH = it}
