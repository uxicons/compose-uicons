package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgeCheck: ImageVector? = null

val Icons.Sr.BadgeCheck: ImageVector
    get() = _BadgeCheck ?: UXIcon(name = "BadgeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, -1.63f, -0.71f, -3.16f, -1.93f, -4.12f)
                curveToRelative(0.14f, -1.62f, -0.44f, -3.21f, -1.59f, -4.36f)
                curveToRelative(-1.15f, -1.15f, -2.73f, -1.73f, -4.28f, -1.55f)
                curveToRelative(-2.01f, -2.56f, -6.37f, -2.6f, -8.33f, -0.04f)
                curveToRelative(-1.62f, -0.14f, -3.21f, 0.44f, -4.36f, 1.59f)
                curveToRelative(-1.15f, 1.15f, -1.73f, 2.74f, -1.55f, 4.28f)
                curveToRelative(-2.56f, 2.01f, -2.6f, 6.37f, -0.04f, 8.33f)
                curveToRelative(-0.14f, 1.62f, 0.44f, 3.21f, 1.59f, 4.36f)
                curveToRelative(1.15f, 1.15f, 2.74f, 1.73f, 4.28f, 1.55f)
                curveToRelative(2.01f, 2.56f, 6.37f, 2.6f, 8.33f, 0.04f)
                curveToRelative(1.62f, 0.14f, 3.21f, -0.44f, 4.36f, -1.59f)
                curveToRelative(1.15f, -1.15f, 1.73f, -2.74f, 1.55f, -4.28f)
                curveToRelative(1.25f, -1.05f, 1.96f, -2.58f, 1.96f, -4.21f)
                close()
                moveTo(17.54f, 10.57f)
                lineToRelative(-4.74f, 4.57f)
                curveToRelative(-1.16f, 1.16f, -3.07f, 1.15f, -4.23f, -0.01f)
                lineToRelative(-2.25f, -2.09f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.28f, 2.12f)
                curveToRelative(0.42f, 0.42f, 1.05f, 0.42f, 1.44f, 0.03f)
                lineToRelative(4.75f, -4.58f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
            }
        }.also { _BadgeCheck = it}
