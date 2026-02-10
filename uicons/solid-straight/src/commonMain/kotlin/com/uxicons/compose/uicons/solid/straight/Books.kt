package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Books: ImageVector? = null

val Icons.Ss.Books: ImageVector
    get() = _Books ?: UXIcon(name = "Books") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 0f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(3f)
                lineTo(5f, 5f)
                close()
                moveTo(12f, 5f)
                lineTo(12f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
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
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(7f, 19f)
                verticalLineToRelative(5f)
                close()
                moveTo(13.58f, 7.3f)
                lineToRelative(3.47f, 10.34f)
                lineToRelative(4.75f, -1.57f)
                lineToRelative(-3.47f, -10.34f)
                lineToRelative(-4.75f, 1.57f)
                close()
                moveTo(17.68f, 19.54f)
                lineToRelative(1.44f, 4.42f)
                lineToRelative(4.75f, -1.57f)
                lineToRelative(-1.44f, -4.42f)
                lineToRelative(-4.75f, 1.57f)
                close()
                moveTo(12.95f, 5.4f)
                lineToRelative(4.75f, -1.57f)
                lineToRelative(-0.8f, -2.42f)
                curveToRelative(-0.35f, -1.05f, -1.48f, -1.62f, -2.53f, -1.27f)
                lineToRelative(-0.95f, 0.32f)
                curveToRelative(-1.05f, 0.35f, -1.62f, 1.48f, -1.27f, 2.53f)
                lineToRelative(0.8f, 2.42f)
                close()
            }
        }.also { _Books = it}
