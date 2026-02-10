package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNibSlash: ImageVector? = null

val Icons.Ts.PenNibSlash: ImageVector
    get() = _PenNibSlash ?: UXIcon(name = "PenNibSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.43f, 11.28f)
                lineToRelative(3.53f, -3.53f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.25f, 3.25f)
                lineToRelative(-6.29f, -6.29f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.53f, 3.53f)
                lineToRelative(-6.14f, 2.3f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineTo(23.25f, 23.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-5.83f, -5.83f)
                lineToRelative(2.3f, -6.14f)
                close()
                moveTo(12.87f, 4.58f)
                lineToRelative(6.54f, 6.54f)
                lineToRelative(-2.07f, 5.52f)
                lineTo(7.36f, 6.65f)
                lineToRelative(5.52f, -2.07f)
                close()
                moveTo(2.27f, 22.44f)
                lineToRelative(5.72f, -5.72f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.28f, 1.02f, 0.28f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.37f, 0.1f, 0.72f, 0.28f, 1.02f)
                lineTo(1.56f, 21.74f)
                lineToRelative(3.15f, -13.49f)
                lineToRelative(-0.83f, -0.83f)
                lineTo(0f, 24f)
                lineToRelative(16.55f, -3.92f)
                lineToRelative(-0.83f, -0.83f)
                lineToRelative(-13.45f, 3.19f)
                close()
                moveTo(9f, 14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _PenNibSlash = it}
