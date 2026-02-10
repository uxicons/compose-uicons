package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Rr.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.9f, 10.99f)
                curveToRelative(0.56f, 0.05f, 1.04f, -0.35f, 1.09f, -0.9f)
                curveTo(3.46f, 5.48f, 7.33f, 2f, 12f, 2f)
                reflectiveCurveToRelative(8.54f, 3.48f, 9.01f, 8.1f)
                curveToRelative(0.05f, 0.52f, 0.56f, 1.01f, 1.09f, 0.9f)
                curveToRelative(0.55f, -0.06f, 0.95f, -0.55f, 0.9f, -1.09f)
                curveTo(22.43f, 4.26f, 17.7f, 0f, 12f, 0f)
                reflectiveCurveTo(1.57f, 4.26f, 1.0f, 9.9f)
                curveToRelative(-0.06f, 0.55f, 0.35f, 1.04f, 0.9f, 1.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.67f, 13.81f)
                curveToRelative(-0.35f, -0.51f, -0.92f, -0.81f, -1.54f, -0.81f)
                lineTo(1.86f, 13f)
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
                moveTo(21.92f, 15.05f)
                curveToRelative(-0.99f, 1.61f, -2.21f, 1.92f, -4.21f, 1.95f)
                lineTo(6.31f, 17f)
                curveToRelative(-2.02f, -0.03f, -3.23f, -0.34f, -4.23f, -1.95f)
                lineToRelative(-0.02f, -0.05f)
                horizontalLineToRelative(19.87f)
                lineToRelative(-0.02f, 0.05f)
                close()
            }
        }.also { _BowlScoop = it}
