package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockBrick: ImageVector? = null

val Icons.Ss.BlockBrick: ImageVector
    get() = _BlockBrick ?: UXIcon(name = "BlockBrick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                lineTo(11f, 7f)
                verticalLineToRelative(4f)
                lineTo(0f, 11f)
                lineTo(0f, 7f)
                close()
                moveTo(8f, 0f)
                lineTo(8f, 5f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(6f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 5f)
                close()
                moveTo(6f, 17f)
                verticalLineToRelative(-4f)
                lineTo(0f, 13f)
                verticalLineToRelative(4f)
                lineTo(6f, 17f)
                close()
                moveTo(16f, 13f)
                lineTo(8f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-5f)
                lineTo(13f, 19f)
                close()
                moveTo(11f, 19f)
                lineTo(0f, 19f)
                verticalLineToRelative(5f)
                lineTo(11f, 24f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                close()
                moveTo(6f, 5f)
                lineTo(6f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(2f)
                lineTo(6f, 5f)
                close()
                moveTo(13f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                lineTo(24f, 7f)
                lineTo(13f, 7f)
                close()
            }
        }.also { _BlockBrick = it}
