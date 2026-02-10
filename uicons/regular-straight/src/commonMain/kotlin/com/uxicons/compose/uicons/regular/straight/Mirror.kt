package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Rs.Mirror: ImageVector
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
                moveTo(20.97f, 9.5f)
                curveTo(20.97f, 4.26f, 16.95f, 0f, 12f, 0f)
                lineTo(12f, 0.01f)
                curveToRelative(-0.01f, 0f, -0.02f, -0.01f, -0.03f, -0.01f)
                curveToRelative(-2.07f, 0f, -3.96f, 0.75f, -5.48f, 2.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.01f)
                lineToRelative(0.92f, 1.84f)
                curveToRelative(1.22f, -1.14f, 2.82f, -1.84f, 4.56f, -1.84f)
                curveToRelative(0.01f, 0f, 0.02f, -0.01f, 0.03f, -0.01f)
                verticalLineToRelative(0.01f)
                curveToRelative(3.84f, 0f, 6.97f, 3.36f, 6.97f, 7.5f)
                reflectiveCurveToRelative(-3.13f, 7.5f, -6.97f, 7.5f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.01f, 0f, -0.02f, -0.01f, -0.03f, -0.01f)
                curveToRelative(-3.03f, 0f, -5.6f, -2.09f, -6.56f, -5f)
                lineTo(3.33f, 12.0f)
                curveToRelative(0.91f, 3.52f, 3.67f, 6.23f, 7.11f, 6.86f)
                lineToRelative(-0.49f, 2.68f)
                curveToRelative(-0.23f, 1.28f, 0.75f, 2.46f, 2.05f, 2.46f)
                reflectiveCurveToRelative(2.29f, -1.18f, 2.05f, -2.46f)
                lineToRelative(-0.49f, -2.69f)
                curveToRelative(4.2f, -0.79f, 7.41f, -4.67f, 7.41f, -9.35f)
                close()
            }
        }.also { _Mirror = it}
