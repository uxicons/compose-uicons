package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Tr.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(17.93f, 8.84f, 17.93f, 0.15f, 12f, 0f)
                curveToRelative(-5.93f, 0.16f, -5.93f, 8.85f, 0f, 9f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.62f, 0.12f, 4.61f, 6.88f, 0f, 7f)
                curveToRelative(-4.62f, -0.12f, -4.61f, -6.88f, 0f, -7f)
                close()
                moveTo(22.38f, 11.05f)
                curveToRelative(-1.03f, -0.86f, -2.37f, -1.21f, -3.69f, -0.97f)
                lineToRelative(-4.21f, 0.77f)
                curveToRelative(-1.07f, 0.2f, -1.96f, 0.85f, -2.48f, 1.74f)
                curveToRelative(-0.52f, -0.89f, -1.41f, -1.54f, -2.49f, -1.74f)
                lineToRelative(-4.21f, -0.77f)
                curveToRelative(-1.31f, -0.24f, -2.66f, 0.12f, -3.69f, 0.97f)
                curveToRelative(-1.03f, 0.86f, -1.62f, 2.12f, -1.62f, 3.46f)
                verticalLineToRelative(3.7f)
                curveToRelative(0f, 2.18f, 1.55f, 4.04f, 3.69f, 4.43f)
                lineToRelative(6.78f, 1.23f)
                curveToRelative(1.01f, 0.18f, 2.03f, 0.18f, 3.04f, 0f)
                lineToRelative(6.79f, -1.23f)
                curveToRelative(2.14f, -0.39f, 3.69f, -2.25f, 3.69f, -4.43f)
                verticalLineToRelative(-3.7f)
                curveToRelative(0f, -1.34f, -0.59f, -2.6f, -1.62f, -3.46f)
                close()
                moveTo(11.5f, 22.98f)
                curveToRelative(-0.28f, -0.02f, -0.56f, -0.05f, -0.84f, -0.1f)
                lineToRelative(-6.78f, -1.23f)
                curveToRelative(-1.67f, -0.3f, -2.87f, -1.75f, -2.87f, -3.44f)
                verticalLineToRelative(-3.7f)
                curveToRelative(0f, -1.04f, 0.46f, -2.02f, 1.26f, -2.69f)
                curveToRelative(0.8f, -0.67f, 1.85f, -0.94f, 2.87f, -0.76f)
                lineToRelative(4.21f, 0.77f)
                curveToRelative(1.25f, 0.23f, 2.17f, 1.32f, 2.17f, 2.59f)
                verticalLineToRelative(8.57f)
                close()
                moveTo(23f, 18.2f)
                curveToRelative(0f, 1.69f, -1.21f, 3.14f, -2.87f, 3.44f)
                lineToRelative(-6.79f, 1.23f)
                curveToRelative(-0.28f, 0.05f, -0.56f, 0.09f, -0.84f, 0.1f)
                lineTo(12.5f, 14.42f)
                curveToRelative(0f, -1.27f, 0.91f, -2.37f, 2.17f, -2.59f)
                lineToRelative(4.21f, -0.77f)
                curveToRelative(1.02f, -0.19f, 2.07f, 0.09f, 2.87f, 0.76f)
                curveToRelative(0.8f, 0.67f, 1.26f, 1.65f, 1.26f, 2.69f)
                verticalLineToRelative(3.7f)
                close()
            }
        }.also { _BookOpenReader = it}
