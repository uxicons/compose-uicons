package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StageTheatre: ImageVector? = null

val Icons.Ss.StageTheatre: ImageVector
    get() = _StageTheatre ?: UXIcon(name = "StageTheatre") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 16f)
                curveToRelative(1.43f, 1.76f, 3f, 4.49f, 3f, 8f)
                lineTo(0f, 24f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.11f, -1.4f, -7.64f, -4.65f, -8f, -12f)
                curveToRelative(-0.36f, 7.35f, -4.89f, 10.6f, -8f, 12f)
                lineTo(0f, 14f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(9.04f, 2f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.23f, 3.38f, -1.62f, 5.36f, -3.02f, 6.5f)
                verticalLineToRelative(2.38f)
                curveToRelative(2.14f, -1.23f, 4.74f, -3.77f, 5.04f, -8.88f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(-1.41f, -1.14f, -2.79f, -3.12f, -3.02f, -6.5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.3f, 5.11f, 2.9f, 7.64f, 5.04f, 8.88f)
                verticalLineToRelative(-2.38f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.43f, 1.76f, -3f, 4.49f, -3f, 8f)
                close()
            }
        }.also { _StageTheatre = it}
