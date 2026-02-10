package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Sr.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.08f)
                curveToRelative(-1.86f, -1.0f, -3.08f, -2.97f, -3.08f, -5.15f)
                curveTo(2f, 2.62f, 4.62f, 0f, 7.85f, 0f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.26f, 0f, 5.92f, 2.65f, 5.92f, 5.92f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -2.16f, -1.76f, -3.92f, -3.92f, -3.92f)
                lineTo(7.85f, 2f)
                curveToRelative(-2.12f, 0f, -3.85f, 1.73f, -3.85f, 3.85f)
                curveToRelative(0f, 1.73f, 1.17f, 3.26f, 2.84f, 3.71f)
                lineToRelative(5.29f, 1.44f)
                horizontalLineToRelative(10.87f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.06f, 15.11f)
                curveToRelative(-0.49f, 0.24f, -0.7f, 0.84f, -0.45f, 1.34f)
                curveToRelative(0.26f, 0.52f, 0.4f, 1.11f, 0.4f, 1.7f)
                curveToRelative(0f, 2.12f, -1.73f, 3.85f, -3.85f, 3.85f)
                lineTo(7.92f, 22f)
                curveToRelative(-2.16f, 0f, -3.92f, -1.76f, -3.92f, -3.92f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 3.26f, 2.65f, 5.92f, 5.92f, 5.92f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.23f, 0f, 5.85f, -2.62f, 5.85f, -5.85f)
                curveToRelative(0f, -0.89f, -0.21f, -1.79f, -0.6f, -2.59f)
                curveToRelative(-0.24f, -0.49f, -0.84f, -0.7f, -1.34f, -0.45f)
                close()
            }
        }.also { _Strikethrough = it}
