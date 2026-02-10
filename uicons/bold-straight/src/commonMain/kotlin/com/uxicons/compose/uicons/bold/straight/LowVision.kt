package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LowVision: ImageVector? = null

val Icons.Bs.LowVision: ImageVector
    get() = _LowVision ?: UXIcon(name = "LowVision") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.36f, 13.28f)
                lineToRelative(0.6f, -1.28f)
                lineToRelative(-0.6f, -1.28f)
                curveToRelative(-0.86f, -1.83f, -4.22f, -7.8f, -11.36f, -7.8f)
                curveToRelative(-1.99f, 0f, -3.84f, 0.47f, -5.54f, 1.4f)
                lineTo(2.16f, 0.01f)
                lineTo(0.04f, 2.13f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.94f, -3.94f)
                curveToRelative(1.86f, -1.74f, 2.93f, -3.72f, 3.34f, -4.59f)
                close()
                moveTo(12f, 5.92f)
                curveToRelative(5.37f, 0f, 7.98f, 4.65f, 8.65f, 6.08f)
                lineToRelative(0.0f, 0.01f)
                lineToRelative(-0.0f, 0.01f)
                curveToRelative(-0.34f, 0.71f, -1.21f, 2.35f, -2.74f, 3.75f)
                lineToRelative(-2.21f, -2.21f)
                curveToRelative(0.61f, -1.45f, 0.32f, -3.19f, -0.86f, -4.37f)
                reflectiveCurveToRelative(-2.92f, -1.47f, -4.37f, -0.86f)
                lineToRelative(-1.75f, -1.75f)
                curveToRelative(1.03f, -0.43f, 2.13f, -0.64f, 3.29f, -0.64f)
                close()
                moveTo(2.64f, 7.57f)
                lineToRelative(12.96f, 12.96f)
                curveToRelative(-1.14f, 0.37f, -2.34f, 0.56f, -3.6f, 0.56f)
                curveToRelative(-0.03f, 0f, -0.05f, -0.0f, -0.08f, -0.0f)
                lineTo(0.95f, 10.11f)
                curveToRelative(0.36f, -0.68f, 0.92f, -1.59f, 1.69f, -2.54f)
                close()
                moveTo(0.05f, 12.04f)
                lineToRelative(8.54f, 8.54f)
                curveToRelative(-4.83f, -1.47f, -7.25f, -5.79f, -7.96f, -7.3f)
                lineTo(0.05f, 12.04f)
                close()
            }
        }.also { _LowVision = it}
