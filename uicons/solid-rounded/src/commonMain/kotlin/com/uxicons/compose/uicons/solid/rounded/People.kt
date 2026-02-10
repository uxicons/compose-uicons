package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _People: ImageVector? = null

val Icons.Sr.People: ImageVector
    get() = _People ?: UXIcon(name = "People") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.48f, 0.81f, 2.77f, 2f, 3.46f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.54f)
                curveToRelative(1.19f, -0.69f, 2f, -1.99f, 2f, -3.46f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(18f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(22.98f, 16.63f)
                lineToRelative(-0.88f, -7.01f)
                curveToRelative(-0.26f, -2.06f, -2.02f, -3.62f, -4.1f, -3.62f)
                reflectiveCurveToRelative(-3.84f, 1.56f, -4.1f, 3.62f)
                lineToRelative(-0.88f, 7.01f)
                curveToRelative(-0.11f, 0.85f, 0.16f, 1.71f, 0.73f, 2.36f)
                curveToRelative(0.34f, 0.39f, 0.77f, 0.67f, 1.25f, 0.84f)
                verticalLineToRelative(3.17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0.48f, -0.17f, 0.91f, -0.46f, 1.25f, -0.84f)
                curveToRelative(0.57f, -0.65f, 0.83f, -1.5f, 0.73f, -2.36f)
                close()
            }
        }.also { _People = it}
