package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShovelSnow: ImageVector? = null

val Icons.Bs.ShovelSnow: ImageVector
    get() = _ShovelSnow ?: UXIcon(name = "ShovelSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.87f, 7.13f)
                lineToRelative(2.12f, -2.12f)
                lineTo(18.99f, 0.01f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-5.7f, 5.7f)
                lineToRelative(-1.58f, -1.58f)
                curveToRelative(-1.4f, -1.4f, -3.68f, -1.4f, -5.07f, 0f)
                lineTo(-0.01f, 13.65f)
                lineToRelative(10.36f, 10.36f)
                lineToRelative(5.96f, -5.96f)
                curveToRelative(1.4f, -1.4f, 1.4f, -3.67f, 0f, -5.07f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(5.7f, -5.7f)
                lineToRelative(1.44f, 1.44f)
                close()
                moveTo(14.19f, 15.93f)
                lineToRelative(-3.84f, 3.84f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(2.63f, -2.63f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.63f, 2.63f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(3.84f, -3.84f)
                curveToRelative(0.23f, -0.23f, 0.6f, -0.23f, 0.83f, 0f)
                lineToRelative(5.29f, 5.29f)
                curveToRelative(0.23f, 0.23f, 0.23f, 0.6f, 0f, 0.83f)
                close()
            }
        }.also { _ShovelSnow = it}
