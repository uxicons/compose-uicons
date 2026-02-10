package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Tr.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.09f, 4.62f)
                lineTo(13.88f, 0.5f)
                curveToRelative(-1.16f, -0.66f, -2.61f, -0.66f, -3.77f, 0f)
                lineTo(2.91f, 4.62f)
                curveToRelative(-1.18f, 0.68f, -1.91f, 1.94f, -1.91f, 3.3f)
                verticalLineToRelative(8.17f)
                curveToRelative(0f, 1.36f, 0.73f, 2.62f, 1.91f, 3.3f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(7.21f, 4.12f, 7.21f, 4.12f)
                curveToRelative(0.57f, 0.33f, 1.22f, 0.49f, 1.86f, 0.5f)
                curveToRelative(0.01f, 0f, 0.01f, 0.0f, 0.02f, 0.0f)
                reflectiveCurveToRelative(0.01f, -0.0f, 0.02f, -0.0f)
                curveToRelative(0.64f, -0.0f, 1.29f, -0.17f, 1.86f, -0.5f)
                lineToRelative(7.21f, -4.12f)
                curveToRelative(1.18f, -0.68f, 1.91f, -1.94f, 1.91f, -3.3f)
                lineTo(23.0f, 7.92f)
                curveToRelative(0f, -1.36f, -0.73f, -2.62f, -1.91f, -3.3f)
                close()
                moveTo(3.4f, 5.49f)
                lineTo(10.61f, 1.37f)
                curveToRelative(0.85f, -0.49f, 1.92f, -0.49f, 2.78f, 0f)
                lineToRelative(7.21f, 4.12f)
                curveToRelative(0.31f, 0.18f, 0.56f, 0.43f, 0.78f, 0.7f)
                lineToRelative(-9.4f, 5.24f)
                lineTo(2.75f, 6.03f)
                curveToRelative(0.19f, -0.21f, 0.41f, -0.4f, 0.66f, -0.54f)
                close()
                moveTo(3.4f, 18.51f)
                curveToRelative(-0.87f, -0.5f, -1.41f, -1.43f, -1.41f, -2.43f)
                lineTo(2.0f, 7.92f)
                curveToRelative(0f, -0.36f, 0.09f, -0.71f, 0.23f, -1.03f)
                lineToRelative(9.28f, 5.42f)
                verticalLineToRelative(10.63f)
                curveToRelative(-0.31f, -0.06f, -0.61f, -0.14f, -0.89f, -0.3f)
                lineToRelative(-7.21f, -4.12f)
                close()
                moveTo(22.0f, 16.08f)
                curveToRelative(0f, 1.0f, -0.54f, 1.93f, -1.41f, 2.43f)
                lineToRelative(-7.21f, 4.12f)
                curveToRelative(-0.28f, 0.16f, -0.58f, 0.25f, -0.89f, 0.3f)
                verticalLineToRelative(-10.66f)
                lineToRelative(9.36f, -5.22f)
                curveToRelative(0.09f, 0.28f, 0.15f, 0.56f, 0.15f, 0.86f)
                verticalLineToRelative(8.17f)
                close()
            }
        }.also { _Cube = it}
