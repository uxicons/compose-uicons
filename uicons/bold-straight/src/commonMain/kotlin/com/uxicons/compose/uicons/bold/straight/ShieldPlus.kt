package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Bs.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 7.18f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2.32f)
                lineToRelative(-2.32f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2.32f, 0f)
                lineToRelative(0f, 2.32f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2.32f)
                lineToRelative(2.32f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-2.32f, 0f)
                lineToRelative(0f, -2.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.92f, 24f)
                lineToRelative(-0.53f, -0.24f)
                curveTo(11.01f, 23.59f, 2f, 19.5f, 2f, 12f)
                verticalLineTo(5.53f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.05f, 2.68f)
                lineTo(12f, 0.03f)
                lineToRelative(7.95f, 2.65f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.53f)
                verticalLineTo(12f)
                curveToRelative(0f, 8.54f, -9.14f, 11.68f, -9.53f, 11.81f)
                close()
                moveTo(12f, 3.19f)
                lineTo(5f, 5.53f)
                verticalLineTo(12f)
                curveToRelative(0f, 4.67f, 5.34f, 7.85f, 7.08f, 8.75f)
                curveTo(13.82f, 20.03f, 19f, 17.41f, 19f, 12f)
                verticalLineTo(5.53f)
                close()
            }
        }.also { _ShieldPlus = it}
