package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockBrick: ImageVector? = null

val Icons.Bs.BlockBrick: ImageVector
    get() = _BlockBrick ?: UXIcon(name = "BlockBrick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 3f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(9f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(3f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(3f, 14f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(7.5f)
                lineTo(11f, 7f)
                lineTo(3f, 7f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(3f, 21f)
                close()
                moveTo(13f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                lineTo(13f, 21f)
                close()
            }
        }.also { _BlockBrick = it}
