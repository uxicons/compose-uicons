package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TtyAnswer: ImageVector? = null

val Icons.Ss.TtyAnswer: ImageVector
    get() = _TtyAnswer ?: UXIcon(name = "TtyAnswer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(20f, 0f)
                close()
                moveTo(16f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 0f)
                close()
                moveTo(12f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(12f, 0f)
                close()
                moveTo(24f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17.61f, 12.85f)
                lineToRelative(-4.13f, 4.13f)
                curveToRelative(-2.96f, -1.28f, -5.08f, -3.41f, -6.45f, -6.47f)
                lineToRelative(4.12f, -4.12f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                curveToRelative(-1.11f, 1.1f, -1.72f, 2.6f, -1.72f, 4.21f)
                curveToRelative(0f, 7.25f, 9.25f, 16.5f, 16.5f, 16.5f)
                curveToRelative(1.61f, 0f, 3.1f, -0.61f, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                close()
            }
        }.also { _TtyAnswer = it}
