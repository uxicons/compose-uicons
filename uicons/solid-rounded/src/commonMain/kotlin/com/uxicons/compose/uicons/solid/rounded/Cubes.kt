package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cubes: ImageVector? = null

val Icons.Sr.Cubes: ImageVector
    get() = _Cubes ?: UXIcon(name = "Cubes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.57f)
                lineToRelative(4.93f, -2.46f)
                lineTo(13.34f, 0.32f)
                curveToRelative(-0.84f, -0.42f, -1.84f, -0.42f, -2.68f, 0f)
                lineToRelative(-3.58f, 1.79f)
                lineToRelative(4.93f, 2.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17.12f)
                lineTo(0f, 14.63f)
                verticalLineToRelative(4.74f)
                curveToRelative(0f, 1.07f, 0.57f, 2.07f, 1.51f, 2.6f)
                lineToRelative(3.49f, 2f)
                verticalLineToRelative(-6.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.98f)
                lineToRelative(3.49f, -2f)
                curveToRelative(0.93f, -0.53f, 1.51f, -1.53f, 1.51f, -2.6f)
                verticalLineToRelative(-4.74f)
                reflectiveCurveToRelative(-5f, 2.49f, -5f, 2.49f)
                verticalLineToRelative(6.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.89f, 10.84f)
                lineToRelative(-4.01f, 2.02f)
                lineToRelative(5.12f, 2.51f)
                lineToRelative(3.89f, -1.96f)
                lineToRelative(-5f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11.73f)
                lineToRelative(0f, -5.5f)
                lineToRelative(-5f, -2.49f)
                lineToRelative(0f, 5.42f)
                lineToRelative(5f, 2.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9.16f)
                lineToRelative(0f, -5.42f)
                lineToRelative(-5f, 2.49f)
                lineToRelative(0f, 5.5f)
                lineToRelative(5f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.11f, 10.84f)
                lineToRelative(-5f, 2.57f)
                lineToRelative(3.89f, 1.96f)
                lineToRelative(5.12f, -2.51f)
                lineToRelative(-4.01f, -2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15.12f)
                lineToRelative(-4f, 1.95f)
                lineToRelative(0f, 6.86f)
                lineToRelative(4f, -2.25f)
                lineToRelative(0f, -6.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15.12f)
                lineToRelative(0f, 6.55f)
                lineToRelative(4f, 2.24f)
                lineToRelative(0f, -6.86f)
                lineToRelative(-4f, -1.93f)
                close()
            }
        }.also { _Cubes = it}
