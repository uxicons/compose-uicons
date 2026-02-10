package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Tr.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.36f, 13.33f)
                lineTo(14.85f, 1.38f)
                lineToRelative(-0.02f, -0.02f)
                curveToRelative(-0.69f, -0.86f, -1.73f, -1.36f, -2.84f, -1.36f)
                reflectiveCurveToRelative(-2.14f, 0.5f, -2.85f, 1.38f)
                lineTo(0.64f, 13.33f)
                curveToRelative(-1.12f, 1.63f, -0.75f, 3.83f, 0.89f, 5.02f)
                lineToRelative(8.01f, 4.95f)
                curveToRelative(0.76f, 0.47f, 1.61f, 0.7f, 2.46f, 0.7f)
                reflectiveCurveToRelative(1.7f, -0.23f, 2.46f, -0.7f)
                lineToRelative(8.05f, -4.97f)
                curveToRelative(1.6f, -1.17f, 1.98f, -3.36f, 0.85f, -5.0f)
                close()
                moveTo(2.08f, 17.52f)
                curveToRelative(-1.16f, -0.85f, -1.43f, -2.44f, -0.62f, -3.62f)
                lineTo(9.94f, 1.99f)
                curveToRelative(0.4f, -0.49f, 0.95f, -0.82f, 1.56f, -0.94f)
                lineTo(11.5f, 22.97f)
                curveToRelative(-0.5f, -0.07f, -0.99f, -0.24f, -1.44f, -0.52f)
                lineToRelative(-7.98f, -4.93f)
                close()
                moveTo(21.95f, 17.5f)
                lineToRelative(-8.01f, 4.95f)
                curveToRelative(-0.45f, 0.28f, -0.94f, 0.45f, -1.44f, 0.52f)
                lineTo(12.5f, 1.05f)
                curveToRelative(0.6f, 0.12f, 1.15f, 0.44f, 1.55f, 0.93f)
                lineToRelative(8.49f, 11.93f)
                curveToRelative(0.81f, 1.19f, 0.54f, 2.78f, -0.59f, 3.6f)
                close()
            }
        }.also { _DiceD4 = it}
