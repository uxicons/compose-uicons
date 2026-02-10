package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Rr.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.8f, 1.2f)
                curveToRelative(-0.8f, -0.8f, -1.87f, -1.22f, -2.99f, -1.2f)
                curveToRelative(-3.97f, 0.08f, -9.48f, 0.95f, -13.17f, 4.64f)
                curveToRelative(-5.1f, 5.1f, -4.75f, 13.71f, -4.57f, 15.87f)
                lineToRelative(-1.78f, 1.78f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.78f, -1.78f)
                curveToRelative(0.46f, 0.04f, 1.2f, 0.08f, 2.13f, 0.08f)
                curveToRelative(3.5f, 0f, 9.71f, -0.63f, 13.73f, -4.65f)
                curveToRelative(3.69f, -3.69f, 4.56f, -9.2f, 4.64f, -13.17f)
                curveToRelative(0.02f, -1.13f, -0.4f, -2.19f, -1.2f, -2.99f)
                close()
                moveTo(22.0f, 4.15f)
                curveToRelative(-0.03f, 1.5f, -0.21f, 3.66f, -0.82f, 5.85f)
                horizontalLineToRelative(-5.77f)
                lineToRelative(6.49f, -6.49f)
                curveToRelative(0.06f, 0.2f, 0.1f, 0.42f, 0.09f, 0.64f)
                close()
                moveTo(18.77f, 15f)
                horizontalLineToRelative(-8.35f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(7.08f)
                curveToRelative(-0.44f, 1.06f, -1.01f, 2.08f, -1.73f, 3f)
                close()
                moveTo(9f, 5.24f)
                curveToRelative(0.92f, -0.72f, 1.94f, -1.29f, 3f, -1.73f)
                verticalLineToRelative(7.08f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(19.85f, 2f)
                curveToRelative(0.23f, -0.0f, 0.43f, 0.04f, 0.64f, 0.09f)
                lineToRelative(-6.49f, 6.49f)
                verticalLineToRelative(-5.77f)
                curveToRelative(2.2f, -0.61f, 4.35f, -0.79f, 5.85f, -0.82f)
                close()
                moveTo(7f, 7.32f)
                verticalLineToRelative(8.27f)
                lineToRelative(-2.99f, 2.99f)
                curveToRelative(-0.01f, -2.8f, 0.4f, -7.7f, 2.99f, -11.26f)
                close()
                moveTo(5.42f, 19.99f)
                lineTo(8.41f, 17f)
                horizontalLineToRelative(8.27f)
                curveToRelative(-3.56f, 2.6f, -8.46f, 3.0f, -11.26f, 2.99f)
                close()
            }
        }.also { _BayLeaf = it}
