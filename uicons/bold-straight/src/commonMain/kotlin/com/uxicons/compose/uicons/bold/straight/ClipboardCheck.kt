package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Bs.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 12.8f)
                lineToRelative(4.45f, -4.37f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.27f, -2.19f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(1.96f, 1.88f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 2f)
                horizontalLineToRelative(5.34f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.39f, 0f, 2.6f, 0.82f, 3.16f, 2f)
                horizontalLineToRelative(5.34f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19f, 5f)
                close()
            }
        }.also { _ClipboardCheck = it}
