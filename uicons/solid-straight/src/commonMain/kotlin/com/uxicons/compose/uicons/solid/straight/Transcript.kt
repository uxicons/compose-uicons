package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcript: ImageVector? = null

val Icons.Ss.Transcript: ImageVector
    get() = _Transcript ?: UXIcon(name = "Transcript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12f)
                lineToRelative(-3.89f, -3f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.11f)
                lineToRelative(3.89f, -3f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0.73f, 0f, 1.41f, -0.21f, 2f, -0.56f)
                verticalLineToRelative(11.56f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(16.73f)
                lineToRelative(-1.29f, 1f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, 0.73f, 0.21f, 1.41f, 0.56f, 2f)
                horizontalLineToRelative(-7.56f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11.43f)
                lineToRelative(2.59f, 2f)
                horizontalLineToRelative(-14.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(5f, 23.41f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(-4.41f)
                close()
            }
        }.also { _Transcript = it}
