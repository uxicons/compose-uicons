package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Ts.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 7.88f)
                curveToRelative(-0.48f, -0.56f, -1.17f, -0.88f, -1.91f, -0.88f)
                lineTo(12.71f, 7f)
                lineTo(8.51f, 2.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineTo(0f, 7.71f)
                verticalLineToRelative(14.29f)
                lineTo(12.91f, 22f)
                lineToRelative(2f, -10f)
                horizontalLineToRelative(6.48f)
                curveToRelative(1.27f, 0f, 2.38f, -0.9f, 2.57f, -2.08f)
                curveToRelative(0.12f, -0.73f, -0.09f, -1.48f, -0.56f, -2.04f)
                close()
                moveTo(22.98f, 9.76f)
                curveToRelative(-0.12f, 0.71f, -0.8f, 1.25f, -1.59f, 1.25f)
                horizontalLineToRelative(-7.3f)
                lineToRelative(-2f, 10f)
                lineTo(1f, 21.0f)
                lineTo(1f, 8.12f)
                lineTo(5.68f, 3.44f)
                curveToRelative(0.57f, -0.57f, 1.56f, -0.56f, 2.12f, -0.0f)
                lineToRelative(3.51f, 3.56f)
                lineTo(7f, 7.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.44f, 0f, 0.86f, 0.19f, 1.14f, 0.53f)
                curveToRelative(0.29f, 0.34f, 0.41f, 0.78f, 0.34f, 1.23f)
                close()
            }
        }.also { _HandBackPointRight = it}
