package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoPlus: ImageVector? = null

val Icons.Bs.VideoPlus: ImageVector
    get() = _VideoPlus ?: UXIcon(name = "VideoPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.12f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                lineTo(21f, 21f)
                verticalLineToRelative(-5.12f)
                lineToRelative(3f, 3f)
                lineTo(24f, 5.12f)
                close()
                moveTo(18f, 18f)
                lineTo(3f, 18f)
                lineTo(3f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(12f, 10.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _VideoPlus = it}
