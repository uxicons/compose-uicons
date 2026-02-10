package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerPlus: ImageVector? = null

val Icons.Sr.LayerPlus: ImageVector
    get() = _LayerPlus ?: UXIcon(name = "LayerPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7.23f)
                curveToRelative(0f, -0.35f, 0.18f, -0.68f, 0.48f, -0.86f)
                lineTo(10.35f, 0.46f)
                curveToRelative(1.02f, -0.61f, 2.29f, -0.61f, 3.31f, 0f)
                lineToRelative(9.86f, 5.92f)
                curveToRelative(0.3f, 0.18f, 0.48f, 0.51f, 0.48f, 0.86f)
                reflectiveCurveToRelative(-0.18f, 0.68f, -0.48f, 0.86f)
                lineToRelative(-9.86f, 5.92f)
                curveToRelative(-0.51f, 0.31f, -1.08f, 0.46f, -1.65f, 0.46f)
                curveToRelative(-0.57f, 0f, -1.14f, -0.15f, -1.65f, -0.46f)
                lineTo(0.48f, 8.09f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.51f, -0.48f, -0.86f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12.52f, 21.91f)
                lineTo(1.51f, 15.31f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                curveToRelative(-0.28f, 0.47f, -0.13f, 1.09f, 0.34f, 1.37f)
                lineToRelative(11f, 6.6f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.14f, 0.51f, 0.14f)
                curveToRelative(0.34f, 0f, 0.67f, -0.17f, 0.86f, -0.48f)
                curveToRelative(0.28f, -0.47f, 0.13f, -1.09f, -0.34f, -1.37f)
                close()
                moveTo(22.49f, 10.75f)
                lineToRelative(-10.48f, 6.29f)
                lineTo(1.51f, 10.75f)
                curveToRelative(-0.47f, -0.28f, -1.09f, -0.13f, -1.37f, 0.34f)
                curveToRelative(-0.28f, 0.47f, -0.13f, 1.09f, 0.34f, 1.37f)
                lineToRelative(11f, 6.6f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.14f, 0.52f, 0.14f)
                reflectiveCurveToRelative(0.36f, -0.05f, 0.52f, -0.14f)
                lineToRelative(11f, -6.6f)
                curveToRelative(0.47f, -0.28f, 0.63f, -0.9f, 0.34f, -1.37f)
                reflectiveCurveToRelative(-0.9f, -0.63f, -1.37f, -0.34f)
                close()
            }
        }.also { _LayerPlus = it}
