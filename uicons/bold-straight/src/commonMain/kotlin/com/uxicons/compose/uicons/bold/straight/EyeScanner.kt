package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeScanner: ImageVector? = null

val Icons.Bs.EyeScanner: ImageVector
    get() = _EyeScanner ?: UXIcon(name = "EyeScanner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 21f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20.24f, 16f)
                horizontalLineToRelative(-4.53f)
                curveToRelative(-1.01f, 0.59f, -2.23f, 1f, -3.71f, 1f)
                reflectiveCurveToRelative(-2.71f, -0.41f, -3.71f, -1f)
                horizontalLineToRelative(-4.55f)
                curveToRelative(1.76f, 2.1f, 4.49f, 4f, 8.26f, 4f)
                curveToRelative(3.98f, 0f, 6.62f, -2.05f, 8.24f, -4f)
                close()
                moveTo(22.14f, 11f)
                horizontalLineToRelative(1.86f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.74f, -1.62f, 3.69f, -7f, 10.14f, -7f)
                reflectiveCurveToRelative(9.39f, 5.35f, 10.14f, 7f)
                close()
                moveTo(18.75f, 11f)
                curveToRelative(-1.03f, -1.64f, -3.13f, -4f, -6.75f, -4f)
                curveToRelative(-3.59f, 0f, -5.7f, 2.37f, -6.74f, 4f)
                horizontalLineToRelative(3.92f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                reflectiveCurveToRelative(2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(3.93f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _EyeScanner = it}
