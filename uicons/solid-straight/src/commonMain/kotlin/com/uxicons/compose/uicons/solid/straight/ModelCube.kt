package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCube: ImageVector? = null

val Icons.Ss.ModelCube: ImageVector
    get() = _ModelCube ?: UXIcon(name = "ModelCube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(20.5f, 15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(1.5f, 17f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(1.5f, 13.56f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.56f, 2f, -0.56f)
                curveToRelative(1.09f, 0f, 2.07f, 0.44f, 2.79f, 1.15f)
                lineToRelative(1.64f, -1.02f)
                lineToRelative(1.01f, 0.54f)
                lineToRelative(0.05f, 1.15f)
                lineToRelative(-1.68f, 1.05f)
                curveToRelative(0.11f, 0.36f, 0.18f, 0.74f, 0.18f, 1.13f)
                curveToRelative(0f, 1.41f, -0.74f, 2.65f, -1.85f, 3.36f)
                lineToRelative(5.35f, 3.07f)
                verticalLineToRelative(-10.85f)
                lineTo(1.5f, 7.15f)
                verticalLineToRelative(6.41f)
                close()
                moveTo(13f, 12.58f)
                verticalLineToRelative(10.84f)
                lineToRelative(5.3f, -3.08f)
                curveToRelative(-1.08f, -0.72f, -1.8f, -1.94f, -1.8f, -3.33f)
                curveToRelative(0f, -0.4f, 0.08f, -0.77f, 0.18f, -1.13f)
                lineToRelative(-1.68f, -1.05f)
                lineToRelative(0.05f, -1.15f)
                lineToRelative(1.01f, -0.54f)
                lineToRelative(1.64f, 1.02f)
                curveToRelative(0.72f, -0.71f, 1.71f, -1.15f, 2.79f, -1.15f)
                curveToRelative(0.73f, 0f, 1.41f, 0.21f, 2f, 0.56f)
                verticalLineToRelative(-6.41f)
                lineToRelative(-9.5f, 5.43f)
                close()
                moveTo(15.98f, 2.24f)
                curveToRelative(-0.11f, 1.75f, -1.34f, 3.19f, -2.98f, 3.62f)
                verticalLineToRelative(2.34f)
                lineToRelative(-1f, 0.57f)
                lineToRelative(-1f, -0.57f)
                verticalLineToRelative(-2.34f)
                curveToRelative(-1.63f, -0.43f, -2.86f, -1.86f, -2.97f, -3.6f)
                lineToRelative(-5.52f, 3.17f)
                lineToRelative(9.49f, 5.42f)
                lineToRelative(9.5f, -5.43f)
                lineToRelative(-5.52f, -3.18f)
                close()
            }
        }.also { _ModelCube = it}
