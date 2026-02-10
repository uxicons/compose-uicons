package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skeleton: ImageVector? = null

val Icons.Ss.Skeleton: ImageVector
    get() = _Skeleton ?: UXIcon(name = "Skeleton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.73f, 17.47f)
                curveToRelative(-0.0f, -0.01f, -0.59f, -1.47f, -2.22f, -1.47f)
                curveToRelative(-1.13f, 0f, -2.27f, 0.71f, -2.47f, 2.01f)
                curveToRelative(-0.03f, 0.16f, -0.04f, 0.32f, -0.04f, 0.49f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineTo(0f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.17f, -0.01f, -0.33f, -0.04f, -0.49f)
                curveToRelative(-0.2f, -1.3f, -1.33f, -2.01f, -2.46f, -2.01f)
                curveToRelative(-1.57f, 0f, -2.23f, 1.46f, -2.23f, 1.47f)
                curveToRelative(-0.55f, 1.36f, -0.27f, 2.53f, 0.78f, 3.92f)
                lineToRelative(1.94f, 2.61f)
                horizontalLineToRelative(10.03f)
                lineToRelative(1.94f, -2.61f)
                curveToRelative(1.05f, -1.39f, 1.33f, -2.56f, 0.78f, -3.92f)
                close()
            }
        }.also { _Skeleton = it}
