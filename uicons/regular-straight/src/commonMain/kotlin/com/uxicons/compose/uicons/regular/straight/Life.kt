package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Rs.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(22.18f, 12.73f)
                lineToRelative(-1.36f, -1.47f)
                lineToRelative(-6.21f, 5.74f)
                horizontalLineToRelative(-5.22f)
                lineToRelative(-6.21f, -5.74f)
                lineToRelative(-1.36f, 1.47f)
                lineToRelative(6.18f, 5.7f)
                verticalLineToRelative(5.56f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.56f)
                lineToRelative(6.18f, -5.7f)
                close()
                moveTo(7f, 3.19f)
                curveTo(7f, 1.44f, 8.35f, 0.03f, 10f, 0.03f)
                curveToRelative(0.78f, 0f, 1.48f, 0.27f, 2f, 0.73f)
                curveTo(12.52f, 0.3f, 13.22f, 0.03f, 14f, 0.03f)
                curveToRelative(1.65f, 0f, 3f, 1.42f, 3f, 3.16f)
                curveToRelative(0f, 2.73f, -4.0f, 5.39f, -4.46f, 5.68f)
                lineToRelative(-0.54f, 0.35f)
                lineToRelative(-0.54f, -0.35f)
                curveToRelative(-0.46f, -0.29f, -4.46f, -2.95f, -4.46f, -5.68f)
                close()
                moveTo(9f, 3.19f)
                curveToRelative(0f, 1.04f, 1.61f, 2.62f, 3f, 3.63f)
                curveToRelative(1.39f, -1.01f, 3f, -2.59f, 3f, -3.63f)
                curveToRelative(0f, -0.64f, -0.45f, -1.16f, -1f, -1.16f)
                curveToRelative(-0.5f, 0f, -1f, 0.31f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.69f, -0.5f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.52f, -1f, 1.16f)
                close()
            }
        }.also { _Life = it}
