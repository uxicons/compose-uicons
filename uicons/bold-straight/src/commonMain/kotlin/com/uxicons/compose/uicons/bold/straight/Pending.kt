package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pending: ImageVector? = null

val Icons.Bs.Pending: ImageVector
    get() = _Pending ?: UXIcon(name = "Pending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 6f)
                verticalLineToRelative(5.05f)
                lineToRelative(3.67f, 2.3f)
                lineToRelative(-1.59f, 2.54f)
                lineToRelative(-5.08f, -3.18f)
                verticalLineToRelative(-6.71f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19.18f, 17.43f)
                lineToRelative(2.39f, 1.81f)
                curveToRelative(0.63f, -0.83f, 1.15f, -1.74f, 1.54f, -2.7f)
                lineToRelative(-2.77f, -1.14f)
                curveToRelative(-0.29f, 0.72f, -0.68f, 1.4f, -1.16f, 2.02f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-0.38f, 0f, -0.77f, -0.03f, -1.14f, -0.08f)
                curveToRelative(-4.42f, -0.56f, -7.86f, -4.34f, -7.86f, -8.92f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(2.44f, 0f, 4.7f, 0.98f, 6.36f, 2.64f)
                lineToRelative(-2.36f, 2.36f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.6f, 0f, 1.09f, -0.49f, 1.09f, -1.09f)
                lineTo(23f, 1f)
                lineToRelative(-2.52f, 2.52f)
                curveTo(18.27f, 1.3f, 15.25f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 6.04f, 4.75f, 12f, 12f, 12f)
                curveToRelative(0.57f, 0f, 1.15f, -0.04f, 1.71f, -0.12f)
                lineToRelative(-0.42f, -2.97f)
                curveToRelative(-0.42f, 0.06f, -0.85f, 0.09f, -1.28f, 0.09f)
                close()
                moveTo(23.9f, 10.45f)
                lineToRelative(-2.98f, 0.38f)
                curveToRelative(0.05f, 0.39f, 0.07f, 0.78f, 0.08f, 1.17f)
                curveToRelative(0f, 0.39f, -0.03f, 0.78f, -0.07f, 1.16f)
                lineToRelative(2.98f, 0.38f)
                curveToRelative(0.07f, -0.51f, 0.1f, -1.03f, 0.1f, -1.55f)
                curveToRelative(0f, -0.52f, -0.03f, -1.04f, -0.1f, -1.55f)
                close()
                moveTo(15.53f, 20.28f)
                lineToRelative(1.18f, 2.76f)
                curveToRelative(0.95f, -0.41f, 1.85f, -0.94f, 2.67f, -1.58f)
                lineToRelative(-1.85f, -2.36f)
                curveToRelative(-0.61f, 0.48f, -1.29f, 0.88f, -2.0f, 1.19f)
                close()
            }
        }.also { _Pending = it}
