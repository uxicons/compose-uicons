package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBattery: ImageVector? = null

val Icons.Sr.PersonBattery: ImageVector
    get() = _PersonBattery ?: UXIcon(name = "PersonBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 9f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(-4f, 0f, -4f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.9f, -0.26f, -1.73f, -0.74f, -2.35f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.55f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(17f, 9.2f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                horizontalLineToRelative(-0.37f)
                curveToRelative(-0.22f, -0.86f, -1f, -1.5f, -1.93f, -1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.93f, 0f, 1.71f, -0.64f, 1.93f, -1.5f)
                horizontalLineToRelative(0.37f)
                curveToRelative(0.39f, 0f, 0.7f, -0.31f, 0.7f, -0.7f)
                verticalLineToRelative(-1.6f)
                close()
            }
        }.also { _PersonBattery = it}
