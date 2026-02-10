package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCube: ImageVector? = null

val Icons.Bs.ModelCube: ImageVector
    get() = _ModelCube ?: UXIcon(name = "ModelCube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                verticalLineToRelative(3.39f)
                lineToRelative(-1f, 0.57f)
                lineToRelative(-1f, -0.57f)
                verticalLineToRelative(-3.39f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                close()
                moveTo(20.5f, 15f)
                curveToRelative(-0.36f, 0f, -0.7f, 0.1f, -0.99f, 0.27f)
                lineToRelative(-2.68f, -1.68f)
                lineToRelative(-1.01f, 0.54f)
                lineToRelative(-0.05f, 1.15f)
                lineToRelative(2.73f, 1.71f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(8.23f, 15.29f)
                lineToRelative(-0.05f, -1.15f)
                lineToRelative(-1.01f, -0.54f)
                lineToRelative(-2.68f, 1.68f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.27f, -0.99f, -0.27f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineToRelative(2.73f, -1.71f)
                close()
                moveTo(16.6f, 17.88f)
                lineToRelative(-3.1f, 1.77f)
                verticalLineToRelative(-6.78f)
                lineToRelative(5.99f, -3.42f)
                lineToRelative(-0.01f, 3.7f)
                curveToRelative(0.33f, -0.09f, 0.67f, -0.15f, 1.02f, -0.15f)
                curveToRelative(0.72f, 0f, 1.39f, 0.21f, 1.98f, 0.54f)
                lineToRelative(0.02f, -7.56f)
                lineToRelative(-6.53f, -3.73f)
                curveToRelative(-0.07f, 1.07f, -0.56f, 2.03f, -1.31f, 2.71f)
                lineToRelative(3.31f, 1.89f)
                lineToRelative(-5.98f, 3.42f)
                lineToRelative(-5.98f, -3.42f)
                lineToRelative(3.31f, -1.89f)
                curveToRelative(-0.75f, -0.68f, -1.24f, -1.63f, -1.31f, -2.71f)
                lineTo(1.5f, 5.99f)
                verticalLineToRelative(7.57f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                curveToRelative(0.34f, 0f, 0.66f, 0.06f, 0.98f, 0.14f)
                lineToRelative(0.01f, -3.7f)
                lineToRelative(6.01f, 3.43f)
                verticalLineToRelative(6.82f)
                lineToRelative(-3.11f, -1.78f)
                curveToRelative(-0.24f, 1.03f, -0.87f, 1.9f, -1.73f, 2.45f)
                lineToRelative(6.32f, 3.62f)
                lineToRelative(6.36f, -3.63f)
                curveToRelative(-0.86f, -0.56f, -1.49f, -1.44f, -1.72f, -2.47f)
                close()
            }
        }.also { _ModelCube = it}
