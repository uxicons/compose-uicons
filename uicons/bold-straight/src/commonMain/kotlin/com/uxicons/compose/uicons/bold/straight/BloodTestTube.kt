package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Bs.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 18.23f)
                verticalLineToRelative(0.77f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3.87f)
                curveToRelative(0.34f, -0.65f, 0.78f, -1.26f, 1.33f, -1.8f)
                lineToRelative(1.8f, -1.76f)
                lineTo(14f, 3f)
                horizontalLineToRelative(1f)
                lineTo(15f, 0f)
                lineTo(3f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 3.08f, 2.31f, 5f, 5f, 5f)
                curveToRelative(2.08f, 0f, 3.87f, -1.28f, 4.62f, -3.09f)
                curveToRelative(-0.51f, -0.31f, -0.99f, -0.67f, -1.42f, -1.1f)
                curveToRelative(-0.48f, -0.48f, -0.88f, -1.01f, -1.2f, -1.58f)
                close()
                moveTo(11f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                lineTo(7f, 3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(21.38f, 10.6f)
                lineToRelative(-3.88f, -3.79f)
                lineToRelative(-3.89f, 3.8f)
                curveToRelative(-2.14f, 2.15f, -2.14f, 5.63f, 0f, 7.78f)
                horizontalLineToRelative(0f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.14f, -2.15f, 2.14f, -5.63f, -0.01f, -7.79f)
                close()
                moveTo(19.27f, 16.27f)
                curveToRelative(-0.94f, 0.94f, -2.59f, 0.94f, -3.54f, 0f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, -0.01f, -3.52f)
                lineToRelative(1.78f, -1.74f)
                lineToRelative(1.77f, 1.73f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                close()
            }
        }.also { _BloodTestTube = it}
