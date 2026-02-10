package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Ss.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.86f, 12.59f)
                lineToRelative(0f, 0f)
                lineToRelative(-1.45f, -1.45f)
                lineToRelative(0f, 0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-10.0f, 9.99f)
                lineToRelative(4.28f, 4.28f)
                lineToRelative(10.0f, -9.99f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.59f, 6.85f)
                lineTo(15.64f, 1.9f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
                reflectiveCurveToRelative(-3.37f, 0.68f, -4.6f, 1.9f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(15.28f, 12.16f)
                lineToRelative(5.3f, -5.3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 9.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.3f, 5.3f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _Hammer = it}
