package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Ts.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.55f)
                lineToRelative(1.59f, -14.4f)
                curveToRelative(0.06f, -0.56f, 0.32f, -1.09f, 0.72f, -1.49f)
                lineTo(10.23f, 0.73f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                lineToRelative(2.38f, 2.38f)
                curveToRelative(0.4f, 0.4f, 0.66f, 0.93f, 0.72f, 1.49f)
                lineToRelative(1.59f, 14.4f)
                horizontalLineToRelative(3.55f)
                verticalLineToRelative(1f)
                close()
                moveTo(16.01f, 6f)
                horizontalLineToRelative(-3.51f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(4.94f)
                lineToRelative(-1.43f, -13f)
                close()
                moveTo(8.13f, 4.71f)
                lineToRelative(-0.03f, 0.29f)
                horizontalLineToRelative(7.79f)
                lineToRelative(-0.03f, -0.29f)
                curveToRelative(-0.04f, -0.34f, -0.19f, -0.66f, -0.43f, -0.9f)
                lineToRelative(-2.38f, -2.38f)
                curveToRelative(-0.57f, -0.57f, -1.55f, -0.57f, -2.12f, 0f)
                lineToRelative(-2.38f, 2.38f)
                curveToRelative(-0.24f, 0.24f, -0.39f, 0.56f, -0.43f, 0.9f)
                close()
                moveTo(6.56f, 19f)
                horizontalLineToRelative(4.94f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(-3.51f)
                lineToRelative(-1.43f, 13f)
                close()
            }
        }.also { _Monument = it}
