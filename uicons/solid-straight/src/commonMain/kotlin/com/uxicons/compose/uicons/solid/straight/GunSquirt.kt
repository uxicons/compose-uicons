package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunSquirt: ImageVector? = null

val Icons.Ss.GunSquirt: ImageVector
    get() = _GunSquirt ?: UXIcon(name = "GunSquirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(5f, 2f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(17f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(2.1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 8f)
                lineTo(4f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.22f)
                lineToRelative(-1.11f, 3.9f)
                curveToRelative(-0.35f, 1.24f, -1.49f, 2.1f, -2.78f, 2.1f)
                curveToRelative(-0.91f, 0f, -1.75f, -0.42f, -2.3f, -1.14f)
                curveToRelative(-0.55f, -0.73f, -0.73f, -1.65f, -0.48f, -2.52f)
                lineToRelative(1.81f, -6.33f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-0.57f, 2f)
                horizontalLineToRelative(2.65f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _GunSquirt = it}
