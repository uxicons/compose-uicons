package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snap: ImageVector? = null

val Icons.Bs.Snap: ImageVector
    get() = _Snap ?: UXIcon(name = "Snap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.41f, 6.35f)
                lineToRelative(-2.06f, -2.18f)
                lineToRelative(2.65f, -2.51f)
                lineToRelative(2.06f, 2.18f)
                lineToRelative(-2.65f, 2.51f)
                close()
                moveTo(5.43f, 4.14f)
                lineTo(2.75f, 1.63f)
                lineTo(0.7f, 3.82f)
                lineToRelative(2.68f, 2.51f)
                lineToRelative(2.05f, -2.19f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineTo(10f, 0f)
                close()
                moveTo(17.13f, 9.49f)
                lineToRelative(4.21f, -4.02f)
                curveToRelative(0.54f, -0.52f, 0.67f, -1.38f, 0.25f, -2.0f)
                curveToRelative(-0.54f, -0.79f, -1.61f, -0.87f, -2.27f, -0.24f)
                lineToRelative(-10.95f, 10.45f)
                lineToRelative(-0.26f, -3.41f)
                curveToRelative(-0.08f, -1.12f, -1.05f, -1.98f, -2.17f, -1.9f)
                curveToRelative(-1.12f, 0.08f, -1.98f, 1.05f, -1.9f, 2.17f)
                lineToRelative(0.54f, 9.05f)
                lineTo(0f, 24f)
                horizontalLineToRelative(4.41f)
                lineToRelative(4.42f, -4.25f)
                lineToRelative(-0.16f, -2.17f)
                lineToRelative(6.23f, -5.95f)
                lineToRelative(4.29f, 7.73f)
                lineToRelative(-4.86f, 4.64f)
                horizontalLineToRelative(4.34f)
                lineToRelative(4.26f, -4.07f)
                lineToRelative(-5.8f, -10.44f)
                close()
            }
        }.also { _Snap = it}
