package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Ts.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 20f)
                lineTo(7.11f, 20f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(7.03f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.48f, 0.17f, -0.68f, -0.01f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 19f)
                close()
                moveTo(12f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 15f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _CommentAlt = it}
