package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MattressPillow: ImageVector? = null

val Icons.Sr.MattressPillow: ImageVector
    get() = _MattressPillow ?: UXIcon(name = "MattressPillow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 21f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.72f, -4.9f, -4f)
                horizontalLineToRelative(3.9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(0.1f, 7f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(18f)
                close()
                moveTo(5f, 14f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(7f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _MattressPillow = it}
