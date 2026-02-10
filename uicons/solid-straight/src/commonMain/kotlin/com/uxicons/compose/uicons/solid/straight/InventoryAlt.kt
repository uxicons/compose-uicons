package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InventoryAlt: ImageVector? = null

val Icons.Ss.InventoryAlt: ImageVector
    get() = _InventoryAlt ?: UXIcon(name = "InventoryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(0f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(3.92f, 6.68f)
                lineToRelative(1.24f, 1.19f)
                lineToRelative(2.53f, -2.48f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.45f, -1.39f)
                lineToRelative(1.39f, -1.44f)
                close()
                moveTo(3.92f, 12.79f)
                lineToRelative(1.24f, 1.19f)
                lineToRelative(2.53f, -2.48f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.45f, -1.39f)
                lineToRelative(1.39f, -1.44f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(2.04f, -2f)
                horizontalLineToRelative(3.46f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _InventoryAlt = it}
