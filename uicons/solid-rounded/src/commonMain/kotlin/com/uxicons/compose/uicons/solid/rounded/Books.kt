package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Books: ImageVector? = null

val Icons.Sr.Books: ImageVector
    get() = _Books ?: UXIcon(name = "Books") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(2f)
                lineTo(5f, 5f)
                close()
                moveTo(12f, 5f)
                lineTo(12f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(10f)
                lineTo(5f, 17f)
                lineTo(5f, 7f)
                lineTo(0f, 7f)
                close()
                moveTo(7f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(5f)
                lineTo(12f, 7f)
                lineTo(7f, 7f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-2f)
                lineTo(7f, 19f)
                verticalLineToRelative(5f)
                close()
                moveTo(13.42f, 7.48f)
                lineToRelative(3.64f, 10.94f)
                lineToRelative(5.41f, -1.79f)
                lineToRelative(-3.64f, -10.94f)
                lineToRelative(-5.41f, 1.79f)
                close()
                moveTo(17.69f, 20.32f)
                lineToRelative(0.79f, 2.31f)
                curveToRelative(0.35f, 1.05f, 1.48f, 1.61f, 2.53f, 1.27f)
                lineToRelative(1.61f, -0.54f)
                curveToRelative(1.05f, -0.35f, 1.62f, -1.48f, 1.27f, -2.53f)
                lineToRelative(-0.79f, -2.31f)
                lineToRelative(-5.41f, 1.79f)
                close()
                moveTo(12.79f, 5.58f)
                lineToRelative(5.41f, -1.79f)
                lineToRelative(-0.8f, -2.42f)
                curveToRelative(-0.35f, -1.05f, -1.48f, -1.62f, -2.53f, -1.27f)
                lineToRelative(-1.61f, 0.54f)
                curveToRelative(-1.05f, 0.35f, -1.62f, 1.48f, -1.27f, 2.53f)
                lineToRelative(0.8f, 2.42f)
                close()
            }
        }.also { _Books = it}
