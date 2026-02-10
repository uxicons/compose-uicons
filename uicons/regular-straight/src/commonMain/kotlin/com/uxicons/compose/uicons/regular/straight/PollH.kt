package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PollH: ImageVector? = null

val Icons.Rs.PollH: ImageVector
    get() = _PollH ?: UXIcon(name = "PollH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(16f, 11f)
                lineTo(5f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2f)
                lineTo(13f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PollH = it}
