package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZipFile: ImageVector? = null

val Icons.Rs.ZipFile: ImageVector
    get() = _ZipFile ?: UXIcon(name = "ZipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(18.41f)
                lineToRelative(5.59f, -5.59f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(18f, 21.59f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, 3.59f)
                close()
                moveTo(9.5f, 5f)
                horizontalLineToRelative(1.28f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.28f)
                verticalLineToRelative(-6f)
                close()
                moveTo(6.05f, 9.83f)
                horizontalLineToRelative(2.22f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-3.77f)
                verticalLineToRelative(-0.91f)
                lineToRelative(2.22f, -3.92f)
                horizontalLineToRelative(-2.22f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(3.77f)
                lineToRelative(0.0f, 0.91f)
                lineToRelative(-2.22f, 3.92f)
                close()
                moveTo(13.97f, 5f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.72f, -0.0f)
                curveToRelative(1.11f, 0f, 2.01f, -0.89f, 2.01f, -1.99f)
                reflectiveCurveToRelative(-0.9f, -1.99f, -2.01f, -1.99f)
                close()
                moveTo(13.97f, 7.72f)
                lineToRelative(-0.71f, 0.0f)
                lineToRelative(-0.01f, -1.47f)
                horizontalLineToRelative(0.71f)
                curveToRelative(0.41f, 0f, 0.76f, 0.34f, 0.76f, 0.73f)
                reflectiveCurveToRelative(-0.35f, 0.73f, -0.76f, 0.73f)
                close()
            }
        }.also { _ZipFile = it}
