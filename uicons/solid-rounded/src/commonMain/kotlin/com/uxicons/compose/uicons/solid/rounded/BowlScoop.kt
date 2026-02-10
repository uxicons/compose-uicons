package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Sr.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.67f, 13.81f)
                curveToRelative(-0.35f, -0.51f, -0.92f, -0.81f, -1.54f, -0.81f)
                horizontalLineTo(1.86f)
                curveToRelative(-0.61f, 0f, -1.19f, 0.3f, -1.54f, 0.81f)
                curveToRelative(-0.35f, 0.51f, -0.42f, 1.15f, -0.2f, 1.73f)
                curveToRelative(0f, 0f, 0.17f, 0.42f, 0.2f, 0.47f)
                curveToRelative(1.62f, 2.71f, 3.93f, 2.96f, 5.97f, 2.99f)
                horizontalLineToRelative(4.7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.71f)
                curveToRelative(2.03f, -0.03f, 4.34f, -0.29f, 5.96f, -2.99f)
                curveToRelative(0.03f, -0.05f, 0.2f, -0.47f, 0.2f, -0.47f)
                curveToRelative(0.22f, -0.57f, 0.15f, -1.22f, -0.2f, -1.73f)
                close()
                moveTo(2f, 11f)
                horizontalLineToRelative(20f)
                curveToRelative(0.28f, 0f, 0.55f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.19f, -0.21f, 0.28f, -0.49f, 0.25f, -0.77f)
                curveTo(22.43f, 4.26f, 17.7f, 0f, 12f, 0f)
                reflectiveCurveTo(1.57f, 4.26f, 1.0f, 9.9f)
                curveToRelative(-0.03f, 0.28f, 0.06f, 0.56f, 0.25f, 0.77f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.33f, 0.74f, 0.33f)
                close()
            }
        }.also { _BowlScoop = it}
