package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Tc.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 13.22f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.04f, -0.68f, 0.21f)
                curveToRelative(-0.01f, 0.02f, -1.19f, 2.21f, -3.41f, 4.44f)
                curveToRelative(-1.78f, 1.78f, -3.55f, 2.91f, -4.18f, 3.28f)
                curveToRelative(-0.65f, -0.4f, -2.5f, -1.58f, -4.19f, -3.28f)
                curveToRelative(-0.38f, -0.38f, -0.74f, -0.77f, -1.06f, -1.16f)
                curveToRelative(-0.18f, -0.21f, -0.49f, -0.23f, -0.7f, -0.06f)
                curveToRelative(-0.21f, 0.18f, -0.23f, 0.49f, -0.06f, 0.7f)
                curveToRelative(0.34f, 0.4f, 0.71f, 0.81f, 1.11f, 1.21f)
                curveToRelative(2.18f, 2.19f, 4.55f, 3.54f, 4.65f, 3.59f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                curveToRelative(0.08f, 0f, 0.16f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.1f, -0.05f, 2.34f, -1.27f, 4.66f, -3.6f)
                curveToRelative(2.33f, -2.34f, 3.53f, -4.58f, 3.58f, -4.67f)
                curveToRelative(0.13f, -0.24f, 0.04f, -0.55f, -0.21f, -0.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.35f, 11.74f)
                curveToRelative(0.38f, 1.12f, 0.75f, 2.36f, 1.1f, 3.75f)
                curveToRelative(0.06f, 0.23f, 0.26f, 0.38f, 0.48f, 0.38f)
                curveToRelative(0.04f, 0f, 0.08f, -0.01f, 0.12f, -0.02f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                curveTo(11.81f, 5.08f, 8.41f, 2.18f, 8.03f, 1.88f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, -0.01f)
                curveToRelative(-0.15f, 0.11f, -3.71f, 2.89f, -6.41f, 13.37f)
                curveToRelative(-0.07f, 0.27f, 0.09f, 0.54f, 0.36f, 0.61f)
                curveToRelative(0.27f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.36f, -1.39f, 0.73f, -2.63f, 1.1f, -3.75f)
                horizontalLineTo(12.35f)
                close()
                moveTo(7.72f, 2.95f)
                curveToRelative(0.7f, 0.71f, 2.51f, 2.89f, 4.29f, 7.79f)
                horizontalLineTo(3.43f)
                curveToRelative(1.78f, -4.92f, 3.58f, -7.08f, 4.28f, -7.79f)
                close()
            }
        }.also { _TextCheck = it}
