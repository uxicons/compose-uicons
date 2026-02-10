package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentNft: ImageVector? = null

val Icons.Bs.DocumentNft: ImageVector
    get() = _DocumentNft ?: UXIcon(name = "DocumentNft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(17.62f, 24f)
                lineToRelative(6.38f, -6.38f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14f, 4.25f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.25f)
                lineTo(15.25f, 4.25f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(12.5f, 5.72f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1.25f)
                lineTo(9.5f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(1.75f)
                close()
                moveTo(6.79f, 6.25f)
                lineTo(6.79f, 3f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.33f)
                lineToRelative(-1.44f, -3.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.23f)
                lineTo(4f, 3f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.46f, 3.24f)
                close()
                moveTo(3.0f, 11f)
                lineTo(21f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(3f, 21f)
                lineTo(3f, 11f)
                close()
            }
        }.also { _DocumentNft = it}
