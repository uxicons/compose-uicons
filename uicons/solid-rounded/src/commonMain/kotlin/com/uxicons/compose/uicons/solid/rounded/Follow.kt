package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Sr.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2.31f)
                curveToRelative(1.25f, 0.44f, 2.6f, 0.69f, 4f, 0.69f)
                reflectiveCurveToRelative(2.75f, -0.24f, 4f, -0.69f)
                verticalLineToRelative(-2.31f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-1.3f, 0f, -2.52f, -0.36f, -3.56f, -0.99f)
                curveToRelative(-0.69f, 1.18f, -1.97f, 1.99f, -3.44f, 1.99f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(0f, -1.87f, 0.74f, -3.57f, 1.94f, -4.83f)
                curveToRelative(-0.63f, -0.1f, -1.28f, -0.17f, -1.94f, -0.17f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                curveToRelative(0f, 4.43f, 2.42f, 8.31f, 6f, 10.39f)
                verticalLineToRelative(-1.39f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1.39f)
                curveToRelative(3.58f, -2.08f, 6f, -5.96f, 6f, -10.39f)
                curveToRelative(0f, -0.66f, -0.07f, -1.31f, -0.17f, -1.94f)
                curveToRelative(-1.26f, 1.2f, -2.95f, 1.94f, -4.83f, 1.94f)
                close()
            }
        }.also { _Follow = it}
