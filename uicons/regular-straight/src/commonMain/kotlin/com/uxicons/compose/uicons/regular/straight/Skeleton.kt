package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skeleton: ImageVector? = null

val Icons.Rs.Skeleton: ImageVector
    get() = _Skeleton ?: UXIcon(name = "Skeleton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 2f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
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
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(-1.37f, 0.02f, -2.54f, 0.84f, -3.06f, 2.14f)
                curveToRelative(-0.55f, 1.36f, -0.25f, 2.9f, 0.78f, 3.92f)
                lineToRelative(1.94f, 1.94f)
                horizontalLineToRelative(10.03f)
                lineToRelative(1.94f, -1.94f)
                curveToRelative(1.02f, -1.02f, 1.33f, -2.56f, 0.78f, -3.92f)
                curveToRelative(-0.52f, -1.3f, -1.7f, -2.12f, -3.13f, -2.14f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(-2f)
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
                close()
                moveTo(13.34f, 18f)
                curveToRelative(-0.22f, 0.46f, -0.34f, 0.96f, -0.34f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.8f, 0.01f, 1.27f, 0.62f, 1.38f, 0.89f)
                curveToRelative(0.19f, 0.47f, 0.21f, 1.21f, -0.34f, 1.76f)
                lineToRelative(-1.35f, 1.35f)
                lineTo(7.82f, 22f)
                lineToRelative(-1.35f, -1.35f)
                curveToRelative(-0.55f, -0.55f, -0.52f, -1.29f, -0.34f, -1.76f)
                curveToRelative(0.11f, -0.26f, 0.54f, -0.87f, 1.38f, -0.89f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(2.68f)
                close()
            }
        }.also { _Skeleton = it}
