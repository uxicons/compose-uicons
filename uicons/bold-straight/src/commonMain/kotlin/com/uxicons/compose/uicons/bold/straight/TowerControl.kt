package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TowerControl: ImageVector? = null

val Icons.Bs.TowerControl: ImageVector
    get() = _TowerControl ?: UXIcon(name = "TowerControl") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.32f, 6.1f)
                curveToRelative(-0.57f, -0.7f, -1.42f, -1.1f, -2.32f, -1.1f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                lineTo(3.0f, 5f)
                curveToRelative(-0.9f, 0f, -1.75f, 0.4f, -2.32f, 1.1f)
                curveTo(0.11f, 6.8f, -0.12f, 7.7f, 0.06f, 8.59f)
                lineToRelative(1.88f, 9.41f)
                lineTo(7f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5.06f)
                lineToRelative(1.88f, -9.41f)
                curveToRelative(0.18f, -0.89f, -0.05f, -1.79f, -0.62f, -2.49f)
                close()
                moveTo(20.2f, 12f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                lineToRelative(-0.8f, 4f)
                close()
                moveTo(14f, 8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(4f)
                lineTo(3.8f, 12f)
                lineToRelative(-0.8f, -4f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(14f, 21f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _TowerControl = it}
