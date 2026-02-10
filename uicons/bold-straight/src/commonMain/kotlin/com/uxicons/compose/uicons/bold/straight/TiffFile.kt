package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TiffFile: ImageVector? = null

val Icons.Bs.TiffFile: ImageVector
    get() = _TiffFile ?: UXIcon(name = "TiffFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(24f, 12.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(2.4f)
                close()
                moveTo(19f, 12.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(2.4f)
                close()
                moveTo(9.25f, 19f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(6.4f)
                close()
            }
        }.also { _TiffFile = it}
