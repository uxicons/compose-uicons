package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Rr.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.3f, 0.7f)
                curveToRelative(-0.54f, -0.54f, -1.29f, -0.79f, -2.05f, -0.67f)
                curveToRelative(-3.63f, 0.55f, -10.53f, 2.28f, -15.97f, 7.74f)
                curveToRelative(-1.54f, 1.54f, -2.36f, 3.67f, -2.27f, 5.85f)
                curveToRelative(0.07f, 1.62f, 0.63f, 3.12f, 1.58f, 4.37f)
                lineTo(0.29f, 22.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.3f, -4.3f)
                curveToRelative(1.36f, 1.06f, 3.0f, 1.6f, 4.67f, 1.6f)
                curveToRelative(2.11f, 0f, 4.24f, -0.84f, 5.83f, -2.49f)
                curveToRelative(5.44f, -5.62f, 7.03f, -12.91f, 7.46f, -15.79f)
                curveToRelative(0.11f, -0.76f, -0.13f, -1.5f, -0.67f, -2.03f)
                close()
                moveTo(5.01f, 13.53f)
                curveToRelative(-0.07f, -1.62f, 0.54f, -3.21f, 1.68f, -4.35f)
                curveToRelative(5.04f, -5.05f, 11.47f, -6.66f, 14.85f, -7.17f)
                curveToRelative(0.02f, -0.0f, 0.21f, -0.04f, 0.34f, 0.11f)
                curveToRelative(0.05f, 0.05f, 0.13f, 0.16f, 0.1f, 0.32f)
                curveToRelative(-0.18f, 1.2f, -0.58f, 3.23f, -1.41f, 5.56f)
                horizontalLineToRelative(-3.92f)
                curveToRelative(-1.33f, 0f, -2.59f, 0.52f, -3.54f, 1.47f)
                lineToRelative(-7.09f, 7.09f)
                curveToRelative(-0.61f, -0.88f, -0.97f, -1.92f, -1.02f, -3.03f)
                close()
                moveTo(18.23f, 13f)
                horizontalLineToRelative(-5.82f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.56f, -0.56f, 1.33f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(3.13f)
                curveToRelative(-0.43f, 0.98f, -0.95f, 1.99f, -1.55f, 3f)
                close()
                moveTo(15.07f, 17.13f)
                curveToRelative(-2.08f, 2.15f, -5.34f, 2.46f, -7.62f, 0.84f)
                lineToRelative(2.97f, -2.97f)
                horizontalLineToRelative(6.46f)
                curveToRelative(-0.55f, 0.73f, -1.14f, 1.44f, -1.81f, 2.13f)
                close()
            }
        }.also { _FeatherPointed = it}
