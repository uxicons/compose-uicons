package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TowerControl: ImageVector? = null

val Icons.Ss.TowerControl: ImageVector
    get() = _TowerControl ?: UXIcon(name = "TowerControl") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.35f, 12f)
                horizontalLineToRelative(-5.35f)
                lineTo(18f, 6f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.75f, 0f, 1.46f, 0.33f, 1.94f, 0.92f)
                curveToRelative(0.48f, 0.58f, 0.67f, 1.34f, 0.52f, 2.08f)
                lineToRelative(-0.6f, 3.01f)
                close()
                moveTo(0.65f, 12f)
                lineTo(6f, 12f)
                lineTo(6f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-0.75f, 0f, -1.46f, 0.33f, -1.94f, 0.92f)
                curveTo(0.09f, 7.5f, -0.1f, 8.25f, 0.05f, 8.99f)
                lineToRelative(0.6f, 3.01f)
                close()
                moveTo(1.05f, 14f)
                lineToRelative(0.8f, 4f)
                horizontalLineToRelative(6.15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6.15f)
                lineToRelative(0.8f, -4f)
                lineTo(1.05f, 14f)
                close()
                moveTo(16f, 4f)
                lineTo(16f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(8f, 6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                lineTo(16f, 6f)
                lineTo(8f, 6f)
                close()
            }
        }.also { _TowerControl = it}
