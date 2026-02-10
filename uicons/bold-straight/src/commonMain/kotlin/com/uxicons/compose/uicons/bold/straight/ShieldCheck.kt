package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Bs.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.16f, 11.69f)
                lineTo(9.4f, 9.87f)
                lineTo(7.24f, 11.95f)
                lineToRelative(2.2f, 2.29f)
                arcToRelative(2.36f, 2.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.67f, 0.74f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, -0.69f)
                lineToRelative(5.02f, -5.02f)
                lineTo(15.71f, 7.14f)
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
        }.also { _ShieldCheck = it}
