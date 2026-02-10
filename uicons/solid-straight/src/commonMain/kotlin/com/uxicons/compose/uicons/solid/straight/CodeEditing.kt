package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeEditing: ImageVector? = null

val Icons.Ss.CodeEditing: ImageVector
    get() = _CodeEditing ?: UXIcon(name = "CodeEditing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.54f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-7.67f, 7.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
                moveTo(10.0f, 19.58f)
                lineTo(11.58f, 18f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.93f, 16f)
                horizontalLineToRelative(3.65f)
                lineToRelative(4.67f, -4.67f)
                curveToRelative(0.97f, -0.97f, 2.38f, -1.49f, 3.75f, -1.28f)
                verticalLineToRelative(-7.05f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                close()
                moveTo(13.8f, 6.98f)
                lineTo(15.21f, 5.57f)
                lineTo(17.46f, 7.82f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(-2.26f, 2.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.26f, -2.26f)
                close()
                moveTo(6.54f, 10.63f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(2.26f, 2.24f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _CodeEditing = it}
