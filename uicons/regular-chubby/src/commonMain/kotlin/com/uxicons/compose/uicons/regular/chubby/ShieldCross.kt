package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCross: ImageVector? = null

val Icons.Rc.ShieldCross: ImageVector
    get() = _ShieldCross ?: UXIcon(name = "ShieldCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.95f, 3.5f)
                curveToRelative(-0.06f, -0.28f, -0.23f, -0.52f, -0.47f, -0.66f)
                curveToRelative(-0.13f, -0.07f, -3.2f, -1.83f, -8.38f, -1.83f)
                curveToRelative(-5.12f, -0.07f, -8.5f, 1.77f, -8.57f, 1.83f)
                curveToRelative(-0.24f, 0.14f, -0.42f, 0.38f, -0.47f, 0.66f)
                curveToRelative(-0.53f, 2.6f, -2.09f, 12.77f, 0.04f, 15.04f)
                curveToRelative(2.35f, 2.49f, 7.99f, 4.23f, 8.62f, 4.42f)
                curveToRelative(0.19f, 0.06f, 0.39f, 0.06f, 0.58f, 0f)
                curveToRelative(0.64f, -0.19f, 6.28f, -1.93f, 8.62f, -4.42f)
                curveToRelative(2.13f, -2.27f, 0.57f, -12.44f, 0.04f, -15.04f)
                close()
                moveTo(19.85f, 10f)
                horizontalLineToRelative(-6.85f)
                verticalLineToRelative(-6.98f)
                curveToRelative(3.13f, 0.13f, 5.26f, 0.97f, 6.09f, 1.35f)
                curveToRelative(0.37f, 1.91f, 0.62f, 3.85f, 0.77f, 5.63f)
                close()
                moveTo(11f, 3.03f)
                verticalLineToRelative(6.97f)
                horizontalLineToRelative(-6.85f)
                curveToRelative(0.14f, -1.78f, 0.4f, -3.71f, 0.77f, -5.63f)
                curveToRelative(0.83f, -0.38f, 2.97f, -1.2f, 6.08f, -1.34f)
                close()
                moveTo(4.03f, 12f)
                horizontalLineToRelative(6.97f)
                verticalLineToRelative(8.62f)
                curveToRelative(-2.13f, -0.75f, -5.13f, -2.05f, -6.45f, -3.45f)
                curveToRelative(-0.43f, -0.46f, -0.62f, -2.48f, -0.52f, -5.16f)
                close()
                moveTo(19.45f, 17.16f)
                curveToRelative(-1.32f, 1.4f, -4.33f, 2.7f, -6.46f, 3.46f)
                verticalLineToRelative(-8.62f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.1f, 2.68f, -0.09f, 4.7f, -0.52f, 5.16f)
                close()
            }
        }.also { _ShieldCross = it}
