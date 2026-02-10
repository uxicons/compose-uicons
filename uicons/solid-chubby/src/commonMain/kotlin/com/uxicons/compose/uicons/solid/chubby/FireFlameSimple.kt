package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Sc.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.98f, 14.99f)
                curveToRelative(-0.03f, 0.96f, -1.04f, 1.98f, -1.97f, 2.0f)
                curveToRelative(-0.93f, -0.03f, -1.98f, -1.07f, -1.98f, -1.98f)
                curveToRelative(0f, -0.91f, 1.03f, -2.03f, 1.97f, -2.77f)
                curveToRelative(0.86f, 0.72f, 1.97f, 1.89f, 1.98f, 2.75f)
                close()
                moveTo(21.5f, 13.48f)
                curveToRelative(-0.15f, 4.85f, -4.75f, 9.52f, -9.49f, 9.52f)
                curveToRelative(-4.51f, 0f, -9.51f, -4.78f, -9.51f, -9.5f)
                curveToRelative(-0.0f, -6.15f, 8.05f, -11.71f, 8.97f, -12.33f)
                curveToRelative(0.34f, -0.23f, 0.79f, -0.23f, 1.12f, 0.01f)
                curveToRelative(0.09f, 0.06f, 8.8f, 6.11f, 8.91f, 12.31f)
                close()
                moveTo(15.97f, 15.01f)
                curveToRelative(-0.04f, -2.45f, -3.06f, -4.6f, -3.4f, -4.83f)
                curveToRelative(-0.34f, -0.23f, -0.78f, -0.24f, -1.12f, -0.01f)
                curveToRelative(-0.57f, 0.38f, -3.43f, 2.41f, -3.43f, 4.86f)
                curveToRelative(0f, 1.97f, 1.96f, 3.94f, 3.96f, 3.98f)
                horizontalLineToRelative(0.03f)
                curveToRelative(2.01f, -0.03f, 3.9f, -1.91f, 3.96f, -3.99f)
                close()
            }
        }.also { _FireFlameSimple = it}
