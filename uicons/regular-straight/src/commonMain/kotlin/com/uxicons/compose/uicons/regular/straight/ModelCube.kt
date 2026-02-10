package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCube: ImageVector? = null

val Icons.Rs.ModelCube: ImageVector
    get() = _ModelCube ?: UXIcon(name = "ModelCube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                verticalLineToRelative(4.47f)
                lineToRelative(-1f, 0.57f)
                lineToRelative(-1f, -0.57f)
                lineTo(11f, 3.72f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                close()
                moveTo(20.5f, 15f)
                curveToRelative(-0.36f, 0f, -0.7f, 0.1f, -0.99f, 0.27f)
                lineToRelative(-3.44f, -2.15f)
                lineToRelative(-1.01f, 0.54f)
                lineToRelative(-0.05f, 1.15f)
                lineToRelative(3.5f, 2.19f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2f, 2.0f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(9.0f, 14.82f)
                lineToRelative(-0.05f, -1.15f)
                lineToRelative(-1.01f, -0.54f)
                lineToRelative(-3.44f, 2.15f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.27f, -0.99f, -0.27f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2.0f, -0.89f, 2f, -2.0f)
                lineToRelative(3.5f, -2.19f)
                close()
                moveTo(15.97f, 2.27f)
                curveToRelative(-0.05f, 0.71f, -0.27f, 1.38f, -0.64f, 1.94f)
                lineToRelative(4.14f, 2.37f)
                lineToRelative(-7.47f, 4.27f)
                lineToRelative(-7.48f, -4.27f)
                lineToRelative(4.14f, -2.37f)
                curveToRelative(-0.37f, -0.56f, -0.59f, -1.23f, -0.64f, -1.94f)
                lineTo(1.5f, 6f)
                verticalLineToRelative(7.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                verticalLineToRelative(-4.71f)
                lineToRelative(7.5f, 4.29f)
                verticalLineToRelative(8.55f)
                lineToRelative(-3.98f, -2.27f)
                curveToRelative(-0.33f, 0.62f, -0.8f, 1.14f, -1.38f, 1.51f)
                lineToRelative(6.36f, 3.63f)
                lineToRelative(6.36f, -3.63f)
                curveToRelative(-0.59f, -0.37f, -1.06f, -0.9f, -1.38f, -1.52f)
                lineToRelative(-3.98f, 2.27f)
                verticalLineToRelative(-8.54f)
                lineToRelative(7.5f, -4.29f)
                verticalLineToRelative(4.71f)
                curveToRelative(0.73f, 0f, 1.41f, 0.21f, 2f, 0.56f)
                verticalLineToRelative(-7.56f)
                lineToRelative(-6.53f, -3.73f)
                close()
            }
        }.also { _ModelCube = it}
