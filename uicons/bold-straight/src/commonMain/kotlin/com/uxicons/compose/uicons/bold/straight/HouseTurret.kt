package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTurret: ImageVector? = null

val Icons.Bs.HouseTurret: ImageVector
    get() = _HouseTurret ?: UXIcon(name = "HouseTurret") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                lineTo(24f, 4f)
                curveToRelative(0f, 1.3f, -0.84f, 2.42f, -2f, 2.83f)
                lineTo(22f, 24f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(19f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.48f)
                curveToRelative(-0.31f, -0.44f, -0.68f, -0.84f, -1.11f, -1.18f)
                lineToRelative(-1.89f, -1.48f)
                verticalLineToRelative(-2.99f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.52f, -2f, -2.83f)
                lineTo(11f, 0f)
                horizontalLineToRelative(3f)
                lineTo(14f, 2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 0f)
                horizontalLineToRelative(3f)
                lineTo(19f, 2f)
                horizontalLineToRelative(2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15f, 15.63f)
                verticalLineToRelative(8.37f)
                lineTo(0f, 24f)
                lineTo(0f, 15.63f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineToRelative(4.0f, -3.13f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(4f, 3.13f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.68f, 1.34f, 2.76f)
                close()
                moveTo(12f, 15.63f)
                curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.4f)
                lineToRelative(-4.0f, -3.13f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineToRelative(-4f, 3.13f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(5.37f)
                lineTo(12f, 21f)
                verticalLineToRelative(-5.37f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _HouseTurret = it}
