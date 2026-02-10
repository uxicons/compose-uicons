package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Ts.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 0f)
                curveToRelative(-3.87f, -0.0f, -6.99f, 3.13f, -7.0f, 7.0f)
                horizontalLineToRelative(5f)
                curveToRelative(0.09f, -0.68f, 0.35f, -1.36f, 0.97f, -1.72f)
                curveToRelative(0.49f, -0.29f, 1.08f, -0.36f, 1.65f, -0.19f)
                curveToRelative(0.62f, 0.18f, 1.13f, 0.71f, 1.3f, 1.34f)
                curveToRelative(0.17f, 0.63f, 0.05f, 1.28f, -0.33f, 1.78f)
                curveToRelative(-0.38f, 0.5f, -0.96f, 0.79f, -1.59f, 0.79f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-16.99f)
                curveToRelative(0f, -3.87f, -3.13f, -7.01f, -7.0f, -7.01f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.94f, 0f, 1.81f, -0.43f, 2.38f, -1.18f)
                curveToRelative(0.57f, -0.75f, 0.76f, -1.72f, 0.5f, -2.65f)
                curveToRelative(-0.26f, -0.97f, -1.02f, -1.75f, -1.98f, -2.03f)
                curveToRelative(-0.85f, -0.25f, -1.72f, -0.15f, -2.45f, 0.29f)
                curveToRelative(-0.6f, 0.36f, -1.06f, 0.92f, -1.29f, 1.57f)
                horizontalLineToRelative(-3.08f)
                curveToRelative(0.5f, -2.97f, 3.2f, -5.16f, 6.26f, -4.99f)
                curveToRelative(3.17f, 0.18f, 5.65f, 2.92f, 5.65f, 6.24f)
                verticalLineToRelative(15.75f)
                close()
            }
        }.also { _DoorHanger = it}
