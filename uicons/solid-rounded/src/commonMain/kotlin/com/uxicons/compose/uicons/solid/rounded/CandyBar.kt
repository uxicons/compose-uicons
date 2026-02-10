package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyBar: ImageVector? = null

val Icons.Sr.CandyBar: ImageVector
    get() = _CandyBar ?: UXIcon(name = "CandyBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.16f, 9.18f)
                lineToRelative(5.03f, -5.03f)
                reflectiveCurveToRelative(-1.19f, 1.35f, -1.19f, 2.85f)
                curveToRelative(0f, 0.43f, 0.26f, 1.1f, 0.53f, 1.44f)
                curveToRelative(0.27f, 0.35f, 0.49f, 0.5f, 0.49f, 0.81f)
                reflectiveCurveToRelative(-0.38f, 0.56f, -0.62f, 0.92f)
                curveToRelative(-0.26f, 0.4f, -0.39f, 0.9f, -0.39f, 1.33f)
                curveToRelative(0f, 1.5f, 1.14f, 2.66f, 1.14f, 2.66f)
                lineToRelative(-4.98f, -4.98f)
                close()
                moveTo(15.75f, 10.6f)
                lineToRelative(-3.27f, 3.27f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(3.27f, -3.27f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(4.71f, 8.93f)
                lineToRelative(-2.15f, 2.15f)
                curveToRelative(-1.01f, 1.0f, -1.56f, 2.34f, -1.56f, 3.77f)
                reflectiveCurveToRelative(0.55f, 2.76f, 1.56f, 3.77f)
                lineToRelative(3.82f, 3.82f)
                curveToRelative(1.0f, 1.01f, 2.34f, 1.56f, 3.77f, 1.56f)
                reflectiveCurveToRelative(2.76f, -0.55f, 3.77f, -1.56f)
                lineToRelative(2.15f, -2.15f)
                lineTo(4.71f, 8.93f)
                close()
                moveTo(11.06f, 12.46f)
                lineToRelative(3.27f, -3.27f)
                lineToRelative(-4.94f, -4.94f)
                lineToRelative(-3.27f, 3.27f)
                lineToRelative(4.94f, 4.94f)
                close()
                moveTo(15.75f, 7.77f)
                lineToRelative(5.04f, -5.04f)
                lineToRelative(-1.17f, -1.17f)
                curveToRelative(-1.0f, -1.01f, -2.34f, -1.56f, -3.77f, -1.56f)
                reflectiveCurveToRelative(-2.76f, 0.55f, -3.77f, 1.56f)
                lineToRelative(-1.27f, 1.27f)
                lineToRelative(4.94f, 4.94f)
                close()
            }
        }.also { _CandyBar = it}
