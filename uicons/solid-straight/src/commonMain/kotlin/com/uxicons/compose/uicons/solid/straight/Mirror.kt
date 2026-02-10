package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Ss.Mirror: ImageVector
    get() = _Mirror ?: UXIcon(name = "Mirror") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.37f, 3.33f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-0.83f, -1.67f)
                lineTo(0.03f, 2.5f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                close()
                moveTo(13.6f, 18.85f)
                lineToRelative(0.49f, 2.69f)
                curveToRelative(0.23f, 1.28f, -0.75f, 2.46f, -2.05f, 2.46f)
                reflectiveCurveToRelative(-2.29f, -1.18f, -2.05f, -2.46f)
                lineToRelative(0.49f, -2.69f)
                curveToRelative(-4.22f, -0.77f, -7.44f, -4.67f, -7.44f, -9.35f)
                curveTo(3.03f, 4.26f, 7.05f, 0f, 12f, 0f)
                curveToRelative(4.98f, 0f, 9f, 4.26f, 9f, 9.5f)
                curveToRelative(0f, 4.67f, -3.2f, 8.56f, -7.41f, 9.35f)
                close()
                moveTo(8.08f, 6.15f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.58f, -1.15f)
                lineToRelative(-1f, 2f)
                lineToRelative(-2f, 1f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, -1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-0.42f, -0.85f)
                close()
                moveTo(19f, 9.5f)
                curveToRelative(0f, -4.14f, -3.11f, -7.5f, -6.97f, -7.5f)
                curveToRelative(-1.21f, 0f, -2.35f, 0.33f, -3.34f, 0.91f)
                lineToRelative(0.9f, 1.8f)
                curveToRelative(0.73f, -0.45f, 1.57f, -0.72f, 2.47f, -0.72f)
                curveToRelative(2.72f, 0f, 4.94f, 2.47f, 4.94f, 5.5f)
                reflectiveCurveToRelative(-2.23f, 5.5f, -4.97f, 5.5f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.35f, 0f, -2.57f, -0.61f, -3.47f, -1.59f)
                lineToRelative(-0.94f, 1.89f)
                curveToRelative(1.2f, 1.06f, 2.74f, 1.7f, 4.41f, 1.7f)
                horizontalLineToRelative(0.03f)
                curveToRelative(3.84f, 0f, 6.97f, -3.36f, 6.97f, -7.5f)
                close()
            }
        }.also { _Mirror = it}
