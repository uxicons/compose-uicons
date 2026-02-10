package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Bs.Mirror: ImageVector
    get() = _Mirror ?: UXIcon(name = "Mirror") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 8.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                close()
                moveTo(3.33f, 3.33f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                close()
                moveTo(21f, 9.5f)
                curveTo(21f, 4.26f, 16.96f, 0f, 12f, 0f)
                curveToRelative(-2.08f, 0f, -3.99f, 0.75f, -5.51f, 2.01f)
                lineToRelative(1.39f, 2.78f)
                curveToRelative(1.08f, -1.1f, 2.52f, -1.79f, 4.12f, -1.79f)
                curveToRelative(3.31f, 0f, 6f, 2.92f, 6f, 6.5f)
                reflectiveCurveToRelative(-2.69f, 6.5f, -6f, 6.5f)
                curveToRelative(-2.49f, 0f, -4.63f, -1.65f, -5.54f, -4f)
                lineTo(3.33f, 12f)
                curveToRelative(0.91f, 3.51f, 3.67f, 6.21f, 7.11f, 6.85f)
                lineToRelative(-0.49f, 2.69f)
                curveToRelative(-0.23f, 1.28f, 0.75f, 2.46f, 2.05f, 2.46f)
                reflectiveCurveToRelative(2.29f, -1.18f, 2.05f, -2.46f)
                lineToRelative(-0.49f, -2.69f)
                curveToRelative(4.22f, -0.78f, 7.44f, -4.67f, 7.44f, -9.35f)
                close()
            }
        }.also { _Mirror = it}
