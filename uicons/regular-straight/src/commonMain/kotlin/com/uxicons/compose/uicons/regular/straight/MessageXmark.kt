package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageXmark: ImageVector? = null

val Icons.Rs.MessageXmark: ImageVector
    get() = _MessageXmark ?: UXIcon(name = "MessageXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.48f, 6.91f)
                lineToRelative(-3.09f, 3.09f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.09f, -3.09f)
                lineToRelative(-3.09f, 3.09f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.09f, -3.09f)
                lineToRelative(-3.09f, -3.09f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(3.09f, -3.09f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.83f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(5.65f)
                lineToRelative(4.33f, 3.65f)
                lineToRelative(4.45f, -3.65f)
                horizontalLineToRelative(5.57f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _MessageXmark = it}
