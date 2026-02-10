package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Sr.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.73f, 12.31f)
                reflectiveCurveToRelative(-4.73f, -5.0f, -4.75f, -5.02f)
                curveToRelative(-0.76f, -0.79f, -1.81f, -1.29f, -2.98f, -1.29f)
                curveToRelative(-1.31f, 0f, -2.49f, 0.62f, -3.25f, 1.59f)
                lineToRelative(-4.47f, 4.72f)
                curveToRelative(-0.38f, 0.4f, -0.36f, 1.03f, 0.04f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.69f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.1f, 0.73f, -0.31f)
                lineToRelative(1.92f, -2.02f)
                lineToRelative(-0.62f, 4.96f)
                curveToRelative(-0.11f, 0.85f, 0.16f, 1.71f, 0.73f, 2.36f)
                curveToRelative(0.34f, 0.39f, 0.78f, 0.66f, 1.25f, 0.83f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.19f)
                curveToRelative(0.47f, -0.17f, 0.91f, -0.44f, 1.25f, -0.83f)
                curveToRelative(0.57f, -0.65f, 0.83f, -1.5f, 0.73f, -2.36f)
                lineToRelative(-0.62f, -4.98f)
                lineToRelative(1.92f, 2.04f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.31f, 0.73f, 0.31f)
                curveToRelative(0.25f, 0f, 0.49f, -0.09f, 0.69f, -0.27f)
                curveToRelative(0.4f, -0.38f, 0.42f, -1.01f, 0.04f, -1.41f)
                close()
            }
        }.also { _PersonDress = it}
