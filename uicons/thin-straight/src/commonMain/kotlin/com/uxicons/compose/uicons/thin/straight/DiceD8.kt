package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Ts.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.82f, 0.75f)
                curveToRelative(-0.98f, -0.96f, -2.65f, -0.98f, -3.66f, 0.02f)
                lineTo(0.05f, 12f)
                lineToRelative(10.13f, 11.25f)
                curveToRelative(0.49f, 0.48f, 1.14f, 0.75f, 1.82f, 0.75f)
                reflectiveCurveToRelative(1.33f, -0.27f, 1.84f, -0.77f)
                lineToRelative(10.15f, -11.23f)
                lineTo(13.82f, 0.75f)
                close()
                moveTo(22.4f, 11.73f)
                lineToRelative(-9.9f, 2.75f)
                lineTo(12.5f, 1.11f)
                curveToRelative(0.22f, 0.07f, 0.44f, 0.18f, 0.61f, 0.34f)
                lineToRelative(9.29f, 10.29f)
                close()
                moveTo(10.88f, 1.46f)
                curveToRelative(0.17f, -0.17f, 0.39f, -0.28f, 0.62f, -0.35f)
                lineTo(11.5f, 14.48f)
                lineTo(1.63f, 11.73f)
                lineTo(10.88f, 1.46f)
                close()
                moveTo(2.24f, 12.94f)
                lineToRelative(9.26f, 2.58f)
                verticalLineToRelative(7.38f)
                curveToRelative(-0.23f, -0.07f, -0.43f, -0.18f, -0.6f, -0.34f)
                lineTo(2.24f, 12.94f)
                close()
                moveTo(13.12f, 22.54f)
                curveToRelative(-0.17f, 0.17f, -0.39f, 0.29f, -0.62f, 0.36f)
                verticalLineToRelative(-7.38f)
                lineToRelative(9.29f, -2.58f)
                lineToRelative(-8.67f, 9.6f)
                close()
            }
        }.also { _DiceD8 = it}
