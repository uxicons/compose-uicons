package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockQuote: ImageVector? = null

val Icons.Sc.BlockQuote: ImageVector
    get() = _BlockQuote ?: UXIcon(name = "BlockQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.05f, 5.88f)
                curveToRelative(-0.21f, -0.8f, 0.27f, -1.62f, 1.07f, -1.83f)
                curveToRelative(0.16f, -0.04f, 4.05f, -1.05f, 9.88f, -1.05f)
                reflectiveCurveToRelative(9.72f, 1.01f, 9.88f, 1.05f)
                curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
                curveToRelative(-0.21f, 0.81f, -1.05f, 1.28f, -1.83f, 1.07f)
                curveToRelative(-0.04f, -0.01f, -3.71f, -0.95f, -9.12f, -0.95f)
                reflectiveCurveToRelative(-9.08f, 0.94f, -9.12f, 0.95f)
                curveToRelative(-0.8f, 0.2f, -1.62f, -0.27f, -1.83f, -1.07f)
                close()
                moveTo(21.88f, 11.55f)
                curveToRelative(-0.16f, -0.04f, -4.05f, -1.05f, -9.88f, -1.05f)
                curveToRelative(-1.56f, 0f, -3.12f, 0.07f, -4.64f, 0.22f)
                curveToRelative(-0.82f, 0.08f, -1.43f, 0.81f, -1.35f, 1.63f)
                curveToRelative(0.08f, 0.83f, 0.8f, 1.43f, 1.64f, 1.35f)
                curveToRelative(1.43f, -0.14f, 2.89f, -0.2f, 4.36f, -0.2f)
                curveToRelative(5.41f, 0f, 9.08f, 0.94f, 9.12f, 0.95f)
                curveToRelative(0.78f, 0.21f, 1.62f, -0.26f, 1.83f, -1.07f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.07f, -1.83f)
                close()
                moveTo(21.88f, 19.05f)
                curveToRelative(-0.16f, -0.04f, -4.05f, -1.05f, -9.88f, -1.05f)
                curveToRelative(-1.56f, 0f, -3.12f, 0.07f, -4.64f, 0.22f)
                curveToRelative(-0.82f, 0.08f, -1.43f, 0.81f, -1.35f, 1.64f)
                curveToRelative(0.08f, 0.82f, 0.8f, 1.43f, 1.64f, 1.35f)
                curveToRelative(1.43f, -0.14f, 2.89f, -0.2f, 4.36f, -0.2f)
                curveToRelative(5.41f, 0f, 9.08f, 0.94f, 9.12f, 0.95f)
                curveToRelative(0.78f, 0.21f, 1.62f, -0.26f, 1.83f, -1.07f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.07f, -1.83f)
                close()
                moveTo(2.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _BlockQuote = it}
