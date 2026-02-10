package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Ts.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                lineTo(12.5f, 15f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 1f)
                lineTo(6.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(23.56f, 18.44f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.15f, 3.15f)
                lineTo(1.29f, 19.01f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.44f, 18.44f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineTo(22.71f, 19.99f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _TextWidth = it}
