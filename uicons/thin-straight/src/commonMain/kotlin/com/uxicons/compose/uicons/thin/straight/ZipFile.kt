package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZipFile: ImageVector? = null

val Icons.Ts.ZipFile: ImageVector
    get() = _ZipFile ?: UXIcon(name = "ZipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18.21f)
                lineToRelative(5.79f, -5.79f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(18f, 22.79f)
                verticalLineToRelative(-4.79f)
                horizontalLineToRelative(4.79f)
                lineToRelative(-4.79f, 4.79f)
                close()
                moveTo(17f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(0.82f)
                lineToRelative(-2.95f, 5.18f)
                horizontalLineToRelative(2.85f)
                verticalLineToRelative(1f)
                lineTo(3.9f, 11f)
                verticalLineToRelative(-0.82f)
                lineToRelative(2.95f, -5.18f)
                horizontalLineToRelative(-2.85f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ZipFile = it}
