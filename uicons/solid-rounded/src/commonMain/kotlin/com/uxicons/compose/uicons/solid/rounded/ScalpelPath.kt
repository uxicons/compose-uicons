package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Sr.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 24f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 23f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 23f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(23.18f, 0.79f)
                curveToRelative(-1.05f, -1.06f, -2.9f, -1.05f, -3.95f, -0.0f)
                lineToRelative(-9.13f, 9.04f)
                lineToRelative(4.03f, 3.96f)
                lineToRelative(9.05f, -9.03f)
                curveToRelative(0.53f, -0.53f, 0.82f, -1.23f, 0.82f, -1.98f)
                reflectiveCurveToRelative(-0.29f, -1.45f, -0.82f, -1.98f)
                close()
                moveTo(12.66f, 15.14f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.73f, 2.5f, -2.72f, 4.7f, -5.11f, 5.75f)
                curveToRelative(-1.5f, 0.66f, -3.08f, 1.03f, -4.71f, 1.1f)
                curveToRelative(-0.21f, 0.01f, -0.59f, 0f, -1.01f, 0f)
                curveToRelative(-0.77f, 0f, -1.21f, -0.32f, -1.45f, -0.6f)
                curveToRelative(-0.36f, -0.42f, -0.43f, -0.95f, -0.37f, -1.3f)
                curveToRelative(0.03f, -0.21f, 0.13f, -0.41f, 0.28f, -0.56f)
                lineToRelative(8.38f, -8.3f)
                lineToRelative(3.98f, 3.91f)
                close()
            }
        }.also { _ScalpelPath = it}
