package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Ts.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 23.97f)
                lineToRelative(-0.63f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineTo(5.13f)
                curveToRelative(0f, -1.08f, 0.69f, -2.03f, 1.71f, -2.37f)
                horizontalLineToRelative(0f)
                lineTo(12f, 0.01f)
                lineToRelative(8.29f, 2.75f)
                curveToRelative(1.02f, 0.34f, 1.71f, 1.29f, 1.71f, 2.37f)
                verticalLineToRelative(6.73f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                lineToRelative(-0.65f, 0.26f)
                close()
                moveTo(4.02f, 3.71f)
                curveToRelative(-0.61f, 0.2f, -1.02f, 0.78f, -1.02f, 1.42f)
                verticalLineToRelative(6.72f)
                curveToRelative(0f, 6.04f, 6.74f, 9.87f, 8.8f, 10.91f)
                lineToRelative(0.22f, 0.11f)
                lineToRelative(0.23f, -0.09f)
                curveToRelative(2.05f, -0.82f, 8.74f, -4.05f, 8.74f, -10.92f)
                verticalLineTo(5.13f)
                curveToRelative(0f, -0.65f, -0.41f, -1.22f, -1.03f, -1.42f)
                lineTo(12f, 1.07f)
                lineTo(4.02f, 3.71f)
                close()
            }
        }.also { _Shield = it}
