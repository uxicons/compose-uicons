package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Rs.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.07f)
                curveToRelative(-1.85f, -1.0f, -3.07f, -2.97f, -3.07f, -5.15f)
                curveTo(2f, 2.62f, 4.62f, 0f, 7.85f, 0f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.26f, 0f, 5.92f, 2.65f, 5.92f, 5.92f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -2.16f, -1.76f, -3.92f, -3.92f, -3.92f)
                lineTo(7.85f, 2f)
                curveToRelative(-2.12f, 0f, -3.85f, 1.73f, -3.85f, 3.85f)
                curveToRelative(0f, 1.73f, 1.17f, 3.26f, 2.84f, 3.71f)
                lineToRelative(4.81f, 1.44f)
                horizontalLineToRelative(12.35f)
                close()
                moveTo(18.35f, 15f)
                curveToRelative(1.01f, 0.71f, 1.65f, 1.87f, 1.65f, 3.15f)
                curveToRelative(0f, 2.12f, -1.73f, 3.85f, -3.85f, 3.85f)
                lineTo(7.92f, 22f)
                curveToRelative(-2.16f, 0f, -3.92f, -1.76f, -3.92f, -3.92f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 3.26f, 2.65f, 5.92f, 5.92f, 5.92f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.23f, 0f, 5.85f, -2.62f, 5.85f, -5.85f)
                curveToRelative(0f, -1.15f, -0.35f, -2.23f, -0.95f, -3.15f)
                horizontalLineToRelative(-2.7f)
                close()
            }
        }.also { _Strikethrough = it}
