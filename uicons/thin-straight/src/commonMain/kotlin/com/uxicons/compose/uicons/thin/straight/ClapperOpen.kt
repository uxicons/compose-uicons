package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Ts.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.71f, 10f)
                lineTo(23.68f, 5.48f)
                lineToRelative(-0.78f, -3.52f)
                curveToRelative(-0.29f, -1.35f, -1.62f, -2.21f, -2.98f, -1.92f)
                lineTo(1.98f, 4.58f)
                curveTo(0.65f, 4.84f, -0.25f, 6.24f, 0.06f, 7.55f)
                lineToRelative(0.94f, 4.05f)
                verticalLineToRelative(12.4f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                lineTo(5.71f, 10f)
                close()
                moveTo(9.01f, 8.14f)
                lineToRelative(-4.51f, 1.13f)
                lineToRelative(3.32f, -5.14f)
                lineToRelative(4.51f, -1.14f)
                lineToRelative(-3.32f, 5.15f)
                close()
                moveTo(13.76f, 2.63f)
                lineToRelative(4.63f, -1.17f)
                lineToRelative(-3.24f, 5.14f)
                lineToRelative(-4.71f, 1.18f)
                lineToRelative(3.32f, -5.15f)
                close()
                moveTo(21.92f, 2.17f)
                lineToRelative(0.57f, 2.58f)
                lineToRelative(-5.95f, 1.5f)
                lineToRelative(3.24f, -5.14f)
                lineToRelative(0.35f, -0.09f)
                curveToRelative(0.9f, -0.25f, 1.63f, 0.45f, 1.78f, 1.16f)
                close()
                moveTo(2.2f, 5.55f)
                lineToRelative(4.2f, -1.06f)
                lineToRelative(-3.31f, 5.12f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(-1.46f, 0.37f)
                lineToRelative(-0.61f, -2.65f)
                curveToRelative(-0.17f, -0.81f, 0.34f, -1.61f, 1.17f, -1.79f)
                close()
                moveTo(23f, 23f)
                lineTo(2f, 23f)
                lineTo(2f, 11f)
                lineTo(23f, 11f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _ClapperOpen = it}
