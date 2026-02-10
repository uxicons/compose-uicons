package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Rr.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(17.93f, 8.84f, 17.93f, 0.15f, 12f, 0f)
                curveToRelative(-5.93f, 0.16f, -5.93f, 8.85f, 0f, 9f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.29f, 0.06f, 3.29f, 4.94f, 0f, 5f)
                curveToRelative(-3.29f, -0.06f, -3.29f, -4.94f, 0f, -5f)
                close()
                moveTo(22.2f, 11.16f)
                curveToRelative(-1.14f, -0.95f, -2.64f, -1.35f, -4.1f, -1.08f)
                lineToRelative(-3.82f, 0.69f)
                curveToRelative(-0.91f, 0.17f, -1.71f, 0.63f, -2.28f, 1.29f)
                curveToRelative(-0.58f, -0.66f, -1.37f, -1.12f, -2.29f, -1.29f)
                lineToRelative(-3.82f, -0.69f)
                curveToRelative(-1.46f, -0.26f, -2.96f, 0.13f, -4.1f, 1.08f)
                curveToRelative(-1.14f, 0.95f, -1.8f, 2.35f, -1.8f, 3.84f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 2.42f, 1.73f, 4.49f, 4.11f, 4.92f)
                lineToRelative(6.28f, 1.14f)
                curveToRelative(1.07f, 0.19f, 2.15f, 0.19f, 3.22f, 0f)
                lineToRelative(6.29f, -1.14f)
                curveToRelative(2.38f, -0.43f, 4.11f, -2.5f, 4.11f, -4.92f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -1.49f, -0.65f, -2.89f, -1.8f, -3.84f)
                close()
                moveTo(11f, 21.93f)
                curveToRelative(-0.08f, -0.01f, -0.17f, -0.03f, -0.25f, -0.04f)
                lineToRelative(-6.28f, -1.14f)
                curveToRelative(-1.43f, -0.26f, -2.46f, -1.5f, -2.46f, -2.95f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.08f, -2.3f)
                curveToRelative(0.69f, -0.57f, 1.59f, -0.81f, 2.46f, -0.65f)
                lineToRelative(3.82f, 0.69f)
                curveToRelative(0.95f, 0.17f, 1.64f, 1f, 1.64f, 1.97f)
                verticalLineToRelative(7.22f)
                close()
                moveTo(22f, 17.79f)
                curveToRelative(0f, 1.45f, -1.04f, 2.69f, -2.46f, 2.95f)
                lineToRelative(-6.29f, 1.14f)
                curveToRelative(-0.08f, 0.01f, -0.17f, 0.03f, -0.25f, 0.04f)
                verticalLineToRelative(-7.22f)
                curveToRelative(0f, -0.97f, 0.69f, -1.79f, 1.64f, -1.97f)
                lineToRelative(3.82f, -0.69f)
                curveToRelative(0.88f, -0.16f, 1.77f, 0.08f, 2.46f, 0.65f)
                curveToRelative(0.69f, 0.57f, 1.08f, 1.41f, 1.08f, 2.3f)
                verticalLineToRelative(2.79f)
                close()
            }
        }.also { _BookOpenReader = it}
