package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcript: ImageVector? = null

val Icons.Bs.Transcript: ImageVector
    get() = _Transcript ?: UXIcon(name = "Transcript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-15.38f)
                lineToRelative(-5.62f, -5.67f)
                verticalLineToRelative(-18.34f)
                horizontalLineToRelative(16.73f)
                lineToRelative(-1.29f, 1f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-1.47f, 0f, -2.75f, 0.81f, -3.44f, 2f)
                horizontalLineToRelative(-8.56f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(13f)
                close()
                moveTo(20f, 0f)
                lineTo(16.11f, 3f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.11f)
                lineToRelative(3.89f, 3f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(13.02f)
                lineToRelative(-2.59f, -2f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-1.0f, 0f, -1.91f, -0.39f, -2.62f, -1f)
                horizontalLineToRelative(-7.38f)
                close()
            }
        }.also { _Transcript = it}
