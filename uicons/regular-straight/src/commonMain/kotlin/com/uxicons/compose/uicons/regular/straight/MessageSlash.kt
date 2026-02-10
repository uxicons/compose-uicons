package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Rs.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.41f, 19f)
                horizontalLineToRelative(1.72f)
                lineToRelative(-0.14f, -14f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                curveToRelative(-0.45f, 0f, -0.89f, 0.1f, -1.29f, 0.29f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.54f, -3.54f)
                close()
                moveTo(19f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.01f)
                lineToRelative(0.12f, 11.99f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(0.09f)
                lineTo(5.41f, 4f)
                horizontalLineToRelative(13.59f)
                close()
                moveTo(14.03f, 18.27f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-2.27f, 1.87f)
                curveToRelative(-0.33f, 0.29f, -0.75f, 0.44f, -1.17f, 0.44f)
                curveToRelative(-0.43f, 0f, -0.87f, -0.15f, -1.22f, -0.46f)
                lineToRelative(-3.02f, -2.54f)
                lineTo(2f, 19f)
                lineTo(2f, 6.24f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(8.76f)
                horizontalLineToRelative(4.51f)
                lineToRelative(3.5f, 2.94f)
                lineToRelative(2.03f, -1.68f)
                close()
            }
        }.also { _MessageSlash = it}
