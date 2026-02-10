package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxFull: ImageVector? = null

val Icons.Sr.InboxFull: ImageVector
    get() = _InboxFull ?: UXIcon(name = "InboxFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 14f)
                curveToRelative(1.09f, 0f, 1.98f, 0.88f, 2f, 1.96f)
                curveToRelative(0.02f, 1.1f, 0.81f, 2.04f, 1.91f, 2.04f)
                horizontalLineToRelative(4.18f)
                curveToRelative(1.11f, 0f, 1.89f, -0.93f, 1.91f, -2.04f)
                curveToRelative(0.02f, -1.09f, 0.91f, -1.96f, 2f, -1.96f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, -1.06f, -0.09f, -2.11f, -0.27f, -3.15f)
                lineToRelative(-1.17f, -6.71f)
                curveToRelative(-0.42f, -2.4f, -2.5f, -4.14f, -4.93f, -4.14f)
                lineTo(6.36f, -0f)
                curveTo(3.93f, 0f, 1.85f, 1.75f, 1.44f, 4.14f)
                lineTo(0.27f, 10.85f)
                curveToRelative(-0.18f, 1.04f, -0.27f, 2.09f, -0.27f, 3.15f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(6f, 0f, 6f, 0f)
                close()
                moveTo(5.24f, 4f)
                horizontalLineToRelative(13.52f)
                curveToRelative(0.48f, 0f, 0.9f, 0.34f, 0.98f, 0.82f)
                curveToRelative(0.11f, 0.61f, -0.36f, 1.18f, -0.98f, 1.18f)
                lineTo(5.24f, 6f)
                curveToRelative(-0.62f, 0f, -1.1f, -0.57f, -0.98f, -1.18f)
                curveToRelative(0.09f, -0.47f, 0.5f, -0.82f, 0.98f, -0.82f)
                close()
                moveTo(4.5f, 8f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.48f, 0f, 0.9f, 0.34f, 0.98f, 0.82f)
                curveToRelative(0.11f, 0.61f, -0.36f, 1.18f, -0.98f, 1.18f)
                lineTo(4.5f, 10f)
                curveToRelative(-0.62f, 0f, -1.1f, -0.57f, -0.98f, -1.18f)
                curveToRelative(0.09f, -0.47f, 0.5f, -0.82f, 0.98f, -0.82f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _InboxFull = it}
