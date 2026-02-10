package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Ts.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.83f, 0.75f)
                curveToRelative(-0.98f, -0.96f, -2.63f, -1.0f, -3.68f, 0.04f)
                lineTo(0.02f, 13.08f)
                lineToRelative(10.16f, 10.17f)
                curveToRelative(0.49f, 0.48f, 1.14f, 0.75f, 1.82f, 0.75f)
                reflectiveCurveToRelative(1.33f, -0.27f, 1.82f, -0.75f)
                lineToRelative(10.15f, -10.17f)
                lineTo(13.83f, 0.75f)
                close()
                moveTo(22.18f, 12.46f)
                lineToRelative(-5.63f, -0.91f)
                lineTo(12.81f, 1.26f)
                curveToRelative(0.1f, 0.06f, 0.21f, 0.1f, 0.29f, 0.18f)
                lineToRelative(9.07f, 11.02f)
                close()
                moveTo(12.01f, 14.51f)
                lineToRelative(-3.59f, -2.69f)
                lineTo(12.01f, 1.96f)
                lineToRelative(3.58f, 9.86f)
                lineToRelative(-3.58f, 2.69f)
                close()
                moveTo(10.89f, 1.46f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.14f, 0.31f, -0.2f)
                lineToRelative(-3.75f, 10.29f)
                lineToRelative(-5.62f, 0.91f)
                lineTo(10.89f, 1.46f)
                close()
                moveTo(1.83f, 13.47f)
                lineToRelative(5.86f, -0.95f)
                lineToRelative(3.81f, 2.85f)
                lineToRelative(0.01f, 7.51f)
                curveToRelative(-0.23f, -0.07f, -0.44f, -0.18f, -0.62f, -0.35f)
                lineTo(1.83f, 13.47f)
                close()
                moveTo(13.13f, 22.54f)
                curveToRelative(-0.17f, 0.17f, -0.39f, 0.28f, -0.62f, 0.35f)
                lineToRelative(-0.01f, -7.5f)
                lineToRelative(3.81f, -2.87f)
                lineToRelative(5.86f, 0.95f)
                lineToRelative(-9.05f, 9.06f)
                close()
            }
        }.also { _DiceD10 = it}
