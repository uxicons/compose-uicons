package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Ts.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.11f, 1.07f)
                curveToRelative(-0.5f, -0.68f, -1.27f, -1.07f, -2.11f, -1.07f)
                reflectiveCurveToRelative(-1.61f, 0.39f, -2.11f, 1.07f)
                lineTo(0.01f, 15.43f)
                lineToRelative(11.98f, 8.57f)
                lineToRelative(12.0f, -8.57f)
                lineTo(14.11f, 1.07f)
                close()
                moveTo(13.29f, 1.65f)
                lineToRelative(9.32f, 13.54f)
                lineToRelative(-10.12f, 7.22f)
                lineTo(12.5f, 1.11f)
                curveToRelative(0.31f, 0.09f, 0.6f, 0.27f, 0.79f, 0.53f)
                close()
                moveTo(10.7f, 1.65f)
                curveToRelative(0.2f, -0.27f, 0.49f, -0.45f, 0.8f, -0.54f)
                lineTo(11.5f, 22.41f)
                lineTo(1.4f, 15.18f)
                lineTo(10.7f, 1.65f)
                close()
            }
        }.also { _DiceD4 = it}
