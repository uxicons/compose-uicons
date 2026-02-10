package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilRuler: ImageVector? = null

val Icons.Bs.PencilRuler: ImageVector
    get() = _PencilRuler ?: UXIcon(name = "PencilRuler") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.05f, 9.36f)
                curveToRelative(-1.39f, -1.39f, -1.39f, -3.61f, -0.03f, -4.98f)
                lineTo(5.39f, 0.02f)
                lineToRelative(5.11f, 4.91f)
                lineToRelative(-2.08f, 2.16f)
                lineToRelative(-2.98f, -2.87f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.59f, 2.46f)
                lineToRelative(-2.06f, 2.18f)
                lineToRelative(-2.62f, -2.49f)
                close()
                moveTo(19.1f, 13.53f)
                lineToRelative(-2.16f, 2.08f)
                lineToRelative(2.87f, 2.98f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.68f, 0.03f)
                lineToRelative(-2.49f, -2.62f)
                lineToRelative(-2.18f, 2.06f)
                lineToRelative(2.52f, 2.65f)
                curveToRelative(0.68f, 0.68f, 1.58f, 1.02f, 2.48f, 1.02f)
                reflectiveCurveToRelative(1.79f, -0.34f, 2.48f, -1.02f)
                lineToRelative(4.37f, -4.37f)
                lineToRelative(-4.91f, -5.1f)
                close()
                moveTo(22.81f, 6.91f)
                lineTo(5.72f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.72f)
                lineTo(17.09f, 1.19f)
                curveToRelative(0.76f, -0.77f, 1.78f, -1.19f, 2.86f, -1.19f)
                reflectiveCurveToRelative(2.1f, 0.42f, 2.86f, 1.19f)
                horizontalLineToRelative(0f)
                curveToRelative(1.58f, 1.58f, 1.58f, 4.15f, 0f, 5.72f)
                close()
                moveTo(17.15f, 8.33f)
                lineToRelative(-1.48f, -1.48f)
                lineTo(3f, 19.52f)
                verticalLineToRelative(1.48f)
                horizontalLineToRelative(1.48f)
                lineToRelative(12.67f, -12.67f)
                close()
            }
        }.also { _PencilRuler = it}
