package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inboxes: ImageVector? = null

val Icons.Bs.Inboxes: ImageVector
    get() = _Inboxes ?: UXIcon(name = "Inboxes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(0f, 13f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(18.74f, 16f)
                horizontalLineToRelative(2.26f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3f, 4.24f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.96f, 0f, 3.62f, -1.25f, 4.24f, -3f)
                close()
                moveTo(16f, 0f)
                lineTo(16f, 1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(8f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(21f, 7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3f, 3f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3f, 4.24f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.96f, 0f, 3.62f, -1.25f, 4.24f, -3f)
                horizontalLineToRelative(2.26f)
                lineTo(21f, 7.5f)
                close()
            }
        }.also { _Inboxes = it}
