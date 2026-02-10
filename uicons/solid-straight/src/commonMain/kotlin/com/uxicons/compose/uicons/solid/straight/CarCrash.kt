package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarCrash: ImageVector? = null

val Icons.Ss.CarCrash: ImageVector
    get() = _CarCrash ?: UXIcon(name = "CarCrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(-0.08f, 11f)
                lineToRelative(2.8f, -3.5f)
                lineTo(-0.08f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, -0.03f)
                lineTo(7.5f, 2.72f)
                lineTo(11f, -0.08f)
                lineTo(11f, 3.05f)
                lineTo(6.92f, 6.69f)
                arcTo(14.06f, 14.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, 11f)
                close()
                moveTo(23.98f, 15.19f)
                curveToRelative(0f, -0.28f, 0f, -0.56f, -0.02f, -0.83f)
                lineTo(23.52f, 9.26f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.89f, -2.54f)
                lineToRelative(-6.46f, -2.5f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, 0.55f)
                lineTo(8.26f, 8.19f)
                curveToRelative(-0.21f, 0.19f, -0.4f, 0.4f, -0.6f, 0.6f)
                close()
                moveTo(23.84f, 17.28f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 2.53f)
                lineTo(21.9f, 22.97f)
                lineToRelative(-1.86f, -0.73f)
                lineTo(19.3f, 24.09f)
                lineToRelative(-4.65f, -1.84f)
                lineToRelative(0.73f, -1.84f)
                lineToRelative(-5.03f, -1.98f)
                lineToRelative(-0.75f, 1.88f)
                lineTo(4.96f, 18.46f)
                lineTo(5.7f, 16.6f)
                lineToRelative(-1.86f, -0.73f)
                lineTo(5.1f, 12.71f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, -2.3f)
                close()
                moveTo(9.96f, 13.97f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, 1.87f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.96f, 13.97f)
                close()
                moveTo(18.71f, 17.41f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, 1.85f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, 17.41f)
                close()
            }
        }.also { _CarCrash = it}
