package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Tr.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 10.42f)
                curveTo(23.09f, 3.89f, 17.25f, -0.65f, 10.67f, 0.07f)
                curveTo(5.14f, 0.69f, 0.69f, 5.14f, 0.08f, 10.67f)
                curveToRelative(-0.73f, 6.58f, 3.82f, 12.42f, 10.34f, 13.3f)
                curveToRelative(0.15f, 0.02f, 0.29f, 0.03f, 0.44f, 0.03f)
                curveToRelative(0.93f, 0f, 1.86f, -0.39f, 2.55f, -1.08f)
                lineToRelative(9.52f, -9.52f)
                curveToRelative(0.8f, -0.8f, 1.19f, -1.92f, 1.05f, -2.98f)
                close()
                moveTo(10.55f, 22.98f)
                curveTo(4.57f, 22.17f, 0.4f, 16.82f, 1.07f, 10.78f)
                curveTo(1.63f, 5.71f, 5.71f, 1.63f, 10.78f, 1.07f)
                curveToRelative(0.43f, -0.05f, 0.85f, -0.07f, 1.26f, -0.07f)
                curveToRelative(5.5f, 0f, 10.19f, 3.99f, 10.93f, 9.55f)
                curveToRelative(0.02f, 0.15f, 0.03f, 0.3f, 0.02f, 0.45f)
                curveToRelative(-6.57f, 0.1f, -11.89f, 5.42f, -11.99f, 11.99f)
                curveToRelative(-0.15f, 0.01f, -0.3f, 0.01f, -0.45f, -0.01f)
                close()
                moveTo(12.7f, 22.21f)
                curveToRelative(-0.2f, 0.2f, -0.44f, 0.37f, -0.69f, 0.5f)
                curveToRelative(0.24f, -5.79f, 4.91f, -10.46f, 10.7f, -10.7f)
                curveToRelative(-0.13f, 0.25f, -0.3f, 0.48f, -0.5f, 0.69f)
                lineToRelative(-9.52f, 9.52f)
                close()
            }
        }.also { _Sticker = it}
