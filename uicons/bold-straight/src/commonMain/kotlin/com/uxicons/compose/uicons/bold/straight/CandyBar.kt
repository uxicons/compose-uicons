package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyBar: ImageVector? = null

val Icons.Bs.CandyBar: ImageVector
    get() = _CandyBar ?: UXIcon(name = "CandyBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 11.5f)
                curveToRelative(0f, -0.46f, 0.21f, -0.8f, 0.39f, -1.0f)
                lineToRelative(0.9f, -1.0f)
                lineToRelative(-0.9f, -1.0f)
                curveToRelative(-0.18f, -0.2f, -0.39f, -0.53f, -0.39f, -1.0f)
                curveToRelative(0f, -0.39f, 0.26f, -0.8f, 0.88f, -1.43f)
                lineToRelative(1.06f, -1.06f)
                lineTo(17.93f, 1.0f)
                curveToRelative(-1.29f, -1.29f, -3.53f, -1.29f, -4.82f, 0f)
                lineTo(2.0f, 12.11f)
                curveToRelative(-1.33f, 1.33f, -1.33f, 3.49f, 0f, 4.82f)
                lineToRelative(6.08f, 6.08f)
                curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.41f, 1.0f)
                reflectiveCurveToRelative(1.77f, -0.35f, 2.41f, -1.0f)
                lineToRelative(9.03f, -9.03f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-0.6f, -0.6f, -0.86f, -1.03f, -0.86f, -1.41f)
                close()
                moveTo(9.05f, 9.29f)
                lineToRelative(2.02f, -2.02f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(-2.02f, 2.02f)
                lineToRelative(-2.24f, -2.24f)
                close()
                moveTo(15.43f, 11.63f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(-2.02f, 2.02f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.02f, -2.02f)
                close()
                moveTo(15.52f, 3.0f)
                curveToRelative(0.08f, 0f, 0.19f, 0.02f, 0.29f, 0.12f)
                lineToRelative(1.95f, 1.95f)
                lineToRelative(-2.33f, 2.33f)
                lineToRelative(-2.24f, -2.24f)
                lineToRelative(2.04f, -2.04f)
                curveToRelative(0.1f, -0.1f, 0.21f, -0.12f, 0.29f, -0.12f)
                close()
                moveTo(10.77f, 20.88f)
                curveToRelative(-0.2f, 0.2f, -0.38f, 0.2f, -0.58f, 0f)
                lineToRelative(-6.08f, -6.08f)
                curveToRelative(-0.16f, -0.16f, -0.16f, -0.42f, 0f, -0.58f)
                lineToRelative(2.81f, -2.81f)
                lineToRelative(6.65f, 6.65f)
                lineToRelative(-2.81f, 2.81f)
                close()
            }
        }.also { _CandyBar = it}
