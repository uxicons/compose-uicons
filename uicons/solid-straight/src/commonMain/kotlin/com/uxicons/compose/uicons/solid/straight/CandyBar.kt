package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyBar: ImageVector? = null

val Icons.Ss.CandyBar: ImageVector
    get() = _CandyBar ?: UXIcon(name = "CandyBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.95f, 17.65f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(4.63f, 4.63f)
                lineToRelative(-2.92f, 2.92f)
                close()
                moveTo(22.14f, 8.6f)
                curveToRelative(-0.69f, -0.49f, -1.14f, -1.29f, -1.14f, -2.2f)
                curveToRelative(0f, -0.59f, 0.2f, -1.13f, 0.53f, -1.58f)
                lineToRelative(-3.87f, 3.87f)
                lineToRelative(4.12f, 4.12f)
                curveToRelative(-0.48f, -0.49f, -0.78f, -1.2f, -0.78f, -1.96f)
                curveToRelative(0f, -0.93f, 0.45f, -1.74f, 1.14f, -2.25f)
                close()
                moveTo(10.27f, 4.12f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(4.56f, 4.56f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(-4.56f, -4.56f)
                close()
                moveTo(5.93f, 8.46f)
                lineTo(1.88f, 12.52f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(6.36f, 6.36f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(4.06f, -4.06f)
                lineTo(5.93f, 8.46f)
                close()
                moveTo(16.25f, 7.28f)
                lineToRelative(3.95f, -3.95f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.14f, -4.24f, 0f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(4.56f, 4.56f)
                close()
            }
        }.also { _CandyBar = it}
