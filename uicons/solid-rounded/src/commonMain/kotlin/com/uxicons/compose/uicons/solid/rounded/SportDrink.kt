package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SportDrink: ImageVector? = null

val Icons.Sr.SportDrink: ImageVector
    get() = _SportDrink ?: UXIcon(name = "SportDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 5.14f)
                verticalLineToRelative(-0.64f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.64f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.2f, 0.54f, 2.27f, 1.38f, 3f)
                curveToRelative(-0.84f, 0.73f, -1.38f, 1.8f, -1.38f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.2f, -0.54f, -2.27f, -1.38f, -3f)
                curveToRelative(0.84f, -0.73f, 1.38f, -1.8f, 1.38f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SportDrink = it}
