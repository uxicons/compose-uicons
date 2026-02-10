package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Tr.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 2f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(21f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(20f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(4f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(17.32f, 10.02f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-4.42f, 4.42f)
                curveToRelative(-0.57f, 0.57f, -1.31f, 0.85f, -2.05f, 0.85f)
                curveToRelative(-0.7f, 0f, -1.4f, -0.25f, -1.96f, -0.76f)
                lineToRelative(-2.2f, -2.01f)
                curveToRelative(-0.2f, -0.19f, -0.22f, -0.5f, -0.03f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.5f, -0.22f, 0.71f, -0.03f)
                lineToRelative(2.2f, 2.01f)
                curveToRelative(0.75f, 0.69f, 1.91f, 0.66f, 2.62f, -0.06f)
                lineToRelative(4.42f, -4.42f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                close()
            }
        }.also { _ClipboardCheck = it}
