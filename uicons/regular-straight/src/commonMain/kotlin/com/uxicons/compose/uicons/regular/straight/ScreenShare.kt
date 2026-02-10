package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Rs.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                lineTo(22f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4f, 5f)
                lineTo(20f, 5f)
                lineTo(20f, 15f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1f, -1f)
                lineTo(4f, 15f)
                lineTo(4f, 5f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.09f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.09f)
                verticalLineToRelative(1f)
                close()
                moveTo(9.25f, 11.25f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.76f, -2.76f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.75f, -1.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.51f)
                lineToRelative(-1.75f, 1.76f)
                close()
            }
        }.also { _ScreenShare = it}
