package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentNft: ImageVector? = null

val Icons.Ss.DocumentNft: ImageVector
    get() = _DocumentNft ?: UXIcon(name = "DocumentNft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-1.21f)
                verticalLineToRelative(3.25f)
                lineToRelative(-1.46f, -3.24f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.23f)
                verticalLineToRelative(-3.25f)
                lineToRelative(1.44f, 3.25f)
                horizontalLineToRelative(1.33f)
                lineTo(8f, 5f)
                close()
                moveTo(12.5f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.03f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-1.47f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(17.25f, 5f)
                horizontalLineToRelative(-3.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(1.25f)
                lineTo(16f, 6.25f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-1.25f)
                close()
            }
        }.also { _DocumentNft = it}
