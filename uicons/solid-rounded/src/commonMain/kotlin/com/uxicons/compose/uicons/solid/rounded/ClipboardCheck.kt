package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Sr.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineToRelative(-0.17f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(16.71f, 11.58f)
                lineToRelative(-3.56f, 3.56f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.86f, -2.07f, 0.86f)
                curveToRelative(-0.71f, 0f, -1.42f, -0.26f, -1.98f, -0.77f)
                lineToRelative(-1.77f, -1.62f)
                curveToRelative(-0.41f, -0.37f, -0.43f, -1.01f, -0.06f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.06f)
                lineToRelative(1.77f, 1.62f)
                curveToRelative(0.37f, 0.34f, 0.93f, 0.33f, 1.29f, -0.03f)
                lineToRelative(3.56f, -3.56f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _ClipboardCheck = it}
