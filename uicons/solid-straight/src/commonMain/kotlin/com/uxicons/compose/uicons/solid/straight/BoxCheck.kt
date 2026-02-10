package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Ss.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(5f)
                lineTo(24f, 8f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(1f, 10f)
                verticalLineToRelative(14f)
                lineTo(23f, 24f)
                lineTo(23f, 10f)
                lineTo(1f, 10f)
                close()
                moveTo(11.91f, 20.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-2.97f, -2.89f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.98f, 2.9f)
                lineToRelative(5.81f, -5.7f)
                lineToRelative(1.4f, 1.42f)
                lineToRelative(-5.79f, 5.71f)
                close()
            }
        }.also { _BoxCheck = it}
