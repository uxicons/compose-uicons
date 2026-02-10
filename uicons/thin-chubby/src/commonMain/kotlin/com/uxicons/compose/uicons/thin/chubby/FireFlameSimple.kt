package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Tc.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.28f, 9.58f)
                curveToRelative(-0.17f, -0.11f, -0.39f, -0.11f, -0.56f, 0f)
                curveToRelative(-0.04f, 0.03f, -3.72f, 2.71f, -3.72f, 5.42f)
                curveToRelative(0f, 1.98f, 1.98f, 3.96f, 3.99f, 4.0f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.99f, -0.03f, 3.93f, -1.97f, 4.0f, -4.01f)
                curveToRelative(-0.04f, -2.6f, -3.69f, -5.38f, -3.72f, -5.41f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.46f, -0.03f, -3.0f, -1.57f, -3.0f, -3.0f)
                curveToRelative(0f, -1.69f, 2.07f, -3.63f, 2.99f, -4.37f)
                curveToRelative(0.8f, 0.67f, 2.99f, 2.67f, 3.01f, 4.35f)
                curveToRelative(-0.04f, 1.5f, -1.53f, 2.99f, -3f, 3.02f)
                close()
                moveTo(12.28f, 1.08f)
                curveToRelative(-0.17f, -0.11f, -0.41f, -0.1f, -0.58f, 0.02f)
                curveToRelative(-1.54f, 1.02f, -9.2f, 6.41f, -9.2f, 12.4f)
                curveToRelative(0f, 4.62f, 4.79f, 9.42f, 9.49f, 9.5f)
                horizontalLineToRelative(0.02f)
                curveToRelative(4.74f, -0.07f, 9.35f, -4.68f, 9.5f, -9.51f)
                curveToRelative(-0.1f, -6.23f, -8.85f, -12.16f, -9.22f, -12.41f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-4.13f, -0.08f, -8.5f, -4.45f, -8.5f, -8.5f)
                curveToRelative(0f, -5.22f, 6.82f, -10.24f, 8.5f, -11.4f)
                curveToRelative(1.48f, 1.05f, 8.42f, 6.28f, 8.51f, 11.38f)
                curveToRelative(-0.13f, 4.24f, -4.34f, 8.46f, -8.5f, 8.52f)
                close()
            }
        }.also { _FireFlameSimple = it}
