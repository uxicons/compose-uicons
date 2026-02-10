package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Tc.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.1f, 6.8f)
                curveToRelative(-0.17f, -0.22f, -0.12f, -0.54f, 0.1f, -0.7f)
                curveToRelative(0.22f, -0.17f, 0.54f, -0.12f, 0.7f, 0.1f)
                curveToRelative(1.48f, 1.98f, 3.12f, 3.6f, 4.78f, 4.71f)
                curveToRelative(3.0f, -1.88f, 5.99f, -5.14f, 8.89f, -9.68f)
                curveToRelative(0.15f, -0.23f, 0.46f, -0.3f, 0.69f, -0.15f)
                curveToRelative(0.23f, 0.15f, 0.3f, 0.46f, 0.15f, 0.69f)
                curveToRelative(-3.07f, 4.81f, -6.26f, 8.22f, -9.49f, 10.16f)
                curveToRelative(-0.16f, 0.1f, -0.36f, 0.1f, -0.53f, -0.01f)
                curveToRelative(-1.85f, -1.17f, -3.68f, -2.94f, -5.31f, -5.12f)
                close()
                moveTo(22.76f, 8.57f)
                curveToRelative(-0.24f, -0.14f, -0.54f, -0.07f, -0.69f, 0.17f)
                curveToRelative(-3.31f, 5.51f, -7.73f, 10.06f, -12.8f, 13.17f)
                curveToRelative(-2.56f, -1.68f, -5.1f, -4.16f, -7.37f, -7.21f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.27f, -0.7f, -0.1f)
                curveToRelative(-0.22f, 0.17f, -0.27f, 0.48f, -0.1f, 0.7f)
                curveToRelative(2.42f, 3.25f, 5.15f, 5.88f, 7.9f, 7.62f)
                curveToRelative(0.16f, 0.1f, 0.36f, 0.1f, 0.53f, 0.01f)
                curveToRelative(5.32f, -3.19f, 9.96f, -7.92f, 13.41f, -13.67f)
                curveToRelative(0.14f, -0.24f, 0.07f, -0.54f, -0.17f, -0.69f)
                close()
            }
        }.also { _CheckDouble = it}
