package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MachineLearning: ImageVector? = null

val Icons.Bs.MachineLearning: ImageVector
    get() = _MachineLearning ?: UXIcon(name = "MachineLearning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.11f)
                curveToRelative(-2.54f, -0.38f, -4.76f, -1.73f, -6.3f, -3.65f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.83f, -1.06f)
                curveToRelative(-0.44f, -1.13f, -0.69f, -2.36f, -0.69f, -3.64f)
                reflectiveCurveToRelative(0.25f, -2.51f, 0.69f, -3.64f)
                lineToRelative(-1.83f, -1.06f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(1.54f, -1.92f, 3.76f, -3.27f, 6.3f, -3.65f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                close()
                moveTo(23f, 18.51f)
                verticalLineToRelative(-5.51f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2.51f)
                curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1f, -1.99f)
                close()
                moveTo(23f, 5.49f)
                curveToRelative(0.6f, -0.46f, 1f, -1.17f, 1f, -1.99f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.81f, 0.4f, 1.53f, 1f, 1.99f)
                verticalLineToRelative(2.51f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _MachineLearning = it}
