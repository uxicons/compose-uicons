package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoSmoking: ImageVector? = null

val Icons.Rs.NoSmoking: ImageVector
    get() = _NoSmoking ?: UXIcon(name = "NoSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18.59f)
                lineToRelative(3.96f, 3.96f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(15.41f, 14f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
                moveTo(15.43f, 8.14f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(0.6f, 0.36f, 0.97f, 1.02f, 0.97f, 1.72f)
                verticalLineToRelative(1.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -1.4f, -0.74f, -2.71f, -1.94f, -3.43f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                verticalLineToRelative(-1.86f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.75f, 0.93f, 3.39f, 2.43f, 4.29f)
                close()
                moveTo(21.57f, 4.98f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.51f, -0.48f, -0.86f)
                lineTo(19.0f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(17.0f, 2.87f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(0.9f, 0.54f, 1.46f, 1.52f, 1.46f, 2.57f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.73f)
                curveToRelative(0f, -1.75f, -0.93f, -3.39f, -2.43f, -4.29f)
                close()
                moveTo(13.76f, 18.0f)
                lineToRelative(2f, 2f)
                lineTo(0f, 20.0f)
                verticalLineToRelative(-6f)
                lineTo(9.76f, 14.0f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-2.76f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.76f)
                close()
                moveTo(2f, 18.0f)
                lineTo(7f, 18.0f)
                verticalLineToRelative(-2f)
                lineTo(2f, 16.0f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _NoSmoking = it}
