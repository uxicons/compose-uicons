package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surprise: ImageVector? = null

val Icons.Tc.Surprise: ImageVector
    get() = _Surprise ?: UXIcon(name = "Surprise") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 12.39f)
                curveToRelative(-1.91f, 0.01f, -2.93f, 1.03f, -2.97f, 2.98f)
                curveToRelative(0.04f, 1.96f, 1.03f, 2.96f, 2.97f, 2.97f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.93f, -0.01f, 2.93f, -1.01f, 2.97f, -2.98f)
                curveToRelative(-0.03f, -1.9f, -1.09f, -2.95f, -2.97f, -2.97f)
                close()
                moveTo(12f, 17.33f)
                curveToRelative(-1.37f, -0.01f, -1.95f, -0.58f, -1.97f, -1.97f)
                curveToRelative(0.03f, -1.37f, 0.62f, -1.97f, 1.97f, -1.97f)
                curveToRelative(1.34f, 0.01f, 1.95f, 0.62f, 1.97f, 1.97f)
                curveToRelative(-0.03f, 1.4f, -0.6f, 1.97f, -1.97f, 1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.89f, 1f, 1f, 5.16f, 1f, 12.01f)
                curveToRelative(0f, 7.0f, 3.77f, 10.99f, 11.0f, 10.99f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 11.0f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.99f, -11.0f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10.0f, -10f)
                curveToRelative(0.12f, -6.59f, 3.49f, -9.96f, 10.0f, -10f)
                curveToRelative(4.49f, 0.03f, 9.86f, 1.79f, 10.0f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.4f, 9.97f, -10.0f, 10.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.12f, 10.31f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.88f, 10.31f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _Surprise = it}
