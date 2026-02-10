package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SirenOn: ImageVector? = null

val Icons.Ss.SirenOn: ImageVector
    get() = _SirenOn ?: UXIcon(name = "SirenOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.14f, 6.32f)
                lineTo(0.39f, 3.69f)
                lineToRelative(1.38f, -1.44f)
                lineToRelative(2.75f, 2.63f)
                lineToRelative(-1.38f, 1.44f)
                close()
                moveTo(8.43f, 3.84f)
                lineTo(7.9f, 0.05f)
                lineToRelative(-1.98f, 0.28f)
                lineToRelative(0.54f, 3.79f)
                lineToRelative(1.98f, -0.28f)
                close()
                moveTo(18.08f, 0.33f)
                lineToRelative(-1.98f, -0.28f)
                lineToRelative(-0.54f, 3.79f)
                lineToRelative(1.98f, 0.28f)
                lineToRelative(0.54f, -3.79f)
                close()
                moveTo(23.61f, 3.69f)
                lineToRelative(-1.38f, -1.44f)
                lineToRelative(-2.75f, 2.63f)
                lineToRelative(1.38f, 1.44f)
                lineToRelative(2.75f, -2.63f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 20.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3.03f, 18f)
                lineToRelative(1.15f, -8.51f)
                curveToRelative(0.25f, -1.99f, 1.96f, -3.49f, 3.97f, -3.49f)
                horizontalLineToRelative(7.7f)
                curveToRelative(2.01f, 0f, 3.72f, 1.51f, 3.97f, 3.5f)
                lineToRelative(1.15f, 8.5f)
                lineTo(3.03f, 18f)
                close()
                moveTo(7.61f, 14f)
                horizontalLineToRelative(2.02f)
                lineToRelative(0.27f, -2f)
                horizontalLineToRelative(2.1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.85f)
                lineToRelative(-0.54f, 4f)
                close()
            }
        }.also { _SirenOn = it}
