package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Ts.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                lineToRelative(-4.22f, 4.22f)
                curveToRelative(-2.35f, -2.18f, -5.39f, -3.37f, -8.61f, -3.37f)
                curveTo(5.93f, 2f, 2.74f, 3.32f, 0.35f, 5.71f)
                lineTo(-0.01f, 6.07f)
                lineTo(8.61f, 14.68f)
                lineToRelative(-3.32f, 3.32f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.29f)
                lineToRelative(-3.65f, 3.65f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(0.01f, 4.3f)
                lineToRelative(1f, -0.0f)
                lineToRelative(-0.01f, -5.29f)
                lineToRelative(3.31f, -3.31f)
                lineToRelative(8.62f, 8.62f)
                lineToRelative(0.35f, -0.35f)
                curveToRelative(2.4f, -2.4f, 3.71f, -5.58f, 3.71f, -8.97f)
                curveToRelative(0f, -3.22f, -1.19f, -6.26f, -3.37f, -8.61f)
                lineTo(22.85f, 1.85f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.65f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1.42f, 6.08f)
                curveToRelative(4.46f, -4.09f, 11.35f, -4.09f, 15.8f, 0f)
                lineToRelative(-7.9f, 7.9f)
                lineTo(1.42f, 6.08f)
                close()
                moveTo(17.92f, 22.59f)
                lineToRelative(-7.9f, -7.9f)
                lineToRelative(7.9f, -7.9f)
                curveToRelative(4.09f, 4.46f, 4.09f, 11.35f, 0f, 15.8f)
                close()
            }
        }.also { _BowArrow = it}
