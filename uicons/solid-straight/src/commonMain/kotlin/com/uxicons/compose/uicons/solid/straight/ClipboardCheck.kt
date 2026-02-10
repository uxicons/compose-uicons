package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Ss.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(3f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(11.91f, 15.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.03f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-2.28f, -2.19f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.29f, 2.21f)
                lineToRelative(4.81f, -4.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-4.79f, 4.71f)
                close()
            }
        }.also { _ClipboardCheck = it}
