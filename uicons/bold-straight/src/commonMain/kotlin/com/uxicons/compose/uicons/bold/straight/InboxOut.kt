package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxOut: ImageVector? = null

val Icons.Bs.InboxOut: ImageVector
    get() = _InboxOut ?: UXIcon(name = "InboxOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 11f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(4.08f)
                lineTo(12.98f, 0.41f)
                curveToRelative(-0.54f, -0.55f, -1.43f, -0.55f, -1.97f, 0f)
                horizontalLineToRelative(0f)
                lineTo(6.42f, 5f)
                horizontalLineToRelative(4.08f)
                verticalLineToRelative(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 11f)
                verticalLineToRelative(2.64f)
                curveToRelative(-0.0f, 0.75f, -0.61f, 1.36f, -1.36f, 1.36f)
                horizontalLineToRelative(-4.27f)
                curveToRelative(-0.75f, -0.0f, -1.36f, -0.61f, -1.36f, -1.36f)
                verticalLineToRelative(-2.64f)
                lineTo(0f, 11f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 11f)
                lineTo(15.5f, 11f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2.52f)
                curveToRelative(0.19f, 2.26f, 2.08f, 4.0f, 4.35f, 4f)
                horizontalLineToRelative(4.27f)
                curveToRelative(2.27f, -0.0f, 4.16f, -1.74f, 4.35f, -4f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _InboxOut = it}
