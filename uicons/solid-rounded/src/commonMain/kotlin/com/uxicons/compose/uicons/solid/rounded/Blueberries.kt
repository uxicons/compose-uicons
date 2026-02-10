package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueberries: ImageVector? = null

val Icons.Sr.Blueberries: ImageVector
    get() = _Blueberries ?: UXIcon(name = "Blueberries") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 7f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                reflectiveCurveToRelative(-3.81f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(23.91f, 7.28f)
                curveToRelative(0.55f, 3.96f, -1.65f, 7.49f, -4.95f, 8.97f)
                curveToRelative(0.02f, -0.25f, 0.04f, -0.5f, 0.04f, -0.76f)
                curveToRelative(0f, -2.46f, -0.85f, -4.71f, -2.27f, -6.5f)
                horizontalLineToRelative(0.27f)
                reflectiveCurveToRelative(1f, 0f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.57f)
                curveToRelative(-1.6f, -0.99f, -3.48f, -1.57f, -5.5f, -1.57f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.02f, -0.76f, 0.04f)
                curveTo(9.23f, 1.73f, 12.76f, -0.47f, 16.72f, 0.09f)
                curveToRelative(3.69f, 0.52f, 6.68f, 3.51f, 7.2f, 7.2f)
                close()
            }
        }.also { _Blueberries = it}
