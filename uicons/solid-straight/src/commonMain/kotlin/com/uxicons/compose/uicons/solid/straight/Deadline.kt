package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Deadline: ImageVector? = null

val Icons.Ss.Deadline: ImageVector
    get() = _Deadline ?: UXIcon(name = "Deadline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.67f, 12f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(14f)
                close()
                moveTo(17.67f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15.67f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(12.81f, 14.63f)
                lineTo(7.77f, 23.28f)
                curveToRelative(-4.15f, -1.58f, -7.11f, -5.58f, -7.11f, -10.28f)
                curveToRelative(0f, -2.88f, 1.12f, -5.5f, 2.94f, -7.46f)
                lineToRelative(-0.98f, -1.09f)
                lineToRelative(-0.88f, 0.88f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.25f, -3.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.95f, 0.95f)
                lineToRelative(1.05f, 1.17f)
                curveToRelative(1.58f, -1.19f, 3.49f, -1.96f, 5.57f, -2.15f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.05f)
                curveToRelative(2.08f, 0.19f, 3.99f, 0.96f, 5.57f, 2.15f)
                lineToRelative(1.05f, -1.17f)
                lineToRelative(-0.89f, -0.89f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.19f, 3.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.88f, -0.88f)
                lineToRelative(-0.98f, 1.09f)
                curveToRelative(1.82f, 1.96f, 2.94f, 4.58f, 2.94f, 7.46f)
                curveToRelative(0f, 1.41f, -0.28f, 2.76f, -0.77f, 4.0f)
                lineToRelative(-4.09f, -7.0f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(-1.87f, 3.21f)
                curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.21f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-5.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.43f, 0f, 0.82f, -0.14f, 1.15f, -0.37f)
                close()
            }
        }.also { _Deadline = it}
