package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBattery: ImageVector? = null

val Icons.Ss.PersonBattery: ImageVector
    get() = _PersonBattery ?: UXIcon(name = "PersonBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.01f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 12.79f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.47f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.55f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.18f, 1.46f, 2.3f, 4.02f, 3.48f, 6.72f)
                lineToRelative(0.72f, 1.65f)
                close()
                moveTo(17.0f, 9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.0f, 7f)
                verticalLineToRelative(6f)
                lineTo(14.51f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PersonBattery = it}
