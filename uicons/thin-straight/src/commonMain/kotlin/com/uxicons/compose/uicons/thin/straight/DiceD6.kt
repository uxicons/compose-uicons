package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Ts.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.33f, 0.37f)
                curveToRelative(-0.82f, -0.49f, -1.84f, -0.49f, -2.67f, 0f)
                lineTo(1f, 6.14f)
                verticalLineToRelative(11.72f)
                lineToRelative(9.67f, 5.77f)
                curveToRelative(0.41f, 0.25f, 0.87f, 0.37f, 1.33f, 0.37f)
                reflectiveCurveToRelative(0.92f, -0.12f, 1.33f, -0.37f)
                lineToRelative(9.67f, -5.77f)
                lineTo(23f, 6.14f)
                lineTo(13.33f, 0.37f)
                close()
                moveTo(11.18f, 1.23f)
                curveToRelative(0.51f, -0.3f, 1.13f, -0.3f, 1.64f, 0f)
                lineToRelative(8.7f, 5.2f)
                lineToRelative(-9.52f, 5.69f)
                lineTo(2.48f, 6.42f)
                lineTo(11.18f, 1.23f)
                close()
                moveTo(2f, 17.29f)
                lineTo(2f, 7.31f)
                lineToRelative(9.5f, 5.67f)
                verticalLineToRelative(9.93f)
                curveToRelative(-0.11f, -0.04f, -0.22f, -0.08f, -0.32f, -0.14f)
                lineTo(2f, 17.29f)
                close()
                moveTo(12.82f, 22.77f)
                curveToRelative(-0.1f, 0.06f, -0.21f, 0.1f, -0.32f, 0.14f)
                lineTo(12.5f, 12.98f)
                lineToRelative(9.5f, -5.67f)
                verticalLineToRelative(9.98f)
                lineToRelative(-9.18f, 5.48f)
                close()
            }
        }.also { _DiceD6 = it}
