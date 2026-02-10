package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TowerControl: ImageVector? = null

val Icons.Sr.TowerControl: ImageVector
    get() = _TowerControl ?: UXIcon(name = "TowerControl") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineTo(8f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(8f, 6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                lineTo(16f, 6f)
                lineTo(8f, 6f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(5.68f)
                lineToRelative(0.24f, -1.22f)
                curveToRelative(0.24f, -1.18f, -0.07f, -2.39f, -0.83f, -3.32f)
                reflectiveCurveToRelative(-1.89f, -1.46f, -3.09f, -1.46f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6f)
                close()
                moveTo(0.32f, 12f)
                lineTo(6f, 12f)
                lineTo(6f, 6f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.2f, 0f, -2.33f, 0.53f, -3.09f, 1.46f)
                reflectiveCurveTo(-0.16f, 9.6f, 0.08f, 10.78f)
                lineToRelative(0.24f, 1.22f)
                close()
                moveTo(23.28f, 14f)
                lineToRelative(-0.08f, 0.38f)
                curveToRelative(-0.42f, 2.1f, -2.27f, 3.62f, -4.41f, 3.62f)
                horizontalLineToRelative(-2.79f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.79f)
                curveToRelative(-2.14f, 0f, -3.99f, -1.52f, -4.41f, -3.62f)
                lineToRelative(-0.08f, -0.38f)
                lineTo(23.28f, 14f)
                close()
            }
        }.also { _TowerControl = it}
