package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Sr.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.0f, 21.88f)
                curveToRelative(0.05f, 0.01f, 0.22f, 0.03f, 0.49f, 0.05f)
                lineToRelative(-1.78f, 1.78f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.78f, -1.78f)
                curveToRelative(0.02f, 0.27f, 0.04f, 0.45f, 0.05f, 0.49f)
                curveToRelative(0.06f, 0.46f, 0.42f, 0.82f, 0.87f, 0.87f)
                close()
                moveTo(23.27f, 10f)
                curveToRelative(0.51f, -2.04f, 0.69f, -4.08f, 0.73f, -5.81f)
                curveToRelative(0.02f, -0.79f, -0.19f, -1.54f, -0.58f, -2.19f)
                lineToRelative(-8.01f, 8.01f)
                close()
                moveTo(7f, 4.3f)
                curveToRelative(-0.12f, 0.11f, -0.24f, 0.22f, -0.35f, 0.34f)
                curveToRelative(-5.09f, 5.09f, -4.75f, 13.7f, -4.57f, 15.87f)
                lineToRelative(4.92f, -4.92f)
                close()
                moveTo(21.22f, 15f)
                curveToRelative(0.59f, -0.95f, 1.07f, -1.97f, 1.44f, -3f)
                horizontalLineToRelative(-9.25f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(5.62f, 22.01f)
                curveToRelative(3.5f, 0f, 9.71f, -0.63f, 13.73f, -4.65f)
                curveToRelative(0.12f, -0.12f, 0.23f, -0.23f, 0.34f, -0.35f)
                horizontalLineToRelative(-11.28f)
                lineToRelative(-4.92f, 4.92f)
                curveToRelative(0.46f, 0.04f, 1.2f, 0.08f, 2.13f, 0.08f)
                close()
                moveTo(19.81f, -0f)
                curveToRelative(-1.74f, 0.04f, -3.77f, 0.22f, -5.81f, 0.73f)
                verticalLineToRelative(7.85f)
                lineToRelative(8.01f, -8.0f)
                curveToRelative(-0.66f, -0.39f, -1.42f, -0.59f, -2.19f, -0.58f)
                close()
                moveTo(12f, 1.34f)
                curveToRelative(-1.03f, 0.38f, -2.04f, 0.85f, -3f, 1.44f)
                verticalLineToRelative(10.8f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-9.25f)
                close()
            }
        }.also { _BayLeaf = it}
