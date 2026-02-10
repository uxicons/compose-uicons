package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Rr.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.53f, 13.46f)
                curveToRelative(0.43f, 0.35f, 0.95f, 0.52f, 1.47f, 0.52f)
                reflectiveCurveToRelative(1.04f, -0.17f, 1.47f, -0.52f)
                curveToRelative(1.61f, -1.32f, 3.53f, -3.3f, 3.53f, -5.25f)
                curveToRelative(0f, -1.77f, -1.35f, -3.22f, -3f, -3.22f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.22f)
                curveToRelative(0f, 1.94f, 1.92f, 3.93f, 3.53f, 5.25f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0.48f, 0f, 1f, 0.26f, 1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.74f, 0.52f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.55f, 1f, 1.22f)
                curveToRelative(0f, 0.87f, -1.07f, 2.29f, -2.8f, 3.7f)
                curveToRelative(-0.12f, 0.1f, -0.29f, 0.1f, -0.4f, 0f)
                curveToRelative(-1.73f, -1.42f, -2.8f, -2.83f, -2.8f, -3.7f)
                curveToRelative(0f, -0.67f, 0.45f, -1.22f, 1f, -1.22f)
                close()
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                lineTo(6f, 16f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2f, 0.56f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BookHeart = it}
