package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Ss.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.43f, 1.76f, -3f, 4.49f, -3f, 8f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.11f, -1.4f, -7.64f, -4.65f, -8f, -12f)
                verticalLineToRelative(22f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 12f)
                lineTo(10f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(8f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(-1.41f, -1.14f, -2.79f, -3.12f, -3.02f, -6.5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.3f, 5.11f, 2.9f, 7.64f, 5.04f, 8.88f)
                verticalLineToRelative(-2.38f)
                close()
            }
        }.also { _BoothCurtain = it}
