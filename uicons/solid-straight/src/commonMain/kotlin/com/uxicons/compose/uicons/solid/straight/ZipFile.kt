package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZipFile: ImageVector? = null

val Icons.Ss.ZipFile: ImageVector
    get() = _ZipFile ?: UXIcon(name = "ZipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 19f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(13.47f, 6.25f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(0.01f, 1.47f)
                lineToRelative(0.71f, -0.0f)
                curveToRelative(0.41f, 0f, 0.76f, -0.34f, 0.76f, -0.73f)
                reflectiveCurveToRelative(-0.35f, -0.73f, -0.76f, -0.73f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.77f, 9.83f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(2.22f, -3.92f)
                lineToRelative(-0.0f, -0.91f)
                horizontalLineToRelative(-3.77f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(2.22f)
                lineToRelative(-2.22f, 3.92f)
                verticalLineToRelative(0.91f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-1.2f)
                close()
                moveTo(10.28f, 5f)
                horizontalLineToRelative(-1.28f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.28f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15.48f, 6.99f)
                curveToRelative(0f, -1.09f, -0.9f, -1.99f, -2.01f, -1.99f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.72f, -0.0f)
                curveToRelative(1.11f, 0f, 2.01f, -0.89f, 2.01f, -1.99f)
                close()
            }
        }.also { _ZipFile = it}
