package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skeleton: ImageVector? = null

val Icons.Ts.Skeleton: ImageVector
    get() = _Skeleton ?: UXIcon(name = "Skeleton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 1f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-1.32f, 0.02f, -2.46f, 0.82f, -2.97f, 2.08f)
                curveToRelative(-0.54f, 1.34f, -0.24f, 2.85f, 0.76f, 3.85f)
                lineToRelative(2.07f, 2.07f)
                horizontalLineToRelative(9.81f)
                lineToRelative(2.07f, -2.07f)
                curveToRelative(1.0f, -1.0f, 1.3f, -2.52f, 0.76f, -3.85f)
                curveToRelative(-0.51f, -1.26f, -1.65f, -2.06f, -2.98f, -2.08f)
                horizontalLineToRelative(-4.26f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6.5f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(14.0f, 17f)
                curveToRelative(-0.62f, 0.62f, -1.0f, 1.47f, -1.0f, 2.42f)
                verticalLineToRelative(0.58f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0f, -1.33f, 1.08f, -2.42f, 2.42f, -2.42f)
                horizontalLineToRelative(0.33f)
                curveToRelative(0.93f, 0.02f, 1.7f, 0.56f, 2.06f, 1.45f)
                curveToRelative(0.39f, 0.96f, 0.18f, 2.05f, -0.54f, 2.77f)
                lineToRelative(-1.78f, 1.78f)
                lineTo(7.51f, 23f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(-0.72f, -0.72f, -0.93f, -1.81f, -0.54f, -2.77f)
                curveToRelative(0.36f, -0.9f, 1.13f, -1.44f, 2.05f, -1.45f)
                horizontalLineToRelative(0.34f)
                curveToRelative(1.33f, 0f, 2.42f, 1.08f, 2.42f, 2.42f)
                verticalLineToRelative(0.58f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0f, -0.94f, -0.38f, -1.8f, -1.0f, -2.42f)
                horizontalLineToRelative(4.01f)
                close()
            }
        }.also { _Skeleton = it}
