package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SirenOn: ImageVector? = null

val Icons.Rs.SirenOn: ImageVector
    get() = _SirenOn ?: UXIcon(name = "SirenOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(-1.15f, -8.5f)
                curveToRelative(-0.25f, -2.0f, -1.96f, -3.5f, -3.97f, -3.5f)
                horizontalLineToRelative(-7.7f)
                curveToRelative(-2.01f, 0f, -3.72f, 1.51f, -3.97f, 3.49f)
                lineToRelative(-1.15f, 8.51f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6.16f, 9.75f)
                curveToRelative(0.12f, -1.0f, 0.98f, -1.75f, 1.99f, -1.75f)
                horizontalLineToRelative(7.7f)
                curveToRelative(1.01f, 0f, 1.86f, 0.75f, 1.99f, 1.76f)
                lineToRelative(1.11f, 8.24f)
                lineTo(5.05f, 18f)
                lineToRelative(1.11f, -8.25f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(8.15f, 10f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.27f, 2f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(0.54f, -4f)
                close()
                moveTo(3.14f, 6.32f)
                lineTo(0.39f, 3.69f)
                lineToRelative(1.38f, -1.44f)
                lineToRelative(2.75f, 2.63f)
                lineToRelative(-1.38f, 1.44f)
                close()
                moveTo(6.45f, 4.12f)
                lineToRelative(-0.54f, -3.79f)
                lineTo(7.9f, 0.05f)
                lineToRelative(0.54f, 3.79f)
                lineToRelative(-1.98f, 0.28f)
                close()
                moveTo(17.55f, 4.12f)
                lineToRelative(-1.98f, -0.28f)
                lineTo(16.1f, 0.05f)
                lineToRelative(1.98f, 0.28f)
                lineToRelative(-0.54f, 3.79f)
                close()
                moveTo(20.86f, 6.32f)
                lineToRelative(-1.38f, -1.44f)
                lineToRelative(2.75f, -2.63f)
                lineToRelative(1.38f, 1.44f)
                lineToRelative(-2.75f, 2.63f)
                close()
            }
        }.also { _SirenOn = it}
