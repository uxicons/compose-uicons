package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Ts.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.71f, 19f)
                horizontalLineToRelative(2.29f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-0.49f, 0f, -0.97f, 0.14f, -1.38f, 0.41f)
                lineTo(0.7f, -0.0f)
                lineTo(-0.0f, 0.7f)
                lineToRelative(23.3f, 23.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-4.3f, -4.3f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-2.29f)
                lineTo(3.85f, 3.15f)
                curveToRelative(0.2f, -0.1f, 0.42f, -0.15f, 0.65f, -0.15f)
                close()
                moveTo(15.04f, 18.58f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.89f, 2.39f)
                curveToRelative(-0.24f, 0.21f, -0.55f, 0.32f, -0.86f, 0.32f)
                curveToRelative(-0.31f, 0f, -0.63f, -0.11f, -0.88f, -0.34f)
                lineToRelative(-3.17f, -2.67f)
                lineTo(2f, 19f)
                lineTo(2f, 5.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(11.46f)
                horizontalLineToRelative(5.32f)
                lineToRelative(3.46f, 2.91f)
                curveToRelative(0.13f, 0.12f, 0.31f, 0.11f, 0.43f, 0.01f)
                lineToRelative(2.83f, -2.34f)
                close()
            }
        }.also { _MessageSlash = it}
